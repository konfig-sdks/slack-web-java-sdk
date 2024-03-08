# AdminUsergroupsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDefaultChannels**](AdminUsergroupsApi.md#addDefaultChannels) | **POST** /admin.usergroups.addChannels |  |
| [**associateDefaultWorkspaces**](AdminUsergroupsApi.md#associateDefaultWorkspaces) | **POST** /admin.usergroups.addTeams |  |
| [**listChannelsGet**](AdminUsergroupsApi.md#listChannelsGet) | **GET** /admin.usergroups.listChannels |  |
| [**removeChannels**](AdminUsergroupsApi.md#removeChannels) | **POST** /admin.usergroups.removeChannels |  |


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
import com.konfigthis.client.api.AdminUsergroupsApi;
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
              .adminUsergroups
              .addDefaultChannels(token, channelIds, usergroupId)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsergroupsApi#addDefaultChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusergroupsAddDefaultChannelsResponse> response = client
              .adminUsergroups
              .addDefaultChannels(token, channelIds, usergroupId)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsergroupsApi#addDefaultChannels");
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
import com.konfigthis.client.api.AdminUsergroupsApi;
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
              .adminUsergroups
              .associateDefaultWorkspaces(token, teamIds, usergroupId)
              .autoProvision(autoProvision)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsergroupsApi#associateDefaultWorkspaces");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusergroupsAssociateDefaultWorkspacesResponse> response = client
              .adminUsergroups
              .associateDefaultWorkspaces(token, teamIds, usergroupId)
              .autoProvision(autoProvision)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsergroupsApi#associateDefaultWorkspaces");
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
import com.konfigthis.client.api.AdminUsergroupsApi;
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
              .adminUsergroups
              .listChannelsGet(token, usergroupId)
              .teamId(teamId)
              .includeNumMembers(includeNumMembers)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsergroupsApi#listChannelsGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusergroupsListChannelsGetResponse> response = client
              .adminUsergroups
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
      System.err.println("Exception when calling AdminUsergroupsApi#listChannelsGet");
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
import com.konfigthis.client.api.AdminUsergroupsApi;
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
              .adminUsergroups
              .removeChannels(token, channelIds, usergroupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsergroupsApi#removeChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusergroupsRemoveChannelsResponse> response = client
              .adminUsergroups
              .removeChannels(token, channelIds, usergroupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUsergroupsApi#removeChannels");
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

