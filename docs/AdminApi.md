# AdminApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDefaultChannels**](AdminApi.md#addDefaultChannels) | **POST** /admin.usergroups.addChannels |  |
| [**addEmoji**](AdminApi.md#addEmoji) | **POST** /admin.emoji.add |  |
| [**addGroupIdpGroups**](AdminApi.md#addGroupIdpGroups) | **POST** /admin.conversations.restrictAccess.addGroup |  |
| [**addWorkspaceUser**](AdminApi.md#addWorkspaceUser) | **POST** /admin.users.assign |  |
| [**aliasAdd**](AdminApi.md#aliasAdd) | **POST** /admin.emoji.addAlias |  |
| [**approveAppInstallation**](AdminApi.md#approveAppInstallation) | **POST** /admin.apps.approve |  |
| [**approveRequest**](AdminApi.md#approveRequest) | **POST** /admin.inviteRequests.approve |  |
| [**archiveChannel**](AdminApi.md#archiveChannel) | **POST** /admin.conversations.archive |  |
| [**associateDefaultWorkspaces**](AdminApi.md#associateDefaultWorkspaces) | **POST** /admin.usergroups.addTeams |  |
| [**convertToPrivateChannel**](AdminApi.md#convertToPrivateChannel) | **POST** /admin.conversations.convertToPrivate |  |
| [**createChannelBasedConversation**](AdminApi.md#createChannelBasedConversation) | **POST** /admin.conversations.create |  |
| [**createEnterpriseTeam**](AdminApi.md#createEnterpriseTeam) | **POST** /admin.teams.create |  |
| [**deleteChannel**](AdminApi.md#deleteChannel) | **POST** /admin.conversations.delete |  |
| [**denyRequest**](AdminApi.md#denyRequest) | **POST** /admin.inviteRequests.deny |  |
| [**disconnectSharedChannel**](AdminApi.md#disconnectSharedChannel) | **POST** /admin.conversations.disconnectShared |  |
| [**getAll**](AdminApi.md#getAll) | **GET** /admin.teams.admins.list |  |
| [**getConversationPrefs**](AdminApi.md#getConversationPrefs) | **GET** /admin.conversations.getConversationPrefs |  |
| [**getInfo**](AdminApi.md#getInfo) | **GET** /admin.teams.settings.info |  |
| [**getList**](AdminApi.md#getList) | **GET** /admin.apps.restricted.list |  |
| [**getTeamsList**](AdminApi.md#getTeamsList) | **GET** /admin.conversations.getTeams |  |
| [**invalidateSession**](AdminApi.md#invalidateSession) | **POST** /admin.users.session.invalidate |  |
| [**inviteUserToChannel**](AdminApi.md#inviteUserToChannel) | **POST** /admin.conversations.invite |  |
| [**inviteUserToWorkspace**](AdminApi.md#inviteUserToWorkspace) | **POST** /admin.users.invite |  |
| [**list**](AdminApi.md#list) | **GET** /admin.apps.approved.list |  |
| [**listAll**](AdminApi.md#listAll) | **GET** /admin.teams.list |  |
| [**listChannelsGet**](AdminApi.md#listChannelsGet) | **GET** /admin.usergroups.listChannels |  |
| [**listEnterpriseEmoji**](AdminApi.md#listEnterpriseEmoji) | **GET** /admin.emoji.list |  |
| [**listGroups**](AdminApi.md#listGroups) | **GET** /admin.conversations.restrictAccess.listGroups |  |
| [**listOriginalConnectedChannelInfo**](AdminApi.md#listOriginalConnectedChannelInfo) | **GET** /admin.conversations.ekm.listOriginalConnectedChannelInfo |  |
| [**listOwners**](AdminApi.md#listOwners) | **GET** /admin.teams.owners.list |  |
| [**listPendingWorkspaceInviteRequests**](AdminApi.md#listPendingWorkspaceInviteRequests) | **GET** /admin.inviteRequests.list |  |
| [**listWorkspaceUsers**](AdminApi.md#listWorkspaceUsers) | **GET** /admin.users.list |  |
| [**list_0**](AdminApi.md#list_0) | **GET** /admin.apps.requests.list |  |
| [**list_1**](AdminApi.md#list_1) | **GET** /admin.inviteRequests.approved.list |  |
| [**list_2**](AdminApi.md#list_2) | **GET** /admin.inviteRequests.denied.list |  |
| [**removeChannels**](AdminApi.md#removeChannels) | **POST** /admin.usergroups.removeChannels |  |
| [**removeEnterpriseEmoji**](AdminApi.md#removeEnterpriseEmoji) | **POST** /admin.emoji.remove |  |
| [**removeIdpGroup**](AdminApi.md#removeIdpGroup) | **POST** /admin.conversations.restrictAccess.removeGroup |  |
| [**removeUserFromWorkspace**](AdminApi.md#removeUserFromWorkspace) | **POST** /admin.users.remove |  |
| [**renameChannel**](AdminApi.md#renameChannel) | **POST** /admin.conversations.rename |  |
| [**renameEmoji**](AdminApi.md#renameEmoji) | **POST** /admin.emoji.rename |  |
| [**resetSessions**](AdminApi.md#resetSessions) | **POST** /admin.users.session.reset |  |
| [**restrictApp**](AdminApi.md#restrictApp) | **POST** /admin.apps.restrict |  |
| [**searchChannels**](AdminApi.md#searchChannels) | **GET** /admin.conversations.search |  |
| [**setAdminUser**](AdminApi.md#setAdminUser) | **POST** /admin.users.setAdmin |  |
| [**setConversationPrefs**](AdminApi.md#setConversationPrefs) | **POST** /admin.conversations.setConversationPrefs |  |
| [**setDefaultChannels**](AdminApi.md#setDefaultChannels) | **POST** /admin.teams.settings.setDefaultChannels |  |
| [**setDescription**](AdminApi.md#setDescription) | **POST** /admin.teams.settings.setDescription |  |
| [**setDiscoverabilityOfWorkspace**](AdminApi.md#setDiscoverabilityOfWorkspace) | **POST** /admin.teams.settings.setDiscoverability |  |
| [**setExpirationGuest**](AdminApi.md#setExpirationGuest) | **POST** /admin.users.setExpiration |  |
| [**setIcon**](AdminApi.md#setIcon) | **POST** /admin.teams.settings.setIcon |  |
| [**setName**](AdminApi.md#setName) | **POST** /admin.teams.settings.setName |  |
| [**setRegularUser**](AdminApi.md#setRegularUser) | **POST** /admin.users.setRegular |  |
| [**setTeamsWorkspaceConnection**](AdminApi.md#setTeamsWorkspaceConnection) | **POST** /admin.conversations.setTeams |  |
| [**setWorkspaceOwner**](AdminApi.md#setWorkspaceOwner) | **POST** /admin.users.setOwner |  |
| [**unarchiveChannel**](AdminApi.md#unarchiveChannel) | **POST** /admin.conversations.unarchive |  |


<a name="addDefaultChannels"></a>
# **addDefaultChannels**
> AdminusergroupsAddDefaultChannelsResponse addDefaultChannels(token, channelIds, usergroupId, adminusergroupsAddDefaultChannelsRequest).teamId(teamId).execute();



Add one or more default channels to an IDP group.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.usergroups:write`
    String channelIds = "channelIds_example"; // Comma separated string of channel IDs.
    String usergroupId = "usergroupId_example"; // ID of the IDP group to add default channels for.
    String teamId = "teamId_example"; // The workspace to add default channels in.
    try {
      AdminusergroupsAddDefaultChannelsResponse result = client
              .admin
              .addDefaultChannels(token, channelIds, usergroupId)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#addDefaultChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusergroupsAddDefaultChannelsResponse> response = client
              .admin
              .addDefaultChannels(token, channelIds, usergroupId)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#addDefaultChannels");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.usergroups:write&#x60; | |
| **channelIds** | **String**| Comma separated string of channel IDs. | |
| **usergroupId** | **String**| ID of the IDP group to add default channels for. | |
| **adminusergroupsAddDefaultChannelsRequest** | [**AdminusergroupsAddDefaultChannelsRequest**](AdminusergroupsAddDefaultChannelsRequest.md)|  | |
| **teamId** | **String**| The workspace to add default channels in. | [optional] |

### Return type

[**AdminusergroupsAddDefaultChannelsResponse**](AdminusergroupsAddDefaultChannelsResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response if the token provided is not associated with an Org Admin or Owner |  -  |

<a name="addEmoji"></a>
# **addEmoji**
> AdminemojiAddEmojiResponse addEmoji(name, token, url, adminemojiAddEmojiRequest).execute();



Add an emoji.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String name = "name_example"; // The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    String url = "url_example"; // The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best.
    try {
      AdminemojiAddEmojiResponse result = client
              .admin
              .addEmoji(name, token, url)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#addEmoji");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminemojiAddEmojiResponse> response = client
              .admin
              .addEmoji(name, token, url)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#addEmoji");
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
| **name** | **String**| The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **url** | **String**| The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best. | |
| **adminemojiAddEmojiRequest** | [**AdminemojiAddEmojiRequest**](AdminemojiAddEmojiRequest.md)|  | |

### Return type

[**AdminemojiAddEmojiResponse**](AdminemojiAddEmojiResponse.md)

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

<a name="addGroupIdpGroups"></a>
# **addGroupIdpGroups**
> AdminconversationsrestrictAccessAddGroupIdpGroupsResponse addGroupIdpGroups(channelId, groupId, token, adminconversationsrestrictAccessAddGroupIdpGroupsRequest).teamId(teamId).execute();



Add an allowlist of IDP groups for accessing a channel

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String channelId = "channelId_example"; // The channel to link this group to.
    String groupId = "groupId_example"; // The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel.
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:write`
    String teamId = "teamId_example"; // The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
    try {
      AdminconversationsrestrictAccessAddGroupIdpGroupsResponse result = client
              .admin
              .addGroupIdpGroups(channelId, groupId, token)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#addGroupIdpGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsrestrictAccessAddGroupIdpGroupsResponse> response = client
              .admin
              .addGroupIdpGroups(channelId, groupId, token)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#addGroupIdpGroups");
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
| **channelId** | **String**| The channel to link this group to. | |
| **groupId** | **String**| The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **adminconversationsrestrictAccessAddGroupIdpGroupsRequest** | [**AdminconversationsrestrictAccessAddGroupIdpGroupsRequest**](AdminconversationsrestrictAccessAddGroupIdpGroupsRequest.md)|  | |
| **teamId** | **String**| The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | [optional] |

### Return type

[**AdminconversationsrestrictAccessAddGroupIdpGroupsResponse**](AdminconversationsrestrictAccessAddGroupIdpGroupsResponse.md)

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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .addWorkspaceUser(token, teamId, userId)
              .channelIds(channelIds)
              .isRestricted(isRestricted)
              .isUltraRestricted(isUltraRestricted)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#addWorkspaceUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersAddWorkspaceUserResponse> response = client
              .admin
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
      System.err.println("Exception when calling AdminApi#addWorkspaceUser");
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

<a name="aliasAdd"></a>
# **aliasAdd**
> AdminemojiAliasAddResponse aliasAdd(aliasFor, name, token, adminemojiAliasAddRequest).execute();



Add an emoji alias.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String aliasFor = "aliasFor_example"; // The alias of the emoji.
    String name = "name_example"; // The name of the emoji to be aliased. Colons (`:myemoji:`) around the value are not required, although they may be included.
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    try {
      AdminemojiAliasAddResponse result = client
              .admin
              .aliasAdd(aliasFor, name, token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#aliasAdd");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminemojiAliasAddResponse> response = client
              .admin
              .aliasAdd(aliasFor, name, token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#aliasAdd");
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
| **aliasFor** | **String**| The alias of the emoji. | |
| **name** | **String**| The name of the emoji to be aliased. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **adminemojiAliasAddRequest** | [**AdminemojiAliasAddRequest**](AdminemojiAliasAddRequest.md)|  | |

### Return type

[**AdminemojiAliasAddResponse**](AdminemojiAliasAddResponse.md)

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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .approveAppInstallation(token)
              .appId(appId)
              .requestId(requestId)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#approveAppInstallation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminappsApproveAppInstallationResponse> response = client
              .admin
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
      System.err.println("Exception when calling AdminApi#approveAppInstallation");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .approveRequest(inviteRequestId, token)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#approveRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdmininviteRequestsApproveRequestResponse> response = client
              .admin
              .approveRequest(inviteRequestId, token)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#approveRequest");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .archiveChannel(token, channelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#archiveChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsArchiveChannelResponse> response = client
              .admin
              .archiveChannel(token, channelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#archiveChannel");
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

<a name="associateDefaultWorkspaces"></a>
# **associateDefaultWorkspaces**
> AdminusergroupsAssociateDefaultWorkspacesResponse associateDefaultWorkspaces(token, teamIds, usergroupId, adminusergroupsAssociateDefaultWorkspacesRequest).autoProvision(autoProvision).execute();



Associate one or more default workspaces with an organization-wide IDP group.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    String teamIds = "teamIds_example"; // A comma separated list of encoded team (workspace) IDs. Each workspace *MUST* belong to the organization associated with the token.
    String usergroupId = "usergroupId_example"; // An encoded usergroup (IDP Group) ID.
    Boolean autoProvision = true; // When `true`, this method automatically creates new workspace accounts for the IDP group members.
    try {
      AdminusergroupsAssociateDefaultWorkspacesResponse result = client
              .admin
              .associateDefaultWorkspaces(token, teamIds, usergroupId)
              .autoProvision(autoProvision)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#associateDefaultWorkspaces");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusergroupsAssociateDefaultWorkspacesResponse> response = client
              .admin
              .associateDefaultWorkspaces(token, teamIds, usergroupId)
              .autoProvision(autoProvision)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#associateDefaultWorkspaces");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **teamIds** | **String**| A comma separated list of encoded team (workspace) IDs. Each workspace *MUST* belong to the organization associated with the token. | |
| **usergroupId** | **String**| An encoded usergroup (IDP Group) ID. | |
| **adminusergroupsAssociateDefaultWorkspacesRequest** | [**AdminusergroupsAssociateDefaultWorkspacesRequest**](AdminusergroupsAssociateDefaultWorkspacesRequest.md)|  | |
| **autoProvision** | **Boolean**| When &#x60;true&#x60;, this method automatically creates new workspace accounts for the IDP group members. | [optional] |

### Return type

[**AdminusergroupsAssociateDefaultWorkspacesResponse**](AdminusergroupsAssociateDefaultWorkspacesResponse.md)

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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .convertToPrivateChannel(token, channelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#convertToPrivateChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsConvertToPrivateChannelResponse> response = client
              .admin
              .convertToPrivateChannel(token, channelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#convertToPrivateChannel");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .createChannelBasedConversation(token, isPrivate, name)
              .description(description)
              .orgWide(orgWide)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannelId());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#createChannelBasedConversation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsCreateChannelBasedConversationResponse> response = client
              .admin
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
      System.err.println("Exception when calling AdminApi#createChannelBasedConversation");
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

<a name="createEnterpriseTeam"></a>
# **createEnterpriseTeam**
> AdminteamsCreateEnterpriseTeamResponse createEnterpriseTeam(token, teamDomain, teamName, adminteamsCreateEnterpriseTeamRequest).teamDescription(teamDescription).teamDiscoverability(teamDiscoverability).execute();



Create an Enterprise team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    String teamDomain = "teamDomain_example"; // Team domain (for example, slacksoftballteam).
    String teamName = "teamName_example"; // Team name (for example, Slack Softball Team).
    String teamDescription = "teamDescription_example"; // Description for the team.
    String teamDiscoverability = "teamDiscoverability_example"; // Who can join the team. A team's discoverability can be `open`, `closed`, `invite_only`, or `unlisted`.
    try {
      AdminteamsCreateEnterpriseTeamResponse result = client
              .admin
              .createEnterpriseTeam(token, teamDomain, teamName)
              .teamDescription(teamDescription)
              .teamDiscoverability(teamDiscoverability)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#createEnterpriseTeam");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamsCreateEnterpriseTeamResponse> response = client
              .admin
              .createEnterpriseTeam(token, teamDomain, teamName)
              .teamDescription(teamDescription)
              .teamDiscoverability(teamDiscoverability)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#createEnterpriseTeam");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **teamDomain** | **String**| Team domain (for example, slacksoftballteam). | |
| **teamName** | **String**| Team name (for example, Slack Softball Team). | |
| **adminteamsCreateEnterpriseTeamRequest** | [**AdminteamsCreateEnterpriseTeamRequest**](AdminteamsCreateEnterpriseTeamRequest.md)|  | |
| **teamDescription** | **String**| Description for the team. | [optional] |
| **teamDiscoverability** | **String**| Who can join the team. A team&#39;s discoverability can be &#x60;open&#x60;, &#x60;closed&#x60;, &#x60;invite_only&#x60;, or &#x60;unlisted&#x60;. | [optional] |

### Return type

[**AdminteamsCreateEnterpriseTeamResponse**](AdminteamsCreateEnterpriseTeamResponse.md)

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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .deleteChannel(token, channelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#deleteChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsDeleteChannelResponse> response = client
              .admin
              .deleteChannel(token, channelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#deleteChannel");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .denyRequest(inviteRequestId, token)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#denyRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdmininviteRequestsDenyRequestResponse> response = client
              .admin
              .denyRequest(inviteRequestId, token)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#denyRequest");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .disconnectSharedChannel(token, channelId)
              .leavingTeamIds(leavingTeamIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#disconnectSharedChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsDisconnectSharedChannelResponse> response = client
              .admin
              .disconnectSharedChannel(token, channelId)
              .leavingTeamIds(leavingTeamIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#disconnectSharedChannel");
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

<a name="getAll"></a>
# **getAll**
> AdminteamsadminsGetAllResponse getAll(token, teamId).limit(limit).cursor(cursor).execute();



List all of the admins on a given workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:read`
    String teamId = "teamId_example";
    Integer limit = 56; // The maximum number of items to return.
    String cursor = "cursor_example"; // Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
    try {
      AdminteamsadminsGetAllResponse result = client
              .admin
              .getAll(token, teamId)
              .limit(limit)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamsadminsGetAllResponse> response = client
              .admin
              .getAll(token, teamId)
              .limit(limit)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getAll");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **teamId** | **String**|  | |
| **limit** | **Integer**| The maximum number of items to return. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

### Return type

[**AdminteamsadminsGetAllResponse**](AdminteamsadminsGetAllResponse.md)

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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .getConversationPrefs(token, channelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getPrefs());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getConversationPrefs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsGetConversationPrefsResponse> response = client
              .admin
              .getConversationPrefs(token, channelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getConversationPrefs");
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

<a name="getInfo"></a>
# **getInfo**
> AdminteamssettingsGetInfoResponse getInfo(token, teamId).execute();



Fetch information about settings in a workspace

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:read`
    String teamId = "teamId_example";
    try {
      AdminteamssettingsGetInfoResponse result = client
              .admin
              .getInfo(token, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamssettingsGetInfoResponse> response = client
              .admin
              .getInfo(token, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getInfo");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **teamId** | **String**|  | |

### Return type

[**AdminteamssettingsGetInfoResponse**](AdminteamssettingsGetInfoResponse.md)

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

<a name="getList"></a>
# **getList**
> AdminappsrestrictedGetListResponse getList(token).limit(limit).cursor(cursor).teamId(teamId).enterpriseId(enterpriseId).execute();



List restricted apps for an org or workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.apps:read`
    Integer limit = 56; // The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    String cursor = "cursor_example"; // Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
    String teamId = "teamId_example";
    String enterpriseId = "enterpriseId_example";
    try {
      AdminappsrestrictedGetListResponse result = client
              .admin
              .getList(token)
              .limit(limit)
              .cursor(cursor)
              .teamId(teamId)
              .enterpriseId(enterpriseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminappsrestrictedGetListResponse> response = client
              .admin
              .getList(token)
              .limit(limit)
              .cursor(cursor)
              .teamId(teamId)
              .enterpriseId(enterpriseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getList");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.apps:read&#x60; | |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **teamId** | **String**|  | [optional] |
| **enterpriseId** | **String**|  | [optional] |

### Return type

[**AdminappsrestrictedGetListResponse**](AdminappsrestrictedGetListResponse.md)

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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .getTeamsList(token, channelId)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getResponseMetadata());
      System.out.println(result.getTeamIds());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getTeamsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsGetTeamsListResponse> response = client
              .admin
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
      System.err.println("Exception when calling AdminApi#getTeamsList");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .invalidateSession(token, sessionId, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#invalidateSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminuserssessionInvalidateSessionResponse> response = client
              .admin
              .invalidateSession(token, sessionId, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#invalidateSession");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .inviteUserToChannel(token, channelId, userIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#inviteUserToChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsInviteUserToChannelResponse> response = client
              .admin
              .inviteUserToChannel(token, channelId, userIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#inviteUserToChannel");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
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
      System.err.println("Exception when calling AdminApi#inviteUserToWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersInviteUserToWorkspaceResponse> response = client
              .admin
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
      System.err.println("Exception when calling AdminApi#inviteUserToWorkspace");
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

<a name="list"></a>
# **list**
> AdminappsapprovedListResponse list(token).limit(limit).cursor(cursor).teamId(teamId).enterpriseId(enterpriseId).execute();



List approved apps for an org or workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.apps:read`
    Integer limit = 56; // The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    String cursor = "cursor_example"; // Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
    String teamId = "teamId_example";
    String enterpriseId = "enterpriseId_example";
    try {
      AdminappsapprovedListResponse result = client
              .admin
              .list(token)
              .limit(limit)
              .cursor(cursor)
              .teamId(teamId)
              .enterpriseId(enterpriseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminappsapprovedListResponse> response = client
              .admin
              .list(token)
              .limit(limit)
              .cursor(cursor)
              .teamId(teamId)
              .enterpriseId(enterpriseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#list");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.apps:read&#x60; | |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **teamId** | **String**|  | [optional] |
| **enterpriseId** | **String**|  | [optional] |

### Return type

[**AdminappsapprovedListResponse**](AdminappsapprovedListResponse.md)

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

<a name="listAll"></a>
# **listAll**
> AdminteamsListAllResponse listAll(token).limit(limit).cursor(cursor).execute();



List all teams on an Enterprise organization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:read`
    Integer limit = 56; // The maximum number of items to return. Must be between 1 - 100 both inclusive.
    String cursor = "cursor_example"; // Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
    try {
      AdminteamsListAllResponse result = client
              .admin
              .listAll(token)
              .limit(limit)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamsListAllResponse> response = client
              .admin
              .listAll(token)
              .limit(limit)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#listAll");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 100 both inclusive. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

### Return type

[**AdminteamsListAllResponse**](AdminteamsListAllResponse.md)

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

<a name="listChannelsGet"></a>
# **listChannelsGet**
> AdminusergroupsListChannelsGetResponse listChannelsGet(token, usergroupId).teamId(teamId).includeNumMembers(includeNumMembers).execute();



List the channels linked to an org-level IDP group (user group).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.usergroups:read`
    String usergroupId = "usergroupId_example"; // ID of the IDP group to list default channels for.
    String teamId = "teamId_example"; // ID of the the workspace.
    Boolean includeNumMembers = true; // Flag to include or exclude the count of members per channel.
    try {
      AdminusergroupsListChannelsGetResponse result = client
              .admin
              .listChannelsGet(token, usergroupId)
              .teamId(teamId)
              .includeNumMembers(includeNumMembers)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#listChannelsGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusergroupsListChannelsGetResponse> response = client
              .admin
              .listChannelsGet(token, usergroupId)
              .teamId(teamId)
              .includeNumMembers(includeNumMembers)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#listChannelsGet");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.usergroups:read&#x60; | |
| **usergroupId** | **String**| ID of the IDP group to list default channels for. | |
| **teamId** | **String**| ID of the the workspace. | [optional] |
| **includeNumMembers** | **Boolean**| Flag to include or exclude the count of members per channel. | [optional] |

### Return type

[**AdminusergroupsListChannelsGetResponse**](AdminusergroupsListChannelsGetResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response if the token provided is not associated with an Org Admin or Owner |  -  |

<a name="listEnterpriseEmoji"></a>
# **listEnterpriseEmoji**
> AdminemojiListEnterpriseEmojiResponse listEnterpriseEmoji(token).cursor(cursor).limit(limit).execute();



List emoji for an Enterprise Grid organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:read`
    String cursor = "cursor_example"; // Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
    Integer limit = 56; // The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    try {
      AdminemojiListEnterpriseEmojiResponse result = client
              .admin
              .listEnterpriseEmoji(token)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#listEnterpriseEmoji");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminemojiListEnterpriseEmojiResponse> response = client
              .admin
              .listEnterpriseEmoji(token)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#listEnterpriseEmoji");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |

### Return type

[**AdminemojiListEnterpriseEmojiResponse**](AdminemojiListEnterpriseEmojiResponse.md)

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

<a name="listGroups"></a>
# **listGroups**
> AdminconversationsrestrictAccessListGroupsResponse listGroups(token, channelId).teamId(teamId).execute();



List all IDP Groups linked to a channel

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String channelId = "channelId_example";
    String teamId = "teamId_example"; // The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
    try {
      AdminconversationsrestrictAccessListGroupsResponse result = client
              .admin
              .listGroups(token, channelId)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#listGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsrestrictAccessListGroupsResponse> response = client
              .admin
              .listGroups(token, channelId)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#listGroups");
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
| **channelId** | **String**|  | |
| **teamId** | **String**| The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | [optional] |

### Return type

[**AdminconversationsrestrictAccessListGroupsResponse**](AdminconversationsrestrictAccessListGroupsResponse.md)

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

<a name="listOriginalConnectedChannelInfo"></a>
# **listOriginalConnectedChannelInfo**
> AdminconversationsekmListOriginalConnectedChannelInfoResponse listOriginalConnectedChannelInfo(token).channelIds(channelIds).teamIds(teamIds).limit(limit).cursor(cursor).execute();



List all disconnected channels—i.e., channels that were once connected to other workspaces and then disconnected—and the corresponding original channel IDs for key revocation with EKM.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String channelIds = "channelIds_example"; // A comma-separated list of channels to filter to.
    String teamIds = "teamIds_example"; // A comma-separated list of the workspaces to which the channels you would like returned belong.
    Integer limit = 56; // The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    String cursor = "cursor_example"; // Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
    try {
      AdminconversationsekmListOriginalConnectedChannelInfoResponse result = client
              .admin
              .listOriginalConnectedChannelInfo(token)
              .channelIds(channelIds)
              .teamIds(teamIds)
              .limit(limit)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#listOriginalConnectedChannelInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsekmListOriginalConnectedChannelInfoResponse> response = client
              .admin
              .listOriginalConnectedChannelInfo(token)
              .channelIds(channelIds)
              .teamIds(teamIds)
              .limit(limit)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#listOriginalConnectedChannelInfo");
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
| **channelIds** | **String**| A comma-separated list of channels to filter to. | [optional] |
| **teamIds** | **String**| A comma-separated list of the workspaces to which the channels you would like returned belong. | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

### Return type

[**AdminconversationsekmListOriginalConnectedChannelInfoResponse**](AdminconversationsekmListOriginalConnectedChannelInfoResponse.md)

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

<a name="listOwners"></a>
# **listOwners**
> AdminteamsownersListOwnersResponse listOwners(token, teamId).limit(limit).cursor(cursor).execute();



List all of the owners on a given workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:read`
    String teamId = "teamId_example";
    Integer limit = 56; // The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    String cursor = "cursor_example"; // Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
    try {
      AdminteamsownersListOwnersResponse result = client
              .admin
              .listOwners(token, teamId)
              .limit(limit)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#listOwners");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamsownersListOwnersResponse> response = client
              .admin
              .listOwners(token, teamId)
              .limit(limit)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#listOwners");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **teamId** | **String**|  | |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

### Return type

[**AdminteamsownersListOwnersResponse**](AdminteamsownersListOwnersResponse.md)

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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .listPendingWorkspaceInviteRequests(token)
              .teamId(teamId)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#listPendingWorkspaceInviteRequests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdmininviteRequestsListPendingWorkspaceInviteRequestsResponse> response = client
              .admin
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
      System.err.println("Exception when calling AdminApi#listPendingWorkspaceInviteRequests");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .listWorkspaceUsers(token, teamId)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#listWorkspaceUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersListWorkspaceUsersResponse> response = client
              .admin
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
      System.err.println("Exception when calling AdminApi#listWorkspaceUsers");
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

<a name="list_0"></a>
# **list_0**
> AdminappsrequestsListResponse list_0(token).limit(limit).cursor(cursor).teamId(teamId).execute();



List app requests for a team/workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.apps:read`
    Integer limit = 56; // The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    String cursor = "cursor_example"; // Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
    String teamId = "teamId_example";
    try {
      AdminappsrequestsListResponse result = client
              .admin
              .list_0(token)
              .limit(limit)
              .cursor(cursor)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#list_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminappsrequestsListResponse> response = client
              .admin
              .list_0(token)
              .limit(limit)
              .cursor(cursor)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#list_0");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.apps:read&#x60; | |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **teamId** | **String**|  | [optional] |

### Return type

[**AdminappsrequestsListResponse**](AdminappsrequestsListResponse.md)

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

<a name="list_1"></a>
# **list_1**
> AdmininviteRequestsapprovedListResponse list_1(token).teamId(teamId).cursor(cursor).limit(limit).execute();



List all approved workspace invite requests.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
      AdmininviteRequestsapprovedListResponse result = client
              .admin
              .list_1(token)
              .teamId(teamId)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#list_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdmininviteRequestsapprovedListResponse> response = client
              .admin
              .list_1(token)
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
      System.err.println("Exception when calling AdminApi#list_1");
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

[**AdmininviteRequestsapprovedListResponse**](AdmininviteRequestsapprovedListResponse.md)

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

<a name="list_2"></a>
# **list_2**
> AdmininviteRequestsdeniedListResponse list_2(token).teamId(teamId).cursor(cursor).limit(limit).execute();



List all denied workspace invite requests.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String cursor = "cursor_example"; // Value of the `next_cursor` field sent as part of the previous api response
    Integer limit = 56; // The number of results that will be returned by the API on each invocation. Must be between 1 - 1000 both inclusive
    try {
      AdmininviteRequestsdeniedListResponse result = client
              .admin
              .list_2(token)
              .teamId(teamId)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#list_2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdmininviteRequestsdeniedListResponse> response = client
              .admin
              .list_2(token)
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
      System.err.println("Exception when calling AdminApi#list_2");
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
| **cursor** | **String**| Value of the &#x60;next_cursor&#x60; field sent as part of the previous api response | [optional] |
| **limit** | **Integer**| The number of results that will be returned by the API on each invocation. Must be between 1 - 1000 both inclusive | [optional] |

### Return type

[**AdmininviteRequestsdeniedListResponse**](AdmininviteRequestsdeniedListResponse.md)

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

<a name="removeChannels"></a>
# **removeChannels**
> AdminusergroupsRemoveChannelsResponse removeChannels(token, channelIds, usergroupId, adminusergroupsRemoveChannelsRequest).execute();



Remove one or more default channels from an org-level IDP group (user group).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.usergroups:write`
    String channelIds = "channelIds_example"; // Comma-separated string of channel IDs
    String usergroupId = "usergroupId_example"; // ID of the IDP Group
    try {
      AdminusergroupsRemoveChannelsResponse result = client
              .admin
              .removeChannels(token, channelIds, usergroupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#removeChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusergroupsRemoveChannelsResponse> response = client
              .admin
              .removeChannels(token, channelIds, usergroupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#removeChannels");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.usergroups:write&#x60; | |
| **channelIds** | **String**| Comma-separated string of channel IDs | |
| **usergroupId** | **String**| ID of the IDP Group | |
| **adminusergroupsRemoveChannelsRequest** | [**AdminusergroupsRemoveChannelsRequest**](AdminusergroupsRemoveChannelsRequest.md)|  | |

### Return type

[**AdminusergroupsRemoveChannelsResponse**](AdminusergroupsRemoveChannelsResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response if the token provided is not associated with an Org Admin or Owner |  -  |

<a name="removeEnterpriseEmoji"></a>
# **removeEnterpriseEmoji**
> AdminemojiRemoveEnterpriseEmojiResponse removeEnterpriseEmoji(name, token, adminemojiRemoveEnterpriseEmojiRequest).execute();



Remove an emoji across an Enterprise Grid organization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String name = "name_example"; // The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    try {
      AdminemojiRemoveEnterpriseEmojiResponse result = client
              .admin
              .removeEnterpriseEmoji(name, token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#removeEnterpriseEmoji");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminemojiRemoveEnterpriseEmojiResponse> response = client
              .admin
              .removeEnterpriseEmoji(name, token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#removeEnterpriseEmoji");
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
| **name** | **String**| The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **adminemojiRemoveEnterpriseEmojiRequest** | [**AdminemojiRemoveEnterpriseEmojiRequest**](AdminemojiRemoveEnterpriseEmojiRequest.md)|  | |

### Return type

[**AdminemojiRemoveEnterpriseEmojiResponse**](AdminemojiRemoveEnterpriseEmojiResponse.md)

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

<a name="removeIdpGroup"></a>
# **removeIdpGroup**
> AdminconversationsrestrictAccessRemoveIdpGroupResponse removeIdpGroup(channelId, groupId, teamId, token, adminconversationsrestrictAccessRemoveIdpGroupRequest).execute();



Remove a linked IDP group linked from a private channel

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String channelId = "channelId_example"; // The channel to remove the linked group from.
    String groupId = "groupId_example"; // The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel.
    String teamId = "teamId_example"; // The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:write`
    try {
      AdminconversationsrestrictAccessRemoveIdpGroupResponse result = client
              .admin
              .removeIdpGroup(channelId, groupId, teamId, token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#removeIdpGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsrestrictAccessRemoveIdpGroupResponse> response = client
              .admin
              .removeIdpGroup(channelId, groupId, teamId, token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#removeIdpGroup");
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
| **channelId** | **String**| The channel to remove the linked group from. | |
| **groupId** | **String**| The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel. | |
| **teamId** | **String**| The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **adminconversationsrestrictAccessRemoveIdpGroupRequest** | [**AdminconversationsrestrictAccessRemoveIdpGroupRequest**](AdminconversationsrestrictAccessRemoveIdpGroupRequest.md)|  | |

### Return type

[**AdminconversationsrestrictAccessRemoveIdpGroupResponse**](AdminconversationsrestrictAccessRemoveIdpGroupResponse.md)

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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .removeUserFromWorkspace(token, teamId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#removeUserFromWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersRemoveUserFromWorkspaceResponse> response = client
              .admin
              .removeUserFromWorkspace(token, teamId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#removeUserFromWorkspace");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .renameChannel(token, channelId, name)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#renameChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsRenameChannelResponse> response = client
              .admin
              .renameChannel(token, channelId, name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#renameChannel");
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

<a name="renameEmoji"></a>
# **renameEmoji**
> AdminemojiRenameEmojiResponse renameEmoji(name, newName, token, adminemojiRenameEmojiRequest).execute();



Rename an emoji.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String name = "name_example"; // The name of the emoji to be renamed. Colons (`:myemoji:`) around the value are not required, although they may be included.
    String newName = "newName_example"; // The new name of the emoji.
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    try {
      AdminemojiRenameEmojiResponse result = client
              .admin
              .renameEmoji(name, newName, token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#renameEmoji");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminemojiRenameEmojiResponse> response = client
              .admin
              .renameEmoji(name, newName, token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#renameEmoji");
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
| **name** | **String**| The name of the emoji to be renamed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
| **newName** | **String**| The new name of the emoji. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **adminemojiRenameEmojiRequest** | [**AdminemojiRenameEmojiRequest**](AdminemojiRenameEmojiRequest.md)|  | |

### Return type

[**AdminemojiRenameEmojiResponse**](AdminemojiRenameEmojiResponse.md)

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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .resetSessions(token, userId)
              .mobileOnly(mobileOnly)
              .webOnly(webOnly)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#resetSessions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminuserssessionResetSessionsResponse> response = client
              .admin
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
      System.err.println("Exception when calling AdminApi#resetSessions");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .restrictApp(token)
              .appId(appId)
              .requestId(requestId)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#restrictApp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminappsRestrictAppResponse> response = client
              .admin
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
      System.err.println("Exception when calling AdminApi#restrictApp");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
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
      System.err.println("Exception when calling AdminApi#searchChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsSearchChannelsResponse> response = client
              .admin
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
      System.err.println("Exception when calling AdminApi#searchChannels");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .setAdminUser(token, teamId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setAdminUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersSetAdminUserResponse> response = client
              .admin
              .setAdminUser(token, teamId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setAdminUser");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .setConversationPrefs(token, channelId, prefs)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setConversationPrefs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsSetConversationPrefsResponse> response = client
              .admin
              .setConversationPrefs(token, channelId, prefs)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setConversationPrefs");
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

<a name="setDefaultChannels"></a>
# **setDefaultChannels**
> AdminteamssettingsSetDefaultChannelsResponse setDefaultChannels(channelIds, teamId, token, adminteamssettingsSetDefaultChannelsRequest).execute();



Set the default channels of a workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String channelIds = "channelIds_example"; // An array of channel IDs.
    String teamId = "teamId_example"; // ID for the workspace to set the default channel for.
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    try {
      AdminteamssettingsSetDefaultChannelsResponse result = client
              .admin
              .setDefaultChannels(channelIds, teamId, token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setDefaultChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamssettingsSetDefaultChannelsResponse> response = client
              .admin
              .setDefaultChannels(channelIds, teamId, token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setDefaultChannels");
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
| **channelIds** | **String**| An array of channel IDs. | |
| **teamId** | **String**| ID for the workspace to set the default channel for. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **adminteamssettingsSetDefaultChannelsRequest** | [**AdminteamssettingsSetDefaultChannelsRequest**](AdminteamssettingsSetDefaultChannelsRequest.md)|  | |

### Return type

[**AdminteamssettingsSetDefaultChannelsResponse**](AdminteamssettingsSetDefaultChannelsResponse.md)

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

<a name="setDescription"></a>
# **setDescription**
> AdminteamssettingsSetDescriptionResponse setDescription(token, description, teamId, adminteamssettingsSetDescriptionRequest).execute();



Set the description of a given workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    String description = "description_example"; // The new description for the workspace.
    String teamId = "teamId_example"; // ID for the workspace to set the description for.
    try {
      AdminteamssettingsSetDescriptionResponse result = client
              .admin
              .setDescription(token, description, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setDescription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamssettingsSetDescriptionResponse> response = client
              .admin
              .setDescription(token, description, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setDescription");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **description** | **String**| The new description for the workspace. | |
| **teamId** | **String**| ID for the workspace to set the description for. | |
| **adminteamssettingsSetDescriptionRequest** | [**AdminteamssettingsSetDescriptionRequest**](AdminteamssettingsSetDescriptionRequest.md)|  | |

### Return type

[**AdminteamssettingsSetDescriptionResponse**](AdminteamssettingsSetDescriptionResponse.md)

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

<a name="setDiscoverabilityOfWorkspace"></a>
# **setDiscoverabilityOfWorkspace**
> AdminteamssettingsSetDiscoverabilityOfWorkspaceResponse setDiscoverabilityOfWorkspace(token, discoverability, teamId, adminteamssettingsSetDiscoverabilityOfWorkspaceRequest).execute();



An API method that allows admins to set the discoverability of a given workspace

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    String discoverability = "discoverability_example"; // This workspace's discovery setting. It must be set to one of `open`, `invite_only`, `closed`, or `unlisted`.
    String teamId = "teamId_example"; // The ID of the workspace to set discoverability on.
    try {
      AdminteamssettingsSetDiscoverabilityOfWorkspaceResponse result = client
              .admin
              .setDiscoverabilityOfWorkspace(token, discoverability, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setDiscoverabilityOfWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamssettingsSetDiscoverabilityOfWorkspaceResponse> response = client
              .admin
              .setDiscoverabilityOfWorkspace(token, discoverability, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setDiscoverabilityOfWorkspace");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **discoverability** | **String**| This workspace&#39;s discovery setting. It must be set to one of &#x60;open&#x60;, &#x60;invite_only&#x60;, &#x60;closed&#x60;, or &#x60;unlisted&#x60;. | |
| **teamId** | **String**| The ID of the workspace to set discoverability on. | |
| **adminteamssettingsSetDiscoverabilityOfWorkspaceRequest** | [**AdminteamssettingsSetDiscoverabilityOfWorkspaceRequest**](AdminteamssettingsSetDiscoverabilityOfWorkspaceRequest.md)|  | |

### Return type

[**AdminteamssettingsSetDiscoverabilityOfWorkspaceResponse**](AdminteamssettingsSetDiscoverabilityOfWorkspaceResponse.md)

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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .setExpirationGuest(token, expirationTs, teamId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setExpirationGuest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersSetExpirationGuestResponse> response = client
              .admin
              .setExpirationGuest(token, expirationTs, teamId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setExpirationGuest");
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

<a name="setIcon"></a>
# **setIcon**
> AdminteamssettingsSetIconResponse setIcon(imageUrl, teamId, token, adminteamssettingsSetIconRequest).execute();



Sets the icon of a workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String imageUrl = "imageUrl_example"; // Image URL for the icon
    String teamId = "teamId_example"; // ID for the workspace to set the icon for.
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    try {
      AdminteamssettingsSetIconResponse result = client
              .admin
              .setIcon(imageUrl, teamId, token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setIcon");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamssettingsSetIconResponse> response = client
              .admin
              .setIcon(imageUrl, teamId, token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setIcon");
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
| **imageUrl** | **String**| Image URL for the icon | |
| **teamId** | **String**| ID for the workspace to set the icon for. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **adminteamssettingsSetIconRequest** | [**AdminteamssettingsSetIconRequest**](AdminteamssettingsSetIconRequest.md)|  | |

### Return type

[**AdminteamssettingsSetIconResponse**](AdminteamssettingsSetIconResponse.md)

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

<a name="setName"></a>
# **setName**
> AdminteamssettingsSetNameResponse setName(token, name, teamId, adminteamssettingsSetNameRequest).execute();



Set the name of a given workspace.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    String name = "name_example"; // The new name of the workspace.
    String teamId = "teamId_example"; // ID for the workspace to set the name for.
    try {
      AdminteamssettingsSetNameResponse result = client
              .admin
              .setName(token, name, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamssettingsSetNameResponse> response = client
              .admin
              .setName(token, name, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setName");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **name** | **String**| The new name of the workspace. | |
| **teamId** | **String**| ID for the workspace to set the name for. | |
| **adminteamssettingsSetNameRequest** | [**AdminteamssettingsSetNameRequest**](AdminteamssettingsSetNameRequest.md)|  | |

### Return type

[**AdminteamssettingsSetNameResponse**](AdminteamssettingsSetNameResponse.md)

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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .setRegularUser(token, teamId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setRegularUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersSetRegularUserResponse> response = client
              .admin
              .setRegularUser(token, teamId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setRegularUser");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .setTeamsWorkspaceConnection(token, channelId)
              .orgChannel(orgChannel)
              .targetTeamIds(targetTeamIds)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setTeamsWorkspaceConnection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsSetTeamsWorkspaceConnectionResponse> response = client
              .admin
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
      System.err.println("Exception when calling AdminApi#setTeamsWorkspaceConnection");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .setWorkspaceOwner(token, teamId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setWorkspaceOwner");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusersSetWorkspaceOwnerResponse> response = client
              .admin
              .setWorkspaceOwner(token, teamId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#setWorkspaceOwner");
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
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .unarchiveChannel(token, channelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#unarchiveChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsUnarchiveChannelResponse> response = client
              .admin
              .unarchiveChannel(token, channelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#unarchiveChannel");
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

