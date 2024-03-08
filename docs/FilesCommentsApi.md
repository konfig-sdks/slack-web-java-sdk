# FilesCommentsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteComment**](FilesCommentsApi.md#deleteComment) | **POST** /files.comments.delete |  |


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
import com.konfigthis.client.api.FilesCommentsApi;
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
              .filesComments
              .deleteComment()
              .token(token)
              ._file(_file)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesCommentsApi#deleteComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilescommentsDeleteCommentResponse> response = client
              .filesComments
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
      System.err.println("Exception when calling FilesCommentsApi#deleteComment");
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

