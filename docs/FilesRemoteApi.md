# FilesRemoteApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFromRemote**](FilesRemoteApi.md#addFromRemote) | **POST** /files.remote.add |  |
| [**deleteFile**](FilesRemoteApi.md#deleteFile) | **POST** /files.remote.remove |  |
| [**getInfo**](FilesRemoteApi.md#getInfo) | **GET** /files.remote.info |  |
| [**listRemoteFiles**](FilesRemoteApi.md#listRemoteFiles) | **GET** /files.remote.list |  |
| [**shareRemoteFile**](FilesRemoteApi.md#shareRemoteFile) | **GET** /files.remote.share |  |
| [**updateRemoteFile**](FilesRemoteApi.md#updateRemoteFile) | **POST** /files.remote.update |  |


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
import com.konfigthis.client.api.FilesRemoteApi;
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
              .filesRemote
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
      System.err.println("Exception when calling FilesRemoteApi#addFromRemote");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesremoteAddFromRemoteResponse> response = client
              .filesRemote
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
      System.err.println("Exception when calling FilesRemoteApi#addFromRemote");
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
import com.konfigthis.client.api.FilesRemoteApi;
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
              .filesRemote
              .deleteFile()
              .externalId(externalId)
              ._file(_file)
              .token(token)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesRemoteApi#deleteFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesremoteDeleteFileResponse> response = client
              .filesRemote
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
      System.err.println("Exception when calling FilesRemoteApi#deleteFile");
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
import com.konfigthis.client.api.FilesRemoteApi;
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
              .filesRemote
              .getInfo()
              .token(token)
              ._file(_file)
              .externalId(externalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesRemoteApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesremoteGetInfoResponse> response = client
              .filesRemote
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
      System.err.println("Exception when calling FilesRemoteApi#getInfo");
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
import com.konfigthis.client.api.FilesRemoteApi;
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
              .filesRemote
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
      System.err.println("Exception when calling FilesRemoteApi#listRemoteFiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesremoteListRemoteFilesResponse> response = client
              .filesRemote
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
      System.err.println("Exception when calling FilesRemoteApi#listRemoteFiles");
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
import com.konfigthis.client.api.FilesRemoteApi;
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
              .filesRemote
              .shareRemoteFile()
              .token(token)
              ._file(_file)
              .externalId(externalId)
              .channels(channels)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesRemoteApi#shareRemoteFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesremoteShareRemoteFileResponse> response = client
              .filesRemote
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
      System.err.println("Exception when calling FilesRemoteApi#shareRemoteFile");
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
import com.konfigthis.client.api.FilesRemoteApi;
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
              .filesRemote
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
      System.err.println("Exception when calling FilesRemoteApi#updateRemoteFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesremoteUpdateRemoteFileResponse> response = client
              .filesRemote
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
      System.err.println("Exception when calling FilesRemoteApi#updateRemoteFile");
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

