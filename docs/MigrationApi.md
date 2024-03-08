# MigrationApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exchange**](MigrationApi.md#exchange) | **GET** /migration.exchange |  |


<a name="exchange"></a>
# **exchange**
> MigrationExchangeResponse exchange(token, users).teamId(teamId).toOld(toOld).execute();



For Enterprise Grid workspaces, map local user IDs to global user IDs

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MigrationApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `tokens.basic`
    String users = "users_example"; // A comma-separated list of user ids, up to 400 per request
    String teamId = "teamId_example"; // Specify team_id starts with `T` in case of Org Token
    Boolean toOld = true; // Specify `true` to convert `W` global user IDs to workspace-specific `U` IDs. Defaults to `false`.
    try {
      MigrationExchangeResponse result = client
              .migration
              .exchange(token, users)
              .teamId(teamId)
              .toOld(toOld)
              .execute();
      System.out.println(result);
      System.out.println(result.getEnterpriseId());
      System.out.println(result.getInvalidUserIds());
      System.out.println(result.getOk());
      System.out.println(result.getTeamId());
      System.out.println(result.getUserIdMap());
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationApi#exchange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MigrationExchangeResponse> response = client
              .migration
              .exchange(token, users)
              .teamId(teamId)
              .toOld(toOld)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationApi#exchange");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;tokens.basic&#x60; | |
| **users** | **String**| A comma-separated list of user ids, up to 400 per request | |
| **teamId** | **String**| Specify team_id starts with &#x60;T&#x60; in case of Org Token | [optional] |
| **toOld** | **Boolean**| Specify &#x60;true&#x60; to convert &#x60;W&#x60; global user IDs to workspace-specific &#x60;U&#x60; IDs. Defaults to &#x60;false&#x60;. | [optional] |

### Return type

[**MigrationExchangeResponse**](MigrationExchangeResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response when mappings exist for the specified user IDs |  -  |
| **0** | Typical error response when there are no mappings to provide |  -  |

