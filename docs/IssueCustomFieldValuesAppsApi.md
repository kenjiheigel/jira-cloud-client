# IssueCustomFieldValuesAppsApi

All URIs are relative to *https://your-domain.atlassian.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateCustomFieldValue**](IssueCustomFieldValuesAppsApi.md#updateCustomFieldValue) | **PUT** /rest/api/3/app/field/{fieldIdOrKey}/value | Update custom field value
[**updateMultipleCustomFieldValues**](IssueCustomFieldValuesAppsApi.md#updateMultipleCustomFieldValues) | **POST** /rest/api/3/app/field/value | Update custom fields

<a name="updateCustomFieldValue"></a>
# **updateCustomFieldValue**
> Object updateCustomFieldValue(body, fieldIdOrKey, generateChangelog)

Update custom field value

Updates the value of a custom field on one or more issues. Custom fields can only be updated by the Forge app that created them.  **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IssueCustomFieldValuesAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldValuesAppsApi apiInstance = new IssueCustomFieldValuesAppsApi();
CustomFieldValueUpdateDetails body = new CustomFieldValueUpdateDetails(); // CustomFieldValueUpdateDetails | 
String fieldIdOrKey = "fieldIdOrKey_example"; // String | The ID or key of the custom field. For example, `customfield_10010`.
Boolean generateChangelog = true; // Boolean | Whether to generate a changelog for this update.
try {
    Object result = apiInstance.updateCustomFieldValue(body, fieldIdOrKey, generateChangelog);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldValuesAppsApi#updateCustomFieldValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomFieldValueUpdateDetails**](CustomFieldValueUpdateDetails.md)|  |
 **fieldIdOrKey** | **String**| The ID or key of the custom field. For example, &#x60;customfield_10010&#x60;. |
 **generateChangelog** | **Boolean**| Whether to generate a changelog for this update. | [optional] [default to true]

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMultipleCustomFieldValues"></a>
# **updateMultipleCustomFieldValues**
> Object updateMultipleCustomFieldValues(body, generateChangelog)

Update custom fields

Updates the value of one or more custom fields on one or more issues. Combinations of custom field and issue should be unique within the request. Custom fields can only be updated by the Forge app that created them.  **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IssueCustomFieldValuesAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldValuesAppsApi apiInstance = new IssueCustomFieldValuesAppsApi();
MultipleCustomFieldValuesUpdateDetails body = new MultipleCustomFieldValuesUpdateDetails(); // MultipleCustomFieldValuesUpdateDetails | 
Boolean generateChangelog = true; // Boolean | Whether to generate a changelog for this update.
try {
    Object result = apiInstance.updateMultipleCustomFieldValues(body, generateChangelog);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldValuesAppsApi#updateMultipleCustomFieldValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MultipleCustomFieldValuesUpdateDetails**](MultipleCustomFieldValuesUpdateDetails.md)|  |
 **generateChangelog** | **Boolean**| Whether to generate a changelog for this update. | [optional] [default to true]

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

