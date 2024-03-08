# AdminEmojiApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEmoji**](AdminEmojiApi.md#addEmoji) | **POST** /admin.emoji.add |  |
| [**aliasAdd**](AdminEmojiApi.md#aliasAdd) | **POST** /admin.emoji.addAlias |  |
| [**listEnterpriseEmoji**](AdminEmojiApi.md#listEnterpriseEmoji) | **GET** /admin.emoji.list |  |
| [**removeEnterpriseEmoji**](AdminEmojiApi.md#removeEnterpriseEmoji) | **POST** /admin.emoji.remove |  |
| [**renameEmoji**](AdminEmojiApi.md#renameEmoji) | **POST** /admin.emoji.rename |  |


<a name="addEmoji"></a>
# **addEmoji**
> AdminemojiAddEmojiResponse addEmoji(name, token, url, adminemojiAddEmojiRequest).execute();



Add an emoji.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminEmojiApi;
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
    String name = "name_example"; // The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    String url = "url_example"; // The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best.
    try {
      AdminemojiAddEmojiResponse result = client
              .adminEmoji
              .addEmoji(name, token, url)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminEmojiApi#addEmoji");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminemojiAddEmojiResponse> response = client
              .adminEmoji
              .addEmoji(name, token, url)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminEmojiApi#addEmoji");
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
| **name** | **String**| The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **url** | **String**| The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best. | |
| **adminemojiAddEmojiRequest** | [**AdminemojiAddEmojiRequest**](AdminemojiAddEmojiRequest.md)|  | |

### Return type

[**AdminemojiAddEmojiResponse**](AdminemojiAddEmojiResponse.md)

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

<a name="aliasAdd"></a>
# **aliasAdd**
> AdminemojiAliasAddResponse aliasAdd(aliasFor, name, token, adminemojiAliasAddRequest).execute();



Add an emoji alias.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminEmojiApi;
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
    String aliasFor = "aliasFor_example"; // The alias of the emoji.
    String name = "name_example"; // The name of the emoji to be aliased. Colons (`:myemoji:`) around the value are not required, although they may be included.
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    try {
      AdminemojiAliasAddResponse result = client
              .adminEmoji
              .aliasAdd(aliasFor, name, token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminEmojiApi#aliasAdd");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminemojiAliasAddResponse> response = client
              .adminEmoji
              .aliasAdd(aliasFor, name, token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminEmojiApi#aliasAdd");
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
| **aliasFor** | **String**| The alias of the emoji. | |
| **name** | **String**| The name of the emoji to be aliased. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **adminemojiAliasAddRequest** | [**AdminemojiAliasAddRequest**](AdminemojiAliasAddRequest.md)|  | |

### Return type

[**AdminemojiAliasAddResponse**](AdminemojiAliasAddResponse.md)

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

<a name="listEnterpriseEmoji"></a>
# **listEnterpriseEmoji**
> AdminemojiListEnterpriseEmojiResponse listEnterpriseEmoji(token).cursor(cursor).limit(limit).execute();



List emoji for an Enterprise Grid organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminEmojiApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:read`
    String cursor = "cursor_example"; // Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
    Integer limit = 56; // The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    try {
      AdminemojiListEnterpriseEmojiResponse result = client
              .adminEmoji
              .listEnterpriseEmoji(token)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminEmojiApi#listEnterpriseEmoji");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminemojiListEnterpriseEmojiResponse> response = client
              .adminEmoji
              .listEnterpriseEmoji(token)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminEmojiApi#listEnterpriseEmoji");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |

### Return type

[**AdminemojiListEnterpriseEmojiResponse**](AdminemojiListEnterpriseEmojiResponse.md)

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

<a name="removeEnterpriseEmoji"></a>
# **removeEnterpriseEmoji**
> AdminemojiRemoveEnterpriseEmojiResponse removeEnterpriseEmoji(name, token, adminemojiRemoveEnterpriseEmojiRequest).execute();



Remove an emoji across an Enterprise Grid organization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminEmojiApi;
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
    String name = "name_example"; // The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    try {
      AdminemojiRemoveEnterpriseEmojiResponse result = client
              .adminEmoji
              .removeEnterpriseEmoji(name, token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminEmojiApi#removeEnterpriseEmoji");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminemojiRemoveEnterpriseEmojiResponse> response = client
              .adminEmoji
              .removeEnterpriseEmoji(name, token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminEmojiApi#removeEnterpriseEmoji");
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
| **name** | **String**| The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **adminemojiRemoveEnterpriseEmojiRequest** | [**AdminemojiRemoveEnterpriseEmojiRequest**](AdminemojiRemoveEnterpriseEmojiRequest.md)|  | |

### Return type

[**AdminemojiRemoveEnterpriseEmojiResponse**](AdminemojiRemoveEnterpriseEmojiResponse.md)

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

<a name="renameEmoji"></a>
# **renameEmoji**
> AdminemojiRenameEmojiResponse renameEmoji(name, newName, token, adminemojiRenameEmojiRequest).execute();



Rename an emoji.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminEmojiApi;
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
    String name = "name_example"; // The name of the emoji to be renamed. Colons (`:myemoji:`) around the value are not required, although they may be included.
    String newName = "newName_example"; // The new name of the emoji.
    String token = "token_example"; // Authentication token. Requires scope: `admin.teams:write`
    try {
      AdminemojiRenameEmojiResponse result = client
              .adminEmoji
              .renameEmoji(name, newName, token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminEmojiApi#renameEmoji");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminemojiRenameEmojiResponse> response = client
              .adminEmoji
              .renameEmoji(name, newName, token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminEmojiApi#renameEmoji");
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
| **name** | **String**| The name of the emoji to be renamed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
| **newName** | **String**| The new name of the emoji. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **adminemojiRenameEmojiRequest** | [**AdminemojiRenameEmojiRequest**](AdminemojiRenameEmojiRequest.md)|  | |

### Return type

[**AdminemojiRenameEmojiResponse**](AdminemojiRenameEmojiResponse.md)

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

