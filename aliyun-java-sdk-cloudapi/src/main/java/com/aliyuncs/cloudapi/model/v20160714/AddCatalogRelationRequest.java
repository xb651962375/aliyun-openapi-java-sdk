/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AddCatalogRelationRequest extends RpcAcsRequest<AddCatalogRelationResponse> {
	
	public AddCatalogRelationRequest() {
		super("CloudAPI", "2016-07-14", "AddCatalogRelation", "apigateway");
	}



	private String catalogId;



	private String apiId;



	public String getCatalogId() {

		return this.catalogId;

	}



	public void setCatalogId(String catalogId) {

		this.catalogId = catalogId;

		putQueryParameter("CatalogId", catalogId);

	}



	public String getApiId() {

		return this.apiId;

	}



	public void setApiId(String apiId) {

		this.apiId = apiId;

		putQueryParameter("ApiId", apiId);

	}

	@Override
	public Class<AddCatalogRelationResponse> getResponseClass() {
		return AddCatalogRelationResponse.class;
	}

}
