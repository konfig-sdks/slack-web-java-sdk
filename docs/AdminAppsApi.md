# AdminAppsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveAppInstallation**](AdminAppsApi.md#approveAppInstallation) | **POST** /admin.apps.approve |  |
| [**restrictApp**](AdminAppsApi.md#restrictApp) | **POST** /admin.apps.restrict |  |


<a name="approveAppInstallation"></a>
# **approveAppInstallation**
> AdminappsApproveAppInstallationResponse approveAppInstallation(token).appId(appId).requestId(requestId).teamId(teamId).adminappsApproveAppInstallationRequest(adminappsApproveAppInstallationRequest).execute();



Approve an app for installation on a workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminAppsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.apps:write`
    String appId = "appId_example"; // The id of the app to approve.
    String requestId = "requestId_example"; // The id of the request to approve.
    String teamId = "teamId_example";
    try {
      AdminappsApproveAppInstallationResponse result = client
              .adminApps
              .approveAppInstallation(token)
              .appId(appId)
              .requestId(requestId)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminAppsApi#approveAppInstallation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminappsApproveAppInstallationResponse> response = client
              .adminApps
              .approveAppInstallation(token)
              .appId(appId)
              .requestId(requestId)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminAppsApi#approveAppInstallation");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.apps:write&#x60; | |
| **appId** | **String**| The id of the app to approve. | [optional] |
| **requestId** | **String**| The id of the request to approve. | [optional] |
| **teamId** | **String**|  | [optional] |
| **adminappsApproveAppInstallationRequest** | [**AdminappsApproveAppInstallationRequest**](AdminappsApproveAppInstallationRequest.md)|  | [optional] |

### Return type

[**AdminappsApproveAppInstallationResponse**](AdminappsApproveAppInstallationResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="restrictApp"></a>
# **restrictApp**
> AdminappsRestrictAppResponse restrictApp(token).appId(appId).requestId(requestId).teamId(teamId).adminappsRestrictAppRequest(adminappsRestrictAppRequest).execute();



Restrict an app for installation on a workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminAppsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.apps:write`
    String appId = "appId_example"; // The id of the app to restrict.
    String requestId = "requestId_example"; // The id of the request to restrict.
    String teamId = "teamId_example";
    try {
      AdminappsRestrictAppResponse result = client
              .adminApps
              .restrictApp(token)
              .appId(appId)
              .requestId(requestId)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminAppsApi#restrictApp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminappsRestrictAppResponse> response = client
              .adminApps
              .restrictApp(token)
              .appId(appId)
              .requestId(requestId)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminAppsApi#restrictApp");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.apps:write&#x60; | |
| **appId** | **String**| The id of the app to restrict. | [optional] |
| **requestId** | **String**| The id of the request to restrict. | [optional] |
| **teamId** | **String**|  | [optional] |
| **adminappsRestrictAppRequest** | [**AdminappsRestrictAppRequest**](AdminappsRestrictAppRequest.md)|  | [optional] |

### Return type

[**AdminappsRestrictAppResponse**](AdminappsRestrictAppResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

