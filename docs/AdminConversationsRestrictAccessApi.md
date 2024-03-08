# AdminConversationsRestrictAccessApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGroupIdpGroups**](AdminConversationsRestrictAccessApi.md#addGroupIdpGroups) | **POST** /admin.conversations.restrictAccess.addGroup |  |
| [**listGroups**](AdminConversationsRestrictAccessApi.md#listGroups) | **GET** /admin.conversations.restrictAccess.listGroups |  |
| [**removeIdpGroup**](AdminConversationsRestrictAccessApi.md#removeIdpGroup) | **POST** /admin.conversations.restrictAccess.removeGroup |  |


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
import com.konfigthis.client.api.AdminConversationsRestrictAccessApi;
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
              .adminConversationsRestrictAccess
              .addGroupIdpGroups(channelId, groupId, token)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsRestrictAccessApi#addGroupIdpGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsrestrictAccessAddGroupIdpGroupsResponse> response = client
              .adminConversationsRestrictAccess
              .addGroupIdpGroups(channelId, groupId, token)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsRestrictAccessApi#addGroupIdpGroups");
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
import com.konfigthis.client.api.AdminConversationsRestrictAccessApi;
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
              .adminConversationsRestrictAccess
              .listGroups(token, channelId)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsRestrictAccessApi#listGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsrestrictAccessListGroupsResponse> response = client
              .adminConversationsRestrictAccess
              .listGroups(token, channelId)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsRestrictAccessApi#listGroups");
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
import com.konfigthis.client.api.AdminConversationsRestrictAccessApi;
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
              .adminConversationsRestrictAccess
              .removeIdpGroup(channelId, groupId, teamId, token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsRestrictAccessApi#removeIdpGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsrestrictAccessRemoveIdpGroupResponse> response = client
              .adminConversationsRestrictAccess
              .removeIdpGroup(channelId, groupId, teamId, token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsRestrictAccessApi#removeIdpGroup");
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

