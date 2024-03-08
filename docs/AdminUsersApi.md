# AdminUsersApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addWorkspaceUser**](AdminUsersApi.md#addWorkspaceUser) | **POST** /admin.users.assign |  |
| [**inviteUserToWorkspace**](AdminUsersApi.md#inviteUserToWorkspace) | **POST** /admin.users.invite |  |
| [**listWorkspaceUsers**](AdminUsersApi.md#listWorkspaceUsers) | **GET** /admin.users.list |  |
| [**removeUserFromWorkspace**](AdminUsersApi.md#removeUserFromWorkspace) | **POST** /admin.users.remove |  |
| [**setAdminUser**](AdminUsersApi.md#setAdminUser) | **POST** /admin.users.setAdmin |  |
| [**setExpirationGuest**](AdminUsersApi.md#setExpirationGuest) | **POST** /admin.users.setExpiration |  |
| [**setRegularUser**](AdminUsersApi.md#setRegularUser) | **POST** /admin.users.setRegular |  |
| [**setWorkspaceOwner**](AdminUsersApi.md#setWorkspaceOwner) | **POST** /admin.users.setOwner |  |


<a name="addWorkspaceUser"></a>
# **addWorkspaceUser**
> AdminusersAddWorkspaceUserResponse addWorkspaceUser(token, teamId, userId, adminusersAddWorkspaceUserRequest).channelIds(channelIds).isRestricted(isRestricted).isUltraRestricted(isUltraRestricted).execute();



Add an Enterprise user to a workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminUsersApi;
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
    String teamId = "teamId_example"; // The ID (`T1234`) of the workspace.
    String userId = "userId_example"; // The ID of the user to add to the workspace.
    String channelIds = "channelIds_example"; // Comma separated values of channel IDs to add user in the new workspace.
    Boolean isRestricted = true; // True if user should be added to the workspace as a guest.
    Boolean isUltraRestricted = true; // True if user should be added to the workspace as a single-channel guest.
    try {
      AdminusersAddWorkspaceUserResponse result = client
              .adminUsers
              .addWorkspaceUser(token, teamId, userId)
              .channelIds(channelIds)
              .isRestricted(isRestricted)
              .isUltraRestricted(isUltraRestricted)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#addWorkspaceUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersAddWorkspaceUserResponse> response = client
              .adminUsers
              .addWorkspaceUser(token, teamId, userId)
              .channelIds(channelIds)
              .isRestricted(isRestricted)
              .isUltraRestricted(isUltraRestricted)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#addWorkspaceUser");
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
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **userId** | **String**| The ID of the user to add to the workspace. | |
| **adminusersAddWorkspaceUserRequest** | [**AdminusersAddWorkspaceUserRequest**](AdminusersAddWorkspaceUserRequest.md)|  | |
| **channelIds** | **String**| Comma separated values of channel IDs to add user in the new workspace. | [optional] |
| **isRestricted** | **Boolean**| True if user should be added to the workspace as a guest. | [optional] |
| **isUltraRestricted** | **Boolean**| True if user should be added to the workspace as a single-channel guest. | [optional] |

### Return type

[**AdminusersAddWorkspaceUserResponse**](AdminusersAddWorkspaceUserResponse.md)

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

<a name="inviteUserToWorkspace"></a>
# **inviteUserToWorkspace**
> AdminusersInviteUserToWorkspaceResponse inviteUserToWorkspace(token, channelIds, email, teamId, adminusersInviteUserToWorkspaceRequest).customMessage(customMessage).guestExpirationTs(guestExpirationTs).isRestricted(isRestricted).isUltraRestricted(isUltraRestricted).realName(realName).resend(resend).execute();



Invite a user to a workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminUsersApi;
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
    String channelIds = "channelIds_example"; // A comma-separated list of `channel_id`s for this user to join. At least one channel is required.
    String email = "email_example"; // The email address of the person to invite.
    String teamId = "teamId_example"; // The ID (`T1234`) of the workspace.
    String customMessage = "customMessage_example"; // An optional message to send to the user in the invite email.
    String guestExpirationTs = "guestExpirationTs_example"; // Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date.
    Boolean isRestricted = true; // Is this user a multi-channel guest user? (default: false)
    Boolean isUltraRestricted = true; // Is this user a single channel guest user? (default: false)
    String realName = "realName_example"; // Full name of the user.
    Boolean resend = true; // Allow this invite to be resent in the future if a user has not signed up yet. (default: false)
    try {
      AdminusersInviteUserToWorkspaceResponse result = client
              .adminUsers
              .inviteUserToWorkspace(token, channelIds, email, teamId)
              .customMessage(customMessage)
              .guestExpirationTs(guestExpirationTs)
              .isRestricted(isRestricted)
              .isUltraRestricted(isUltraRestricted)
              .realName(realName)
              .resend(resend)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#inviteUserToWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersInviteUserToWorkspaceResponse> response = client
              .adminUsers
              .inviteUserToWorkspace(token, channelIds, email, teamId)
              .customMessage(customMessage)
              .guestExpirationTs(guestExpirationTs)
              .isRestricted(isRestricted)
              .isUltraRestricted(isUltraRestricted)
              .realName(realName)
              .resend(resend)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#inviteUserToWorkspace");
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
| **channelIds** | **String**| A comma-separated list of &#x60;channel_id&#x60;s for this user to join. At least one channel is required. | |
| **email** | **String**| The email address of the person to invite. | |
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **adminusersInviteUserToWorkspaceRequest** | [**AdminusersInviteUserToWorkspaceRequest**](AdminusersInviteUserToWorkspaceRequest.md)|  | |
| **customMessage** | **String**| An optional message to send to the user in the invite email. | [optional] |
| **guestExpirationTs** | **String**| Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date. | [optional] |
| **isRestricted** | **Boolean**| Is this user a multi-channel guest user? (default: false) | [optional] |
| **isUltraRestricted** | **Boolean**| Is this user a single channel guest user? (default: false) | [optional] |
| **realName** | **String**| Full name of the user. | [optional] |
| **resend** | **Boolean**| Allow this invite to be resent in the future if a user has not signed up yet. (default: false) | [optional] |

### Return type

[**AdminusersInviteUserToWorkspaceResponse**](AdminusersInviteUserToWorkspaceResponse.md)

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

<a name="listWorkspaceUsers"></a>
# **listWorkspaceUsers**
> AdminusersListWorkspaceUsersResponse listWorkspaceUsers(token, teamId).cursor(cursor).limit(limit).execute();



List users on a workspace

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminUsersApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.users:read`
    String teamId = "teamId_example"; // The ID (`T1234`) of the workspace.
    String cursor = "cursor_example"; // Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
    Integer limit = 56; // Limit for how many users to be retrieved per page
    try {
      AdminusersListWorkspaceUsersResponse result = client
              .adminUsers
              .listWorkspaceUsers(token, teamId)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#listWorkspaceUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersListWorkspaceUsersResponse> response = client
              .adminUsers
              .listWorkspaceUsers(token, teamId)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#listWorkspaceUsers");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.users:read&#x60; | |
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |
| **limit** | **Integer**| Limit for how many users to be retrieved per page | [optional] |

### Return type

[**AdminusersListWorkspaceUsersResponse**](AdminusersListWorkspaceUsersResponse.md)

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

<a name="removeUserFromWorkspace"></a>
# **removeUserFromWorkspace**
> AdminusersRemoveUserFromWorkspaceResponse removeUserFromWorkspace(token, teamId, userId, adminusersRemoveUserFromWorkspaceRequest).execute();



Remove a user from a workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminUsersApi;
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
    String teamId = "teamId_example"; // The ID (`T1234`) of the workspace.
    String userId = "userId_example"; // The ID of the user to remove.
    try {
      AdminusersRemoveUserFromWorkspaceResponse result = client
              .adminUsers
              .removeUserFromWorkspace(token, teamId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#removeUserFromWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersRemoveUserFromWorkspaceResponse> response = client
              .adminUsers
              .removeUserFromWorkspace(token, teamId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#removeUserFromWorkspace");
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
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **userId** | **String**| The ID of the user to remove. | |
| **adminusersRemoveUserFromWorkspaceRequest** | [**AdminusersRemoveUserFromWorkspaceRequest**](AdminusersRemoveUserFromWorkspaceRequest.md)|  | |

### Return type

[**AdminusersRemoveUserFromWorkspaceResponse**](AdminusersRemoveUserFromWorkspaceResponse.md)

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

<a name="setAdminUser"></a>
# **setAdminUser**
> AdminusersSetAdminUserResponse setAdminUser(token, teamId, userId, adminusersSetAdminUserRequest).execute();



Set an existing guest, regular user, or owner to be an admin user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminUsersApi;
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
    String teamId = "teamId_example"; // The ID (`T1234`) of the workspace.
    String userId = "userId_example"; // The ID of the user to designate as an admin.
    try {
      AdminusersSetAdminUserResponse result = client
              .adminUsers
              .setAdminUser(token, teamId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#setAdminUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersSetAdminUserResponse> response = client
              .adminUsers
              .setAdminUser(token, teamId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#setAdminUser");
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
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **userId** | **String**| The ID of the user to designate as an admin. | |
| **adminusersSetAdminUserRequest** | [**AdminusersSetAdminUserRequest**](AdminusersSetAdminUserRequest.md)|  | |

### Return type

[**AdminusersSetAdminUserResponse**](AdminusersSetAdminUserResponse.md)

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

<a name="setExpirationGuest"></a>
# **setExpirationGuest**
> AdminusersSetExpirationGuestResponse setExpirationGuest(token, expirationTs, teamId, userId, adminusersSetExpirationGuestRequest).execute();



Set an expiration for a guest user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminUsersApi;
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
    Integer expirationTs = 56; // Timestamp when guest account should be disabled.
    String teamId = "teamId_example"; // The ID (`T1234`) of the workspace.
    String userId = "userId_example"; // The ID of the user to set an expiration for.
    try {
      AdminusersSetExpirationGuestResponse result = client
              .adminUsers
              .setExpirationGuest(token, expirationTs, teamId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#setExpirationGuest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersSetExpirationGuestResponse> response = client
              .adminUsers
              .setExpirationGuest(token, expirationTs, teamId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#setExpirationGuest");
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
| **expirationTs** | **Integer**| Timestamp when guest account should be disabled. | |
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **userId** | **String**| The ID of the user to set an expiration for. | |
| **adminusersSetExpirationGuestRequest** | [**AdminusersSetExpirationGuestRequest**](AdminusersSetExpirationGuestRequest.md)|  | |

### Return type

[**AdminusersSetExpirationGuestResponse**](AdminusersSetExpirationGuestResponse.md)

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

<a name="setRegularUser"></a>
# **setRegularUser**
> AdminusersSetRegularUserResponse setRegularUser(token, teamId, userId, adminusersSetRegularUserRequest).execute();



Set an existing guest user, admin user, or owner to be a regular user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminUsersApi;
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
    String teamId = "teamId_example"; // The ID (`T1234`) of the workspace.
    String userId = "userId_example"; // The ID of the user to designate as a regular user.
    try {
      AdminusersSetRegularUserResponse result = client
              .adminUsers
              .setRegularUser(token, teamId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#setRegularUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersSetRegularUserResponse> response = client
              .adminUsers
              .setRegularUser(token, teamId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#setRegularUser");
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
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **userId** | **String**| The ID of the user to designate as a regular user. | |
| **adminusersSetRegularUserRequest** | [**AdminusersSetRegularUserRequest**](AdminusersSetRegularUserRequest.md)|  | |

### Return type

[**AdminusersSetRegularUserResponse**](AdminusersSetRegularUserResponse.md)

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

<a name="setWorkspaceOwner"></a>
# **setWorkspaceOwner**
> AdminusersSetWorkspaceOwnerResponse setWorkspaceOwner(token, teamId, userId, adminusersSetWorkspaceOwnerRequest).execute();



Set an existing guest, regular user, or admin user to be a workspace owner.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminUsersApi;
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
    String teamId = "teamId_example"; // The ID (`T1234`) of the workspace.
    String userId = "userId_example"; // Id of the user to promote to owner.
    try {
      AdminusersSetWorkspaceOwnerResponse result = client
              .adminUsers
              .setWorkspaceOwner(token, teamId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#setWorkspaceOwner");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersSetWorkspaceOwnerResponse> response = client
              .adminUsers
              .setWorkspaceOwner(token, teamId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsersApi#setWorkspaceOwner");
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
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **userId** | **String**| Id of the user to promote to owner. | |
| **adminusersSetWorkspaceOwnerRequest** | [**AdminusersSetWorkspaceOwnerRequest**](AdminusersSetWorkspaceOwnerRequest.md)|  | |

### Return type

[**AdminusersSetWorkspaceOwnerResponse**](AdminusersSetWorkspaceOwnerResponse.md)

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

