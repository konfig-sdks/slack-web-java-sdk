# AdminTeamsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEnterpriseTeam**](AdminTeamsApi.md#createEnterpriseTeam) | **POST** /admin.teams.create |  |
| [**listAll**](AdminTeamsApi.md#listAll) | **GET** /admin.teams.list |  |


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
import com.konfigthis.client.api.AdminTeamsApi;
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
              .adminTeams
              .createEnterpriseTeam(token, teamDomain, teamName)
              .teamDescription(teamDescription)
              .teamDiscoverability(teamDiscoverability)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminTeamsApi#createEnterpriseTeam");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamsCreateEnterpriseTeamResponse> response = client
              .adminTeams
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
      System.err.println("Exception when calling AdminTeamsApi#createEnterpriseTeam");
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
import com.konfigthis.client.api.AdminTeamsApi;
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
              .adminTeams
              .listAll(token)
              .limit(limit)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminTeamsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminteamsListAllResponse> response = client
              .adminTeams
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
      System.err.println("Exception when calling AdminTeamsApi#listAll");
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

