# UsergroupsUsersApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAllUsers**](UsergroupsUsersApi.md#listAllUsers) | **GET** /usergroups.users.list |  |
| [**updateList**](UsergroupsUsersApi.md#updateList) | **POST** /usergroups.users.update |  |


<a name="listAllUsers"></a>
# **listAllUsers**
> UsergroupsusersListAllUsersResponse listAllUsers(token, usergroup).includeDisabled(includeDisabled).execute();



List all users in a User Group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsergroupsUsersApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `usergroups:read`
    String usergroup = "usergroup_example"; // The encoded ID of the User Group to update.
    Boolean includeDisabled = true; // Allow results that involve disabled User Groups.
    try {
      UsergroupsusersListAllUsersResponse result = client
              .usergroupsUsers
              .listAllUsers(token, usergroup)
              .includeDisabled(includeDisabled)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getUsers());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsUsersApi#listAllUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsergroupsusersListAllUsersResponse> response = client
              .usergroupsUsers
              .listAllUsers(token, usergroup)
              .includeDisabled(includeDisabled)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsUsersApi#listAllUsers");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;usergroups:read&#x60; | |
| **usergroup** | **String**| The encoded ID of the User Group to update. | |
| **includeDisabled** | **Boolean**| Allow results that involve disabled User Groups. | [optional] |

### Return type

[**UsergroupsusersListAllUsersResponse**](UsergroupsusersListAllUsersResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Standard success response when used with a user token |  -  |
| **0** | Standard failure response when used with an invalid token |  -  |

<a name="updateList"></a>
# **updateList**
> UsergroupsusersUpdateListResponse updateList(token, usergroup, users).includeCount(includeCount).usergroupsusersUpdateListRequest(usergroupsusersUpdateListRequest).execute();



Update the list of users for a User Group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsergroupsUsersApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `usergroups:write`
    String usergroup = "usergroup_example"; // The encoded ID of the User Group to update.
    String users = "users_example"; // A comma separated string of encoded user IDs that represent the entire list of users for the User Group.
    Boolean includeCount = true; // Include the number of users in the User Group.
    try {
      UsergroupsusersUpdateListResponse result = client
              .usergroupsUsers
              .updateList(token, usergroup, users)
              .includeCount(includeCount)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getUsergroup());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsUsersApi#updateList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsergroupsusersUpdateListResponse> response = client
              .usergroupsUsers
              .updateList(token, usergroup, users)
              .includeCount(includeCount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsUsersApi#updateList");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;usergroups:write&#x60; | |
| **usergroup** | **String**| The encoded ID of the User Group to update. | |
| **users** | **String**| A comma separated string of encoded user IDs that represent the entire list of users for the User Group. | |
| **includeCount** | **Boolean**| Include the number of users in the User Group. | [optional] |
| **usergroupsusersUpdateListRequest** | [**UsergroupsusersUpdateListRequest**](UsergroupsusersUpdateListRequest.md)|  | [optional] |

### Return type

[**UsergroupsusersUpdateListResponse**](UsergroupsusersUpdateListResponse.md)

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

