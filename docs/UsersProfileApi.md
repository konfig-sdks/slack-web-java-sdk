# UsersProfileApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProfileInfo**](UsersProfileApi.md#getProfileInfo) | **GET** /users.profile.get |  |
| [**setProfileInfo**](UsersProfileApi.md#setProfileInfo) | **POST** /users.profile.set |  |


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
import com.konfigthis.client.api.UsersProfileApi;
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
              .usersProfile
              .getProfileInfo(token)
              .includeLabels(includeLabels)
              .user(user)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getProfile());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersProfileApi#getProfileInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersprofileGetProfileInfoResponse> response = client
              .usersProfile
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
      System.err.println("Exception when calling UsersProfileApi#getProfileInfo");
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
import com.konfigthis.client.api.UsersProfileApi;
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
              .usersProfile
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
      System.err.println("Exception when calling UsersProfileApi#setProfileInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersprofileSetProfileInfoResponse> response = client
              .usersProfile
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
      System.err.println("Exception when calling UsersProfileApi#setProfileInfo");
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

