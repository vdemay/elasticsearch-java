/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// typedef: cat.nodeattrs.Request

/**
 * Returns information about custom node attributes.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.nodeattrs.Request">API
 *      specification</a>
 */

public class NodeattrsRequest extends CatRequestBase {
	public NodeattrsRequest() {
	}

	/**
	 * Singleton instance for {@link NodeattrsRequest}.
	 */
	public static final NodeattrsRequest _INSTANCE = new NodeattrsRequest();

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.nodeattrs}".
	 */
	public static final Endpoint<NodeattrsRequest, NodeattrsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.nodeattrs",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_cat/nodeattrs";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				return params;

			}, SimpleEndpoint.emptyMap(), false, NodeattrsResponse._DESERIALIZER);
}
