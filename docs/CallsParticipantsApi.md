# CallsParticipantsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewParticipant**](CallsParticipantsApi.md#addNewParticipant) | **POST** /calls.participants.add |  |
| [**registerRemoved**](CallsParticipantsApi.md#registerRemoved) | **POST** /calls.participants.remove |  |


<a name="addNewParticipant"></a>
# **addNewParticipant**
> CallsparticipantsAddNewParticipantResponse addNewParticipant(token, id, users, callsparticipantsAddNewParticipantRequest).execute();



Registers new participants added to a Call.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CallsParticipantsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `calls:write`
    String id = "id_example"; // `id` returned by the [`calls.add`](https://slack.dev) method.
    String users = "users_example"; // The list of users to add as participants in the Call. [Read more on how to specify users here](https://slack.dev).
    try {
      CallsparticipantsAddNewParticipantResponse result = client
              .callsParticipants
              .addNewParticipant(token, id, users)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsParticipantsApi#addNewParticipant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CallsparticipantsAddNewParticipantResponse> response = client
              .callsParticipants
              .addNewParticipant(token, id, users)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsParticipantsApi#addNewParticipant");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;calls:write&#x60; | |
| **id** | **String**| &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](https://slack.dev) method. | |
| **users** | **String**| The list of users to add as participants in the Call. [Read more on how to specify users here](https://slack.dev). | |
| **callsparticipantsAddNewParticipantRequest** | [**CallsparticipantsAddNewParticipantRequest**](CallsparticipantsAddNewParticipantRequest.md)|  | |

### Return type

[**CallsparticipantsAddNewParticipantResponse**](CallsparticipantsAddNewParticipantResponse.md)

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

<a name="registerRemoved"></a>
# **registerRemoved**
> CallsparticipantsRegisterRemovedResponse registerRemoved(token, id, users, callsparticipantsRegisterRemovedRequest).execute();



Registers participants removed from a Call.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CallsParticipantsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `calls:write`
    String id = "id_example"; // `id` returned by the [`calls.add`](https://slack.dev) method.
    String users = "users_example"; // The list of users to remove as participants in the Call. [Read more on how to specify users here](https://slack.dev).
    try {
      CallsparticipantsRegisterRemovedResponse result = client
              .callsParticipants
              .registerRemoved(token, id, users)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsParticipantsApi#registerRemoved");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CallsparticipantsRegisterRemovedResponse> response = client
              .callsParticipants
              .registerRemoved(token, id, users)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsParticipantsApi#registerRemoved");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;calls:write&#x60; | |
| **id** | **String**| &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](https://slack.dev) method. | |
| **users** | **String**| The list of users to remove as participants in the Call. [Read more on how to specify users here](https://slack.dev). | |
| **callsparticipantsRegisterRemovedRequest** | [**CallsparticipantsRegisterRemovedRequest**](CallsparticipantsRegisterRemovedRequest.md)|  | |

### Return type

[**CallsparticipantsRegisterRemovedResponse**](CallsparticipantsRegisterRemovedResponse.md)

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

