/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * OpenAPI spec version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.CustomFieldConfigurations;
import io.swagger.client.model.PageBeanContextualConfiguration;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssueCustomFieldConfigurationAppsApi {
    private ApiClient apiClient;

    public IssueCustomFieldConfigurationAppsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IssueCustomFieldConfigurationAppsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCustomFieldConfiguration
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @param id The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. Can&#x27;t be provided with &#x60;fieldContextId&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param fieldContextId The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: &#x60;fieldContextId&#x3D;10000&amp;fieldContextId&#x3D;10001&#x60;. Can&#x27;t be provided with &#x60;id&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param issueId The ID of the issue to filter results by. If the issue doesn&#x27;t exist, an empty list is returned. Can&#x27;t be provided with &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param projectKeyOrId The ID or key of the project to filter results by. Must be provided with &#x60;issueTypeId&#x60;. Can&#x27;t be provided with &#x60;issueId&#x60;. (optional)
     * @param issueTypeId The ID of the issue type to filter results by. Must be provided with &#x60;projectKeyOrId&#x60;. Can&#x27;t be provided with &#x60;issueId&#x60;. (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCustomFieldConfigurationCall(String fieldIdOrKey, List<Long> id, List<Long> fieldContextId, Long issueId, String projectKeyOrId, String issueTypeId, Long startAt, Integer maxResults, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/app/field/{fieldIdOrKey}/context/configuration"
            .replaceAll("\\{" + "fieldIdOrKey" + "\\}", apiClient.escapeString(fieldIdOrKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "id", id));
        if (fieldContextId != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fieldContextId", fieldContextId));
        if (issueId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("issueId", issueId));
        if (projectKeyOrId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("projectKeyOrId", projectKeyOrId));
        if (issueTypeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("issueTypeId", issueTypeId));
        if (startAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startAt", startAt));
        if (maxResults != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("maxResults", maxResults));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCustomFieldConfigurationValidateBeforeCall(String fieldIdOrKey, List<Long> id, List<Long> fieldContextId, Long issueId, String projectKeyOrId, String issueTypeId, Long startAt, Integer maxResults, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'fieldIdOrKey' is set
        if (fieldIdOrKey == null) {
            throw new ApiException("Missing the required parameter 'fieldIdOrKey' when calling getCustomFieldConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = getCustomFieldConfigurationCall(fieldIdOrKey, id, fieldContextId, issueId, projectKeyOrId, issueTypeId, startAt, maxResults, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get custom field configurations
     * Returns a [paginated](#pagination) list of configurations for a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  The result can be filtered by one of these criteria:   *  &#x60;id&#x60;.  *  &#x60;fieldContextId&#x60;.  *  &#x60;issueId&#x60;.  *  &#x60;projectKeyOrId&#x60; and &#x60;issueTypeId&#x60;.  Otherwise, all configurations are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @param id The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. Can&#x27;t be provided with &#x60;fieldContextId&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param fieldContextId The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: &#x60;fieldContextId&#x3D;10000&amp;fieldContextId&#x3D;10001&#x60;. Can&#x27;t be provided with &#x60;id&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param issueId The ID of the issue to filter results by. If the issue doesn&#x27;t exist, an empty list is returned. Can&#x27;t be provided with &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param projectKeyOrId The ID or key of the project to filter results by. Must be provided with &#x60;issueTypeId&#x60;. Can&#x27;t be provided with &#x60;issueId&#x60;. (optional)
     * @param issueTypeId The ID of the issue type to filter results by. Must be provided with &#x60;projectKeyOrId&#x60;. Can&#x27;t be provided with &#x60;issueId&#x60;. (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @return PageBeanContextualConfiguration
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageBeanContextualConfiguration getCustomFieldConfiguration(String fieldIdOrKey, List<Long> id, List<Long> fieldContextId, Long issueId, String projectKeyOrId, String issueTypeId, Long startAt, Integer maxResults) throws ApiException {
        ApiResponse<PageBeanContextualConfiguration> resp = getCustomFieldConfigurationWithHttpInfo(fieldIdOrKey, id, fieldContextId, issueId, projectKeyOrId, issueTypeId, startAt, maxResults);
        return resp.getData();
    }

    /**
     * Get custom field configurations
     * Returns a [paginated](#pagination) list of configurations for a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  The result can be filtered by one of these criteria:   *  &#x60;id&#x60;.  *  &#x60;fieldContextId&#x60;.  *  &#x60;issueId&#x60;.  *  &#x60;projectKeyOrId&#x60; and &#x60;issueTypeId&#x60;.  Otherwise, all configurations are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @param id The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. Can&#x27;t be provided with &#x60;fieldContextId&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param fieldContextId The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: &#x60;fieldContextId&#x3D;10000&amp;fieldContextId&#x3D;10001&#x60;. Can&#x27;t be provided with &#x60;id&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param issueId The ID of the issue to filter results by. If the issue doesn&#x27;t exist, an empty list is returned. Can&#x27;t be provided with &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param projectKeyOrId The ID or key of the project to filter results by. Must be provided with &#x60;issueTypeId&#x60;. Can&#x27;t be provided with &#x60;issueId&#x60;. (optional)
     * @param issueTypeId The ID of the issue type to filter results by. Must be provided with &#x60;projectKeyOrId&#x60;. Can&#x27;t be provided with &#x60;issueId&#x60;. (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @return ApiResponse&lt;PageBeanContextualConfiguration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageBeanContextualConfiguration> getCustomFieldConfigurationWithHttpInfo(String fieldIdOrKey, List<Long> id, List<Long> fieldContextId, Long issueId, String projectKeyOrId, String issueTypeId, Long startAt, Integer maxResults) throws ApiException {
        com.squareup.okhttp.Call call = getCustomFieldConfigurationValidateBeforeCall(fieldIdOrKey, id, fieldContextId, issueId, projectKeyOrId, issueTypeId, startAt, maxResults, null, null);
        Type localVarReturnType = new TypeToken<PageBeanContextualConfiguration>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get custom field configurations (asynchronously)
     * Returns a [paginated](#pagination) list of configurations for a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  The result can be filtered by one of these criteria:   *  &#x60;id&#x60;.  *  &#x60;fieldContextId&#x60;.  *  &#x60;issueId&#x60;.  *  &#x60;projectKeyOrId&#x60; and &#x60;issueTypeId&#x60;.  Otherwise, all configurations are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @param id The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. Can&#x27;t be provided with &#x60;fieldContextId&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param fieldContextId The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: &#x60;fieldContextId&#x3D;10000&amp;fieldContextId&#x3D;10001&#x60;. Can&#x27;t be provided with &#x60;id&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param issueId The ID of the issue to filter results by. If the issue doesn&#x27;t exist, an empty list is returned. Can&#x27;t be provided with &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param projectKeyOrId The ID or key of the project to filter results by. Must be provided with &#x60;issueTypeId&#x60;. Can&#x27;t be provided with &#x60;issueId&#x60;. (optional)
     * @param issueTypeId The ID of the issue type to filter results by. Must be provided with &#x60;projectKeyOrId&#x60;. Can&#x27;t be provided with &#x60;issueId&#x60;. (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCustomFieldConfigurationAsync(String fieldIdOrKey, List<Long> id, List<Long> fieldContextId, Long issueId, String projectKeyOrId, String issueTypeId, Long startAt, Integer maxResults, final ApiCallback<PageBeanContextualConfiguration> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCustomFieldConfigurationValidateBeforeCall(fieldIdOrKey, id, fieldContextId, issueId, projectKeyOrId, issueTypeId, startAt, maxResults, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageBeanContextualConfiguration>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateCustomFieldConfiguration
     * @param body  (required)
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCustomFieldConfigurationCall(CustomFieldConfigurations body, String fieldIdOrKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/app/field/{fieldIdOrKey}/context/configuration"
            .replaceAll("\\{" + "fieldIdOrKey" + "\\}", apiClient.escapeString(fieldIdOrKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateCustomFieldConfigurationValidateBeforeCall(CustomFieldConfigurations body, String fieldIdOrKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateCustomFieldConfiguration(Async)");
        }
        // verify the required parameter 'fieldIdOrKey' is set
        if (fieldIdOrKey == null) {
            throw new ApiException("Missing the required parameter 'fieldIdOrKey' when calling updateCustomFieldConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = updateCustomFieldConfigurationCall(body, fieldIdOrKey, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update custom field configurations
     * Update the configuration for contexts of a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     * @param body  (required)
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object updateCustomFieldConfiguration(CustomFieldConfigurations body, String fieldIdOrKey) throws ApiException {
        ApiResponse<Object> resp = updateCustomFieldConfigurationWithHttpInfo(body, fieldIdOrKey);
        return resp.getData();
    }

    /**
     * Update custom field configurations
     * Update the configuration for contexts of a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     * @param body  (required)
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> updateCustomFieldConfigurationWithHttpInfo(CustomFieldConfigurations body, String fieldIdOrKey) throws ApiException {
        com.squareup.okhttp.Call call = updateCustomFieldConfigurationValidateBeforeCall(body, fieldIdOrKey, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update custom field configurations (asynchronously)
     * Update the configuration for contexts of a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     * @param body  (required)
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCustomFieldConfigurationAsync(CustomFieldConfigurations body, String fieldIdOrKey, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateCustomFieldConfigurationValidateBeforeCall(body, fieldIdOrKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}