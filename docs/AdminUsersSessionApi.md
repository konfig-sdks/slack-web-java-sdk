# AdminUsersSessionApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**invalidateSession**](AdminUsersSessionApi.md#invalidateSession) | **POST** /admin.users.session.invalidate |  |
| [**resetSessions**](AdminUsersSessionApi.md#resetSessions) | **POST** /admin.users.session.reset |  |


<a name="invalidateSession"></a>
# **invalidateSession**
> AdminuserssessionInvalidateSessionResponse invalidateSession(token, sessionId, teamId, adminuserssessionInvalidateSessionRequest).execute();



Invalidate a single session for a user by session_id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminUsersSessionApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.users:write`
    Integer sessionId = 56;
    String teamId = "teamId_example"; // ID of the team that the session belongs to
    try {
      AdminuserssessionInvalidateSessionResponse result = client
              .adminUsersSession
              .invalidateSession(token, sessionId, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersSessionApi#invalidateSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminuserssessionInvalidateSessionResponse> response = client
              .adminUsersSession
              .invalidateSession(token, sessionId, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersSessionApi#invalidateSession");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **sessionId** | **Integer**|  | |
| **teamId** | **String**| ID of the team that the session belongs to | |
| **adminuserssessionInvalidateSessionRequest** | [**AdminuserssessionInvalidateSessionRequest**](AdminuserssessionInvalidateSessionRequest.md)|  | |

### Return type

[**AdminuserssessionInvalidateSessionResponse**](AdminuserssessionInvalidateSessionResponse.md)

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

<a name="resetSessions"></a>
# **resetSessions**
> AdminuserssessionResetSessionsResponse resetSessions(token, userId, adminuserssessionResetSessionsRequest).mobileOnly(mobileOnly).webOnly(webOnly).execute();



Wipes all valid sessions on all devices for a given user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminUsersSessionApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.users:write`
    String userId = "userId_example"; // The ID of the user to wipe sessions for
    Boolean mobileOnly = true; // Only expire mobile sessions (default: false)
    Boolean webOnly = true; // Only expire web sessions (default: false)
    try {
      AdminuserssessionResetSessionsResponse result = client
              .adminUsersSession
              .resetSessions(token, userId)
              .mobileOnly(mobileOnly)
              .webOnly(webOnly)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersSessionApi#resetSessions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminuserssessionResetSessionsResponse> response = client
              .adminUsersSession
              .resetSessions(token, userId)
              .mobileOnly(mobileOnly)
              .webOnly(webOnly)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersSessionApi#resetSessions");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **userId** | **String**| The ID of the user to wipe sessions for | |
| **adminuserssessionResetSessionsRequest** | [**AdminuserssessionResetSessionsRequest**](AdminuserssessionResetSessionsRequest.md)|  | |
| **mobileOnly** | **Boolean**| Only expire mobile sessions (default: false) | [optional] |
| **webOnly** | **Boolean**| Only expire web sessions (default: false) | [optional] |

### Return type

[**AdminuserssessionResetSessionsResponse**](AdminuserssessionResetSessionsResponse.md)

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

