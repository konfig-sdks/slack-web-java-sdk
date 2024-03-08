# OauthApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**access**](OauthApi.md#access) | **GET** /oauth.access |  |
| [**exchangeToken**](OauthApi.md#exchangeToken) | **GET** /oauth.v2.access |  |
| [**token**](OauthApi.md#token) | **GET** /oauth.token |  |


<a name="access"></a>
# **access**
> OauthAccessResponse access().clientId(clientId).clientSecret(clientSecret).code(code).redirectUri(redirectUri).singleChannel(singleChannel).execute();



Exchanges a temporary OAuth verifier code for an access token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
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
    String clientId = "clientId_example"; // Issued when you created your application.
    String clientSecret = "clientSecret_example"; // Issued when you created your application.
    String code = "code_example"; // The `code` param returned via the OAuth callback.
    String redirectUri = "redirectUri_example"; // This must match the originally submitted URI (if one was sent).
    Boolean singleChannel = true; // Request the user to add your app only to a single channel. Only valid with a [legacy workspace app](https://api.slack.com/legacy-workspace-apps).
    try {
      OauthAccessResponse result = client
              .oauth
              .access()
              .clientId(clientId)
              .clientSecret(clientSecret)
              .code(code)
              .redirectUri(redirectUri)
              .singleChannel(singleChannel)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#access");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OauthAccessResponse> response = client
              .oauth
              .access()
              .clientId(clientId)
              .clientSecret(clientSecret)
              .code(code)
              .redirectUri(redirectUri)
              .singleChannel(singleChannel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#access");
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
| **clientId** | **String**| Issued when you created your application. | [optional] |
| **clientSecret** | **String**| Issued when you created your application. | [optional] |
| **code** | **String**| The &#x60;code&#x60; param returned via the OAuth callback. | [optional] |
| **redirectUri** | **String**| This must match the originally submitted URI (if one was sent). | [optional] |
| **singleChannel** | **Boolean**| Request the user to add your app only to a single channel. Only valid with a [legacy workspace app](https://api.slack.com/legacy-workspace-apps). | [optional] |

### Return type

[**OauthAccessResponse**](OauthAccessResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful user token negotiation for a single scope |  -  |
| **0** | Typical error response |  -  |

<a name="exchangeToken"></a>
# **exchangeToken**
> Oauthv2ExchangeTokenResponse exchangeToken(code).clientId(clientId).clientSecret(clientSecret).redirectUri(redirectUri).execute();



Exchanges a temporary OAuth verifier code for an access token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
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
    String code = "code_example"; // The `code` param returned via the OAuth callback.
    String clientId = "clientId_example"; // Issued when you created your application.
    String clientSecret = "clientSecret_example"; // Issued when you created your application.
    String redirectUri = "redirectUri_example"; // This must match the originally submitted URI (if one was sent).
    try {
      Oauthv2ExchangeTokenResponse result = client
              .oauth
              .exchangeToken(code)
              .clientId(clientId)
              .clientSecret(clientSecret)
              .redirectUri(redirectUri)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#exchangeToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Oauthv2ExchangeTokenResponse> response = client
              .oauth
              .exchangeToken(code)
              .clientId(clientId)
              .clientSecret(clientSecret)
              .redirectUri(redirectUri)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#exchangeToken");
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
| **code** | **String**| The &#x60;code&#x60; param returned via the OAuth callback. | |
| **clientId** | **String**| Issued when you created your application. | [optional] |
| **clientSecret** | **String**| Issued when you created your application. | [optional] |
| **redirectUri** | **String**| This must match the originally submitted URI (if one was sent). | [optional] |

### Return type

[**Oauthv2ExchangeTokenResponse**](Oauthv2ExchangeTokenResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful token request with scopes for both a bot user and a user token |  -  |
| **0** | Typical error response |  -  |

<a name="token"></a>
# **token**
> OauthTokenResponse token().clientId(clientId).clientSecret(clientSecret).code(code).redirectUri(redirectUri).singleChannel(singleChannel).execute();



Exchanges a temporary OAuth verifier code for a workspace token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
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
    String clientId = "clientId_example"; // Issued when you created your application.
    String clientSecret = "clientSecret_example"; // Issued when you created your application.
    String code = "code_example"; // The `code` param returned via the OAuth callback.
    String redirectUri = "redirectUri_example"; // This must match the originally submitted URI (if one was sent).
    Boolean singleChannel = true; // Request the user to add your app only to a single channel.
    try {
      OauthTokenResponse result = client
              .oauth
              .token()
              .clientId(clientId)
              .clientSecret(clientSecret)
              .code(code)
              .redirectUri(redirectUri)
              .singleChannel(singleChannel)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#token");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OauthTokenResponse> response = client
              .oauth
              .token()
              .clientId(clientId)
              .clientSecret(clientSecret)
              .code(code)
              .redirectUri(redirectUri)
              .singleChannel(singleChannel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#token");
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
| **clientId** | **String**| Issued when you created your application. | [optional] |
| **clientSecret** | **String**| Issued when you created your application. | [optional] |
| **code** | **String**| The &#x60;code&#x60; param returned via the OAuth callback. | [optional] |
| **redirectUri** | **String**| This must match the originally submitted URI (if one was sent). | [optional] |
| **singleChannel** | **Boolean**| Request the user to add your app only to a single channel. | [optional] |

### Return type

[**OauthTokenResponse**](OauthTokenResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success example using a workspace app produces a very different kind of response |  -  |
| **0** | Typical error response |  -  |

