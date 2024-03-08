# ChatScheduledMessagesApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](ChatScheduledMessagesApi.md#list) | **GET** /chat.scheduledMessages.list |  |


<a name="list"></a>
# **list**
> ChatscheduledMessagesListResponse list().token(token).channel(channel).latest(latest).oldest(oldest).limit(limit).cursor(cursor).execute();



Returns a list of scheduled messages.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatScheduledMessagesApi;
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
    String channel = "channel_example"; // The channel of the scheduled messages
    Double latest = 3.4D; // A UNIX timestamp of the latest value in the time range
    Double oldest = 3.4D; // A UNIX timestamp of the oldest value in the time range
    Integer limit = 56; // Maximum number of original entries to return.
    String cursor = "cursor_example"; // For pagination purposes, this is the `cursor` value returned from a previous call to `chat.scheduledmessages.list` indicating where you want to start this call from.
    try {
      ChatscheduledMessagesListResponse result = client
              .chatScheduledMessages
              .list()
              .token(token)
              .channel(channel)
              .latest(latest)
              .oldest(oldest)
              .limit(limit)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getResponseMetadata());
      System.out.println(result.getScheduledMessages());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatScheduledMessagesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChatscheduledMessagesListResponse> response = client
              .chatScheduledMessages
              .list()
              .token(token)
              .channel(channel)
              .latest(latest)
              .oldest(oldest)
              .limit(limit)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatScheduledMessagesApi#list");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;none&#x60; | [optional] |
| **channel** | **String**| The channel of the scheduled messages | [optional] |
| **latest** | **Double**| A UNIX timestamp of the latest value in the time range | [optional] |
| **oldest** | **Double**| A UNIX timestamp of the oldest value in the time range | [optional] |
| **limit** | **Integer**| Maximum number of original entries to return. | [optional] |
| **cursor** | **String**| For pagination purposes, this is the &#x60;cursor&#x60; value returned from a previous call to &#x60;chat.scheduledmessages.list&#x60; indicating where you want to start this call from. | [optional] |

### Return type

[**ChatscheduledMessagesListResponse**](ChatscheduledMessagesListResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response if the channel passed is invalid |  -  |

