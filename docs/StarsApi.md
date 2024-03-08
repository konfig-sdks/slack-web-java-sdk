# StarsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](StarsApi.md#add) | **POST** /stars.add |  |
| [**list**](StarsApi.md#list) | **GET** /stars.list |  |
| [**remove**](StarsApi.md#remove) | **POST** /stars.remove |  |


<a name="add"></a>
# **add**
> StarsAddResponse add(token).channel(channel)._file(_file).fileComment(fileComment).timestamp(timestamp).starsAddRequest(starsAddRequest).execute();



Adds a star to an item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StarsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `stars:write`
    String channel = "channel_example"; // Channel to add star to, or channel where the message to add star to was posted (used with `timestamp`).
    String _file = "_file_example"; // File to add star to.
    String fileComment = "fileComment_example"; // File comment to add star to.
    String timestamp = "timestamp_example"; // Timestamp of the message to add star to.
    try {
      StarsAddResponse result = client
              .stars
              .add(token)
              .channel(channel)
              ._file(_file)
              .fileComment(fileComment)
              .timestamp(timestamp)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling StarsApi#add");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StarsAddResponse> response = client
              .stars
              .add(token)
              .channel(channel)
              ._file(_file)
              .fileComment(fileComment)
              .timestamp(timestamp)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StarsApi#add");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;stars:write&#x60; | |
| **channel** | **String**| Channel to add star to, or channel where the message to add star to was posted (used with &#x60;timestamp&#x60;). | [optional] |
| **_file** | **String**| File to add star to. | [optional] |
| **fileComment** | **String**| File comment to add star to. | [optional] |
| **timestamp** | **String**| Timestamp of the message to add star to. | [optional] |
| **starsAddRequest** | [**StarsAddRequest**](StarsAddRequest.md)|  | [optional] |

### Return type

[**StarsAddResponse**](StarsAddResponse.md)

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
> StarsListResponse list().token(token).count(count).page(page).cursor(cursor).limit(limit).execute();



Lists stars for a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StarsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `stars:read`
    String count = "count_example";
    String page = "page_example";
    String cursor = "cursor_example"; // Parameter for pagination. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection. See [pagination](https://slack.dev) for more details.
    Integer limit = 56; // The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached.
    try {
      StarsListResponse result = client
              .stars
              .list()
              .token(token)
              .count(count)
              .page(page)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getOk());
      System.out.println(result.getPaging());
    } catch (ApiException e) {
      System.err.println("Exception when calling StarsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StarsListResponse> response = client
              .stars
              .list()
              .token(token)
              .count(count)
              .page(page)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StarsApi#list");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;stars:read&#x60; | [optional] |
| **count** | **String**|  | [optional] |
| **page** | **String**|  | [optional] |
| **cursor** | **String**| Parameter for pagination. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection. See [pagination](https://slack.dev) for more details. | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | [optional] |

### Return type

[**StarsListResponse**](StarsListResponse.md)

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

<a name="remove"></a>
# **remove**
> StarsRemoveResponse remove(token).channel(channel)._file(_file).fileComment(fileComment).timestamp(timestamp).starsRemoveRequest(starsRemoveRequest).execute();



Removes a star from an item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StarsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `stars:write`
    String channel = "channel_example"; // Channel to remove star from, or channel where the message to remove star from was posted (used with `timestamp`).
    String _file = "_file_example"; // File to remove star from.
    String fileComment = "fileComment_example"; // File comment to remove star from.
    String timestamp = "timestamp_example"; // Timestamp of the message to remove star from.
    try {
      StarsRemoveResponse result = client
              .stars
              .remove(token)
              .channel(channel)
              ._file(_file)
              .fileComment(fileComment)
              .timestamp(timestamp)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling StarsApi#remove");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StarsRemoveResponse> response = client
              .stars
              .remove(token)
              .channel(channel)
              ._file(_file)
              .fileComment(fileComment)
              .timestamp(timestamp)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StarsApi#remove");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;stars:write&#x60; | |
| **channel** | **String**| Channel to remove star from, or channel where the message to remove star from was posted (used with &#x60;timestamp&#x60;). | [optional] |
| **_file** | **String**| File to remove star from. | [optional] |
| **fileComment** | **String**| File comment to remove star from. | [optional] |
| **timestamp** | **String**| Timestamp of the message to remove star from. | [optional] |
| **starsRemoveRequest** | [**StarsRemoveRequest**](StarsRemoveRequest.md)|  | [optional] |

### Return type

[**StarsRemoveResponse**](StarsRemoveResponse.md)

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

