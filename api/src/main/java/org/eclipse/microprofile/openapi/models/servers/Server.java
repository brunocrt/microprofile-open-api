/**
 * Copyright (c) 2017 Contributors to the Eclipse Foundation
 * Copyright 2017 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eclipse.microprofile.openapi.models.servers;

import java.util.Map;

import org.eclipse.microprofile.openapi.models.Constructible;
import org.eclipse.microprofile.openapi.models.Extensible;

/**
 * An object representing a server.
 *
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.0.md#serverObject">Server Object</a>
 */
public interface Server extends Constructible, Extensible<Server> {

    /**
     * This method returns the url property of Server instance, which is a URL to the target host.
     * <p>
     * This URL supports Server Variables and MAY be relative, to indicate that the host location is relative to the location where the OpenAPI
     * definition is being served. Variable substitutions will be made when a variable is named enclosed in curly brackets.
     * </p>
     * <p>
     * This is a REQUIRED property.
     * </p>
     * @return String url
     **/
    String getUrl();

    /**
     * This method sets the url property of Server instance to the given url argument, representing a URL to the target host.
     * <p>
     * This URL supports Server Variables and MAY be relative, to indicate that the host location is relative to the location where the OpenAPI
     * definition is being served. Variable substitutions will be made when a variable is named enclosed in curly brackets.
     * </p>
     * <p>
     * This is a REQUIRED property.
     * </p>
     * @param url a URL to the target host
     */
    void setUrl(String url);

    /**
     * This method sets the url property of Server instance to the given url argument, representing a URL to the target host, and returns the modified
     * instance.
     * <p>
     * This URL supports Server Variables and MAY be relative, to indicate that the host location is relative to the location where the OpenAPI
     * definition is being served. Variable substitutions will be made when a variable is named enclosed in curly brackets.
     * </p>
     * <p>
     * This is a REQUIRED property.
     * </p>
     * @param url a URL to the target host
     * @return Server instance with the set url property.
     */
    default Server url(String url) {
        setUrl(url);
        return this;
    }

    /**
     * This method returns the description property of Server instance. The decsription property is an optional string describing the host designated
     * by the URL.
     * @return String description
     **/
    String getDescription();

    /**
     * This method sets the description property of a Server instance to the given description parameter.
     * <p>
     * Description of a server is an optional string describing the host designated by the URL. CommonMark syntax can be used for rich text
     * representation.
     * </p>
     * @param description an optional string describing the host designated by the URL
     */
    void setDescription(String description);

    /**
     * This method sets the description property of a Server instance to the given description parameter and returns the modified instance.
     * <p>
     * Description of a server is an optional string describing the host designated by the URL. CommonMark syntax can be used for rich text
     * representation.
     * </p> 
     * @param description an optional string describing the host designated by the URL
     * @return Server instance with the set description property.
     */
    default Server description(String description) {
        setDescription(description);
        return this;
    }

    /**
     * This method returns the variables property of Server instance.
     * <p>
     * Variables are represented as a map between variable name and its value. The value is used for substitution in the server's URL template.
     * </p> 
     * @return ServerVariables variables
     * @deprecated since 1.1, use <code>getServerVariables()</code> instead.  In the future this method will instead return a <code>Map<String, ServerVariable></code>.
     **/
    @Deprecated
    ServerVariables getVariables();
    
    /**
     * This method returns the variables property of the Server instance.
     * <p>
     * Variables are represented as a map between variable name and its value. The value is used for substitution in the server's URL template.
     * </p>
     * <p>
     * This method replaces <code>getVariables()</code> (which is deprecated) as part of an effort to eventually remove 
     * the {@link ServerVariables} class.  A future version of this class will likely transition this method back to 
     * being named <code>getVariables()</code> once the current method with that name is removed.
     * </p>
     * @return ServerVariables variables
     */
    Map<String, ServerVariable> getServerVariables();

    /**
     * This method sets the variables property of Server instance to the given variables argument.
     * <p>
     * Variables property is a map between variable name and its value. The value is used for substitution in the server's URL template.
     * </p>
     * @param variables a map between variable name and its value
     * @deprecated since 1.1, use <code>setVariables(Map<String, ServerVariable>)</code> instead
     */
    @Deprecated
    void setVariables(ServerVariables variables);
    
    /**
     * This method sets the variables property of Server instance to the given variables argument.
     * <p>
     * Variables property is a map between variable name and its value. The value is used for substitution in the server's URL template.
     * </p>
     * @param variables a map between variable name and its value
     */
    void setVariables(Map<String, ServerVariable> variables);
    
    /**
     * This method sets the variables property of Server instance to the given variables argument and returns the modified instance.
     * <p>
     * Variables property is a map between variable name and its value. The value is used for substitution in the server's URL template.
     * </p>
     * @param variables a map between variable name and its value
     * @return Server instance with the set variables property.
     * @deprecated since 1.1, use <code>setVariables(Map<String, ServerVariable>)</code> instead
     */
    @Deprecated
    default Server variables(ServerVariables variables) {
        setVariables(variables);
        return this;
    }

    /**
     * This method sets the variables property of Server instance to the given variables argument and returns the modified instance.
     * <p>
     * Variables property is a map between variable name and its value. The value is used for substitution in the server's URL template.
     * </p>
     * @param variables a map between variable name and its value
     * @return Server instance with the set variables property.
     */
    default Server variables(Map<String, ServerVariable> variables) {
        setVariables(variables);
        return this;
    }
}