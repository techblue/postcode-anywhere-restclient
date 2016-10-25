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

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.client.core.executors.ApacheHttpClient4Executor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.co.techblue.postcodeanywhere.exception.LookupException;

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
        final HttpClient httpClient = new DefaultHttpClient();
        if (StringUtils.isNotBlank(proxyHost)) {
            final HttpHost httpProxy = new HttpHost(proxyHost, proxyPort);
            httpClient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, httpProxy);
        }
        final ApacheHttpClient4Executor executor = new ApacheHttpClient4Executor(httpClient);
        return ProxyFactory.create(clazz, serverUri, executor);
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
    protected <T, EX extends LookupException> T parseEntityFromResponse(final ClientResponse<T> clientResponse,
        final Class<EX> exceptionClazz) throws EX {
        T entity = null;
        try {
            // validateResponseSuccess(clientResponse, exceptionClazz);
            entity = clientResponse.getEntity();
        } finally {
            clientResponse.releaseConnection();
        }
        return entity;
    }

    // /**
    // * Validate response success.
    // *
    // * @param <EX> the generic type
    // * @param clientResponse the client response
    // * @param exceptionClazz the exception clazz
    // * @throws EX the eX
    // */
    // protected <EX extends LookupException> void validateResponseSuccess(final ClientResponse<?> clientResponse,
    // final Class<EX> exceptionClazz) throws EX {
    // if (clientResponse.getResponseStatus().getFamily() != Family.SUCCESSFUL) {
    // ErrorResponse errorResponse = null;
    // Exception cause = null;
    // try {
    // errorResponse = clientResponse.getEntity(ErrorResponse.class);
    // } catch (final ClientResponseFailure responseFailure) {
    // cause = responseFailure;
    // }
    // EX exception = null;
    // final String genericErrorMsg = "Error occurred while creating new instance of exception class of type "
    // + exceptionClazz.getCanonicalName() + " to throw the following error:\n" + errorResponse;
    // try {
    // if (cause != null) {
    // exception = exceptionClazz.getConstructor(String.class, Throwable.class).newInstance(cause.getMessage(),
    // cause);
    // } else {
    // exception = exceptionClazz.getConstructor(String.class).newInstance(
    // "Request processing failed. HTTP Status: " + clientResponse.getStatus() + "\n Error:"
    // + errorResponse);
    // }
    // } catch (final IllegalArgumentException iae) {
    // throw new IllegalStateException(genericErrorMsg, iae);
    // } catch (final SecurityException se) {
    // throw new IllegalStateException(genericErrorMsg, se);
    // } catch (final InstantiationException ie) {
    // throw new IllegalStateException(genericErrorMsg, ie);
    // } catch (final IllegalAccessException iacce) {
    // throw new IllegalStateException(genericErrorMsg, iacce);
    // } catch (final InvocationTargetException ite) {
    // throw new IllegalStateException(genericErrorMsg, ite);
    // } catch (final NoSuchMethodException nsme) {
    // throw new IllegalStateException(genericErrorMsg, nsme);
    // }
    // exception.setErrorResponse(errorResponse);
    // throw exception;
    // }
    // }

}
