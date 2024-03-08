# UsergroupsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](UsergroupsApi.md#create) | **POST** /usergroups.create |  |
| [**disable**](UsergroupsApi.md#disable) | **POST** /usergroups.disable |  |
| [**enable**](UsergroupsApi.md#enable) | **POST** /usergroups.enable |  |
| [**list**](UsergroupsApi.md#list) | **GET** /usergroups.list |  |
| [**listAllUsers**](UsergroupsApi.md#listAllUsers) | **GET** /usergroups.users.list |  |
| [**update**](UsergroupsApi.md#update) | **POST** /usergroups.update |  |
| [**updateList**](UsergroupsApi.md#updateList) | **POST** /usergroups.users.update |  |


<a name="create"></a>
# **create**
> UsergroupsCreateResponse create(token, name).description(description).channels(channels).handle(handle).includeCount(includeCount).usergroupsCreateRequest(usergroupsCreateRequest).execute();



Create a User Group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsergroupsApi;
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
    String name = "name_example"; // A name for the User Group. Must be unique among User Groups.
    String description = "description_example"; // A short description of the User Group.
    String channels = "channels_example"; // A comma separated string of encoded channel IDs for which the User Group uses as a default.
    String handle = "handle_example"; // A mention handle. Must be unique among channels, users and User Groups.
    Boolean includeCount = true; // Include the number of users in each User Group.
    try {
      UsergroupsCreateResponse result = client
              .usergroups
              .create(token, name)
              .description(description)
              .channels(channels)
              .handle(handle)
              .includeCount(includeCount)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getUsergroup());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsergroupsCreateResponse> response = client
              .usergroups
              .create(token, name)
              .description(description)
              .channels(channels)
              .handle(handle)
              .includeCount(includeCount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsApi#create");
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
| **name** | **String**| A name for the User Group. Must be unique among User Groups. | |
| **description** | **String**| A short description of the User Group. | [optional] |
| **channels** | **String**| A comma separated string of encoded channel IDs for which the User Group uses as a default. | [optional] |
| **handle** | **String**| A mention handle. Must be unique among channels, users and User Groups. | [optional] |
| **includeCount** | **Boolean**| Include the number of users in each User Group. | [optional] |
| **usergroupsCreateRequest** | [**UsergroupsCreateRequest**](UsergroupsCreateRequest.md)|  | [optional] |

### Return type

[**UsergroupsCreateResponse**](UsergroupsCreateResponse.md)

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

<a name="disable"></a>
# **disable**
> UsergroupsDisableResponse disable(token, usergroup).includeCount(includeCount).usergroupsDisableRequest(usergroupsDisableRequest).execute();



Disable an existing User Group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsergroupsApi;
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
    String usergroup = "usergroup_example"; // The encoded ID of the User Group to disable.
    Boolean includeCount = true; // Include the number of users in the User Group.
    try {
      UsergroupsDisableResponse result = client
              .usergroups
              .disable(token, usergroup)
              .includeCount(includeCount)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getUsergroup());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsApi#disable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsergroupsDisableResponse> response = client
              .usergroups
              .disable(token, usergroup)
              .includeCount(includeCount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsApi#disable");
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
| **usergroup** | **String**| The encoded ID of the User Group to disable. | |
| **includeCount** | **Boolean**| Include the number of users in the User Group. | [optional] |
| **usergroupsDisableRequest** | [**UsergroupsDisableRequest**](UsergroupsDisableRequest.md)|  | [optional] |

### Return type

[**UsergroupsDisableResponse**](UsergroupsDisableResponse.md)

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

<a name="enable"></a>
# **enable**
> UsergroupsEnableResponse enable(token, usergroup).includeCount(includeCount).usergroupsEnableRequest(usergroupsEnableRequest).execute();



Enable a User Group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsergroupsApi;
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
    String usergroup = "usergroup_example"; // The encoded ID of the User Group to enable.
    Boolean includeCount = true; // Include the number of users in the User Group.
    try {
      UsergroupsEnableResponse result = client
              .usergroups
              .enable(token, usergroup)
              .includeCount(includeCount)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getUsergroup());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsApi#enable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsergroupsEnableResponse> response = client
              .usergroups
              .enable(token, usergroup)
              .includeCount(includeCount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsApi#enable");
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
| **usergroup** | **String**| The encoded ID of the User Group to enable. | |
| **includeCount** | **Boolean**| Include the number of users in the User Group. | [optional] |
| **usergroupsEnableRequest** | [**UsergroupsEnableRequest**](UsergroupsEnableRequest.md)|  | [optional] |

### Return type

[**UsergroupsEnableResponse**](UsergroupsEnableResponse.md)

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

<a name="list"></a>
# **list**
> UsergroupsListResponse list(token).includeUsers(includeUsers).includeCount(includeCount).includeDisabled(includeDisabled).execute();



List all User Groups for a team

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsergroupsApi;
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
    Boolean includeUsers = true; // Include the list of users for each User Group.
    Boolean includeCount = true; // Include the number of users in each User Group.
    Boolean includeDisabled = true; // Include disabled User Groups.
    try {
      UsergroupsListResponse result = client
              .usergroups
              .list(token)
              .includeUsers(includeUsers)
              .includeCount(includeCount)
              .includeDisabled(includeDisabled)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getUsergroups());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsergroupsListResponse> response = client
              .usergroups
              .list(token)
              .includeUsers(includeUsers)
              .includeCount(includeCount)
              .includeDisabled(includeDisabled)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsApi#list");
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
| **includeUsers** | **Boolean**| Include the list of users for each User Group. | [optional] |
| **includeCount** | **Boolean**| Include the number of users in each User Group. | [optional] |
| **includeDisabled** | **Boolean**| Include disabled User Groups. | [optional] |

### Return type

[**UsergroupsListResponse**](UsergroupsListResponse.md)

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
import com.konfigthis.client.api.UsergroupsApi;
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
              .usergroups
              .listAllUsers(token, usergroup)
              .includeDisabled(includeDisabled)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getUsers());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsApi#listAllUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsergroupsusersListAllUsersResponse> response = client
              .usergroups
              .listAllUsers(token, usergroup)
              .includeDisabled(includeDisabled)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsApi#listAllUsers");
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

<a name="update"></a>
# **update**
> UsergroupsUpdateResponse update(token, usergroup).description(description).channels(channels).handle(handle).includeCount(includeCount).name(name).usergroupsUpdateRequest(usergroupsUpdateRequest).execute();



Update an existing User Group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsergroupsApi;
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
    String description = "description_example"; // A short description of the User Group.
    String channels = "channels_example"; // A comma separated string of encoded channel IDs for which the User Group uses as a default.
    String handle = "handle_example"; // A mention handle. Must be unique among channels, users and User Groups.
    Boolean includeCount = true; // Include the number of users in the User Group.
    String name = "name_example"; // A name for the User Group. Must be unique among User Groups.
    try {
      UsergroupsUpdateResponse result = client
              .usergroups
              .update(token, usergroup)
              .description(description)
              .channels(channels)
              .handle(handle)
              .includeCount(includeCount)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getUsergroup());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsApi#update");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsergroupsUpdateResponse> response = client
              .usergroups
              .update(token, usergroup)
              .description(description)
              .channels(channels)
              .handle(handle)
              .includeCount(includeCount)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsApi#update");
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
| **description** | **String**| A short description of the User Group. | [optional] |
| **channels** | **String**| A comma separated string of encoded channel IDs for which the User Group uses as a default. | [optional] |
| **handle** | **String**| A mention handle. Must be unique among channels, users and User Groups. | [optional] |
| **includeCount** | **Boolean**| Include the number of users in the User Group. | [optional] |
| **name** | **String**| A name for the User Group. Must be unique among User Groups. | [optional] |
| **usergroupsUpdateRequest** | [**UsergroupsUpdateRequest**](UsergroupsUpdateRequest.md)|  | [optional] |

### Return type

[**UsergroupsUpdateResponse**](UsergroupsUpdateResponse.md)

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
import com.konfigthis.client.api.UsergroupsApi;
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
              .usergroups
              .updateList(token, usergroup, users)
              .includeCount(includeCount)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
      System.out.println(result.getUsergroup());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsApi#updateList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsergroupsusersUpdateListResponse> response = client
              .usergroups
              .updateList(token, usergroup, users)
              .includeCount(includeCount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsergroupsApi#updateList");
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

