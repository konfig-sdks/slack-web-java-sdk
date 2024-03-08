# AppsPermissionsResourcesApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getResourcesList**](AppsPermissionsResourcesApi.md#getResourcesList) | **GET** /apps.permissions.resources.list |  |


<a name="getResourcesList"></a>
# **getResourcesList**
> AppspermissionsresourcesGetResourcesListResponse getResourcesList(token).cursor(cursor).limit(limit).execute();



Returns list of resource grants this app has on a team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsPermissionsResourcesApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `none`
    String cursor = "cursor_example"; // Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](https://slack.dev) for more detail.
    Integer limit = 56; // The maximum number of items to return.
    try {
      AppspermissionsresourcesGetResourcesListResponse result = client
              .appsPermissionsResources
              .getResourcesList(token)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getResources());
      System.out.println(result.getResponseMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsPermissionsResourcesApi#getResourcesList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppspermissionsresourcesGetResourcesListResponse> response = client
              .appsPermissionsResources
              .getResourcesList(token)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsPermissionsResourcesApi#getResourcesList");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;none&#x60; | |
| **cursor** | **String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](https://slack.dev) for more detail. | [optional] |
| **limit** | **Integer**| The maximum number of items to return. | [optional] |

### Return type

[**AppspermissionsresourcesGetResourcesListResponse**](AppspermissionsresourcesGetResourcesListResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical successful paginated response |  -  |
| **0** | Typical error response |  -  |

