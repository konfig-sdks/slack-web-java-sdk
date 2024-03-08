# AdminConversationsEkmApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listOriginalConnectedChannelInfo**](AdminConversationsEkmApi.md#listOriginalConnectedChannelInfo) | **GET** /admin.conversations.ekm.listOriginalConnectedChannelInfo |  |


<a name="listOriginalConnectedChannelInfo"></a>
# **listOriginalConnectedChannelInfo**
> AdminconversationsekmListOriginalConnectedChannelInfoResponse listOriginalConnectedChannelInfo(token).channelIds(channelIds).teamIds(teamIds).limit(limit).cursor(cursor).execute();



List all disconnected channels—i.e., channels that were once connected to other workspaces and then disconnected—and the corresponding original channel IDs for key revocation with EKM.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminConversationsEkmApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.conversations:read`
    String channelIds = "channelIds_example"; // A comma-separated list of channels to filter to.
    String teamIds = "teamIds_example"; // A comma-separated list of the workspaces to which the channels you would like returned belong.
    Integer limit = 56; // The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    String cursor = "cursor_example"; // Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
    try {
      AdminconversationsekmListOriginalConnectedChannelInfoResponse result = client
              .adminConversationsEkm
              .listOriginalConnectedChannelInfo(token)
              .channelIds(channelIds)
              .teamIds(teamIds)
              .limit(limit)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsEkmApi#listOriginalConnectedChannelInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminconversationsekmListOriginalConnectedChannelInfoResponse> response = client
              .adminConversationsEkm
              .listOriginalConnectedChannelInfo(token)
              .channelIds(channelIds)
              .teamIds(teamIds)
              .limit(limit)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminConversationsEkmApi#listOriginalConnectedChannelInfo");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | |
| **channelIds** | **String**| A comma-separated list of channels to filter to. | [optional] |
| **teamIds** | **String**| A comma-separated list of the workspaces to which the channels you would like returned belong. | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

### Return type

[**AdminconversationsekmListOriginalConnectedChannelInfoResponse**](AdminconversationsekmListOriginalConnectedChannelInfoResponse.md)

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

