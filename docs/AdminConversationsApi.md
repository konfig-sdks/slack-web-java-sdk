# AdminConversationsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archiveChannel**](AdminConversationsApi.md#archiveChannel) | **POST** /admin.conversations.archive |  |
| [**convertToPrivateChannel**](AdminConversationsApi.md#convertToPrivateChannel) | **POST** /admin.conversations.convertToPrivate |  |
| [**createChannelBasedConversation**](AdminConversationsApi.md#createChannelBasedConversation) | **POST** /admin.conversations.create |  |
| [**deleteChannel**](AdminConversationsApi.md#deleteChannel) | **POST** /admin.conversations.delete |  |
| [**disconnectSharedChannel**](AdminConversationsApi.md#disconnectSharedChannel) | **POST** /admin.conversations.disconnectShared |  |
| [**getConversationPrefs**](AdminConversationsApi.md#getConversationPrefs) | **GET** /admin.conversations.getConversationPrefs |  |
| [**getTeamsList**](AdminConversationsApi.md#getTeamsList) | **GET** /admin.conversations.getTeams |  |
| [**inviteUserToChannel**](AdminConversationsApi.md#inviteUserToChannel) | **POST** /admin.conversations.invite |  |
| [**renameChannel**](AdminConversationsApi.md#renameChannel) | **POST** /admin.conversations.rename |  |
| [**searchChannels**](AdminConversationsApi.md#searchChannels) | **GET** /admin.conversations.search |  |
| [**setConversationPrefs**](AdminConversationsApi.md#setConversationPrefs) | **POST** /admin.conversations.setConversationPrefs |  |
| [**setTeamsWorkspaceConnection**](AdminConversationsApi.md#setTeamsWorkspaceConnection) | **POST** /admin.conversations.setTeams |  |
| [**unarchiveChannel**](AdminConversationsApi.md#unarchiveChannel) | **POST** /admin.conversations.unarchive |  |


<a name="archiveChannel"></a>
# **archiveChannel**
> AdminconversationsArchiveChannelResponse archiveChannel(token, channelId, adminconversationsArchiveChannelRequest).execute();



Archive a public or private channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // The channel to archive.
    try {
      AdminconversationsArchiveChannelResponse result = client
              .adminConversations
              .archiveChannel(token, channelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#archiveChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsArchiveChannelResponse> response = client
              .adminConversations
              .archiveChannel(token, channelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#archiveChannel");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel to archive. | |
| **adminconversationsArchiveChannelRequest** | [**AdminconversationsArchiveChannelRequest**](AdminconversationsArchiveChannelRequest.md)|  | |

### Return type

[**AdminconversationsArchiveChannelResponse**](AdminconversationsArchiveChannelResponse.md)

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

<a name="convertToPrivateChannel"></a>
# **convertToPrivateChannel**
> AdminconversationsConvertToPrivateChannelResponse convertToPrivateChannel(token, channelId, adminconversationsConvertToPrivateChannelRequest).execute();



Convert a public channel to a private channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // The channel to convert to private.
    try {
      AdminconversationsConvertToPrivateChannelResponse result = client
              .adminConversations
              .convertToPrivateChannel(token, channelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#convertToPrivateChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsConvertToPrivateChannelResponse> response = client
              .adminConversations
              .convertToPrivateChannel(token, channelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#convertToPrivateChannel");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel to convert to private. | |
| **adminconversationsConvertToPrivateChannelRequest** | [**AdminconversationsConvertToPrivateChannelRequest**](AdminconversationsConvertToPrivateChannelRequest.md)|  | |

### Return type

[**AdminconversationsConvertToPrivateChannelResponse**](AdminconversationsConvertToPrivateChannelResponse.md)

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

<a name="createChannelBasedConversation"></a>
# **createChannelBasedConversation**
> AdminconversationsCreateChannelBasedConversationResponse createChannelBasedConversation(token, isPrivate, name, adminconversationsCreateChannelBasedConversationRequest).description(description).orgWide(orgWide).teamId(teamId).execute();



Create a public or private channel-based conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:write`
    Boolean isPrivate = true; // When `true`, creates a private channel instead of a public channel
    String name = "name_example"; // Name of the public or private channel to create.
    String description = "description_example"; // Description of the public or private channel to create.
    Boolean orgWide = true; // When `true`, the channel will be available org-wide. Note: if the channel is not `org_wide=true`, you must specify a `team_id` for this channel
    String teamId = "teamId_example"; // The workspace to create the channel in. Note: this argument is required unless you set `org_wide=true`.
    try {
      AdminconversationsCreateChannelBasedConversationResponse result = client
              .adminConversations
              .createChannelBasedConversation(token, isPrivate, name)
              .description(description)
              .orgWide(orgWide)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannelId());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#createChannelBasedConversation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsCreateChannelBasedConversationResponse> response = client
              .adminConversations
              .createChannelBasedConversation(token, isPrivate, name)
              .description(description)
              .orgWide(orgWide)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#createChannelBasedConversation");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **isPrivate** | **Boolean**| When &#x60;true&#x60;, creates a private channel instead of a public channel | |
| **name** | **String**| Name of the public or private channel to create. | |
| **adminconversationsCreateChannelBasedConversationRequest** | [**AdminconversationsCreateChannelBasedConversationRequest**](AdminconversationsCreateChannelBasedConversationRequest.md)|  | |
| **description** | **String**| Description of the public or private channel to create. | [optional] |
| **orgWide** | **Boolean**| When &#x60;true&#x60;, the channel will be available org-wide. Note: if the channel is not &#x60;org_wide&#x3D;true&#x60;, you must specify a &#x60;team_id&#x60; for this channel | [optional] |
| **teamId** | **String**| The workspace to create the channel in. Note: this argument is required unless you set &#x60;org_wide&#x3D;true&#x60;. | [optional] |

### Return type

[**AdminconversationsCreateChannelBasedConversationResponse**](AdminconversationsCreateChannelBasedConversationResponse.md)

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

<a name="deleteChannel"></a>
# **deleteChannel**
> AdminconversationsDeleteChannelResponse deleteChannel(token, channelId, adminconversationsDeleteChannelRequest).execute();



Delete a public or private channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // The channel to delete.
    try {
      AdminconversationsDeleteChannelResponse result = client
              .adminConversations
              .deleteChannel(token, channelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#deleteChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsDeleteChannelResponse> response = client
              .adminConversations
              .deleteChannel(token, channelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#deleteChannel");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel to delete. | |
| **adminconversationsDeleteChannelRequest** | [**AdminconversationsDeleteChannelRequest**](AdminconversationsDeleteChannelRequest.md)|  | |

### Return type

[**AdminconversationsDeleteChannelResponse**](AdminconversationsDeleteChannelResponse.md)

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

<a name="disconnectSharedChannel"></a>
# **disconnectSharedChannel**
> AdminconversationsDisconnectSharedChannelResponse disconnectSharedChannel(token, channelId, adminconversationsDisconnectSharedChannelRequest).leavingTeamIds(leavingTeamIds).execute();



Disconnect a connected channel from one or more workspaces.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // The channel to be disconnected from some workspaces.
    String leavingTeamIds = "leavingTeamIds_example"; // The team to be removed from the channel. Currently only a single team id can be specified.
    try {
      AdminconversationsDisconnectSharedChannelResponse result = client
              .adminConversations
              .disconnectSharedChannel(token, channelId)
              .leavingTeamIds(leavingTeamIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#disconnectSharedChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsDisconnectSharedChannelResponse> response = client
              .adminConversations
              .disconnectSharedChannel(token, channelId)
              .leavingTeamIds(leavingTeamIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#disconnectSharedChannel");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel to be disconnected from some workspaces. | |
| **adminconversationsDisconnectSharedChannelRequest** | [**AdminconversationsDisconnectSharedChannelRequest**](AdminconversationsDisconnectSharedChannelRequest.md)|  | |
| **leavingTeamIds** | **String**| The team to be removed from the channel. Currently only a single team id can be specified. | [optional] |

### Return type

[**AdminconversationsDisconnectSharedChannelResponse**](AdminconversationsDisconnectSharedChannelResponse.md)

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

<a name="getConversationPrefs"></a>
# **getConversationPrefs**
> AdminconversationsGetConversationPrefsResponse getConversationPrefs(token, channelId).execute();



Get conversation preferences for a public or private channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:read`
    String channelId = "channelId_example"; // The channel to get preferences for.
    try {
      AdminconversationsGetConversationPrefsResponse result = client
              .adminConversations
              .getConversationPrefs(token, channelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getPrefs());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#getConversationPrefs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsGetConversationPrefsResponse> response = client
              .adminConversations
              .getConversationPrefs(token, channelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#getConversationPrefs");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | |
| **channelId** | **String**| The channel to get preferences for. | |

### Return type

[**AdminconversationsGetConversationPrefsResponse**](AdminconversationsGetConversationPrefsResponse.md)

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

<a name="getTeamsList"></a>
# **getTeamsList**
> AdminconversationsGetTeamsListResponse getTeamsList(token, channelId).cursor(cursor).limit(limit).execute();



Get all the workspaces a given public or private channel is connected to within this Enterprise org.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:read`
    String channelId = "channelId_example"; // The channel to determine connected workspaces within the organization for.
    String cursor = "cursor_example"; // Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
    Integer limit = 56; // The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    try {
      AdminconversationsGetTeamsListResponse result = client
              .adminConversations
              .getTeamsList(token, channelId)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getResponseMetadata());
      System.out.println(result.getTeamIds());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#getTeamsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsGetTeamsListResponse> response = client
              .adminConversations
              .getTeamsList(token, channelId)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#getTeamsList");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | |
| **channelId** | **String**| The channel to determine connected workspaces within the organization for. | |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |

### Return type

[**AdminconversationsGetTeamsListResponse**](AdminconversationsGetTeamsListResponse.md)

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

<a name="inviteUserToChannel"></a>
# **inviteUserToChannel**
> AdminconversationsInviteUserToChannelResponse inviteUserToChannel(token, channelId, userIds, adminconversationsInviteUserToChannelRequest).execute();



Invite a user to a public or private channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // The channel that the users will be invited to.
    String userIds = "userIds_example"; // The users to invite.
    try {
      AdminconversationsInviteUserToChannelResponse result = client
              .adminConversations
              .inviteUserToChannel(token, channelId, userIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#inviteUserToChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsInviteUserToChannelResponse> response = client
              .adminConversations
              .inviteUserToChannel(token, channelId, userIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#inviteUserToChannel");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel that the users will be invited to. | |
| **userIds** | **String**| The users to invite. | |
| **adminconversationsInviteUserToChannelRequest** | [**AdminconversationsInviteUserToChannelRequest**](AdminconversationsInviteUserToChannelRequest.md)|  | |

### Return type

[**AdminconversationsInviteUserToChannelResponse**](AdminconversationsInviteUserToChannelResponse.md)

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

<a name="renameChannel"></a>
# **renameChannel**
> AdminconversationsRenameChannelResponse renameChannel(token, channelId, name, adminconversationsRenameChannelRequest).execute();



Rename a public or private channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // The channel to rename.
    String name = "name_example";
    try {
      AdminconversationsRenameChannelResponse result = client
              .adminConversations
              .renameChannel(token, channelId, name)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#renameChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsRenameChannelResponse> response = client
              .adminConversations
              .renameChannel(token, channelId, name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#renameChannel");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel to rename. | |
| **name** | **String**|  | |
| **adminconversationsRenameChannelRequest** | [**AdminconversationsRenameChannelRequest**](AdminconversationsRenameChannelRequest.md)|  | |

### Return type

[**AdminconversationsRenameChannelResponse**](AdminconversationsRenameChannelResponse.md)

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

<a name="searchChannels"></a>
# **searchChannels**
> AdminconversationsSearchChannelsResponse searchChannels(token).teamIds(teamIds).query(query).limit(limit).cursor(cursor).searchChannelTypes(searchChannelTypes).sort(sort).sortDir(sortDir).execute();



Search for public or private channels in an Enterprise organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:read`
    String teamIds = "teamIds_example"; // Comma separated string of team IDs, signifying the workspaces to search through.
    String query = "query_example"; // Name of the the channel to query by.
    Integer limit = 56; // Maximum number of items to be returned. Must be between 1 - 20 both inclusive. Default is 10.
    String cursor = "cursor_example"; // Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
    String searchChannelTypes = "searchChannelTypes_example"; // The type of channel to include or exclude in the search. For example `private` will search private channels, while `private_exclude` will exclude them. For a full list of types, check the [Types section](https://slack.dev).
    String sort = "sort_example"; // Possible values are `relevant` (search ranking based on what we think is closest), `name` (alphabetical), `member_count` (number of users in the channel), and `created` (date channel was created). You can optionally pair this with the `sort_dir` arg to change how it is sorted 
    String sortDir = "sortDir_example"; // Sort direction. Possible values are `asc` for ascending order like (1, 2, 3) or (a, b, c), and `desc` for descending order like (3, 2, 1) or (c, b, a)
    try {
      AdminconversationsSearchChannelsResponse result = client
              .adminConversations
              .searchChannels(token)
              .teamIds(teamIds)
              .query(query)
              .limit(limit)
              .cursor(cursor)
              .searchChannelTypes(searchChannelTypes)
              .sort(sort)
              .sortDir(sortDir)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannels());
      System.out.println(result.getNextCursor());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#searchChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsSearchChannelsResponse> response = client
              .adminConversations
              .searchChannels(token)
              .teamIds(teamIds)
              .query(query)
              .limit(limit)
              .cursor(cursor)
              .searchChannelTypes(searchChannelTypes)
              .sort(sort)
              .sortDir(sortDir)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#searchChannels");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | |
| **teamIds** | **String**| Comma separated string of team IDs, signifying the workspaces to search through. | [optional] |
| **query** | **String**| Name of the the channel to query by. | [optional] |
| **limit** | **Integer**| Maximum number of items to be returned. Must be between 1 - 20 both inclusive. Default is 10. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |
| **searchChannelTypes** | **String**| The type of channel to include or exclude in the search. For example &#x60;private&#x60; will search private channels, while &#x60;private_exclude&#x60; will exclude them. For a full list of types, check the [Types section](https://slack.dev). | [optional] |
| **sort** | **String**| Possible values are &#x60;relevant&#x60; (search ranking based on what we think is closest), &#x60;name&#x60; (alphabetical), &#x60;member_count&#x60; (number of users in the channel), and &#x60;created&#x60; (date channel was created). You can optionally pair this with the &#x60;sort_dir&#x60; arg to change how it is sorted  | [optional] |
| **sortDir** | **String**| Sort direction. Possible values are &#x60;asc&#x60; for ascending order like (1, 2, 3) or (a, b, c), and &#x60;desc&#x60; for descending order like (3, 2, 1) or (c, b, a) | [optional] |

### Return type

[**AdminconversationsSearchChannelsResponse**](AdminconversationsSearchChannelsResponse.md)

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

<a name="setConversationPrefs"></a>
# **setConversationPrefs**
> AdminconversationsSetConversationPrefsResponse setConversationPrefs(token, channelId, prefs, adminconversationsSetConversationPrefsRequest).execute();



Set the posting permissions for a public or private channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // The channel to set the prefs for
    String prefs = "prefs_example"; // The prefs for this channel in a stringified JSON format.
    try {
      AdminconversationsSetConversationPrefsResponse result = client
              .adminConversations
              .setConversationPrefs(token, channelId, prefs)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#setConversationPrefs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsSetConversationPrefsResponse> response = client
              .adminConversations
              .setConversationPrefs(token, channelId, prefs)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#setConversationPrefs");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel to set the prefs for | |
| **prefs** | **String**| The prefs for this channel in a stringified JSON format. | |
| **adminconversationsSetConversationPrefsRequest** | [**AdminconversationsSetConversationPrefsRequest**](AdminconversationsSetConversationPrefsRequest.md)|  | |

### Return type

[**AdminconversationsSetConversationPrefsResponse**](AdminconversationsSetConversationPrefsResponse.md)

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

<a name="setTeamsWorkspaceConnection"></a>
# **setTeamsWorkspaceConnection**
> AdminconversationsSetTeamsWorkspaceConnectionResponse setTeamsWorkspaceConnection(token, channelId, adminconversationsSetTeamsWorkspaceConnectionRequest).orgChannel(orgChannel).targetTeamIds(targetTeamIds).teamId(teamId).execute();



Set the workspaces in an Enterprise grid org that connect to a public or private channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // The encoded `channel_id` to add or remove to workspaces.
    Boolean orgChannel = true; // True if channel has to be converted to an org channel
    String targetTeamIds = "targetTeamIds_example"; // A comma-separated list of workspaces to which the channel should be shared. Not required if the channel is being shared org-wide.
    String teamId = "teamId_example"; // The workspace to which the channel belongs. Omit this argument if the channel is a cross-workspace shared channel.
    try {
      AdminconversationsSetTeamsWorkspaceConnectionResponse result = client
              .adminConversations
              .setTeamsWorkspaceConnection(token, channelId)
              .orgChannel(orgChannel)
              .targetTeamIds(targetTeamIds)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#setTeamsWorkspaceConnection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsSetTeamsWorkspaceConnectionResponse> response = client
              .adminConversations
              .setTeamsWorkspaceConnection(token, channelId)
              .orgChannel(orgChannel)
              .targetTeamIds(targetTeamIds)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#setTeamsWorkspaceConnection");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The encoded &#x60;channel_id&#x60; to add or remove to workspaces. | |
| **adminconversationsSetTeamsWorkspaceConnectionRequest** | [**AdminconversationsSetTeamsWorkspaceConnectionRequest**](AdminconversationsSetTeamsWorkspaceConnectionRequest.md)|  | |
| **orgChannel** | **Boolean**| True if channel has to be converted to an org channel | [optional] |
| **targetTeamIds** | **String**| A comma-separated list of workspaces to which the channel should be shared. Not required if the channel is being shared org-wide. | [optional] |
| **teamId** | **String**| The workspace to which the channel belongs. Omit this argument if the channel is a cross-workspace shared channel. | [optional] |

### Return type

[**AdminconversationsSetTeamsWorkspaceConnectionResponse**](AdminconversationsSetTeamsWorkspaceConnectionResponse.md)

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

<a name="unarchiveChannel"></a>
# **unarchiveChannel**
> AdminconversationsUnarchiveChannelResponse unarchiveChannel(token, channelId, adminconversationsUnarchiveChannelRequest).execute();



Unarchive a public or private channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // The channel to unarchive.
    try {
      AdminconversationsUnarchiveChannelResponse result = client
              .adminConversations
              .unarchiveChannel(token, channelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#unarchiveChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsUnarchiveChannelResponse> response = client
              .adminConversations
              .unarchiveChannel(token, channelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsApi#unarchiveChannel");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel to unarchive. | |
| **adminconversationsUnarchiveChannelRequest** | [**AdminconversationsUnarchiveChannelRequest**](AdminconversationsUnarchiveChannelRequest.md)|  | |

### Return type

[**AdminconversationsUnarchiveChannelResponse**](AdminconversationsUnarchiveChannelResponse.md)

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

