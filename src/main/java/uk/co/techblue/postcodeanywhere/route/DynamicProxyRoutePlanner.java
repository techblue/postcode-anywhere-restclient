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
package uk.co.techblue.postcodeanywhere.route;

import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.protocol.HttpContext;

/**
 * The Class DynamicProxyRoutePlanner.
 *
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class DynamicProxyRoutePlanner implements HttpRoutePlanner {

    /** The default proxy route planner. */
    private DefaultProxyRoutePlanner defaultProxyRoutePlanner = null;

    /**
     * Instantiates a new dynamic proxy route planner.
     *
     * @param host the host
     */
    public DynamicProxyRoutePlanner(final HttpHost host) {
        defaultProxyRoutePlanner = new DefaultProxyRoutePlanner(host);
    }

    /**
     * Sets the proxy.
     *
     * @param host the new proxy
     */
    public void setProxy(final HttpHost host) {
        defaultProxyRoutePlanner = new DefaultProxyRoutePlanner(host);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.apache.http.conn.routing.HttpRoutePlanner#determineRoute(org.apache.http.HttpHost, org.apache.http.HttpRequest,
     * org.apache.http.protocol.HttpContext)
     */
    @Override
    public HttpRoute determineRoute(final HttpHost target, final HttpRequest request, final HttpContext context) throws HttpException {
        return defaultProxyRoutePlanner.determineRoute(target, request, context);
    }

}
