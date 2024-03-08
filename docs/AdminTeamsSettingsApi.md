# AdminTeamsSettingsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInfo**](AdminTeamsSettingsApi.md#getInfo) | **GET** /admin.teams.settings.info |  |
| [**setDefaultChannels**](AdminTeamsSettingsApi.md#setDefaultChannels) | **POST** /admin.teams.settings.setDefaultChannels |  |
| [**setDescription**](AdminTeamsSettingsApi.md#setDescription) | **POST** /admin.teams.settings.setDescription |  |
| [**setDiscoverabilityOfWorkspace**](AdminTeamsSettingsApi.md#setDiscoverabilityOfWorkspace) | **POST** /admin.teams.settings.setDiscoverability |  |
| [**setIcon**](AdminTeamsSettingsApi.md#setIcon) | **POST** /admin.teams.settings.setIcon |  |
| [**setName**](AdminTeamsSettingsApi.md#setName) | **POST** /admin.teams.settings.setName |  |


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
import com.konfigthis.client.api.AdminTeamsSettingsApi;
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
              .adminTeamsSettings
              .getInfo(token, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminTeamsSettingsApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamssettingsGetInfoResponse> response = client
              .adminTeamsSettings
              .getInfo(token, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminTeamsSettingsApi#getInfo");
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
import com.konfigthis.client.api.AdminTeamsSettingsApi;
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
              .adminTeamsSettings
              .setDefaultChannels(channelIds, teamId, token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminTeamsSettingsApi#setDefaultChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamssettingsSetDefaultChannelsResponse> response = client
              .adminTeamsSettings
              .setDefaultChannels(channelIds, teamId, token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminTeamsSettingsApi#setDefaultChannels");
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
import com.konfigthis.client.api.AdminTeamsSettingsApi;
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
              .adminTeamsSettings
              .setDescription(token, description, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminTeamsSettingsApi#setDescription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamssettingsSetDescriptionResponse> response = client
              .adminTeamsSettings
              .setDescription(token, description, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminTeamsSettingsApi#setDescription");
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
import com.konfigthis.client.api.AdminTeamsSettingsApi;
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
              .adminTeamsSettings
              .setDiscoverabilityOfWorkspace(token, discoverability, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminTeamsSettingsApi#setDiscoverabilityOfWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamssettingsSetDiscoverabilityOfWorkspaceResponse> response = client
              .adminTeamsSettings
              .setDiscoverabilityOfWorkspace(token, discoverability, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminTeamsSettingsApi#setDiscoverabilityOfWorkspace");
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
import com.konfigthis.client.api.AdminTeamsSettingsApi;
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
              .adminTeamsSettings
              .setIcon(imageUrl, teamId, token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminTeamsSettingsApi#setIcon");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamssettingsSetIconResponse> response = client
              .adminTeamsSettings
              .setIcon(imageUrl, teamId, token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminTeamsSettingsApi#setIcon");
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
import com.konfigthis.client.api.AdminTeamsSettingsApi;
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
              .adminTeamsSettings
              .setName(token, name, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminTeamsSettingsApi#setName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamssettingsSetNameResponse> response = client
              .adminTeamsSettings
              .setName(token, name, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminTeamsSettingsApi#setName");
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

