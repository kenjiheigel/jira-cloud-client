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


import io.swagger.client.model.ScreenableTab;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScreenTabsApi {
    private ApiClient apiClient;

    public ScreenTabsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ScreenTabsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addScreenTab
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addScreenTabCall(ScreenableTab body, Long screenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/screens/{screenId}/tabs"
            .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()));

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
    private com.squareup.okhttp.Call addScreenTabValidateBeforeCall(ScreenableTab body, Long screenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addScreenTab(Async)");
        }
        // verify the required parameter 'screenId' is set
        if (screenId == null) {
            throw new ApiException("Missing the required parameter 'screenId' when calling addScreenTab(Async)");
        }
        
        com.squareup.okhttp.Call call = addScreenTabCall(body, screenId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create screen tab
     * Creates a tab for a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @return ScreenableTab
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ScreenableTab addScreenTab(ScreenableTab body, Long screenId) throws ApiException {
        ApiResponse<ScreenableTab> resp = addScreenTabWithHttpInfo(body, screenId);
        return resp.getData();
    }

    /**
     * Create screen tab
     * Creates a tab for a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @return ApiResponse&lt;ScreenableTab&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ScreenableTab> addScreenTabWithHttpInfo(ScreenableTab body, Long screenId) throws ApiException {
        com.squareup.okhttp.Call call = addScreenTabValidateBeforeCall(body, screenId, null, null);
        Type localVarReturnType = new TypeToken<ScreenableTab>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create screen tab (asynchronously)
     * Creates a tab for a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addScreenTabAsync(ScreenableTab body, Long screenId, final ApiCallback<ScreenableTab> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addScreenTabValidateBeforeCall(body, screenId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ScreenableTab>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteScreenTab
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteScreenTabCall(Long screenId, Long tabId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/screens/{screenId}/tabs/{tabId}"
            .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()))
            .replaceAll("\\{" + "tabId" + "\\}", apiClient.escapeString(tabId.toString()));

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
    private com.squareup.okhttp.Call deleteScreenTabValidateBeforeCall(Long screenId, Long tabId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'screenId' is set
        if (screenId == null) {
            throw new ApiException("Missing the required parameter 'screenId' when calling deleteScreenTab(Async)");
        }
        // verify the required parameter 'tabId' is set
        if (tabId == null) {
            throw new ApiException("Missing the required parameter 'tabId' when calling deleteScreenTab(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteScreenTabCall(screenId, tabId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete screen tab
     * Deletes a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteScreenTab(Long screenId, Long tabId) throws ApiException {
        deleteScreenTabWithHttpInfo(screenId, tabId);
    }

    /**
     * Delete screen tab
     * Deletes a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteScreenTabWithHttpInfo(Long screenId, Long tabId) throws ApiException {
        com.squareup.okhttp.Call call = deleteScreenTabValidateBeforeCall(screenId, tabId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete screen tab (asynchronously)
     * Deletes a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteScreenTabAsync(Long screenId, Long tabId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteScreenTabValidateBeforeCall(screenId, tabId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAllScreenTabs
     * @param screenId The ID of the screen. (required)
     * @param projectKey The key of the project. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllScreenTabsCall(Long screenId, String projectKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/screens/{screenId}/tabs"
            .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()));

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
    private com.squareup.okhttp.Call getAllScreenTabsValidateBeforeCall(Long screenId, String projectKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'screenId' is set
        if (screenId == null) {
            throw new ApiException("Missing the required parameter 'screenId' when calling getAllScreenTabs(Async)");
        }
        
        com.squareup.okhttp.Call call = getAllScreenTabsCall(screenId, projectKey, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all screen tabs
     * Returns the list of tabs for a screen.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
     * @param screenId The ID of the screen. (required)
     * @param projectKey The key of the project. (optional)
     * @return List&lt;ScreenableTab&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ScreenableTab> getAllScreenTabs(Long screenId, String projectKey) throws ApiException {
        ApiResponse<List<ScreenableTab>> resp = getAllScreenTabsWithHttpInfo(screenId, projectKey);
        return resp.getData();
    }

    /**
     * Get all screen tabs
     * Returns the list of tabs for a screen.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
     * @param screenId The ID of the screen. (required)
     * @param projectKey The key of the project. (optional)
     * @return ApiResponse&lt;List&lt;ScreenableTab&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ScreenableTab>> getAllScreenTabsWithHttpInfo(Long screenId, String projectKey) throws ApiException {
        com.squareup.okhttp.Call call = getAllScreenTabsValidateBeforeCall(screenId, projectKey, null, null);
        Type localVarReturnType = new TypeToken<List<ScreenableTab>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all screen tabs (asynchronously)
     * Returns the list of tabs for a screen.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
     * @param screenId The ID of the screen. (required)
     * @param projectKey The key of the project. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllScreenTabsAsync(Long screenId, String projectKey, final ApiCallback<List<ScreenableTab>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllScreenTabsValidateBeforeCall(screenId, projectKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ScreenableTab>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for moveScreenTab
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param pos The position of tab. The base index is 0. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call moveScreenTabCall(Long screenId, Long tabId, Integer pos, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/screens/{screenId}/tabs/{tabId}/move/{pos}"
            .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()))
            .replaceAll("\\{" + "tabId" + "\\}", apiClient.escapeString(tabId.toString()))
            .replaceAll("\\{" + "pos" + "\\}", apiClient.escapeString(pos.toString()));

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
    private com.squareup.okhttp.Call moveScreenTabValidateBeforeCall(Long screenId, Long tabId, Integer pos, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'screenId' is set
        if (screenId == null) {
            throw new ApiException("Missing the required parameter 'screenId' when calling moveScreenTab(Async)");
        }
        // verify the required parameter 'tabId' is set
        if (tabId == null) {
            throw new ApiException("Missing the required parameter 'tabId' when calling moveScreenTab(Async)");
        }
        // verify the required parameter 'pos' is set
        if (pos == null) {
            throw new ApiException("Missing the required parameter 'pos' when calling moveScreenTab(Async)");
        }
        
        com.squareup.okhttp.Call call = moveScreenTabCall(screenId, tabId, pos, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Move screen tab
     * Moves a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param pos The position of tab. The base index is 0. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object moveScreenTab(Long screenId, Long tabId, Integer pos) throws ApiException {
        ApiResponse<Object> resp = moveScreenTabWithHttpInfo(screenId, tabId, pos);
        return resp.getData();
    }

    /**
     * Move screen tab
     * Moves a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param pos The position of tab. The base index is 0. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> moveScreenTabWithHttpInfo(Long screenId, Long tabId, Integer pos) throws ApiException {
        com.squareup.okhttp.Call call = moveScreenTabValidateBeforeCall(screenId, tabId, pos, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Move screen tab (asynchronously)
     * Moves a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param pos The position of tab. The base index is 0. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call moveScreenTabAsync(Long screenId, Long tabId, Integer pos, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = moveScreenTabValidateBeforeCall(screenId, tabId, pos, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for renameScreenTab
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call renameScreenTabCall(ScreenableTab body, Long screenId, Long tabId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/screens/{screenId}/tabs/{tabId}"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call renameScreenTabValidateBeforeCall(ScreenableTab body, Long screenId, Long tabId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling renameScreenTab(Async)");
        }
        // verify the required parameter 'screenId' is set
        if (screenId == null) {
            throw new ApiException("Missing the required parameter 'screenId' when calling renameScreenTab(Async)");
        }
        // verify the required parameter 'tabId' is set
        if (tabId == null) {
            throw new ApiException("Missing the required parameter 'tabId' when calling renameScreenTab(Async)");
        }
        
        com.squareup.okhttp.Call call = renameScreenTabCall(body, screenId, tabId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update screen tab
     * Updates the name of a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @return ScreenableTab
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ScreenableTab renameScreenTab(ScreenableTab body, Long screenId, Long tabId) throws ApiException {
        ApiResponse<ScreenableTab> resp = renameScreenTabWithHttpInfo(body, screenId, tabId);
        return resp.getData();
    }

    /**
     * Update screen tab
     * Updates the name of a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @return ApiResponse&lt;ScreenableTab&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ScreenableTab> renameScreenTabWithHttpInfo(ScreenableTab body, Long screenId, Long tabId) throws ApiException {
        com.squareup.okhttp.Call call = renameScreenTabValidateBeforeCall(body, screenId, tabId, null, null);
        Type localVarReturnType = new TypeToken<ScreenableTab>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update screen tab (asynchronously)
     * Updates the name of a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param body  (required)
     * @param screenId The ID of the screen. (required)
     * @param tabId The ID of the screen tab. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call renameScreenTabAsync(ScreenableTab body, Long screenId, Long tabId, final ApiCallback<ScreenableTab> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = renameScreenTabValidateBeforeCall(body, screenId, tabId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ScreenableTab>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
