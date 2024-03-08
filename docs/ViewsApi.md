# ViewsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**open**](ViewsApi.md#open) | **GET** /views.open |  |
| [**publish**](ViewsApi.md#publish) | **GET** /views.publish |  |
| [**push**](ViewsApi.md#push) | **GET** /views.push |  |
| [**update**](ViewsApi.md#update) | **GET** /views.update |  |


<a name="open"></a>
# **open**
> ViewsOpenResponse open(token, triggerId, view).execute();



Open a view for a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
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
    String triggerId = "triggerId_example"; // Exchange a trigger to post to the user.
    String view = "view_example"; // A [view payload](https://slack.dev). This must be a JSON-encoded string.
    try {
      ViewsOpenResponse result = client
              .views
              .open(token, triggerId, view)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#open");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ViewsOpenResponse> response = client
              .views
              .open(token, triggerId, view)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#open");
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
| **triggerId** | **String**| Exchange a trigger to post to the user. | |
| **view** | **String**| A [view payload](https://slack.dev). This must be a JSON-encoded string. | |

### Return type

[**ViewsOpenResponse**](ViewsOpenResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response includes the opened view payload. |  -  |
| **0** | Typical error response, before getting to any possible validation errors. |  -  |

<a name="publish"></a>
# **publish**
> ViewsPublishResponse publish(token, userId, view).hash(hash).execute();



Publish a static view for a User.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
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
    String userId = "userId_example"; // `id` of the user you want publish a view to.
    String view = "view_example"; // A [view payload](https://slack.dev). This must be a JSON-encoded string.
    String hash = "hash_example"; // A string that represents view state to protect against possible race conditions.
    try {
      ViewsPublishResponse result = client
              .views
              .publish(token, userId, view)
              .hash(hash)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#publish");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ViewsPublishResponse> response = client
              .views
              .publish(token, userId, view)
              .hash(hash)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#publish");
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
| **userId** | **String**| &#x60;id&#x60; of the user you want publish a view to. | |
| **view** | **String**| A [view payload](https://slack.dev). This must be a JSON-encoded string. | |
| **hash** | **String**| A string that represents view state to protect against possible race conditions. | [optional] |

### Return type

[**ViewsPublishResponse**](ViewsPublishResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response includes the published view payload. |  -  |
| **0** | Typical error response, before getting to any possible validation errors. |  -  |

<a name="push"></a>
# **push**
> ViewsPushResponse push(token, triggerId, view).execute();



Push a view onto the stack of a root view.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
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
    String triggerId = "triggerId_example"; // Exchange a trigger to post to the user.
    String view = "view_example"; // A [view payload](https://slack.dev). This must be a JSON-encoded string.
    try {
      ViewsPushResponse result = client
              .views
              .push(token, triggerId, view)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#push");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ViewsPushResponse> response = client
              .views
              .push(token, triggerId, view)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#push");
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
| **triggerId** | **String**| Exchange a trigger to post to the user. | |
| **view** | **String**| A [view payload](https://slack.dev). This must be a JSON-encoded string. | |

### Return type

[**ViewsPushResponse**](ViewsPushResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response includes the pushed view payload. |  -  |
| **0** | Typical error response. |  -  |

<a name="update"></a>
# **update**
> ViewsUpdateResponse update(token).viewId(viewId).externalId(externalId).view(view).hash(hash).execute();



Update an existing view.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewsApi;
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
    String viewId = "viewId_example"; // A unique identifier of the view to be updated. Either `view_id` or `external_id` is required.
    String externalId = "externalId_example"; // A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either `view_id` or `external_id` is required.
    String view = "view_example"; // A [view object](https://slack.dev). This must be a JSON-encoded string.
    String hash = "hash_example"; // A string that represents view state to protect against possible race conditions.
    try {
      ViewsUpdateResponse result = client
              .views
              .update(token)
              .viewId(viewId)
              .externalId(externalId)
              .view(view)
              .hash(hash)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#update");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ViewsUpdateResponse> response = client
              .views
              .update(token)
              .viewId(viewId)
              .externalId(externalId)
              .view(view)
              .hash(hash)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewsApi#update");
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
| **viewId** | **String**| A unique identifier of the view to be updated. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. | [optional] |
| **externalId** | **String**| A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. | [optional] |
| **view** | **String**| A [view object](https://slack.dev). This must be a JSON-encoded string. | [optional] |
| **hash** | **String**| A string that represents view state to protect against possible race conditions. | [optional] |

### Return type

[**ViewsUpdateResponse**](ViewsUpdateResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response includes the updated view payload. |  -  |
| **0** | Typical error response. |  -  |

