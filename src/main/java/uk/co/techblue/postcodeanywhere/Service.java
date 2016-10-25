/*******************************************************************************
 * Copyright 2016 Technology Blueprint Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package uk.co.techblue.postcodeanywhere;

import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.client.jaxrs.engines.ApacheHttpClient4Engine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.co.techblue.postcodeanywhere.exception.LookupException;
import uk.co.techblue.postcodeanywhere.route.DynamicProxyRoutePlanner;

/**
 * The Class Service.
 *
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 * @param <RT> the generic type
 */
public abstract class Service<RT extends Resource> {

    /** The logger. */
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /** The rest base uri. */
    protected final String restBaseUri;

    /** The resource proxy. */
    protected final RT resourceProxy;

    /**
     * Instantiates a new service.
     *
     * @param restBaseUri the rest base uri
     */
    public Service(final String restBaseUri) {
        this.restBaseUri = restBaseUri;
        this.resourceProxy = getResourceProxy(getResourceClass(), restBaseUri);
    }

    /**
     * Gets the resource class.
     *
     * @return the resource class
     */
    protected abstract Class<RT> getResourceClass();

    /**
     * Gets the resource proxy.
     *
     * @param <T> the generic resource type
     * @param clazz the resource class
     * @param serverUri the server uri
     * @return the resource proxy
     */
    protected <T> T getResourceProxy(final Class<T> clazz, final String serverUri) {
        return getClientService(clazz, serverUri);
    }

    /**
     * Gets the client service.
     *
     * @param <T> the generic type
     * @param clazz the clazz
     * @param serverUri the server uri
     * @return the client service
     */
    private final <T> T getClientService(final Class<T> clazz, final String serverUri) {
        logger.info("Generating REST resource proxy for: " + clazz.getName());
        final String proxyHost = System.getProperty("proxy.host");
        final int proxyPort = NumberUtils.toInt(System.getProperty("proxy.port"));
        DynamicProxyRoutePlanner routePlanner = null;
        if (StringUtils.isNotBlank(proxyHost)) {
            final HttpHost httpProxy = new HttpHost(proxyHost, proxyPort);
            routePlanner = new DynamicProxyRoutePlanner(httpProxy);
        }
        final HttpClient httpclient = HttpClients.custom().setRoutePlanner(routePlanner).build();

        final ApacheHttpClient4Engine engine = new ApacheHttpClient4Engine(httpclient);

        final ResteasyClientBuilder resteasyClientBuilder = new ResteasyClientBuilder().connectionPoolSize(20);
        final ResteasyClient client = resteasyClientBuilder.httpEngine(engine).build();
        final ResteasyWebTarget target = client.target(serverUri);

        return target.proxy(clazz);
    }

    /**
     * Gets the entity from response.
     *
     * @param <T> the Entity type
     * @param <EX> the Exception type to throw if parsing fails
     * @param clientResponse the client response
     * @param exceptionClazz the exception class to throw if parsing fails
     * @return the entity
     * @throws EX the ex
     */
    protected <T, EX extends LookupException> T parseEntityFromResponse(final Response clientResponse, final Class<T> responsetype, final Class<EX> exceptionClazz) throws EX {
        T entity = null;
        try {
            entity = clientResponse.readEntity(responsetype);
        } finally {
            clientResponse.close();
        }
        return entity;
    }

}
