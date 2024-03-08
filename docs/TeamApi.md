# TeamApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accessLogs**](TeamApi.md#accessLogs) | **GET** /team.accessLogs |  |
| [**billableInfo**](TeamApi.md#billableInfo) | **GET** /team.billableInfo |  |
| [**getProfile**](TeamApi.md#getProfile) | **GET** /team.profile.get |  |
| [**info**](TeamApi.md#info) | **GET** /team.info |  |
| [**integrationLogs**](TeamApi.md#integrationLogs) | **GET** /team.integrationLogs |  |


<a name="accessLogs"></a>
# **accessLogs**
> TeamAccessLogsResponse accessLogs(token).before(before).count(count).page(page).execute();



Gets the access logs for the current team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin`
    String before = "before_example"; // End of time range of logs to include in results (inclusive).
    String count = "count_example";
    String page = "page_example";
    try {
      TeamAccessLogsResponse result = client
              .team
              .accessLogs(token)
              .before(before)
              .count(count)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getLogins());
      System.out.println(result.getOk());
      System.out.println(result.getPaging());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#accessLogs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TeamAccessLogsResponse> response = client
              .team
              .accessLogs(token)
              .before(before)
              .count(count)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#accessLogs");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin&#x60; | |
| **before** | **String**| End of time range of logs to include in results (inclusive). | [optional] |
| **count** | **String**|  | [optional] |
| **page** | **String**|  | [optional] |

### Return type

[**TeamAccessLogsResponse**](TeamAccessLogsResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This response demonstrates pagination and two access log entries. |  -  |
| **0** | A workspace must be on a paid plan to use this method, otherwise the &#x60;paid_only&#x60; error is thrown: |  -  |

<a name="billableInfo"></a>
# **billableInfo**
> TeamBillableInfoResponse billableInfo(token).user(user).execute();



Gets billable users information for the current team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin`
    String user = "user_example"; // A user to retrieve the billable information for. Defaults to all users.
    try {
      TeamBillableInfoResponse result = client
              .team
              .billableInfo(token)
              .user(user)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#billableInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TeamBillableInfoResponse> response = client
              .team
              .billableInfo(token)
              .user(user)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#billableInfo");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin&#x60; | |
| **user** | **String**| A user to retrieve the billable information for. Defaults to all users. | [optional] |

### Return type

[**TeamBillableInfoResponse**](TeamBillableInfoResponse.md)

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

<a name="getProfile"></a>
# **getProfile**
> TeamprofileGetProfileResponse getProfile(token).visibility(visibility).execute();



Retrieve a team&#39;s profile.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `users.profile:read`
    String visibility = "visibility_example"; // Filter by visibility.
    try {
      TeamprofileGetProfileResponse result = client
              .team
              .getProfile(token)
              .visibility(visibility)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getProfile());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TeamprofileGetProfileResponse> response = client
              .team
              .getProfile(token)
              .visibility(visibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#getProfile");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;users.profile:read&#x60; | |
| **visibility** | **String**| Filter by visibility. | [optional] |

### Return type

[**TeamprofileGetProfileResponse**](TeamprofileGetProfileResponse.md)

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

<a name="info"></a>
# **info**
> TeamInfoResponse info(token).team(team).execute();



Gets information about the current team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `team:read`
    String team = "team_example"; // Team to get info on, if omitted, will return information about the current team. Will only return team that the authenticated token is allowed to see through external shared channels
    try {
      TeamInfoResponse result = client
              .team
              .info(token)
              .team(team)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getTeam());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#info");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TeamInfoResponse> response = client
              .team
              .info(token)
              .team(team)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#info");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;team:read&#x60; | |
| **team** | **String**| Team to get info on, if omitted, will return information about the current team. Will only return team that the authenticated token is allowed to see through external shared channels | [optional] |

### Return type

[**TeamInfoResponse**](TeamInfoResponse.md)

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

<a name="integrationLogs"></a>
# **integrationLogs**
> TeamIntegrationLogsResponse integrationLogs(token).appId(appId).changeType(changeType).count(count).page(page).serviceId(serviceId).user(user).execute();



Gets the integration logs for the current team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin`
    String appId = "appId_example"; // Filter logs to this Slack app. Defaults to all logs.
    String changeType = "changeType_example"; // Filter logs with this change type. Defaults to all logs.
    String count = "count_example";
    String page = "page_example";
    String serviceId = "serviceId_example"; // Filter logs to this service. Defaults to all logs.
    String user = "user_example"; // Filter logs generated by this user’s actions. Defaults to all logs.
    try {
      TeamIntegrationLogsResponse result = client
              .team
              .integrationLogs(token)
              .appId(appId)
              .changeType(changeType)
              .count(count)
              .page(page)
              .serviceId(serviceId)
              .user(user)
              .execute();
      System.out.println(result);
      System.out.println(result.getLogs());
      System.out.println(result.getOk());
      System.out.println(result.getPaging());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#integrationLogs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TeamIntegrationLogsResponse> response = client
              .team
              .integrationLogs(token)
              .appId(appId)
              .changeType(changeType)
              .count(count)
              .page(page)
              .serviceId(serviceId)
              .user(user)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamApi#integrationLogs");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin&#x60; | |
| **appId** | **String**| Filter logs to this Slack app. Defaults to all logs. | [optional] |
| **changeType** | **String**| Filter logs with this change type. Defaults to all logs. | [optional] |
| **count** | **String**|  | [optional] |
| **page** | **String**|  | [optional] |
| **serviceId** | **String**| Filter logs to this service. Defaults to all logs. | [optional] |
| **user** | **String**| Filter logs generated by this user’s actions. Defaults to all logs. | [optional] |

### Return type

[**TeamIntegrationLogsResponse**](TeamIntegrationLogsResponse.md)

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

