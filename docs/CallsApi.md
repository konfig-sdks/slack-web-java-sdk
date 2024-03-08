# CallsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](CallsApi.md#add) | **POST** /calls.add |  |
| [**addNewParticipant**](CallsApi.md#addNewParticipant) | **POST** /calls.participants.add |  |
| [**end**](CallsApi.md#end) | **POST** /calls.end |  |
| [**info**](CallsApi.md#info) | **GET** /calls.info |  |
| [**registerRemoved**](CallsApi.md#registerRemoved) | **POST** /calls.participants.remove |  |
| [**update**](CallsApi.md#update) | **POST** /calls.update |  |


<a name="add"></a>
# **add**
> CallsAddResponse add(token, externalUniqueId, joinUrl, callsAddRequest).title(title).createdBy(createdBy).dateStart(dateStart).desktopAppJoinUrl(desktopAppJoinUrl).externalDisplayId(externalDisplayId).users(users).execute();



Registers a new Call.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CallsApi;
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
    String externalUniqueId = "externalUniqueId_example"; // An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service.
    String joinUrl = "joinUrl_example"; // The URL required for a client to join the Call.
    String title = "title_example"; // The name of the Call.
    String createdBy = "createdBy_example"; // The valid Slack user ID of the user who created this Call. When this method is called with a user token, the `created_by` field is optional and defaults to the authed user of the token. Otherwise, the field is required.
    Integer dateStart = 56; // Call start time in UTC UNIX timestamp format
    String desktopAppJoinUrl = "desktopAppJoinUrl_example"; // When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL.
    String externalDisplayId = "externalDisplayId_example"; // An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object.
    String users = "users_example"; // The list of users to register as participants in the Call. [Read more on how to specify users here](https://slack.dev).
    try {
      CallsAddResponse result = client
              .calls
              .add(token, externalUniqueId, joinUrl)
              .title(title)
              .createdBy(createdBy)
              .dateStart(dateStart)
              .desktopAppJoinUrl(desktopAppJoinUrl)
              .externalDisplayId(externalDisplayId)
              .users(users)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#add");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CallsAddResponse> response = client
              .calls
              .add(token, externalUniqueId, joinUrl)
              .title(title)
              .createdBy(createdBy)
              .dateStart(dateStart)
              .desktopAppJoinUrl(desktopAppJoinUrl)
              .externalDisplayId(externalDisplayId)
              .users(users)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#add");
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
| **externalUniqueId** | **String**| An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service. | |
| **joinUrl** | **String**| The URL required for a client to join the Call. | |
| **callsAddRequest** | [**CallsAddRequest**](CallsAddRequest.md)|  | |
| **title** | **String**| The name of the Call. | [optional] |
| **createdBy** | **String**| The valid Slack user ID of the user who created this Call. When this method is called with a user token, the &#x60;created_by&#x60; field is optional and defaults to the authed user of the token. Otherwise, the field is required. | [optional] |
| **dateStart** | **Integer**| Call start time in UTC UNIX timestamp format | [optional] |
| **desktopAppJoinUrl** | **String**| When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. | [optional] |
| **externalDisplayId** | **String**| An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object. | [optional] |
| **users** | **String**| The list of users to register as participants in the Call. [Read more on how to specify users here](https://slack.dev). | [optional] |

### Return type

[**CallsAddResponse**](CallsAddResponse.md)

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
import com.konfigthis.client.api.CallsApi;
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
              .calls
              .addNewParticipant(token, id, users)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#addNewParticipant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CallsparticipantsAddNewParticipantResponse> response = client
              .calls
              .addNewParticipant(token, id, users)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#addNewParticipant");
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

<a name="end"></a>
# **end**
> CallsEndResponse end(token, id, callsEndRequest).duration(duration).execute();



Ends a Call.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CallsApi;
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
    String id = "id_example"; // `id` returned when registering the call using the [`calls.add`](https://slack.dev) method.
    Integer duration = 56; // Call duration in seconds
    try {
      CallsEndResponse result = client
              .calls
              .end(token, id)
              .duration(duration)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#end");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CallsEndResponse> response = client
              .calls
              .end(token, id)
              .duration(duration)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#end");
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
| **id** | **String**| &#x60;id&#x60; returned when registering the call using the [&#x60;calls.add&#x60;](https://slack.dev) method. | |
| **callsEndRequest** | [**CallsEndRequest**](CallsEndRequest.md)|  | |
| **duration** | **Integer**| Call duration in seconds | [optional] |

### Return type

[**CallsEndResponse**](CallsEndResponse.md)

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

<a name="info"></a>
# **info**
> CallsInfoResponse info(token, id).execute();



Returns information about a Call.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CallsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `calls:read`
    String id = "id_example"; // `id` of the Call returned by the [`calls.add`](https://slack.dev) method.
    try {
      CallsInfoResponse result = client
              .calls
              .info(token, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#info");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CallsInfoResponse> response = client
              .calls
              .info(token, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#info");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;calls:read&#x60; | |
| **id** | **String**| &#x60;id&#x60; of the Call returned by the [&#x60;calls.add&#x60;](https://slack.dev) method. | |

### Return type

[**CallsInfoResponse**](CallsInfoResponse.md)

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
import com.konfigthis.client.api.CallsApi;
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
              .calls
              .registerRemoved(token, id, users)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#registerRemoved");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CallsparticipantsRegisterRemovedResponse> response = client
              .calls
              .registerRemoved(token, id, users)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#registerRemoved");
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

<a name="update"></a>
# **update**
> CallsUpdateResponse update(token, id, callsUpdateRequest).title(title).desktopAppJoinUrl(desktopAppJoinUrl).joinUrl(joinUrl).execute();



Updates information about a Call.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CallsApi;
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
    String title = "title_example"; // The name of the Call.
    String desktopAppJoinUrl = "desktopAppJoinUrl_example"; // When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL.
    String joinUrl = "joinUrl_example"; // The URL required for a client to join the Call.
    try {
      CallsUpdateResponse result = client
              .calls
              .update(token, id)
              .title(title)
              .desktopAppJoinUrl(desktopAppJoinUrl)
              .joinUrl(joinUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#update");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CallsUpdateResponse> response = client
              .calls
              .update(token, id)
              .title(title)
              .desktopAppJoinUrl(desktopAppJoinUrl)
              .joinUrl(joinUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#update");
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
| **callsUpdateRequest** | [**CallsUpdateRequest**](CallsUpdateRequest.md)|  | |
| **title** | **String**| The name of the Call. | [optional] |
| **desktopAppJoinUrl** | **String**| When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. | [optional] |
| **joinUrl** | **String**| The URL required for a client to join the Call. | [optional] |

### Return type

[**CallsUpdateResponse**](CallsUpdateResponse.md)

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

