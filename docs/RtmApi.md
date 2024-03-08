# RtmApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**connect**](RtmApi.md#connect) | **GET** /rtm.connect |  |


<a name="connect"></a>
# **connect**
> RtmConnectResponse connect(token).batchPresenceAware(batchPresenceAware).presenceSub(presenceSub).execute();



Starts a Real Time Messaging session.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RtmApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `rtm:stream`
    Boolean batchPresenceAware = true; // Batch presence deliveries via subscription. Enabling changes the shape of `presence_change` events. See [batch presence](https://slack.dev).
    Boolean presenceSub = true; // Only deliver presence events when requested by subscription. See [presence subscriptions](https://slack.dev).
    try {
      RtmConnectResponse result = client
              .rtm
              .connect(token)
              .batchPresenceAware(batchPresenceAware)
              .presenceSub(presenceSub)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getSelf());
      System.out.println(result.getTeam());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling RtmApi#connect");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RtmConnectResponse> response = client
              .rtm
              .connect(token)
              .batchPresenceAware(batchPresenceAware)
              .presenceSub(presenceSub)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RtmApi#connect");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;rtm:stream&#x60; | |
| **batchPresenceAware** | **Boolean**| Batch presence deliveries via subscription. Enabling changes the shape of &#x60;presence_change&#x60; events. See [batch presence](https://slack.dev). | [optional] |
| **presenceSub** | **Boolean**| Only deliver presence events when requested by subscription. See [presence subscriptions](https://slack.dev). | [optional] |

### Return type

[**RtmConnectResponse**](RtmConnectResponse.md)

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

