# FilesApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFromRemote**](FilesApi.md#addFromRemote) | **POST** /files.remote.add |  |
| [**delete**](FilesApi.md#delete) | **POST** /files.delete |  |
| [**deleteComment**](FilesApi.md#deleteComment) | **POST** /files.comments.delete |  |
| [**deleteFile**](FilesApi.md#deleteFile) | **POST** /files.remote.remove |  |
| [**getInfo**](FilesApi.md#getInfo) | **GET** /files.remote.info |  |
| [**info**](FilesApi.md#info) | **GET** /files.info |  |
| [**list**](FilesApi.md#list) | **GET** /files.list |  |
| [**listRemoteFiles**](FilesApi.md#listRemoteFiles) | **GET** /files.remote.list |  |
| [**revokePublicURL**](FilesApi.md#revokePublicURL) | **POST** /files.revokePublicURL |  |
| [**shareRemoteFile**](FilesApi.md#shareRemoteFile) | **GET** /files.remote.share |  |
| [**sharedPublicURL**](FilesApi.md#sharedPublicURL) | **POST** /files.sharedPublicURL |  |
| [**updateRemoteFile**](FilesApi.md#updateRemoteFile) | **POST** /files.remote.update |  |
| [**upload**](FilesApi.md#upload) | **POST** /files.upload |  |


<a name="addFromRemote"></a>
# **addFromRemote**
> FilesremoteAddFromRemoteResponse addFromRemote().title(title).externalId(externalId).externalUrl(externalUrl).filetype(filetype).indexableFileContents(indexableFileContents).previewImage(previewImage).token(token).filesremoteAddFromRemoteRequest(filesremoteAddFromRemoteRequest).execute();



Adds a file from a remote service

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String title = "title_example"; // Title of the file being shared.
    String externalId = "externalId_example"; // Creator defined GUID for the file.
    String externalUrl = "externalUrl_example"; // URL of the remote file.
    String filetype = "filetype_example"; // type of file
    String indexableFileContents = "indexableFileContents_example"; // A text file (txt, pdf, doc, etc.) containing textual search terms that are used to improve discovery of the remote file.
    String previewImage = "previewImage_example"; // Preview of the document via `multipart/form-data`.
    String token = "token_example"; // Authentication token. Requires scope: `remote_files:write`
    try {
      FilesremoteAddFromRemoteResponse result = client
              .files
              .addFromRemote()
              .title(title)
              .externalId(externalId)
              .externalUrl(externalUrl)
              .filetype(filetype)
              .indexableFileContents(indexableFileContents)
              .previewImage(previewImage)
              .token(token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#addFromRemote");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesremoteAddFromRemoteResponse> response = client
              .files
              .addFromRemote()
              .title(title)
              .externalId(externalId)
              .externalUrl(externalUrl)
              .filetype(filetype)
              .indexableFileContents(indexableFileContents)
              .previewImage(previewImage)
              .token(token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#addFromRemote");
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
| **title** | **String**| Title of the file being shared. | [optional] |
| **externalId** | **String**| Creator defined GUID for the file. | [optional] |
| **externalUrl** | **String**| URL of the remote file. | [optional] |
| **filetype** | **String**| type of file | [optional] |
| **indexableFileContents** | **String**| A text file (txt, pdf, doc, etc.) containing textual search terms that are used to improve discovery of the remote file. | [optional] |
| **previewImage** | **String**| Preview of the document via &#x60;multipart/form-data&#x60;. | [optional] |
| **token** | **String**| Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional] |
| **filesremoteAddFromRemoteRequest** | [**FilesremoteAddFromRemoteRequest**](FilesremoteAddFromRemoteRequest.md)|  | [optional] |

### Return type

[**FilesremoteAddFromRemoteResponse**](FilesremoteAddFromRemoteResponse.md)

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

<a name="delete"></a>
# **delete**
> FilesDeleteResponse delete().token(token)._file(_file).filesDeleteRequest(filesDeleteRequest).execute();



Deletes a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `files:write:user`
    String _file = "_file_example"; // ID of file to delete.
    try {
      FilesDeleteResponse result = client
              .files
              .delete()
              .token(token)
              ._file(_file)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#delete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesDeleteResponse> response = client
              .files
              .delete()
              .token(token)
              ._file(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#delete");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |
| **_file** | **String**| ID of file to delete. | [optional] |
| **filesDeleteRequest** | [**FilesDeleteRequest**](FilesDeleteRequest.md)|  | [optional] |

### Return type

[**FilesDeleteResponse**](FilesDeleteResponse.md)

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

<a name="deleteComment"></a>
# **deleteComment**
> FilescommentsDeleteCommentResponse deleteComment().token(token)._file(_file).id(id).filescommentsDeleteCommentRequest(filescommentsDeleteCommentRequest).execute();



Deletes an existing comment on a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `files:write:user`
    String _file = "_file_example"; // File to delete a comment from.
    String id = "id_example"; // The comment to delete.
    try {
      FilescommentsDeleteCommentResponse result = client
              .files
              .deleteComment()
              .token(token)
              ._file(_file)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#deleteComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilescommentsDeleteCommentResponse> response = client
              .files
              .deleteComment()
              .token(token)
              ._file(_file)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#deleteComment");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |
| **_file** | **String**| File to delete a comment from. | [optional] |
| **id** | **String**| The comment to delete. | [optional] |
| **filescommentsDeleteCommentRequest** | [**FilescommentsDeleteCommentRequest**](FilescommentsDeleteCommentRequest.md)|  | [optional] |

### Return type

[**FilescommentsDeleteCommentResponse**](FilescommentsDeleteCommentResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Standard success response is very simple |  -  |
| **0** | Standard failure response when used with an invalid token |  -  |

<a name="deleteFile"></a>
# **deleteFile**
> FilesremoteDeleteFileResponse deleteFile().externalId(externalId)._file(_file).token(token).filesremoteDeleteFileRequest(filesremoteDeleteFileRequest).execute();



Remove a remote file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String externalId = "externalId_example"; // Creator defined GUID for the file.
    String _file = "_file_example"; // Specify a file by providing its ID.
    String token = "token_example"; // Authentication token. Requires scope: `remote_files:write`
    try {
      FilesremoteDeleteFileResponse result = client
              .files
              .deleteFile()
              .externalId(externalId)
              ._file(_file)
              .token(token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#deleteFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesremoteDeleteFileResponse> response = client
              .files
              .deleteFile()
              .externalId(externalId)
              ._file(_file)
              .token(token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#deleteFile");
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
| **externalId** | **String**| Creator defined GUID for the file. | [optional] |
| **_file** | **String**| Specify a file by providing its ID. | [optional] |
| **token** | **String**| Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional] |
| **filesremoteDeleteFileRequest** | [**FilesremoteDeleteFileRequest**](FilesremoteDeleteFileRequest.md)|  | [optional] |

### Return type

[**FilesremoteDeleteFileResponse**](FilesremoteDeleteFileResponse.md)

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

<a name="getInfo"></a>
# **getInfo**
> FilesremoteGetInfoResponse getInfo().token(token)._file(_file).externalId(externalId).execute();



Retrieve information about a remote file added to Slack

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `remote_files:read`
    String _file = "_file_example"; // Specify a file by providing its ID.
    String externalId = "externalId_example"; // Creator defined GUID for the file.
    try {
      FilesremoteGetInfoResponse result = client
              .files
              .getInfo()
              .token(token)
              ._file(_file)
              .externalId(externalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesremoteGetInfoResponse> response = client
              .files
              .getInfo()
              .token(token)
              ._file(_file)
              .externalId(externalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getInfo");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;remote_files:read&#x60; | [optional] |
| **_file** | **String**| Specify a file by providing its ID. | [optional] |
| **externalId** | **String**| Creator defined GUID for the file. | [optional] |

### Return type

[**FilesremoteGetInfoResponse**](FilesremoteGetInfoResponse.md)

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

<a name="info"></a>
# **info**
> FilesInfoResponse info().token(token)._file(_file).count(count).page(page).limit(limit).cursor(cursor).execute();



Gets information about a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `files:read`
    String _file = "_file_example"; // Specify a file by providing its ID.
    String count = "count_example";
    String page = "page_example";
    Integer limit = 56; // The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached.
    String cursor = "cursor_example"; // Parameter for pagination. File comments are paginated for a single file. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection of comments. See [pagination](https://slack.dev) for more details.
    try {
      FilesInfoResponse result = client
              .files
              .info()
              .token(token)
              ._file(_file)
              .count(count)
              .page(page)
              .limit(limit)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getComments());
      System.out.println(result.getContentHtml());
      System.out.println(result.getEditor());
      System.out.println(result.getFile());
      System.out.println(result.getOk());
      System.out.println(result.getPaging());
      System.out.println(result.getResponseMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#info");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesInfoResponse> response = client
              .files
              .info()
              .token(token)
              ._file(_file)
              .count(count)
              .page(page)
              .limit(limit)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#info");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;files:read&#x60; | [optional] |
| **_file** | **String**| Specify a file by providing its ID. | [optional] |
| **count** | **String**|  | [optional] |
| **page** | **String**|  | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | [optional] |
| **cursor** | **String**| Parameter for pagination. File comments are paginated for a single file. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection of comments. See [pagination](https://slack.dev) for more details. | [optional] |

### Return type

[**FilesInfoResponse**](FilesInfoResponse.md)

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
> FilesListResponse list().token(token).user(user).channel(channel).tsFrom(tsFrom).tsTo(tsTo).types(types).count(count).page(page).showFilesHiddenByLimit(showFilesHiddenByLimit).execute();



List for a team, in a channel, or from a user with applied filters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `files:read`
    String user = "user_example"; // Filter files created by a single user.
    String channel = "channel_example"; // Filter files appearing in a specific channel, indicated by its ID.
    Double tsFrom = 3.4D; // Filter files created after this timestamp (inclusive).
    Double tsTo = 3.4D; // Filter files created before this timestamp (inclusive).
    String types = "types_example"; // Filter files by type ([see below](https://slack.dev)). You can pass multiple values in the types argument, like `types=spaces,snippets`.The default value is `all`, which does not filter the list.
    String count = "count_example";
    String page = "page_example";
    Boolean showFilesHiddenByLimit = true; // Show truncated file info for files hidden due to being too old, and the team who owns the file being over the file limit.
    try {
      FilesListResponse result = client
              .files
              .list()
              .token(token)
              .user(user)
              .channel(channel)
              .tsFrom(tsFrom)
              .tsTo(tsTo)
              .types(types)
              .count(count)
              .page(page)
              .showFilesHiddenByLimit(showFilesHiddenByLimit)
              .execute();
      System.out.println(result);
      System.out.println(result.getFiles());
      System.out.println(result.getOk());
      System.out.println(result.getPaging());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesListResponse> response = client
              .files
              .list()
              .token(token)
              .user(user)
              .channel(channel)
              .tsFrom(tsFrom)
              .tsTo(tsTo)
              .types(types)
              .count(count)
              .page(page)
              .showFilesHiddenByLimit(showFilesHiddenByLimit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#list");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;files:read&#x60; | [optional] |
| **user** | **String**| Filter files created by a single user. | [optional] |
| **channel** | **String**| Filter files appearing in a specific channel, indicated by its ID. | [optional] |
| **tsFrom** | **Double**| Filter files created after this timestamp (inclusive). | [optional] |
| **tsTo** | **Double**| Filter files created before this timestamp (inclusive). | [optional] |
| **types** | **String**| Filter files by type ([see below](https://slack.dev)). You can pass multiple values in the types argument, like &#x60;types&#x3D;spaces,snippets&#x60;.The default value is &#x60;all&#x60;, which does not filter the list. | [optional] |
| **count** | **String**|  | [optional] |
| **page** | **String**|  | [optional] |
| **showFilesHiddenByLimit** | **Boolean**| Show truncated file info for files hidden due to being too old, and the team who owns the file being over the file limit. | [optional] |

### Return type

[**FilesListResponse**](FilesListResponse.md)

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

<a name="listRemoteFiles"></a>
# **listRemoteFiles**
> FilesremoteListRemoteFilesResponse listRemoteFiles().token(token).channel(channel).tsFrom(tsFrom).tsTo(tsTo).limit(limit).cursor(cursor).execute();



Retrieve information about a remote file added to Slack

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `remote_files:read`
    String channel = "channel_example"; // Filter files appearing in a specific channel, indicated by its ID.
    Double tsFrom = 3.4D; // Filter files created after this timestamp (inclusive).
    Double tsTo = 3.4D; // Filter files created before this timestamp (inclusive).
    Integer limit = 56; // The maximum number of items to return.
    String cursor = "cursor_example"; // Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](https://slack.dev) for more detail.
    try {
      FilesremoteListRemoteFilesResponse result = client
              .files
              .listRemoteFiles()
              .token(token)
              .channel(channel)
              .tsFrom(tsFrom)
              .tsTo(tsTo)
              .limit(limit)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#listRemoteFiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesremoteListRemoteFilesResponse> response = client
              .files
              .listRemoteFiles()
              .token(token)
              .channel(channel)
              .tsFrom(tsFrom)
              .tsTo(tsTo)
              .limit(limit)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#listRemoteFiles");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;remote_files:read&#x60; | [optional] |
| **channel** | **String**| Filter files appearing in a specific channel, indicated by its ID. | [optional] |
| **tsFrom** | **Double**| Filter files created after this timestamp (inclusive). | [optional] |
| **tsTo** | **Double**| Filter files created before this timestamp (inclusive). | [optional] |
| **limit** | **Integer**| The maximum number of items to return. | [optional] |
| **cursor** | **String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](https://slack.dev) for more detail. | [optional] |

### Return type

[**FilesremoteListRemoteFilesResponse**](FilesremoteListRemoteFilesResponse.md)

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

<a name="revokePublicURL"></a>
# **revokePublicURL**
> FilesRevokePublicUrlResponse revokePublicURL().token(token)._file(_file).filesRevokePublicUrlRequest(filesRevokePublicUrlRequest).execute();



Revokes public/external sharing access for a file

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `files:write:user`
    String _file = "_file_example"; // File to revoke
    try {
      FilesRevokePublicUrlResponse result = client
              .files
              .revokePublicURL()
              .token(token)
              ._file(_file)
              .execute();
      System.out.println(result);
      System.out.println(result.getFile());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#revokePublicURL");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesRevokePublicUrlResponse> response = client
              .files
              .revokePublicURL()
              .token(token)
              ._file(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#revokePublicURL");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |
| **_file** | **String**| File to revoke | [optional] |
| **filesRevokePublicUrlRequest** | [**FilesRevokePublicUrlRequest**](FilesRevokePublicUrlRequest.md)|  | [optional] |

### Return type

[**FilesRevokePublicUrlResponse**](FilesRevokePublicUrlResponse.md)

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

<a name="shareRemoteFile"></a>
# **shareRemoteFile**
> FilesremoteShareRemoteFileResponse shareRemoteFile().token(token)._file(_file).externalId(externalId).channels(channels).execute();



Share a remote file into a channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `remote_files:share`
    String _file = "_file_example"; // Specify a file registered with Slack by providing its ID. Either this field or `external_id` or both are required.
    String externalId = "externalId_example"; // The globally unique identifier (GUID) for the file, as set by the app registering the file with Slack.  Either this field or `file` or both are required.
    String channels = "channels_example"; // Comma-separated list of channel IDs where the file will be shared.
    try {
      FilesremoteShareRemoteFileResponse result = client
              .files
              .shareRemoteFile()
              .token(token)
              ._file(_file)
              .externalId(externalId)
              .channels(channels)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#shareRemoteFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesremoteShareRemoteFileResponse> response = client
              .files
              .shareRemoteFile()
              .token(token)
              ._file(_file)
              .externalId(externalId)
              .channels(channels)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#shareRemoteFile");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;remote_files:share&#x60; | [optional] |
| **_file** | **String**| Specify a file registered with Slack by providing its ID. Either this field or &#x60;external_id&#x60; or both are required. | [optional] |
| **externalId** | **String**| The globally unique identifier (GUID) for the file, as set by the app registering the file with Slack.  Either this field or &#x60;file&#x60; or both are required. | [optional] |
| **channels** | **String**| Comma-separated list of channel IDs where the file will be shared. | [optional] |

### Return type

[**FilesremoteShareRemoteFileResponse**](FilesremoteShareRemoteFileResponse.md)

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

<a name="sharedPublicURL"></a>
# **sharedPublicURL**
> FilesSharedPublicUrlResponse sharedPublicURL().token(token)._file(_file).filesSharedPublicUrlRequest(filesSharedPublicUrlRequest).execute();



Enables a file for public/external sharing.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `files:write:user`
    String _file = "_file_example"; // File to share
    try {
      FilesSharedPublicUrlResponse result = client
              .files
              .sharedPublicURL()
              .token(token)
              ._file(_file)
              .execute();
      System.out.println(result);
      System.out.println(result.getFile());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#sharedPublicURL");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesSharedPublicUrlResponse> response = client
              .files
              .sharedPublicURL()
              .token(token)
              ._file(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#sharedPublicURL");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |
| **_file** | **String**| File to share | [optional] |
| **filesSharedPublicUrlRequest** | [**FilesSharedPublicUrlRequest**](FilesSharedPublicUrlRequest.md)|  | [optional] |

### Return type

[**FilesSharedPublicUrlResponse**](FilesSharedPublicUrlResponse.md)

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

<a name="updateRemoteFile"></a>
# **updateRemoteFile**
> FilesremoteUpdateRemoteFileResponse updateRemoteFile().title(title).externalId(externalId).externalUrl(externalUrl)._file(_file).filetype(filetype).indexableFileContents(indexableFileContents).previewImage(previewImage).token(token).filesremoteUpdateRemoteFileRequest(filesremoteUpdateRemoteFileRequest).execute();



Updates an existing remote file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String title = "title_example"; // Title of the file being shared.
    String externalId = "externalId_example"; // Creator defined GUID for the file.
    String externalUrl = "externalUrl_example"; // URL of the remote file.
    String _file = "_file_example"; // Specify a file by providing its ID.
    String filetype = "filetype_example"; // type of file
    String indexableFileContents = "indexableFileContents_example"; // File containing contents that can be used to improve searchability for the remote file.
    String previewImage = "previewImage_example"; // Preview of the document via `multipart/form-data`.
    String token = "token_example"; // Authentication token. Requires scope: `remote_files:write`
    try {
      FilesremoteUpdateRemoteFileResponse result = client
              .files
              .updateRemoteFile()
              .title(title)
              .externalId(externalId)
              .externalUrl(externalUrl)
              ._file(_file)
              .filetype(filetype)
              .indexableFileContents(indexableFileContents)
              .previewImage(previewImage)
              .token(token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#updateRemoteFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesremoteUpdateRemoteFileResponse> response = client
              .files
              .updateRemoteFile()
              .title(title)
              .externalId(externalId)
              .externalUrl(externalUrl)
              ._file(_file)
              .filetype(filetype)
              .indexableFileContents(indexableFileContents)
              .previewImage(previewImage)
              .token(token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#updateRemoteFile");
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
| **title** | **String**| Title of the file being shared. | [optional] |
| **externalId** | **String**| Creator defined GUID for the file. | [optional] |
| **externalUrl** | **String**| URL of the remote file. | [optional] |
| **_file** | **String**| Specify a file by providing its ID. | [optional] |
| **filetype** | **String**| type of file | [optional] |
| **indexableFileContents** | **String**| File containing contents that can be used to improve searchability for the remote file. | [optional] |
| **previewImage** | **String**| Preview of the document via &#x60;multipart/form-data&#x60;. | [optional] |
| **token** | **String**| Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional] |
| **filesremoteUpdateRemoteFileRequest** | [**FilesremoteUpdateRemoteFileRequest**](FilesremoteUpdateRemoteFileRequest.md)|  | [optional] |

### Return type

[**FilesremoteUpdateRemoteFileResponse**](FilesremoteUpdateRemoteFileResponse.md)

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

<a name="upload"></a>
# **upload**
> FilesUploadResponse upload().title(title).channels(channels).content(content)._file(_file).filename(filename).filetype(filetype).initialComment(initialComment).threadTs(threadTs).token(token).filesUploadRequest(filesUploadRequest).execute();



Uploads or creates a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String title = "title_example"; // Title of file.
    String channels = "channels_example"; // Comma-separated list of channel names or IDs where the file will be shared.
    String content = "content_example"; // File contents via a POST variable. If omitting this parameter, you must provide a `file`.
    String _file = "_file_example"; // File contents via `multipart/form-data`. If omitting this parameter, you must submit `content`.
    String filename = "filename_example"; // Filename of file.
    String filetype = "filetype_example"; // A [file type](https://slack.dev) identifier.
    String initialComment = "initialComment_example"; // The message text introducing the file in specified `channels`.
    Double threadTs = 3.4D; // Provide another message's `ts` value to upload this file as a reply. Never use a reply's `ts` value; use its parent instead.
    String token = "token_example"; // Authentication token. Requires scope: `files:write:user`
    try {
      FilesUploadResponse result = client
              .files
              .upload()
              .title(title)
              .channels(channels)
              .content(content)
              ._file(_file)
              .filename(filename)
              .filetype(filetype)
              .initialComment(initialComment)
              .threadTs(threadTs)
              .token(token)
              .execute();
      System.out.println(result);
      System.out.println(result.getFile());
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#upload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesUploadResponse> response = client
              .files
              .upload()
              .title(title)
              .channels(channels)
              .content(content)
              ._file(_file)
              .filename(filename)
              .filetype(filetype)
              .initialComment(initialComment)
              .threadTs(threadTs)
              .token(token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#upload");
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
| **title** | **String**| Title of file. | [optional] |
| **channels** | **String**| Comma-separated list of channel names or IDs where the file will be shared. | [optional] |
| **content** | **String**| File contents via a POST variable. If omitting this parameter, you must provide a &#x60;file&#x60;. | [optional] |
| **_file** | **String**| File contents via &#x60;multipart/form-data&#x60;. If omitting this parameter, you must submit &#x60;content&#x60;. | [optional] |
| **filename** | **String**| Filename of file. | [optional] |
| **filetype** | **String**| A [file type](https://slack.dev) identifier. | [optional] |
| **initialComment** | **String**| The message text introducing the file in specified &#x60;channels&#x60;. | [optional] |
| **threadTs** | **Double**| Provide another message&#39;s &#x60;ts&#x60; value to upload this file as a reply. Never use a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | [optional] |
| **token** | **String**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |
| **filesUploadRequest** | [**FilesUploadRequest**](FilesUploadRequest.md)|  | [optional] |

### Return type

[**FilesUploadResponse**](FilesUploadResponse.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response after uploading a file to a channel with an initial message |  -  |
| **0** | Typical error response |  -  |

