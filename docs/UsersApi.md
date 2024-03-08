# UsersApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**conversations**](UsersApi.md#conversations) | **GET** /users.conversations |  |
| [**deletePhoto**](UsersApi.md#deletePhoto) | **POST** /users.deletePhoto |  |
| [**getPresence**](UsersApi.md#getPresence) | **GET** /users.getPresence |  |
| [**getProfileInfo**](UsersApi.md#getProfileInfo) | **GET** /users.profile.get |  |
| [**identity**](UsersApi.md#identity) | **GET** /users.identity |  |
| [**info**](UsersApi.md#info) | **GET** /users.info |  |
| [**list**](UsersApi.md#list) | **GET** /users.list |  |
| [**lookupByEmail**](UsersApi.md#lookupByEmail) | **GET** /users.lookupByEmail |  |
| [**setActive**](UsersApi.md#setActive) | **POST** /users.setActive |  |
| [**setPhoto**](UsersApi.md#setPhoto) | **POST** /users.setPhoto |  |
| [**setPresence**](UsersApi.md#setPresence) | **POST** /users.setPresence |  |
| [**setProfileInfo**](UsersApi.md#setProfileInfo) | **POST** /users.profile.set |  |


<a name="conversations"></a>
# **conversations**
> UsersConversationsResponse conversations().token(token).user(user).types(types).excludeArchived(excludeArchived).limit(limit).cursor(cursor).execute();



List conversations the calling user may access.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String user = "user_example"; // Browse conversations by a specific user ID's membership. Non-public channels are restricted to those where the calling user shares membership.
    String types = "types_example"; // Mix and match channel types by providing a comma-separated list of any combination of `public_channel`, `private_channel`, `mpim`, `im`
    Boolean excludeArchived = true; // Set to `true` to exclude archived channels from the list
    Integer limit = 56; // The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached. Must be an integer no larger than 1000.
    String cursor = "cursor_example"; // Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](https://slack.dev) for more detail.
    try {
      UsersConversationsResponse result = client
              .users
              .conversations()
              .token(token)
              .user(user)
              .types(types)
              .excludeArchived(excludeArchived)
              .limit(limit)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannels());
      System.out.println(result.getOk());
      System.out.println(result.getResponseMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#conversations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersConversationsResponse> response = client
              .users
              .conversations()
              .token(token)
              .user(user)
              .types(types)
              .excludeArchived(excludeArchived)
              .limit(limit)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#conversations");
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
| **user** | **String**| Browse conversations by a specific user ID&#39;s membership. Non-public channels are restricted to those where the calling user shares membership. | [optional] |
| **types** | **String**| Mix and match channel types by providing a comma-separated list of any combination of &#x60;public_channel&#x60;, &#x60;private_channel&#x60;, &#x60;mpim&#x60;, &#x60;im&#x60; | [optional] |
| **excludeArchived** | **Boolean**| Set to &#x60;true&#x60; to exclude archived channels from the list | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. Must be an integer no larger than 1000. | [optional] |
| **cursor** | **String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](https://slack.dev) for more detail. | [optional] |

### Return type

[**UsersConversationsResponse**](UsersConversationsResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response with only public channels. Note how &#x60;num_members&#x60; and &#x60;is_member&#x60; are not returned like typical &#x60;conversations&#x60; objects. |  -  |
| **0** | Typical error response |  -  |

<a name="deletePhoto"></a>
# **deletePhoto**
> UsersDeletePhotoResponse deletePhoto(token, usersDeletePhotoRequest).execute();



Delete the user profile photo

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `users.profile:write`
    try {
      UsersDeletePhotoResponse result = client
              .users
              .deletePhoto(token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deletePhoto");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersDeletePhotoResponse> response = client
              .users
              .deletePhoto(token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deletePhoto");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;users.profile:write&#x60; | |
| **usersDeletePhotoRequest** | [**UsersDeletePhotoRequest**](UsersDeletePhotoRequest.md)|  | |

### Return type

[**UsersDeletePhotoResponse**](UsersDeletePhotoResponse.md)

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

<a name="getPresence"></a>
# **getPresence**
> UsersGetPresenceResponse getPresence(token).user(user).execute();



Gets user presence information.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `users:read`
    String user = "user_example"; // User to get presence info on. Defaults to the authed user.
    try {
      UsersGetPresenceResponse result = client
              .users
              .getPresence(token)
              .user(user)
              .execute();
      System.out.println(result);
      System.out.println(result.getAutoAway());
      System.out.println(result.getConnectionCount());
      System.out.println(result.getLastActivity());
      System.out.println(result.getManualAway());
      System.out.println(result.getOk());
      System.out.println(result.getOnline());
      System.out.println(result.getPresence());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getPresence");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersGetPresenceResponse> response = client
              .users
              .getPresence(token)
              .user(user)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getPresence");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;users:read&#x60; | |
| **user** | **String**| User to get presence info on. Defaults to the authed user. | [optional] |

### Return type

[**UsersGetPresenceResponse**](UsersGetPresenceResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When requesting information for a different user, this method just returns the current presence (either &#x60;active&#x60; or &#x60;away&#x60;). |  -  |
| **0** | Typical error response |  -  |

<a name="getProfileInfo"></a>
# **getProfileInfo**
> UsersprofileGetProfileInfoResponse getProfileInfo(token).includeLabels(includeLabels).user(user).execute();



Retrieves a user&#39;s profile information.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `users.profile:read`
    Boolean includeLabels = true; // Include labels for each ID in custom profile fields
    String user = "user_example"; // User to retrieve profile info for
    try {
      UsersprofileGetProfileInfoResponse result = client
              .users
              .getProfileInfo(token)
              .includeLabels(includeLabels)
              .user(user)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getProfile());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getProfileInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersprofileGetProfileInfoResponse> response = client
              .users
              .getProfileInfo(token)
              .includeLabels(includeLabels)
              .user(user)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getProfileInfo");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;users.profile:read&#x60; | |
| **includeLabels** | **Boolean**| Include labels for each ID in custom profile fields | [optional] |
| **user** | **String**| User to retrieve profile info for | [optional] |

### Return type

[**UsersprofileGetProfileInfoResponse**](UsersprofileGetProfileInfoResponse.md)

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

<a name="identity"></a>
# **identity**
> List&lt;UsersIdentityResponseInner&gt; identity().token(token).execute();



Get a user&#39;s identity.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `identity.basic`
    try {
      List<UsersIdentityResponseInner> result = client
              .users
              .identity()
              .token(token)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#identity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UsersIdentityResponseInner>> response = client
              .users
              .identity()
              .token(token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#identity");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;identity.basic&#x60; | [optional] |

### Return type

[**List&lt;UsersIdentityResponseInner&gt;**](UsersIdentityResponseInner.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | You will receive at a minimum the following information: |  -  |
| **0** | Typical error response |  -  |

<a name="info"></a>
# **info**
> UsersInfoResponse info(token).includeLocale(includeLocale).user(user).execute();



Gets information about a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `users:read`
    Boolean includeLocale = true; // Set this to `true` to receive the locale for this user. Defaults to `false`
    String user = "user_example"; // User to get info on
    try {
      UsersInfoResponse result = client
              .users
              .info(token)
              .includeLocale(includeLocale)
              .user(user)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#info");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersInfoResponse> response = client
              .users
              .info(token)
              .includeLocale(includeLocale)
              .user(user)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#info");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;users:read&#x60; | |
| **includeLocale** | **Boolean**| Set this to &#x60;true&#x60; to receive the locale for this user. Defaults to &#x60;false&#x60; | [optional] |
| **user** | **String**| User to get info on | [optional] |

### Return type

[**UsersInfoResponse**](UsersInfoResponse.md)

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
> UsersListResponse list().token(token).limit(limit).cursor(cursor).includeLocale(includeLocale).execute();



Lists all users in a Slack team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `users:read`
    Integer limit = 56; // The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached. Providing no `limit` value will result in Slack attempting to deliver you the entire result set. If the collection is too large you may experience `limit_required` or HTTP 500 errors.
    String cursor = "cursor_example"; // Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](https://slack.dev) for more detail.
    Boolean includeLocale = true; // Set this to `true` to receive the locale for users. Defaults to `false`
    try {
      UsersListResponse result = client
              .users
              .list()
              .token(token)
              .limit(limit)
              .cursor(cursor)
              .includeLocale(includeLocale)
              .execute();
      System.out.println(result);
      System.out.println(result.getCacheTs());
      System.out.println(result.getMembers());
      System.out.println(result.getOk());
      System.out.println(result.getResponseMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersListResponse> response = client
              .users
              .list()
              .token(token)
              .limit(limit)
              .cursor(cursor)
              .includeLocale(includeLocale)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#list");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;users:read&#x60; | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. Providing no &#x60;limit&#x60; value will result in Slack attempting to deliver you the entire result set. If the collection is too large you may experience &#x60;limit_required&#x60; or HTTP 500 errors. | [optional] |
| **cursor** | **String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](https://slack.dev) for more detail. | [optional] |
| **includeLocale** | **Boolean**| Set this to &#x60;true&#x60; to receive the locale for users. Defaults to &#x60;false&#x60; | [optional] |

### Return type

[**UsersListResponse**](UsersListResponse.md)

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

<a name="lookupByEmail"></a>
# **lookupByEmail**
> UsersLookupByEmailResponse lookupByEmail(token, email).execute();



Find a user with an email address.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `users:read.email`
    String email = "email_example"; // An email address belonging to a user in the workspace
    try {
      UsersLookupByEmailResponse result = client
              .users
              .lookupByEmail(token, email)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#lookupByEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersLookupByEmailResponse> response = client
              .users
              .lookupByEmail(token, email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#lookupByEmail");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;users:read.email&#x60; | |
| **email** | **String**| An email address belonging to a user in the workspace | |

### Return type

[**UsersLookupByEmailResponse**](UsersLookupByEmailResponse.md)

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

<a name="setActive"></a>
# **setActive**
> UsersSetActiveResponse setActive(token).execute();



Marked a user as active. Deprecated and non-functional.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `users:write`
    try {
      UsersSetActiveResponse result = client
              .users
              .setActive(token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#setActive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersSetActiveResponse> response = client
              .users
              .setActive(token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#setActive");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;users:write&#x60; | |

### Return type

[**UsersSetActiveResponse**](UsersSetActiveResponse.md)

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

<a name="setPhoto"></a>
# **setPhoto**
> UsersSetPhotoResponse setPhoto(token, usersSetPhotoRequest).cropW(cropW).cropX(cropX).cropY(cropY).image(image).execute();



Set the user profile photo

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `users.profile:write`
    String cropW = "cropW_example"; // Width/height of crop box (always square)
    String cropX = "cropX_example"; // X coordinate of top-left corner of crop box
    String cropY = "cropY_example"; // Y coordinate of top-left corner of crop box
    String image = "image_example"; // File contents via `multipart/form-data`.
    try {
      UsersSetPhotoResponse result = client
              .users
              .setPhoto(token)
              .cropW(cropW)
              .cropX(cropX)
              .cropY(cropY)
              .image(image)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getProfile());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#setPhoto");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersSetPhotoResponse> response = client
              .users
              .setPhoto(token)
              .cropW(cropW)
              .cropX(cropX)
              .cropY(cropY)
              .image(image)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#setPhoto");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;users.profile:write&#x60; | |
| **usersSetPhotoRequest** | [**UsersSetPhotoRequest**](UsersSetPhotoRequest.md)|  | |
| **cropW** | **String**| Width/height of crop box (always square) | [optional] |
| **cropX** | **String**| X coordinate of top-left corner of crop box | [optional] |
| **cropY** | **String**| Y coordinate of top-left corner of crop box | [optional] |
| **image** | **String**| File contents via &#x60;multipart/form-data&#x60;. | [optional] |

### Return type

[**UsersSetPhotoResponse**](UsersSetPhotoResponse.md)

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

<a name="setPresence"></a>
# **setPresence**
> UsersSetPresenceResponse setPresence(token, presence, usersSetPresenceRequest).execute();



Manually sets user presence.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `users:write`
    String presence = "presence_example"; // Either `auto` or `away`
    try {
      UsersSetPresenceResponse result = client
              .users
              .setPresence(token, presence)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#setPresence");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersSetPresenceResponse> response = client
              .users
              .setPresence(token, presence)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#setPresence");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;users:write&#x60; | |
| **presence** | **String**| Either &#x60;auto&#x60; or &#x60;away&#x60; | |
| **usersSetPresenceRequest** | [**UsersSetPresenceRequest**](UsersSetPresenceRequest.md)|  | |

### Return type

[**UsersSetPresenceResponse**](UsersSetPresenceResponse.md)

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

<a name="setProfileInfo"></a>
# **setProfileInfo**
> UsersprofileSetProfileInfoResponse setProfileInfo(token).name(name).profile(profile).user(user).value(value).usersprofileSetProfileInfoRequest(usersprofileSetProfileInfoRequest).execute();



Set the profile information for a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `users.profile:write`
    String name = "name_example"; // Name of a single key to set. Usable only if `profile` is not passed.
    String profile = "profile_example"; // Collection of key:value pairs presented as a URL-encoded JSON hash. At most 50 fields may be set. Each field name is limited to 255 characters.
    String user = "user_example"; // ID of user to change. This argument may only be specified by team admins on paid teams.
    String value = "value_example"; // Value to set a single key to. Usable only if `profile` is not passed.
    try {
      UsersprofileSetProfileInfoResponse result = client
              .users
              .setProfileInfo(token)
              .name(name)
              .profile(profile)
              .user(user)
              .value(value)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmailPending());
      System.out.println(result.getOk());
      System.out.println(result.getProfile());
      System.out.println(result.getUsername());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#setProfileInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersprofileSetProfileInfoResponse> response = client
              .users
              .setProfileInfo(token)
              .name(name)
              .profile(profile)
              .user(user)
              .value(value)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#setProfileInfo");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;users.profile:write&#x60; | |
| **name** | **String**| Name of a single key to set. Usable only if &#x60;profile&#x60; is not passed. | [optional] |
| **profile** | **String**| Collection of key:value pairs presented as a URL-encoded JSON hash. At most 50 fields may be set. Each field name is limited to 255 characters. | [optional] |
| **user** | **String**| ID of user to change. This argument may only be specified by team admins on paid teams. | [optional] |
| **value** | **String**| Value to set a single key to. Usable only if &#x60;profile&#x60; is not passed. | [optional] |
| **usersprofileSetProfileInfoRequest** | [**UsersprofileSetProfileInfoRequest**](UsersprofileSetProfileInfoRequest.md)|  | [optional] |

### Return type

[**UsersprofileSetProfileInfoResponse**](UsersprofileSetProfileInfoResponse.md)

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

