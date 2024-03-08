# TeamProfileApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProfile**](TeamProfileApi.md#getProfile) | **GET** /team.profile.get |  |


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
import com.konfigthis.client.api.TeamProfileApi;
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
              .teamProfile
              .getProfile(token)
              .visibility(visibility)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getProfile());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamProfileApi#getProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TeamprofileGetProfileResponse> response = client
              .teamProfile
              .getProfile(token)
              .visibility(visibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamProfileApi#getProfile");
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

