# ChatApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**delete**](ChatApi.md#delete) | **POST** /chat.delete |  |
| [**deleteScheduledMessage**](ChatApi.md#deleteScheduledMessage) | **POST** /chat.deleteScheduledMessage |  |
| [**getPermalink**](ChatApi.md#getPermalink) | **GET** /chat.getPermalink |  |
| [**list**](ChatApi.md#list) | **GET** /chat.scheduledMessages.list |  |
| [**meMessage**](ChatApi.md#meMessage) | **POST** /chat.meMessage |  |
| [**postEphemeral**](ChatApi.md#postEphemeral) | **POST** /chat.postEphemeral |  |
| [**postMessage**](ChatApi.md#postMessage) | **POST** /chat.postMessage |  |
| [**scheduleMessage**](ChatApi.md#scheduleMessage) | **POST** /chat.scheduleMessage |  |
| [**unfurl**](ChatApi.md#unfurl) | **POST** /chat.unfurl |  |
| [**update**](ChatApi.md#update) | **POST** /chat.update |  |


<a name="delete"></a>
# **delete**
> ChatDeleteResponse delete().token(token).asUser(asUser).channel(channel).ts(ts).chatDeleteRequest(chatDeleteRequest).execute();



Deletes a message.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `chat:write`
    Boolean asUser = true; // Pass true to delete the message as the authed user with `chat:write:user` scope. [Bot users](https://slack.dev) in this context are considered authed users. If unused or false, the message will be deleted with `chat:write:bot` scope.
    String channel = "channel_example"; // Channel containing the message to be deleted.
    Double ts = 3.4D; // Timestamp of the message to be deleted.
    try {
      ChatDeleteResponse result = client
              .chat
              .delete()
              .token(token)
              .asUser(asUser)
              .channel(channel)
              .ts(ts)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannel());
      System.out.println(result.getOk());
      System.out.println(result.getTs());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#delete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChatDeleteResponse> response = client
              .chat
              .delete()
              .token(token)
              .asUser(asUser)
              .channel(channel)
              .ts(ts)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#delete");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;chat:write&#x60; | [optional] |
| **asUser** | **Boolean**| Pass true to delete the message as the authed user with &#x60;chat:write:user&#x60; scope. [Bot users](https://slack.dev) in this context are considered authed users. If unused or false, the message will be deleted with &#x60;chat:write:bot&#x60; scope. | [optional] |
| **channel** | **String**| Channel containing the message to be deleted. | [optional] |
| **ts** | **Double**| Timestamp of the message to be deleted. | [optional] |
| **chatDeleteRequest** | [**ChatDeleteRequest**](ChatDeleteRequest.md)|  | [optional] |

### Return type

[**ChatDeleteResponse**](ChatDeleteResponse.md)

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

<a name="deleteScheduledMessage"></a>
# **deleteScheduledMessage**
> ChatDeleteScheduledMessageResponse deleteScheduledMessage(token, channel, scheduledMessageId).asUser(asUser).chatDeleteScheduledMessageRequest(chatDeleteScheduledMessageRequest).execute();



Deletes a pending scheduled message from the queue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `chat:write`
    String channel = "channel_example"; // The channel the scheduled_message is posting to
    String scheduledMessageId = "scheduledMessageId_example"; // `scheduled_message_id` returned from call to chat.scheduleMessage
    Boolean asUser = true; // Pass true to delete the message as the authed user with `chat:write:user` scope. [Bot users](https://slack.dev) in this context are considered authed users. If unused or false, the message will be deleted with `chat:write:bot` scope.
    try {
      ChatDeleteScheduledMessageResponse result = client
              .chat
              .deleteScheduledMessage(token, channel, scheduledMessageId)
              .asUser(asUser)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#deleteScheduledMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChatDeleteScheduledMessageResponse> response = client
              .chat
              .deleteScheduledMessage(token, channel, scheduledMessageId)
              .asUser(asUser)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#deleteScheduledMessage");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;chat:write&#x60; | |
| **channel** | **String**| The channel the scheduled_message is posting to | |
| **scheduledMessageId** | **String**| &#x60;scheduled_message_id&#x60; returned from call to chat.scheduleMessage | |
| **asUser** | **Boolean**| Pass true to delete the message as the authed user with &#x60;chat:write:user&#x60; scope. [Bot users](https://slack.dev) in this context are considered authed users. If unused or false, the message will be deleted with &#x60;chat:write:bot&#x60; scope. | [optional] |
| **chatDeleteScheduledMessageRequest** | [**ChatDeleteScheduledMessageRequest**](ChatDeleteScheduledMessageRequest.md)|  | [optional] |

### Return type

[**ChatDeleteScheduledMessageResponse**](ChatDeleteScheduledMessageResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response if no message is found |  -  |

<a name="getPermalink"></a>
# **getPermalink**
> ChatGetPermalinkResponse getPermalink(token, channel, messageTs).execute();



Retrieve a permalink URL for a specific extant message

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
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
    String channel = "channel_example"; // The ID of the conversation or channel containing the message
    String messageTs = "messageTs_example"; // A message's `ts` value, uniquely identifying it within a channel
    try {
      ChatGetPermalinkResponse result = client
              .chat
              .getPermalink(token, channel, messageTs)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannel());
      System.out.println(result.getOk());
      System.out.println(result.getPermalink());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#getPermalink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChatGetPermalinkResponse> response = client
              .chat
              .getPermalink(token, channel, messageTs)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#getPermalink");
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
| **channel** | **String**| The ID of the conversation or channel containing the message | |
| **messageTs** | **String**| A message&#39;s &#x60;ts&#x60; value, uniquely identifying it within a channel | |

### Return type

[**ChatGetPermalinkResponse**](ChatGetPermalinkResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Standard success response |  -  |
| **0** | Error response when channel cannot be found |  -  |

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
import com.konfigthis.client.api.ChatApi;
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
              .chat
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
      System.err.println("Exception when calling ChatApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChatscheduledMessagesListResponse> response = client
              .chat
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
      System.err.println("Exception when calling ChatApi#list");
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

<a name="meMessage"></a>
# **meMessage**
> ChatMeMessageResponse meMessage().token(token).channel(channel).text(text).chatMeMessageRequest(chatMeMessageRequest).execute();



Share a me message into a channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `chat:write`
    String channel = "channel_example"; // Channel to send message to. Can be a public channel, private group or IM channel. Can be an encoded ID, or a name.
    String text = "text_example"; // Text of the message to send.
    try {
      ChatMeMessageResponse result = client
              .chat
              .meMessage()
              .token(token)
              .channel(channel)
              .text(text)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannel());
      System.out.println(result.getOk());
      System.out.println(result.getTs());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#meMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChatMeMessageResponse> response = client
              .chat
              .meMessage()
              .token(token)
              .channel(channel)
              .text(text)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#meMessage");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;chat:write&#x60; | [optional] |
| **channel** | **String**| Channel to send message to. Can be a public channel, private group or IM channel. Can be an encoded ID, or a name. | [optional] |
| **text** | **String**| Text of the message to send. | [optional] |
| **chatMeMessageRequest** | [**ChatMeMessageRequest**](ChatMeMessageRequest.md)|  | [optional] |

### Return type

[**ChatMeMessageResponse**](ChatMeMessageResponse.md)

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

<a name="postEphemeral"></a>
# **postEphemeral**
> ChatPostEphemeralResponse postEphemeral(token, channel, user).asUser(asUser).attachments(attachments).blocks(blocks).iconEmoji(iconEmoji).iconUrl(iconUrl).linkNames(linkNames).parse(parse).text(text).threadTs(threadTs).username(username).chatPostEphemeralRequest(chatPostEphemeralRequest).execute();



Sends an ephemeral message to a user in a channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `chat:write`
    String channel = "channel_example"; // Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name.
    String user = "user_example"; // `id` of the user who will receive the ephemeral message. The user should be in the channel specified by the `channel` argument.
    Boolean asUser = true; // Pass true to post the message as the authed user. Defaults to true if the chat:write:bot scope is not included. Otherwise, defaults to false.
    String attachments = "attachments_example"; // A JSON-based array of structured attachments, presented as a URL-encoded string.
    String blocks = "blocks_example"; // A JSON-based array of structured blocks, presented as a URL-encoded string.
    String iconEmoji = "iconEmoji_example"; // Emoji to use as the icon for this message. Overrides `icon_url`. Must be used in conjunction with `as_user` set to `false`, otherwise ignored. See [authorship](https://slack.dev) below.
    String iconUrl = "iconUrl_example"; // URL to an image to use as the icon for this message. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](https://slack.dev) below.
    Boolean linkNames = true; // Find and link channel names and usernames.
    String parse = "parse_example"; // Change how messages are treated. Defaults to `none`. See [below](https://slack.dev).
    String text = "text_example"; // How this field works and whether it is required depends on other fields you use in your API call. [See below](https://slack.dev) for more detail.
    String threadTs = "threadTs_example"; // Provide another message's `ts` value to post this message in a thread. Avoid using a reply's `ts` value; use its parent's value instead. Ephemeral messages in threads are only shown if there is already an active thread.
    String username = "username_example"; // Set your bot's user name. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](https://slack.dev) below.
    try {
      ChatPostEphemeralResponse result = client
              .chat
              .postEphemeral(token, channel, user)
              .asUser(asUser)
              .attachments(attachments)
              .blocks(blocks)
              .iconEmoji(iconEmoji)
              .iconUrl(iconUrl)
              .linkNames(linkNames)
              .parse(parse)
              .text(text)
              .threadTs(threadTs)
              .username(username)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessageTs());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#postEphemeral");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChatPostEphemeralResponse> response = client
              .chat
              .postEphemeral(token, channel, user)
              .asUser(asUser)
              .attachments(attachments)
              .blocks(blocks)
              .iconEmoji(iconEmoji)
              .iconUrl(iconUrl)
              .linkNames(linkNames)
              .parse(parse)
              .text(text)
              .threadTs(threadTs)
              .username(username)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#postEphemeral");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;chat:write&#x60; | |
| **channel** | **String**| Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. | |
| **user** | **String**| &#x60;id&#x60; of the user who will receive the ephemeral message. The user should be in the channel specified by the &#x60;channel&#x60; argument. | |
| **asUser** | **Boolean**| Pass true to post the message as the authed user. Defaults to true if the chat:write:bot scope is not included. Otherwise, defaults to false. | [optional] |
| **attachments** | **String**| A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional] |
| **blocks** | **String**| A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional] |
| **iconEmoji** | **String**| Emoji to use as the icon for this message. Overrides &#x60;icon_url&#x60;. Must be used in conjunction with &#x60;as_user&#x60; set to &#x60;false&#x60;, otherwise ignored. See [authorship](https://slack.dev) below. | [optional] |
| **iconUrl** | **String**| URL to an image to use as the icon for this message. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](https://slack.dev) below. | [optional] |
| **linkNames** | **Boolean**| Find and link channel names and usernames. | [optional] |
| **parse** | **String**| Change how messages are treated. Defaults to &#x60;none&#x60;. See [below](https://slack.dev). | [optional] |
| **text** | **String**| How this field works and whether it is required depends on other fields you use in your API call. [See below](https://slack.dev) for more detail. | [optional] |
| **threadTs** | **String**| Provide another message&#39;s &#x60;ts&#x60; value to post this message in a thread. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent&#39;s value instead. Ephemeral messages in threads are only shown if there is already an active thread. | [optional] |
| **username** | **String**| Set your bot&#39;s user name. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](https://slack.dev) below. | [optional] |
| **chatPostEphemeralRequest** | [**ChatPostEphemeralRequest**](ChatPostEphemeralRequest.md)|  | [optional] |

### Return type

[**ChatPostEphemeralResponse**](ChatPostEphemeralResponse.md)

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

<a name="postMessage"></a>
# **postMessage**
> ChatPostMessageResponse postMessage(token, channel).asUser(asUser).attachments(attachments).blocks(blocks).iconEmoji(iconEmoji).iconUrl(iconUrl).linkNames(linkNames).mrkdwn(mrkdwn).parse(parse).replyBroadcast(replyBroadcast).text(text).threadTs(threadTs).unfurlLinks(unfurlLinks).unfurlMedia(unfurlMedia).username(username).chatPostMessageRequest(chatPostMessageRequest).execute();



Sends a message to a channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `chat:write`
    String channel = "channel_example"; // Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. See [below](https://slack.dev) for more details.
    String asUser = "asUser_example"; // Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [authorship](https://slack.dev) below.
    String attachments = "attachments_example"; // A JSON-based array of structured attachments, presented as a URL-encoded string.
    String blocks = "blocks_example"; // A JSON-based array of structured blocks, presented as a URL-encoded string.
    String iconEmoji = "iconEmoji_example"; // Emoji to use as the icon for this message. Overrides `icon_url`. Must be used in conjunction with `as_user` set to `false`, otherwise ignored. See [authorship](https://slack.dev) below.
    String iconUrl = "iconUrl_example"; // URL to an image to use as the icon for this message. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](https://slack.dev) below.
    Boolean linkNames = true; // Find and link channel names and usernames.
    Boolean mrkdwn = true; // Disable Slack markup parsing by setting to `false`. Enabled by default.
    String parse = "parse_example"; // Change how messages are treated. Defaults to `none`. See [below](https://slack.dev).
    Boolean replyBroadcast = true; // Used in conjunction with `thread_ts` and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to `false`.
    String text = "text_example"; // How this field works and whether it is required depends on other fields you use in your API call. [See below](https://slack.dev) for more detail.
    String threadTs = "threadTs_example"; // Provide another message's `ts` value to make this message a reply. Avoid using a reply's `ts` value; use its parent instead.
    Boolean unfurlLinks = true; // Pass true to enable unfurling of primarily text-based content.
    Boolean unfurlMedia = true; // Pass false to disable unfurling of media content.
    String username = "username_example"; // Set your bot's user name. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](https://slack.dev) below.
    try {
      ChatPostMessageResponse result = client
              .chat
              .postMessage(token, channel)
              .asUser(asUser)
              .attachments(attachments)
              .blocks(blocks)
              .iconEmoji(iconEmoji)
              .iconUrl(iconUrl)
              .linkNames(linkNames)
              .mrkdwn(mrkdwn)
              .parse(parse)
              .replyBroadcast(replyBroadcast)
              .text(text)
              .threadTs(threadTs)
              .unfurlLinks(unfurlLinks)
              .unfurlMedia(unfurlMedia)
              .username(username)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannel());
      System.out.println(result.getMessage());
      System.out.println(result.getOk());
      System.out.println(result.getTs());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#postMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChatPostMessageResponse> response = client
              .chat
              .postMessage(token, channel)
              .asUser(asUser)
              .attachments(attachments)
              .blocks(blocks)
              .iconEmoji(iconEmoji)
              .iconUrl(iconUrl)
              .linkNames(linkNames)
              .mrkdwn(mrkdwn)
              .parse(parse)
              .replyBroadcast(replyBroadcast)
              .text(text)
              .threadTs(threadTs)
              .unfurlLinks(unfurlLinks)
              .unfurlMedia(unfurlMedia)
              .username(username)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#postMessage");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;chat:write&#x60; | |
| **channel** | **String**| Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. See [below](https://slack.dev) for more details. | |
| **asUser** | **String**| Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [authorship](https://slack.dev) below. | [optional] |
| **attachments** | **String**| A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional] |
| **blocks** | **String**| A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional] |
| **iconEmoji** | **String**| Emoji to use as the icon for this message. Overrides &#x60;icon_url&#x60;. Must be used in conjunction with &#x60;as_user&#x60; set to &#x60;false&#x60;, otherwise ignored. See [authorship](https://slack.dev) below. | [optional] |
| **iconUrl** | **String**| URL to an image to use as the icon for this message. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](https://slack.dev) below. | [optional] |
| **linkNames** | **Boolean**| Find and link channel names and usernames. | [optional] |
| **mrkdwn** | **Boolean**| Disable Slack markup parsing by setting to &#x60;false&#x60;. Enabled by default. | [optional] |
| **parse** | **String**| Change how messages are treated. Defaults to &#x60;none&#x60;. See [below](https://slack.dev). | [optional] |
| **replyBroadcast** | **Boolean**| Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;. | [optional] |
| **text** | **String**| How this field works and whether it is required depends on other fields you use in your API call. [See below](https://slack.dev) for more detail. | [optional] |
| **threadTs** | **String**| Provide another message&#39;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | [optional] |
| **unfurlLinks** | **Boolean**| Pass true to enable unfurling of primarily text-based content. | [optional] |
| **unfurlMedia** | **Boolean**| Pass false to disable unfurling of media content. | [optional] |
| **username** | **String**| Set your bot&#39;s user name. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](https://slack.dev) below. | [optional] |
| **chatPostMessageRequest** | [**ChatPostMessageRequest**](ChatPostMessageRequest.md)|  | [optional] |

### Return type

[**ChatPostMessageResponse**](ChatPostMessageResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response if too many attachments are included |  -  |

<a name="scheduleMessage"></a>
# **scheduleMessage**
> ChatScheduleMessageResponse scheduleMessage().token(token).asUser(asUser).attachments(attachments).blocks(blocks).channel(channel).linkNames(linkNames).parse(parse).postAt(postAt).replyBroadcast(replyBroadcast).text(text).threadTs(threadTs).unfurlLinks(unfurlLinks).unfurlMedia(unfurlMedia).chatScheduleMessageRequest(chatScheduleMessageRequest).execute();



Schedules a message to be sent to a channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `chat:write`
    Boolean asUser = true; // Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [chat.postMessage](chat.postMessage#authorship).
    String attachments = "attachments_example"; // A JSON-based array of structured attachments, presented as a URL-encoded string.
    String blocks = "blocks_example"; // A JSON-based array of structured blocks, presented as a URL-encoded string.
    String channel = "channel_example"; // Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See [below](https://slack.dev) for more details.
    Boolean linkNames = true; // Find and link channel names and usernames.
    String parse = "parse_example"; // Change how messages are treated. Defaults to `none`. See [chat.postMessage](chat.postMessage#formatting).
    String postAt = "postAt_example"; // Unix EPOCH timestamp of time in future to send the message.
    Boolean replyBroadcast = true; // Used in conjunction with `thread_ts` and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to `false`.
    String text = "text_example"; // How this field works and whether it is required depends on other fields you use in your API call. [See below](https://slack.dev) for more detail.
    Double threadTs = 3.4D; // Provide another message's `ts` value to make this message a reply. Avoid using a reply's `ts` value; use its parent instead.
    Boolean unfurlLinks = true; // Pass true to enable unfurling of primarily text-based content.
    Boolean unfurlMedia = true; // Pass false to disable unfurling of media content.
    try {
      ChatScheduleMessageResponse result = client
              .chat
              .scheduleMessage()
              .token(token)
              .asUser(asUser)
              .attachments(attachments)
              .blocks(blocks)
              .channel(channel)
              .linkNames(linkNames)
              .parse(parse)
              .postAt(postAt)
              .replyBroadcast(replyBroadcast)
              .text(text)
              .threadTs(threadTs)
              .unfurlLinks(unfurlLinks)
              .unfurlMedia(unfurlMedia)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannel());
      System.out.println(result.getMessage());
      System.out.println(result.getOk());
      System.out.println(result.getPostAt());
      System.out.println(result.getScheduledMessageId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#scheduleMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChatScheduleMessageResponse> response = client
              .chat
              .scheduleMessage()
              .token(token)
              .asUser(asUser)
              .attachments(attachments)
              .blocks(blocks)
              .channel(channel)
              .linkNames(linkNames)
              .parse(parse)
              .postAt(postAt)
              .replyBroadcast(replyBroadcast)
              .text(text)
              .threadTs(threadTs)
              .unfurlLinks(unfurlLinks)
              .unfurlMedia(unfurlMedia)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#scheduleMessage");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;chat:write&#x60; | [optional] |
| **asUser** | **Boolean**| Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [chat.postMessage](chat.postMessage#authorship). | [optional] |
| **attachments** | **String**| A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional] |
| **blocks** | **String**| A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional] |
| **channel** | **String**| Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See [below](https://slack.dev) for more details. | [optional] |
| **linkNames** | **Boolean**| Find and link channel names and usernames. | [optional] |
| **parse** | **String**| Change how messages are treated. Defaults to &#x60;none&#x60;. See [chat.postMessage](chat.postMessage#formatting). | [optional] |
| **postAt** | **String**| Unix EPOCH timestamp of time in future to send the message. | [optional] |
| **replyBroadcast** | **Boolean**| Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;. | [optional] |
| **text** | **String**| How this field works and whether it is required depends on other fields you use in your API call. [See below](https://slack.dev) for more detail. | [optional] |
| **threadTs** | **Double**| Provide another message&#39;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | [optional] |
| **unfurlLinks** | **Boolean**| Pass true to enable unfurling of primarily text-based content. | [optional] |
| **unfurlMedia** | **Boolean**| Pass false to disable unfurling of media content. | [optional] |
| **chatScheduleMessageRequest** | [**ChatScheduleMessageRequest**](ChatScheduleMessageRequest.md)|  | [optional] |

### Return type

[**ChatScheduleMessageResponse**](ChatScheduleMessageResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response if the &#x60;post_at&#x60; is invalid (ex. in the past or too far into the future) |  -  |

<a name="unfurl"></a>
# **unfurl**
> ChatUnfurlResponse unfurl(token, channel, ts, chatUnfurlRequest).unfurls(unfurls).userAuthMessage(userAuthMessage).userAuthRequired(userAuthRequired).userAuthUrl(userAuthUrl).execute();



Provide custom unfurl behavior for user-posted URLs

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `links:write`
    String channel = "channel_example"; // Channel ID of the message
    String ts = "ts_example"; // Timestamp of the message to add unfurl behavior to.
    String unfurls = "unfurls_example"; // URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl blocks or message attachments.
    String userAuthMessage = "userAuthMessage_example"; // Provide a simply-formatted string to send as an ephemeral message to the user as invitation to authenticate further and enable full unfurling behavior
    Boolean userAuthRequired = true; // Set to `true` or `1` to indicate the user must install your Slack app to trigger unfurls for this domain
    String userAuthUrl = "userAuthUrl_example"; // Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling. Value should be properly URL-encoded.
    try {
      ChatUnfurlResponse result = client
              .chat
              .unfurl(token, channel, ts)
              .unfurls(unfurls)
              .userAuthMessage(userAuthMessage)
              .userAuthRequired(userAuthRequired)
              .userAuthUrl(userAuthUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#unfurl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChatUnfurlResponse> response = client
              .chat
              .unfurl(token, channel, ts)
              .unfurls(unfurls)
              .userAuthMessage(userAuthMessage)
              .userAuthRequired(userAuthRequired)
              .userAuthUrl(userAuthUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#unfurl");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;links:write&#x60; | |
| **channel** | **String**| Channel ID of the message | |
| **ts** | **String**| Timestamp of the message to add unfurl behavior to. | |
| **chatUnfurlRequest** | [**ChatUnfurlRequest**](ChatUnfurlRequest.md)|  | |
| **unfurls** | **String**| URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl blocks or message attachments. | [optional] |
| **userAuthMessage** | **String**| Provide a simply-formatted string to send as an ephemeral message to the user as invitation to authenticate further and enable full unfurling behavior | [optional] |
| **userAuthRequired** | **Boolean**| Set to &#x60;true&#x60; or &#x60;1&#x60; to indicate the user must install your Slack app to trigger unfurls for this domain | [optional] |
| **userAuthUrl** | **String**| Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling. Value should be properly URL-encoded. | [optional] |

### Return type

[**ChatUnfurlResponse**](ChatUnfurlResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical, minimal success response |  -  |
| **0** | Typical error response |  -  |

<a name="update"></a>
# **update**
> ChatUpdateResponse update(token, channel, ts).asUser(asUser).attachments(attachments).blocks(blocks).linkNames(linkNames).parse(parse).text(text).chatUpdateRequest(chatUpdateRequest).execute();



Updates a message.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `chat:write`
    String channel = "channel_example"; // Channel containing the message to be updated.
    String ts = "ts_example"; // Timestamp of the message to be updated.
    String asUser = "asUser_example"; // Pass true to update the message as the authed user. [Bot users](https://slack.dev) in this context are considered authed users.
    String attachments = "attachments_example"; // A JSON-based array of structured attachments, presented as a URL-encoded string. This field is required when not presenting `text`. If you don't include this field, the message's previous `attachments` will be retained. To remove previous `attachments`, include an empty array for this field.
    String blocks = "blocks_example"; // A JSON-based array of [structured blocks](https://slack.dev), presented as a URL-encoded string. If you don't include this field, the message's previous `blocks` will be retained. To remove previous `blocks`, include an empty array for this field.
    String linkNames = "linkNames_example"; // Find and link channel names and usernames. Defaults to `none`. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, `none`.
    String parse = "parse_example"; // Change how messages are treated. Defaults to `client`, unlike `chat.postMessage`. Accepts either `none` or `full`. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, `client`.
    String text = "text_example"; // New text for the message, using the [default formatting rules](https://slack.dev). It's not required when presenting `blocks` or `attachments`.
    try {
      ChatUpdateResponse result = client
              .chat
              .update(token, channel, ts)
              .asUser(asUser)
              .attachments(attachments)
              .blocks(blocks)
              .linkNames(linkNames)
              .parse(parse)
              .text(text)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannel());
      System.out.println(result.getMessage());
      System.out.println(result.getOk());
      System.out.println(result.getText());
      System.out.println(result.getTs());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#update");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChatUpdateResponse> response = client
              .chat
              .update(token, channel, ts)
              .asUser(asUser)
              .attachments(attachments)
              .blocks(blocks)
              .linkNames(linkNames)
              .parse(parse)
              .text(text)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#update");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;chat:write&#x60; | |
| **channel** | **String**| Channel containing the message to be updated. | |
| **ts** | **String**| Timestamp of the message to be updated. | |
| **asUser** | **String**| Pass true to update the message as the authed user. [Bot users](https://slack.dev) in this context are considered authed users. | [optional] |
| **attachments** | **String**| A JSON-based array of structured attachments, presented as a URL-encoded string. This field is required when not presenting &#x60;text&#x60;. If you don&#39;t include this field, the message&#39;s previous &#x60;attachments&#x60; will be retained. To remove previous &#x60;attachments&#x60;, include an empty array for this field. | [optional] |
| **blocks** | **String**| A JSON-based array of [structured blocks](https://slack.dev), presented as a URL-encoded string. If you don&#39;t include this field, the message&#39;s previous &#x60;blocks&#x60; will be retained. To remove previous &#x60;blocks&#x60;, include an empty array for this field. | [optional] |
| **linkNames** | **String**| Find and link channel names and usernames. Defaults to &#x60;none&#x60;. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, &#x60;none&#x60;. | [optional] |
| **parse** | **String**| Change how messages are treated. Defaults to &#x60;client&#x60;, unlike &#x60;chat.postMessage&#x60;. Accepts either &#x60;none&#x60; or &#x60;full&#x60;. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, &#x60;client&#x60;. | [optional] |
| **text** | **String**| New text for the message, using the [default formatting rules](https://slack.dev). It&#39;s not required when presenting &#x60;blocks&#x60; or &#x60;attachments&#x60;. | [optional] |
| **chatUpdateRequest** | [**ChatUpdateRequest**](ChatUpdateRequest.md)|  | [optional] |

### Return type

[**ChatUpdateResponse**](ChatUpdateResponse.md)

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

