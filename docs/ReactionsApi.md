# ReactionsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](ReactionsApi.md#add) | **POST** /reactions.add |  |
| [**get**](ReactionsApi.md#get) | **GET** /reactions.get |  |
| [**list**](ReactionsApi.md#list) | **GET** /reactions.list |  |
| [**remove**](ReactionsApi.md#remove) | **POST** /reactions.remove |  |


<a name="add"></a>
# **add**
> ReactionsAddResponse add(token, channel, name, timestamp, reactionsAddRequest).execute();



Adds a reaction to an item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReactionsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `reactions:write`
    String channel = "channel_example"; // Channel where the message to add reaction to was posted.
    String name = "name_example"; // Reaction (emoji) name.
    String timestamp = "timestamp_example"; // Timestamp of the message to add reaction to.
    try {
      ReactionsAddResponse result = client
              .reactions
              .add(token, channel, name, timestamp)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReactionsApi#add");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReactionsAddResponse> response = client
              .reactions
              .add(token, channel, name, timestamp)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReactionsApi#add");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;reactions:write&#x60; | |
| **channel** | **String**| Channel where the message to add reaction to was posted. | |
| **name** | **String**| Reaction (emoji) name. | |
| **timestamp** | **String**| Timestamp of the message to add reaction to. | |
| **reactionsAddRequest** | [**ReactionsAddRequest**](ReactionsAddRequest.md)|  | |

### Return type

[**ReactionsAddResponse**](ReactionsAddResponse.md)

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

<a name="get"></a>
# **get**
> List&lt;Object&gt; get(token).channel(channel)._file(_file).fileComment(fileComment).full(full).timestamp(timestamp).execute();



Gets reactions for an item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReactionsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `reactions:read`
    String channel = "channel_example"; // Channel where the message to get reactions for was posted.
    String _file = "_file_example"; // File to get reactions for.
    String fileComment = "fileComment_example"; // File comment to get reactions for.
    Boolean full = true; // If true always return the complete reaction list.
    String timestamp = "timestamp_example"; // Timestamp of the message to get reactions for.
    try {
      List<Object> result = client
              .reactions
              .get(token)
              .channel(channel)
              ._file(_file)
              .fileComment(fileComment)
              .full(full)
              .timestamp(timestamp)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReactionsApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Object>> response = client
              .reactions
              .get(token)
              .channel(channel)
              ._file(_file)
              .fileComment(fileComment)
              .full(full)
              .timestamp(timestamp)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReactionsApi#get");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;reactions:read&#x60; | |
| **channel** | **String**| Channel where the message to get reactions for was posted. | [optional] |
| **_file** | **String**| File to get reactions for. | [optional] |
| **fileComment** | **String**| File comment to get reactions for. | [optional] |
| **full** | **Boolean**| If true always return the complete reaction list. | [optional] |
| **timestamp** | **String**| Timestamp of the message to get reactions for. | [optional] |

### Return type

**List&lt;Object&gt;**

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

<a name="list"></a>
# **list**
> ReactionsListResponse list(token).user(user).full(full).count(count).page(page).cursor(cursor).limit(limit).execute();



Lists reactions made by a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReactionsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `reactions:read`
    String user = "user_example"; // Show reactions made by this user. Defaults to the authed user.
    Boolean full = true; // If true always return the complete reaction list.
    Integer count = 56;
    Integer page = 56;
    String cursor = "cursor_example"; // Parameter for pagination. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection. See [pagination](https://slack.dev) for more details.
    Integer limit = 56; // The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached.
    try {
      ReactionsListResponse result = client
              .reactions
              .list(token)
              .user(user)
              .full(full)
              .count(count)
              .page(page)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getOk());
      System.out.println(result.getPaging());
      System.out.println(result.getResponseMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReactionsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReactionsListResponse> response = client
              .reactions
              .list(token)
              .user(user)
              .full(full)
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
      System.err.println("Exception when calling ReactionsApi#list");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;reactions:read&#x60; | |
| **user** | **String**| Show reactions made by this user. Defaults to the authed user. | [optional] |
| **full** | **Boolean**| If true always return the complete reaction list. | [optional] |
| **count** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **cursor** | **String**| Parameter for pagination. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection. See [pagination](https://slack.dev) for more details. | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | [optional] |

### Return type

[**ReactionsListResponse**](ReactionsListResponse.md)

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
> ReactionsRemoveResponse remove(token, name, reactionsRemoveRequest).channel(channel)._file(_file).fileComment(fileComment).timestamp(timestamp).execute();



Removes a reaction from an item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReactionsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `reactions:write`
    String name = "name_example"; // Reaction (emoji) name.
    String channel = "channel_example"; // Channel where the message to remove reaction from was posted.
    String _file = "_file_example"; // File to remove reaction from.
    String fileComment = "fileComment_example"; // File comment to remove reaction from.
    String timestamp = "timestamp_example"; // Timestamp of the message to remove reaction from.
    try {
      ReactionsRemoveResponse result = client
              .reactions
              .remove(token, name)
              .channel(channel)
              ._file(_file)
              .fileComment(fileComment)
              .timestamp(timestamp)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReactionsApi#remove");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReactionsRemoveResponse> response = client
              .reactions
              .remove(token, name)
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
      System.err.println("Exception when calling ReactionsApi#remove");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;reactions:write&#x60; | |
| **name** | **String**| Reaction (emoji) name. | |
| **reactionsRemoveRequest** | [**ReactionsRemoveRequest**](ReactionsRemoveRequest.md)|  | |
| **channel** | **String**| Channel where the message to remove reaction from was posted. | [optional] |
| **_file** | **String**| File to remove reaction from. | [optional] |
| **fileComment** | **String**| File comment to remove reaction from. | [optional] |
| **timestamp** | **String**| Timestamp of the message to remove reaction from. | [optional] |

### Return type

[**ReactionsRemoveResponse**](ReactionsRemoveResponse.md)

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

