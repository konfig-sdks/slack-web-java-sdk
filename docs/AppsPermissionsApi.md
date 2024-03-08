# AppsPermissionsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**additionalScopesRequest**](AppsPermissionsApi.md#additionalScopesRequest) | **GET** /apps.permissions.request |  |
| [**listPermissions**](AppsPermissionsApi.md#listPermissions) | **GET** /apps.permissions.info |  |


<a name="additionalScopesRequest"></a>
# **additionalScopesRequest**
> AppspermissionsAdditionalScopesRequestResponse additionalScopesRequest(token, scopes, triggerId).execute();



Allows an app to request additional scopes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsPermissionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://slack.com/api";
    
    // Configure OAuth2 access token for authorization: slackAuth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    SlackWeb client = new SlackWeb(configuration);
    String token = "token_example"; // Authentication token. Requires scope: `none`
    String scopes = "scopes_example"; // A comma separated list of scopes to request for
    String triggerId = "triggerId_example"; // Token used to trigger the permissions API
    try {
      AppspermissionsAdditionalScopesRequestResponse result = client
              .appsPermissions
              .additionalScopesRequest(token, scopes, triggerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsPermissionsApi#additionalScopesRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppspermissionsAdditionalScopesRequestResponse> response = client
              .appsPermissions
              .additionalScopesRequest(token, scopes, triggerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsPermissionsApi#additionalScopesRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;none&#x60; | |
| **scopes** | **String**| A comma separated list of scopes to request for | |
| **triggerId** | **String**| Token used to trigger the permissions API | |

### Return type

[**AppspermissionsAdditionalScopesRequestResponse**](AppspermissionsAdditionalScopesRequestResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Standard success response when used with a user token |  -  |
| **0** | Standard failure response when trigger_id is invalid |  -  |

<a name="listPermissions"></a>
# **listPermissions**
> AppspermissionsListPermissionsResponse listPermissions().token(token).execute();



Returns list of permissions this app has on a team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsPermissionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://slack.com/api";
    
    // Configure OAuth2 access token for authorization: slackAuth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    SlackWeb client = new SlackWeb(configuration);
    String token = "token_example"; // Authentication token. Requires scope: `none`
    try {
      AppspermissionsListPermissionsResponse result = client
              .appsPermissions
              .listPermissions()
              .token(token)
              .execute();
      System.out.println(result);
      System.out.println(result.getInfo());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsPermissionsApi#listPermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppspermissionsListPermissionsResponse> response = client
              .appsPermissions
              .listPermissions()
              .token(token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsPermissionsApi#listPermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;none&#x60; | [optional] |

### Return type

[**AppspermissionsListPermissionsResponse**](AppspermissionsListPermissionsResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Standard success response when used with a user token |  -  |
| **0** | Standard failure response when used with an invalid token |  -  |

