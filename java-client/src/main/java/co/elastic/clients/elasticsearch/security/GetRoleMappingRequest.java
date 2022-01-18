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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: security.get_role_mapping.Request

/**
 * Retrieves role mappings.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.get_role_mapping.Request">API
 *      specification</a>
 */

public class GetRoleMappingRequest extends RequestBase {
	private final List<String> name;

	// ---------------------------------------------------------------------------------------------

	private GetRoleMappingRequest(Builder builder) {

		this.name = ApiTypeHelper.unmodifiable(builder.name);

	}

	public static GetRoleMappingRequest of(Function<Builder, ObjectBuilder<GetRoleMappingRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The distinct name that identifies the role mapping. The name is used solely
	 * as an identifier to facilitate interaction via the API; it does not affect
	 * the behavior of the mapping in any way. You can specify multiple mapping
	 * names as a comma-separated list. If you do not specify this parameter, the
	 * API returns information about all role mappings.
	 * <p>
	 * API name: {@code name}
	 */
	public final List<String> name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRoleMappingRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetRoleMappingRequest> {
		@Nullable
		private List<String> name;

		/**
		 * The distinct name that identifies the role mapping. The name is used solely
		 * as an identifier to facilitate interaction via the API; it does not affect
		 * the behavior of the mapping in any way. You can specify multiple mapping
		 * names as a comma-separated list. If you do not specify this parameter, the
		 * API returns information about all role mappings.
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>name</code>.
		 */
		public final Builder name(List<String> list) {
			this.name = _listAddAll(this.name, list);
			return this;
		}

		/**
		 * The distinct name that identifies the role mapping. The name is used solely
		 * as an identifier to facilitate interaction via the API; it does not affect
		 * the behavior of the mapping in any way. You can specify multiple mapping
		 * names as a comma-separated list. If you do not specify this parameter, the
		 * API returns information about all role mappings.
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds one or more values to <code>name</code>.
		 */
		public final Builder name(String value, String... values) {
			this.name = _listAdd(this.name, value, values);
			return this;
		}

		/**
		 * Builds a {@link GetRoleMappingRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRoleMappingRequest build() {
			_checkSingleUse();

			return new GetRoleMappingRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_role_mapping}".
	 */
	public static final Endpoint<GetRoleMappingRequest, GetRoleMappingResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.get_role_mapping",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.name()))
					propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/role_mapping");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/role_mapping");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetRoleMappingResponse._DESERIALIZER);
}
