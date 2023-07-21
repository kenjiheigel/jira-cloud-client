# AppPropertiesApi

All URIs are relative to *https://your-domain.atlassian.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addonPropertiesResourceDeleteAddonPropertyDelete**](AppPropertiesApi.md#addonPropertiesResourceDeleteAddonPropertyDelete) | **DELETE** /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey} | Delete app property
[**addonPropertiesResourceDeleteAppPropertyDelete**](AppPropertiesApi.md#addonPropertiesResourceDeleteAppPropertyDelete) | **DELETE** /rest/forge/1/app/properties/{propertyKey} | Delete app property (Forge)
[**addonPropertiesResourceGetAddonPropertiesGet**](AppPropertiesApi.md#addonPropertiesResourceGetAddonPropertiesGet) | **GET** /rest/atlassian-connect/1/addons/{addonKey}/properties | Get app properties
[**addonPropertiesResourceGetAddonPropertyGet**](AppPropertiesApi.md#addonPropertiesResourceGetAddonPropertyGet) | **GET** /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey} | Get app property
[**addonPropertiesResourcePutAddonPropertyPut**](AppPropertiesApi.md#addonPropertiesResourcePutAddonPropertyPut) | **PUT** /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey} | Set app property
[**addonPropertiesResourcePutAppPropertyPut**](AppPropertiesApi.md#addonPropertiesResourcePutAppPropertyPut) | **PUT** /rest/forge/1/app/properties/{propertyKey} | Set app property (Forge)

<a name="addonPropertiesResourceDeleteAddonPropertyDelete"></a>
# **addonPropertiesResourceDeleteAddonPropertyDelete**
> addonPropertiesResourceDeleteAddonPropertyDelete(addonKey, propertyKey)

Delete app property

Deletes an app&#x27;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AppPropertiesApi;


AppPropertiesApi apiInstance = new AppPropertiesApi();
String addonKey = "addonKey_example"; // String | The key of the app, as defined in its descriptor.
String propertyKey = "propertyKey_example"; // String | The key of the property.
try {
    apiInstance.addonPropertiesResourceDeleteAddonPropertyDelete(addonKey, propertyKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AppPropertiesApi#addonPropertiesResourceDeleteAddonPropertyDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonKey** | **String**| The key of the app, as defined in its descriptor. |
 **propertyKey** | **String**| The key of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonPropertiesResourceDeleteAppPropertyDelete"></a>
# **addonPropertiesResourceDeleteAppPropertyDelete**
> addonPropertiesResourceDeleteAppPropertyDelete(propertyKey)

Delete app property (Forge)

Deletes a Forge app&#x27;s property.  **[Permissions](#permissions) required:** Only Forge apps can make this request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AppPropertiesApi apiInstance = new AppPropertiesApi();
String propertyKey = "propertyKey_example"; // String | The key of the property.
try {
    apiInstance.addonPropertiesResourceDeleteAppPropertyDelete(propertyKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AppPropertiesApi#addonPropertiesResourceDeleteAppPropertyDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyKey** | **String**| The key of the property. |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonPropertiesResourceGetAddonPropertiesGet"></a>
# **addonPropertiesResourceGetAddonPropertiesGet**
> PropertyKeys addonPropertiesResourceGetAddonPropertiesGet(addonKey)

Get app properties

Gets all the properties of an app.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request. Additionally, Forge apps published on the Marketplace can access properties of Connect apps they were [migrated from](https://developer.atlassian.com/platform/forge/build-a-connect-on-forge-app/).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AppPropertiesApi apiInstance = new AppPropertiesApi();
String addonKey = "addonKey_example"; // String | The key of the app, as defined in its descriptor.
try {
    PropertyKeys result = apiInstance.addonPropertiesResourceGetAddonPropertiesGet(addonKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppPropertiesApi#addonPropertiesResourceGetAddonPropertiesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonKey** | **String**| The key of the app, as defined in its descriptor. |

### Return type

[**PropertyKeys**](PropertyKeys.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonPropertiesResourceGetAddonPropertyGet"></a>
# **addonPropertiesResourceGetAddonPropertyGet**
> EntityProperty addonPropertiesResourceGetAddonPropertyGet(addonKey, propertyKey)

Get app property

Returns the key and value of an app&#x27;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request. Additionally, Forge apps published on the Marketplace can access properties of Connect apps they were [migrated from](https://developer.atlassian.com/platform/forge/build-a-connect-on-forge-app/).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AppPropertiesApi apiInstance = new AppPropertiesApi();
String addonKey = "addonKey_example"; // String | The key of the app, as defined in its descriptor.
String propertyKey = "propertyKey_example"; // String | The key of the property.
try {
    EntityProperty result = apiInstance.addonPropertiesResourceGetAddonPropertyGet(addonKey, propertyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppPropertiesApi#addonPropertiesResourceGetAddonPropertyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonKey** | **String**| The key of the app, as defined in its descriptor. |
 **propertyKey** | **String**| The key of the property. |

### Return type

[**EntityProperty**](EntityProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonPropertiesResourcePutAddonPropertyPut"></a>
# **addonPropertiesResourcePutAddonPropertyPut**
> OperationMessage addonPropertiesResourcePutAddonPropertyPut(body, addonKey, propertyKey)

Set app property

Sets the value of an app&#x27;s property. Use this resource to store custom data for your app.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AppPropertiesApi;


AppPropertiesApi apiInstance = new AppPropertiesApi();
Object body = null; // Object | 
String addonKey = "addonKey_example"; // String | The key of the app, as defined in its descriptor.
String propertyKey = "propertyKey_example"; // String | The key of the property.
try {
    OperationMessage result = apiInstance.addonPropertiesResourcePutAddonPropertyPut(body, addonKey, propertyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppPropertiesApi#addonPropertiesResourcePutAddonPropertyPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **addonKey** | **String**| The key of the app, as defined in its descriptor. |
 **propertyKey** | **String**| The key of the property. |

### Return type

[**OperationMessage**](OperationMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addonPropertiesResourcePutAppPropertyPut"></a>
# **addonPropertiesResourcePutAppPropertyPut**
> OperationMessage addonPropertiesResourcePutAppPropertyPut(body, propertyKey)

Set app property (Forge)

Sets the value of a Forge app&#x27;s property. These values can be retrieved in [Jira expressions](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/) through the &#x60;app&#x60; [context variable](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables).  For other use cases, use the [Storage API](https://developer.atlassian.com/platform/forge/runtime-reference/storage-api/).  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only Forge apps can make this request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AppPropertiesApi apiInstance = new AppPropertiesApi();
Object body = null; // Object | 
String propertyKey = "propertyKey_example"; // String | The key of the property.
try {
    OperationMessage result = apiInstance.addonPropertiesResourcePutAppPropertyPut(body, propertyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppPropertiesApi#addonPropertiesResourcePutAppPropertyPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **propertyKey** | **String**| The key of the property. |

### Return type

[**OperationMessage**](OperationMessage.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

