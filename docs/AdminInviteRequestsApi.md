# AdminInviteRequestsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveRequest**](AdminInviteRequestsApi.md#approveRequest) | **POST** /admin.inviteRequests.approve |  |
| [**denyRequest**](AdminInviteRequestsApi.md#denyRequest) | **POST** /admin.inviteRequests.deny |  |
| [**listPendingWorkspaceInviteRequests**](AdminInviteRequestsApi.md#listPendingWorkspaceInviteRequests) | **GET** /admin.inviteRequests.list |  |


<a name="approveRequest"></a>
# **approveRequest**
> AdmininviteRequestsApproveRequestResponse approveRequest(token).admininviteRequestsApproveRequestRequest(admininviteRequestsApproveRequestRequest).execute();



Approve a workspace invite request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminInviteRequestsApi;
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
    String inviteRequestId = "inviteRequestId_example"; // ID of the request to invite.
    String token = "token_example"; // Authentication token. Requires scope: `admin.invites:write`
    String teamId = "teamId_example"; // ID for the workspace where the invite request was made.
    try {
      AdmininviteRequestsApproveRequestResponse result = client
              .adminInviteRequests
              .approveRequest(inviteRequestId, token)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminInviteRequestsApi#approveRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdmininviteRequestsApproveRequestResponse> response = client
              .adminInviteRequests
              .approveRequest(inviteRequestId, token)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminInviteRequestsApi#approveRequest");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.invites:write&#x60; | |
| **admininviteRequestsApproveRequestRequest** | [**AdmininviteRequestsApproveRequestRequest**](AdmininviteRequestsApproveRequestRequest.md)|  | [optional] |

### Return type

[**AdmininviteRequestsApproveRequestResponse**](AdmininviteRequestsApproveRequestResponse.md)

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

<a name="denyRequest"></a>
# **denyRequest**
> AdmininviteRequestsDenyRequestResponse denyRequest(token).admininviteRequestsApproveRequestRequest(admininviteRequestsApproveRequestRequest).execute();



Deny a workspace invite request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminInviteRequestsApi;
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
    String inviteRequestId = "inviteRequestId_example"; // ID of the request to invite.
    String token = "token_example"; // Authentication token. Requires scope: `admin.invites:write`
    String teamId = "teamId_example"; // ID for the workspace where the invite request was made.
    try {
      AdmininviteRequestsDenyRequestResponse result = client
              .adminInviteRequests
              .denyRequest(inviteRequestId, token)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminInviteRequestsApi#denyRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdmininviteRequestsDenyRequestResponse> response = client
              .adminInviteRequests
              .denyRequest(inviteRequestId, token)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminInviteRequestsApi#denyRequest");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.invites:write&#x60; | |
| **admininviteRequestsApproveRequestRequest** | [**AdmininviteRequestsApproveRequestRequest**](AdmininviteRequestsApproveRequestRequest.md)|  | [optional] |

### Return type

[**AdmininviteRequestsDenyRequestResponse**](AdmininviteRequestsDenyRequestResponse.md)

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

<a name="listPendingWorkspaceInviteRequests"></a>
# **listPendingWorkspaceInviteRequests**
> AdmininviteRequestsListPendingWorkspaceInviteRequestsResponse listPendingWorkspaceInviteRequests(token).teamId(teamId).cursor(cursor).limit(limit).execute();



List all pending workspace invite requests.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminInviteRequestsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.invites:read`
    String teamId = "teamId_example"; // ID for the workspace where the invite requests were made.
    String cursor = "cursor_example"; // Value of the `next_cursor` field sent as part of the previous API response
    Integer limit = 56; // The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive
    try {
      AdmininviteRequestsListPendingWorkspaceInviteRequestsResponse result = client
              .adminInviteRequests
              .listPendingWorkspaceInviteRequests(token)
              .teamId(teamId)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminInviteRequestsApi#listPendingWorkspaceInviteRequests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdmininviteRequestsListPendingWorkspaceInviteRequestsResponse> response = client
              .adminInviteRequests
              .listPendingWorkspaceInviteRequests(token)
              .teamId(teamId)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminInviteRequestsApi#listPendingWorkspaceInviteRequests");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.invites:read&#x60; | |
| **teamId** | **String**| ID for the workspace where the invite requests were made. | [optional] |
| **cursor** | **String**| Value of the &#x60;next_cursor&#x60; field sent as part of the previous API response | [optional] |
| **limit** | **Integer**| The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive | [optional] |

### Return type

[**AdmininviteRequestsListPendingWorkspaceInviteRequestsResponse**](AdmininviteRequestsListPendingWorkspaceInviteRequestsResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

