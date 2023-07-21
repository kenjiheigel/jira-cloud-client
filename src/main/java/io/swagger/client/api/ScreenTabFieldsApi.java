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


import io.swagger.client.model.AddFieldBean;
import io.swagger.client.model.MoveFieldBean;
import io.swagger.client.model.ScreenableField;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScreenTabFieldsApi {
    private ApiClient apiClient;

    public ScreenTabFieldsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ScreenTabFieldsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addScreenTabField
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addScreenTabFieldCall(AddFieldBean body, Long screenId, Long tabId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/screens/{screenId}/tabs/{tabId}/fields"
            .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()))
            .replaceAll("\\{" + "tabId" + "\\}", apiClient.escapeString(tabId.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addScreenTabFieldValidateBeforeCall(AddFieldBean body, Long screenId, Long tabId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addScreenTabField(Async)");
        }
        // verify the required parameter 'screenId' is set
        if (screenId == null) {
            throw new ApiException("Missing the required parameter 'screenId' when calling addScreenTabField(Async)");
        }
        // verify the required parameter 'tabId' is set
        if (tabId == null) {
            throw new ApiException("Missing the required parameter 'tabId' when calling addScreenTabField(Async)");
        }
        
        com.squareup.okhttp.Call call = addScreenTabFieldCall(body, screenId, tabId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add screen tab field
     * Adds a field to a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @return ScreenableField
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ScreenableField addScreenTabField(AddFieldBean body, Long screenId, Long tabId) throws ApiException {
        ApiResponse<ScreenableField> resp = addScreenTabFieldWithHttpInfo(body, screenId, tabId);
        return resp.getData();
    }

    /**
     * Add screen tab field
     * Adds a field to a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @return ApiResponse&lt;ScreenableField&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ScreenableField> addScreenTabFieldWithHttpInfo(AddFieldBean body, Long screenId, Long tabId) throws ApiException {
        com.squareup.okhttp.Call call = addScreenTabFieldValidateBeforeCall(body, screenId, tabId, null, null);
        Type localVarReturnType = new TypeToken<ScreenableField>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add screen tab field (asynchronously)
     * Adds a field to a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addScreenTabFieldAsync(AddFieldBean body, Long screenId, Long tabId, final ApiCallback<ScreenableField> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addScreenTabFieldValidateBeforeCall(body, screenId, tabId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ScreenableField>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllScreenTabFields
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param projectKey The key of the project. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllScreenTabFieldsCall(Long screenId, Long tabId, String projectKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/screens/{screenId}/tabs/{tabId}/fields"
            .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()))
            .replaceAll("\\{" + "tabId" + "\\}", apiClient.escapeString(tabId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (projectKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("projectKey", projectKey));

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
    private com.squareup.okhttp.Call getAllScreenTabFieldsValidateBeforeCall(Long screenId, Long tabId, String projectKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'screenId' is set
        if (screenId == null) {
            throw new ApiException("Missing the required parameter 'screenId' when calling getAllScreenTabFields(Async)");
        }
        // verify the required parameter 'tabId' is set
        if (tabId == null) {
            throw new ApiException("Missing the required parameter 'tabId' when calling getAllScreenTabFields(Async)");
        }
        
        com.squareup.okhttp.Call call = getAllScreenTabFieldsCall(screenId, tabId, projectKey, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all screen tab fields
     * Returns all fields for a screen tab.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param projectKey The key of the project. (optional)
     * @return List&lt;ScreenableField&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ScreenableField> getAllScreenTabFields(Long screenId, Long tabId, String projectKey) throws ApiException {
        ApiResponse<List<ScreenableField>> resp = getAllScreenTabFieldsWithHttpInfo(screenId, tabId, projectKey);
        return resp.getData();
    }

    /**
     * Get all screen tab fields
     * Returns all fields for a screen tab.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param projectKey The key of the project. (optional)
     * @return ApiResponse&lt;List&lt;ScreenableField&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ScreenableField>> getAllScreenTabFieldsWithHttpInfo(Long screenId, Long tabId, String projectKey) throws ApiException {
        com.squareup.okhttp.Call call = getAllScreenTabFieldsValidateBeforeCall(screenId, tabId, projectKey, null, null);
        Type localVarReturnType = new TypeToken<List<ScreenableField>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all screen tab fields (asynchronously)
     * Returns all fields for a screen tab.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param projectKey The key of the project. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllScreenTabFieldsAsync(Long screenId, Long tabId, String projectKey, final ApiCallback<List<ScreenableField>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllScreenTabFieldsValidateBeforeCall(screenId, tabId, projectKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ScreenableField>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for moveScreenTabField
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param id The ID of the field. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call moveScreenTabFieldCall(MoveFieldBean body, Long screenId, Long tabId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/screens/{screenId}/tabs/{tabId}/fields/{id}/move"
            .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()))
            .replaceAll("\\{" + "tabId" + "\\}", apiClient.escapeString(tabId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call moveScreenTabFieldValidateBeforeCall(MoveFieldBean body, Long screenId, Long tabId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling moveScreenTabField(Async)");
        }
        // verify the required parameter 'screenId' is set
        if (screenId == null) {
            throw new ApiException("Missing the required parameter 'screenId' when calling moveScreenTabField(Async)");
        }
        // verify the required parameter 'tabId' is set
        if (tabId == null) {
            throw new ApiException("Missing the required parameter 'tabId' when calling moveScreenTabField(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling moveScreenTabField(Async)");
        }
        
        com.squareup.okhttp.Call call = moveScreenTabFieldCall(body, screenId, tabId, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Move screen tab field
     * Moves a screen tab field.  If &#x60;after&#x60; and &#x60;position&#x60; are provided in the request, &#x60;position&#x60; is ignored.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param id The ID of the field. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object moveScreenTabField(MoveFieldBean body, Long screenId, Long tabId, String id) throws ApiException {
        ApiResponse<Object> resp = moveScreenTabFieldWithHttpInfo(body, screenId, tabId, id);
        return resp.getData();
    }

    /**
     * Move screen tab field
     * Moves a screen tab field.  If &#x60;after&#x60; and &#x60;position&#x60; are provided in the request, &#x60;position&#x60; is ignored.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param id The ID of the field. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> moveScreenTabFieldWithHttpInfo(MoveFieldBean body, Long screenId, Long tabId, String id) throws ApiException {
        com.squareup.okhttp.Call call = moveScreenTabFieldValidateBeforeCall(body, screenId, tabId, id, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Move screen tab field (asynchronously)
     * Moves a screen tab field.  If &#x60;after&#x60; and &#x60;position&#x60; are provided in the request, &#x60;position&#x60; is ignored.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param id The ID of the field. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call moveScreenTabFieldAsync(MoveFieldBean body, Long screenId, Long tabId, String id, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = moveScreenTabFieldValidateBeforeCall(body, screenId, tabId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for removeScreenTabField
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param id The ID of the field. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removeScreenTabFieldCall(Long screenId, Long tabId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/screens/{screenId}/tabs/{tabId}/fields/{id}"
            .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()))
            .replaceAll("\\{" + "tabId" + "\\}", apiClient.escapeString(tabId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call removeScreenTabFieldValidateBeforeCall(Long screenId, Long tabId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'screenId' is set
        if (screenId == null) {
            throw new ApiException("Missing the required parameter 'screenId' when calling removeScreenTabField(Async)");
        }
        // verify the required parameter 'tabId' is set
        if (tabId == null) {
            throw new ApiException("Missing the required parameter 'tabId' when calling removeScreenTabField(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling removeScreenTabField(Async)");
        }
        
        com.squareup.okhttp.Call call = removeScreenTabFieldCall(screenId, tabId, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Remove screen tab field
     * Removes a field from a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param id The ID of the field. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void removeScreenTabField(Long screenId, Long tabId, String id) throws ApiException {
        removeScreenTabFieldWithHttpInfo(screenId, tabId, id);
    }

    /**
     * Remove screen tab field
     * Removes a field from a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param id The ID of the field. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> removeScreenTabFieldWithHttpInfo(Long screenId, Long tabId, String id) throws ApiException {
        com.squareup.okhttp.Call call = removeScreenTabFieldValidateBeforeCall(screenId, tabId, id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Remove screen tab field (asynchronously)
     * Removes a field from a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param id The ID of the field. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removeScreenTabFieldAsync(Long screenId, Long tabId, String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = removeScreenTabFieldValidateBeforeCall(screenId, tabId, id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
