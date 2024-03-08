# ConversationsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archive**](ConversationsApi.md#archive) | **POST** /conversations.archive |  |
| [**close**](ConversationsApi.md#close) | **POST** /conversations.close |  |
| [**create**](ConversationsApi.md#create) | **POST** /conversations.create |  |
| [**history**](ConversationsApi.md#history) | **GET** /conversations.history |  |
| [**info**](ConversationsApi.md#info) | **GET** /conversations.info |  |
| [**invite**](ConversationsApi.md#invite) | **POST** /conversations.invite |  |
| [**join**](ConversationsApi.md#join) | **POST** /conversations.join |  |
| [**kick**](ConversationsApi.md#kick) | **POST** /conversations.kick |  |
| [**leave**](ConversationsApi.md#leave) | **POST** /conversations.leave |  |
| [**list**](ConversationsApi.md#list) | **GET** /conversations.list |  |
| [**mark**](ConversationsApi.md#mark) | **POST** /conversations.mark |  |
| [**members**](ConversationsApi.md#members) | **GET** /conversations.members |  |
| [**open**](ConversationsApi.md#open) | **POST** /conversations.open |  |
| [**rename**](ConversationsApi.md#rename) | **POST** /conversations.rename |  |
| [**replies**](ConversationsApi.md#replies) | **GET** /conversations.replies |  |
| [**setPurpose**](ConversationsApi.md#setPurpose) | **POST** /conversations.setPurpose |  |
| [**setTopic**](ConversationsApi.md#setTopic) | **POST** /conversations.setTopic |  |
| [**unarchive**](ConversationsApi.md#unarchive) | **POST** /conversations.unarchive |  |


<a name="archive"></a>
# **archive**
> ConversationsArchiveResponse archive().token(token).channel(channel).conversationsArchiveRequest(conversationsArchiveRequest).execute();



Archives a conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:write`
    String channel = "channel_example"; // ID of conversation to archive
    try {
      ConversationsArchiveResponse result = client
              .conversations
              .archive()
              .token(token)
              .channel(channel)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#archive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsArchiveResponse> response = client
              .conversations
              .archive()
              .token(token)
              .channel(channel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#archive");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String**| ID of conversation to archive | [optional] |
| **conversationsArchiveRequest** | [**ConversationsArchiveRequest**](ConversationsArchiveRequest.md)|  | [optional] |

### Return type

[**ConversationsArchiveResponse**](ConversationsArchiveResponse.md)

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

<a name="close"></a>
# **close**
> ConversationsCloseResponse close().token(token).channel(channel).conversationsCloseRequest(conversationsCloseRequest).execute();



Closes a direct message or multi-person direct message.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:write`
    String channel = "channel_example"; // Conversation to close.
    try {
      ConversationsCloseResponse result = client
              .conversations
              .close()
              .token(token)
              .channel(channel)
              .execute();
      System.out.println(result);
      System.out.println(result.getAlreadyClosed());
      System.out.println(result.getNoOp());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#close");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsCloseResponse> response = client
              .conversations
              .close()
              .token(token)
              .channel(channel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#close");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String**| Conversation to close. | [optional] |
| **conversationsCloseRequest** | [**ConversationsCloseRequest**](ConversationsCloseRequest.md)|  | [optional] |

### Return type

[**ConversationsCloseResponse**](ConversationsCloseResponse.md)

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

<a name="create"></a>
# **create**
> ConversationsCreateResponse create().token(token).isPrivate(isPrivate).name(name).conversationsCreateRequest(conversationsCreateRequest).execute();



Initiates a public or private channel-based conversation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:write`
    Boolean isPrivate = true; // Create a private channel instead of a public one
    String name = "name_example"; // Name of the public or private channel to create
    try {
      ConversationsCreateResponse result = client
              .conversations
              .create()
              .token(token)
              .isPrivate(isPrivate)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannel());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsCreateResponse> response = client
              .conversations
              .create()
              .token(token)
              .isPrivate(isPrivate)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#create");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **isPrivate** | **Boolean**| Create a private channel instead of a public one | [optional] |
| **name** | **String**| Name of the public or private channel to create | [optional] |
| **conversationsCreateRequest** | [**ConversationsCreateRequest**](ConversationsCreateRequest.md)|  | [optional] |

### Return type

[**ConversationsCreateResponse**](ConversationsCreateResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | If successful, the command returns a rather stark [conversation object](https://slack.dev) |  -  |
| **0** | Typical error response when name already in use |  -  |

<a name="history"></a>
# **history**
> ConversationsHistoryResponse history().token(token).channel(channel).latest(latest).oldest(oldest).inclusive(inclusive).limit(limit).cursor(cursor).execute();



Fetches a conversation&#39;s history of messages and events.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:history`
    String channel = "channel_example"; // Conversation ID to fetch history for.
    Double latest = 3.4D; // End of time range of messages to include in results.
    Double oldest = 3.4D; // Start of time range of messages to include in results.
    Boolean inclusive = true; // Include messages with latest or oldest timestamp in results only when either timestamp is specified.
    Integer limit = 56; // The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
    String cursor = "cursor_example"; // Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](https://slack.dev) for more detail.
    try {
      ConversationsHistoryResponse result = client
              .conversations
              .history()
              .token(token)
              .channel(channel)
              .latest(latest)
              .oldest(oldest)
              .inclusive(inclusive)
              .limit(limit)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannelActionsCount());
      System.out.println(result.getChannelActionsTs());
      System.out.println(result.getHasMore());
      System.out.println(result.getMessages());
      System.out.println(result.getOk());
      System.out.println(result.getPinCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#history");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsHistoryResponse> response = client
              .conversations
              .history()
              .token(token)
              .channel(channel)
              .latest(latest)
              .oldest(oldest)
              .inclusive(inclusive)
              .limit(limit)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#history");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:history&#x60; | [optional] |
| **channel** | **String**| Conversation ID to fetch history for. | [optional] |
| **latest** | **Double**| End of time range of messages to include in results. | [optional] |
| **oldest** | **Double**| Start of time range of messages to include in results. | [optional] |
| **inclusive** | **Boolean**| Include messages with latest or oldest timestamp in results only when either timestamp is specified. | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | [optional] |
| **cursor** | **String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](https://slack.dev) for more detail. | [optional] |

### Return type

[**ConversationsHistoryResponse**](ConversationsHistoryResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response containing a channel&#39;s messages |  -  |
| **0** | Typical error response |  -  |

<a name="info"></a>
# **info**
> ConversationsInfoResponse info().token(token).channel(channel).includeLocale(includeLocale).includeNumMembers(includeNumMembers).execute();



Retrieve information about a conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:read`
    String channel = "channel_example"; // Conversation ID to learn more about
    Boolean includeLocale = true; // Set this to `true` to receive the locale for this conversation. Defaults to `false`
    Boolean includeNumMembers = true; // Set to `true` to include the member count for the specified conversation. Defaults to `false`
    try {
      ConversationsInfoResponse result = client
              .conversations
              .info()
              .token(token)
              .channel(channel)
              .includeLocale(includeLocale)
              .includeNumMembers(includeNumMembers)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannel());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#info");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsInfoResponse> response = client
              .conversations
              .info()
              .token(token)
              .channel(channel)
              .includeLocale(includeLocale)
              .includeNumMembers(includeNumMembers)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#info");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional] |
| **channel** | **String**| Conversation ID to learn more about | [optional] |
| **includeLocale** | **Boolean**| Set this to &#x60;true&#x60; to receive the locale for this conversation. Defaults to &#x60;false&#x60; | [optional] |
| **includeNumMembers** | **Boolean**| Set to &#x60;true&#x60; to include the member count for the specified conversation. Defaults to &#x60;false&#x60; | [optional] |

### Return type

[**ConversationsInfoResponse**](ConversationsInfoResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response for a public channel. (Also, a response from a private channel and a multi-party IM is very similar to this example.) |  -  |
| **0** | Typical error response when a channel cannot be found |  -  |

<a name="invite"></a>
# **invite**
> ConversationsInviteResponse invite().token(token).channel(channel).users(users).conversationsInviteRequest(conversationsInviteRequest).execute();



Invites users to a channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:write`
    String channel = "channel_example"; // The ID of the public or private channel to invite user(s) to.
    String users = "users_example"; // A comma separated list of user IDs. Up to 1000 users may be listed.
    try {
      ConversationsInviteResponse result = client
              .conversations
              .invite()
              .token(token)
              .channel(channel)
              .users(users)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannel());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#invite");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsInviteResponse> response = client
              .conversations
              .invite()
              .token(token)
              .channel(channel)
              .users(users)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#invite");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String**| The ID of the public or private channel to invite user(s) to. | [optional] |
| **users** | **String**| A comma separated list of user IDs. Up to 1000 users may be listed. | [optional] |
| **conversationsInviteRequest** | [**ConversationsInviteRequest**](ConversationsInviteRequest.md)|  | [optional] |

### Return type

[**ConversationsInviteResponse**](ConversationsInviteResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response when an invitation is extended |  -  |
| **0** | Typical error response when an invite is attempted on a conversation type that does not support it |  -  |

<a name="join"></a>
# **join**
> ConversationsJoinResponse join().token(token).channel(channel).conversationsJoinRequest(conversationsJoinRequest).execute();



Joins an existing conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `channels:write`
    String channel = "channel_example"; // ID of conversation to join
    try {
      ConversationsJoinResponse result = client
              .conversations
              .join()
              .token(token)
              .channel(channel)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannel());
      System.out.println(result.getOk());
      System.out.println(result.getResponseMetadata());
      System.out.println(result.getWarning());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#join");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsJoinResponse> response = client
              .conversations
              .join()
              .token(token)
              .channel(channel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#join");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;channels:write&#x60; | [optional] |
| **channel** | **String**| ID of conversation to join | [optional] |
| **conversationsJoinRequest** | [**ConversationsJoinRequest**](ConversationsJoinRequest.md)|  | [optional] |

### Return type

[**ConversationsJoinResponse**](ConversationsJoinResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response if the conversation is archived and cannot be joined |  -  |

<a name="kick"></a>
# **kick**
> ConversationsKickResponse kick().token(token).channel(channel).user(user).conversationsKickRequest(conversationsKickRequest).execute();



Removes a user from a conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:write`
    String channel = "channel_example"; // ID of conversation to remove user from.
    String user = "user_example"; // User ID to be removed.
    try {
      ConversationsKickResponse result = client
              .conversations
              .kick()
              .token(token)
              .channel(channel)
              .user(user)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#kick");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsKickResponse> response = client
              .conversations
              .kick()
              .token(token)
              .channel(channel)
              .user(user)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#kick");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String**| ID of conversation to remove user from. | [optional] |
| **user** | **String**| User ID to be removed. | [optional] |
| **conversationsKickRequest** | [**ConversationsKickRequest**](ConversationsKickRequest.md)|  | [optional] |

### Return type

[**ConversationsKickResponse**](ConversationsKickResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response when you attempt to kick yourself from a channel |  -  |

<a name="leave"></a>
# **leave**
> ConversationsLeaveResponse leave().token(token).channel(channel).conversationsLeaveRequest(conversationsLeaveRequest).execute();



Leaves a conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:write`
    String channel = "channel_example"; // Conversation to leave
    try {
      ConversationsLeaveResponse result = client
              .conversations
              .leave()
              .token(token)
              .channel(channel)
              .execute();
      System.out.println(result);
      System.out.println(result.getNotInChannel());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#leave");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsLeaveResponse> response = client
              .conversations
              .leave()
              .token(token)
              .channel(channel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#leave");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String**| Conversation to leave | [optional] |
| **conversationsLeaveRequest** | [**ConversationsLeaveRequest**](ConversationsLeaveRequest.md)|  | [optional] |

### Return type

[**ConversationsLeaveResponse**](ConversationsLeaveResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response when attempting to leave a workspace&#39;s \&quot;general\&quot; channel |  -  |

<a name="list"></a>
# **list**
> ConversationsListResponse list().token(token).excludeArchived(excludeArchived).types(types).limit(limit).cursor(cursor).execute();



Lists all channels in a Slack team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:read`
    Boolean excludeArchived = true; // Set to `true` to exclude archived channels from the list
    String types = "types_example"; // Mix and match channel types by providing a comma-separated list of any combination of `public_channel`, `private_channel`, `mpim`, `im`
    Integer limit = 56; // The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached. Must be an integer no larger than 1000.
    String cursor = "cursor_example"; // Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](https://slack.dev) for more detail.
    try {
      ConversationsListResponse result = client
              .conversations
              .list()
              .token(token)
              .excludeArchived(excludeArchived)
              .types(types)
              .limit(limit)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannels());
      System.out.println(result.getOk());
      System.out.println(result.getResponseMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsListResponse> response = client
              .conversations
              .list()
              .token(token)
              .excludeArchived(excludeArchived)
              .types(types)
              .limit(limit)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#list");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional] |
| **excludeArchived** | **Boolean**| Set to &#x60;true&#x60; to exclude archived channels from the list | [optional] |
| **types** | **String**| Mix and match channel types by providing a comma-separated list of any combination of &#x60;public_channel&#x60;, &#x60;private_channel&#x60;, &#x60;mpim&#x60;, &#x60;im&#x60; | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. Must be an integer no larger than 1000. | [optional] |
| **cursor** | **String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](https://slack.dev) for more detail. | [optional] |

### Return type

[**ConversationsListResponse**](ConversationsListResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response with only public channels |  -  |
| **0** | Typical error response |  -  |

<a name="mark"></a>
# **mark**
> ConversationsMarkResponse mark().token(token).channel(channel).ts(ts).conversationsMarkRequest(conversationsMarkRequest).execute();



Sets the read cursor in a channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:write`
    String channel = "channel_example"; // Channel or conversation to set the read cursor for.
    Double ts = 3.4D; // Unique identifier of message you want marked as most recently seen in this conversation.
    try {
      ConversationsMarkResponse result = client
              .conversations
              .mark()
              .token(token)
              .channel(channel)
              .ts(ts)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#mark");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsMarkResponse> response = client
              .conversations
              .mark()
              .token(token)
              .channel(channel)
              .ts(ts)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#mark");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String**| Channel or conversation to set the read cursor for. | [optional] |
| **ts** | **Double**| Unique identifier of message you want marked as most recently seen in this conversation. | [optional] |
| **conversationsMarkRequest** | [**ConversationsMarkRequest**](ConversationsMarkRequest.md)|  | [optional] |

### Return type

[**ConversationsMarkResponse**](ConversationsMarkResponse.md)

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

<a name="members"></a>
# **members**
> ConversationsMembersResponse members().token(token).channel(channel).limit(limit).cursor(cursor).execute();



Retrieve members of a conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:read`
    String channel = "channel_example"; // ID of the conversation to retrieve members for
    Integer limit = 56; // The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
    String cursor = "cursor_example"; // Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](https://slack.dev) for more detail.
    try {
      ConversationsMembersResponse result = client
              .conversations
              .members()
              .token(token)
              .channel(channel)
              .limit(limit)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getMembers());
      System.out.println(result.getOk());
      System.out.println(result.getResponseMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#members");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsMembersResponse> response = client
              .conversations
              .members()
              .token(token)
              .channel(channel)
              .limit(limit)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#members");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional] |
| **channel** | **String**| ID of the conversation to retrieve members for | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | [optional] |
| **cursor** | **String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](https://slack.dev) for more detail. | [optional] |

### Return type

[**ConversationsMembersResponse**](ConversationsMembersResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical paginated success response |  -  |
| **0** | Typical error response when an invalid cursor is provided |  -  |

<a name="open"></a>
# **open**
> ConversationsOpenResponse open().token(token).channel(channel).returnIm(returnIm).users(users).conversationsOpenRequest(conversationsOpenRequest).execute();



Opens or resumes a direct message or multi-person direct message.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:write`
    String channel = "channel_example"; // Resume a conversation by supplying an `im` or `mpim`'s ID. Or provide the `users` field instead.
    Boolean returnIm = true; // Boolean, indicates you want the full IM channel definition in the response.
    String users = "users_example"; // Comma separated lists of users. If only one user is included, this creates a 1:1 DM.  The ordering of the users is preserved whenever a multi-person direct message is returned. Supply a `channel` when not supplying `users`.
    try {
      ConversationsOpenResponse result = client
              .conversations
              .open()
              .token(token)
              .channel(channel)
              .returnIm(returnIm)
              .users(users)
              .execute();
      System.out.println(result);
      System.out.println(result.getAlreadyOpen());
      System.out.println(result.getChannel());
      System.out.println(result.getNoOp());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#open");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsOpenResponse> response = client
              .conversations
              .open()
              .token(token)
              .channel(channel)
              .returnIm(returnIm)
              .users(users)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#open");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String**| Resume a conversation by supplying an &#x60;im&#x60; or &#x60;mpim&#x60;&#39;s ID. Or provide the &#x60;users&#x60; field instead. | [optional] |
| **returnIm** | **Boolean**| Boolean, indicates you want the full IM channel definition in the response. | [optional] |
| **users** | **String**| Comma separated lists of users. If only one user is included, this creates a 1:1 DM.  The ordering of the users is preserved whenever a multi-person direct message is returned. Supply a &#x60;channel&#x60; when not supplying &#x60;users&#x60;. | [optional] |
| **conversationsOpenRequest** | [**ConversationsOpenRequest**](ConversationsOpenRequest.md)|  | [optional] |

### Return type

[**ConversationsOpenResponse**](ConversationsOpenResponse.md)

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

<a name="rename"></a>
# **rename**
> ConversationsRenameResponse rename().token(token).channel(channel).name(name).conversationsRenameRequest(conversationsRenameRequest).execute();



Renames a conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:write`
    String channel = "channel_example"; // ID of conversation to rename
    String name = "name_example"; // New name for conversation.
    try {
      ConversationsRenameResponse result = client
              .conversations
              .rename()
              .token(token)
              .channel(channel)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannel());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#rename");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsRenameResponse> response = client
              .conversations
              .rename()
              .token(token)
              .channel(channel)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#rename");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String**| ID of conversation to rename | [optional] |
| **name** | **String**| New name for conversation. | [optional] |
| **conversationsRenameRequest** | [**ConversationsRenameRequest**](ConversationsRenameRequest.md)|  | [optional] |

### Return type

[**ConversationsRenameResponse**](ConversationsRenameResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response when the calling user is not a member of the conversation |  -  |

<a name="replies"></a>
# **replies**
> ConversationsRepliesResponse replies().token(token).channel(channel).ts(ts).latest(latest).oldest(oldest).inclusive(inclusive).limit(limit).cursor(cursor).execute();



Retrieve a thread of messages posted to a conversation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:history`
    String channel = "channel_example"; // Conversation ID to fetch thread from.
    Double ts = 3.4D; // Unique identifier of a thread's parent message. `ts` must be the timestamp of an existing message with 0 or more replies. If there are no replies then just the single message referenced by `ts` will return - it is just an ordinary, unthreaded message.
    Double latest = 3.4D; // End of time range of messages to include in results.
    Double oldest = 3.4D; // Start of time range of messages to include in results.
    Boolean inclusive = true; // Include messages with latest or oldest timestamp in results only when either timestamp is specified.
    Integer limit = 56; // The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
    String cursor = "cursor_example"; // Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](https://slack.dev) for more detail.
    try {
      ConversationsRepliesResponse result = client
              .conversations
              .replies()
              .token(token)
              .channel(channel)
              .ts(ts)
              .latest(latest)
              .oldest(oldest)
              .inclusive(inclusive)
              .limit(limit)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMore());
      System.out.println(result.getMessages());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#replies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsRepliesResponse> response = client
              .conversations
              .replies()
              .token(token)
              .channel(channel)
              .ts(ts)
              .latest(latest)
              .oldest(oldest)
              .inclusive(inclusive)
              .limit(limit)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#replies");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:history&#x60; | [optional] |
| **channel** | **String**| Conversation ID to fetch thread from. | [optional] |
| **ts** | **Double**| Unique identifier of a thread&#39;s parent message. &#x60;ts&#x60; must be the timestamp of an existing message with 0 or more replies. If there are no replies then just the single message referenced by &#x60;ts&#x60; will return - it is just an ordinary, unthreaded message. | [optional] |
| **latest** | **Double**| End of time range of messages to include in results. | [optional] |
| **oldest** | **Double**| Start of time range of messages to include in results. | [optional] |
| **inclusive** | **Boolean**| Include messages with latest or oldest timestamp in results only when either timestamp is specified. | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | [optional] |
| **cursor** | **String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](https://slack.dev) for more detail. | [optional] |

### Return type

[**ConversationsRepliesResponse**](ConversationsRepliesResponse.md)

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

<a name="setPurpose"></a>
# **setPurpose**
> ConversationsSetPurposeResponse setPurpose().token(token).channel(channel).purpose(purpose).conversationsSetPurposeRequest(conversationsSetPurposeRequest).execute();



Sets the purpose for a conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:write`
    String channel = "channel_example"; // Conversation to set the purpose of
    String purpose = "purpose_example"; // A new, specialer purpose
    try {
      ConversationsSetPurposeResponse result = client
              .conversations
              .setPurpose()
              .token(token)
              .channel(channel)
              .purpose(purpose)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannel());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#setPurpose");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsSetPurposeResponse> response = client
              .conversations
              .setPurpose()
              .token(token)
              .channel(channel)
              .purpose(purpose)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#setPurpose");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String**| Conversation to set the purpose of | [optional] |
| **purpose** | **String**| A new, specialer purpose | [optional] |
| **conversationsSetPurposeRequest** | [**ConversationsSetPurposeRequest**](ConversationsSetPurposeRequest.md)|  | [optional] |

### Return type

[**ConversationsSetPurposeResponse**](ConversationsSetPurposeResponse.md)

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

<a name="setTopic"></a>
# **setTopic**
> ConversationsSetTopicResponse setTopic().token(token).channel(channel).topic(topic).conversationsSetTopicRequest(conversationsSetTopicRequest).execute();



Sets the topic for a conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:write`
    String channel = "channel_example"; // Conversation to set the topic of
    String topic = "topic_example"; // The new topic string. Does not support formatting or linkification.
    try {
      ConversationsSetTopicResponse result = client
              .conversations
              .setTopic()
              .token(token)
              .channel(channel)
              .topic(topic)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannel());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#setTopic");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsSetTopicResponse> response = client
              .conversations
              .setTopic()
              .token(token)
              .channel(channel)
              .topic(topic)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#setTopic");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String**| Conversation to set the topic of | [optional] |
| **topic** | **String**| The new topic string. Does not support formatting or linkification. | [optional] |
| **conversationsSetTopicRequest** | [**ConversationsSetTopicRequest**](ConversationsSetTopicRequest.md)|  | [optional] |

### Return type

[**ConversationsSetTopicResponse**](ConversationsSetTopicResponse.md)

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

<a name="unarchive"></a>
# **unarchive**
> ConversationsUnarchiveResponse unarchive().token(token).channel(channel).conversationsUnarchiveRequest(conversationsUnarchiveRequest).execute();



Reverses conversation archival.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `conversations:write`
    String channel = "channel_example"; // ID of conversation to unarchive
    try {
      ConversationsUnarchiveResponse result = client
              .conversations
              .unarchive()
              .token(token)
              .channel(channel)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#unarchive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsUnarchiveResponse> response = client
              .conversations
              .unarchive()
              .token(token)
              .channel(channel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#unarchive");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String**| ID of conversation to unarchive | [optional] |
| **conversationsUnarchiveRequest** | [**ConversationsUnarchiveRequest**](ConversationsUnarchiveRequest.md)|  | [optional] |

### Return type

[**ConversationsUnarchiveResponse**](ConversationsUnarchiveResponse.md)

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

