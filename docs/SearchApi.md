# SearchApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**messages**](SearchApi.md#messages) | **GET** /search.messages |  |


<a name="messages"></a>
# **messages**
> SearchMessagesResponse messages(token, query).count(count).highlight(highlight).page(page).sort(sort).sortDir(sortDir).execute();



Searches for messages matching a query.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `search:read`
    String query = "query_example"; // Search query.
    Integer count = 56; // Pass the number of results you want per \"page\". Maximum of `100`.
    Boolean highlight = true; // Pass a value of `true` to enable query highlight markers (see below).
    Integer page = 56;
    String sort = "sort_example"; // Return matches sorted by either `score` or `timestamp`.
    String sortDir = "sortDir_example"; // Change sort direction to ascending (`asc`) or descending (`desc`).
    try {
      SearchMessagesResponse result = client
              .search
              .messages(token, query)
              .count(count)
              .highlight(highlight)
              .page(page)
              .sort(sort)
              .sortDir(sortDir)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#messages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SearchMessagesResponse> response = client
              .search
              .messages(token, query)
              .count(count)
              .highlight(highlight)
              .page(page)
              .sort(sort)
              .sortDir(sortDir)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#messages");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;search:read&#x60; | |
| **query** | **String**| Search query. | |
| **count** | **Integer**| Pass the number of results you want per \&quot;page\&quot;. Maximum of &#x60;100&#x60;. | [optional] |
| **highlight** | **Boolean**| Pass a value of &#x60;true&#x60; to enable query highlight markers (see below). | [optional] |
| **page** | **Integer**|  | [optional] |
| **sort** | **String**| Return matches sorted by either &#x60;score&#x60; or &#x60;timestamp&#x60;. | [optional] |
| **sortDir** | **String**| Change sort direction to ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). | [optional] |

### Return type

[**SearchMessagesResponse**](SearchMessagesResponse.md)

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

