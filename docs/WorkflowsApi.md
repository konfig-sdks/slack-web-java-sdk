# WorkflowsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**stepCompleted**](WorkflowsApi.md#stepCompleted) | **GET** /workflows.stepCompleted |  |
| [**stepFailed**](WorkflowsApi.md#stepFailed) | **GET** /workflows.stepFailed |  |
| [**updateStep**](WorkflowsApi.md#updateStep) | **GET** /workflows.updateStep |  |


<a name="stepCompleted"></a>
# **stepCompleted**
> WorkflowsStepCompletedResponse stepCompleted(token, workflowStepExecuteId).outputs(outputs).execute();



Indicate that an app&#39;s step in a workflow completed execution.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `workflow.steps:execute`
    String workflowStepExecuteId = "workflowStepExecuteId_example"; // Context identifier that maps to the correct workflow step execution.
    String outputs = "outputs_example"; // Key-value object of outputs from your step. Keys of this object reflect the configured `key` properties of your [`outputs`](https://slack.dev) array from your `workflow_step` object.
    try {
      WorkflowsStepCompletedResponse result = client
              .workflows
              .stepCompleted(token, workflowStepExecuteId)
              .outputs(outputs)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#stepCompleted");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowsStepCompletedResponse> response = client
              .workflows
              .stepCompleted(token, workflowStepExecuteId)
              .outputs(outputs)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#stepCompleted");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; | |
| **workflowStepExecuteId** | **String**| Context identifier that maps to the correct workflow step execution. | |
| **outputs** | **String**| Key-value object of outputs from your step. Keys of this object reflect the configured &#x60;key&#x60; properties of your [&#x60;outputs&#x60;](https://slack.dev) array from your &#x60;workflow_step&#x60; object. | [optional] |

### Return type

[**WorkflowsStepCompletedResponse**](WorkflowsStepCompletedResponse.md)

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

<a name="stepFailed"></a>
# **stepFailed**
> WorkflowsStepFailedResponse stepFailed(token, workflowStepExecuteId, error).execute();



Indicate that an app&#39;s step in a workflow failed to execute.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `workflow.steps:execute`
    String workflowStepExecuteId = "workflowStepExecuteId_example"; // Context identifier that maps to the correct workflow step execution.
    String error = "error_example"; // A JSON-based object with a `message` property that should contain a human readable error message.
    try {
      WorkflowsStepFailedResponse result = client
              .workflows
              .stepFailed(token, workflowStepExecuteId, error)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#stepFailed");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowsStepFailedResponse> response = client
              .workflows
              .stepFailed(token, workflowStepExecuteId, error)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#stepFailed");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; | |
| **workflowStepExecuteId** | **String**| Context identifier that maps to the correct workflow step execution. | |
| **error** | **String**| A JSON-based object with a &#x60;message&#x60; property that should contain a human readable error message. | |

### Return type

[**WorkflowsStepFailedResponse**](WorkflowsStepFailedResponse.md)

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

<a name="updateStep"></a>
# **updateStep**
> WorkflowsUpdateStepResponse updateStep(token, workflowStepEditId).inputs(inputs).outputs(outputs).stepName(stepName).stepImageUrl(stepImageUrl).execute();



Update the configuration for a workflow extension step.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowsApi;
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
    String token = "token_example"; // Authentication token. Requires scope: `workflow.steps:execute`
    String workflowStepEditId = "workflowStepEditId_example"; // A context identifier provided with `view_submission` payloads used to call back to `workflows.updateStep`.
    String inputs = "inputs_example"; // A JSON key-value map of inputs required from a user during configuration. This is the data your app expects to receive when the workflow step starts. **Please note**: the embedded variable format is set and replaced by the workflow system. You cannot create custom variables that will be replaced at runtime. [Read more about variables in workflow steps here](https://slack.dev).
    String outputs = "outputs_example"; // An JSON array of output objects used during step execution. This is the data your app agrees to provide when your workflow step was executed.
    String stepName = "stepName_example"; // An optional field that can be used to override the step name that is shown in the Workflow Builder.
    String stepImageUrl = "stepImageUrl_example"; // An optional field that can be used to override app image that is shown in the Workflow Builder.
    try {
      WorkflowsUpdateStepResponse result = client
              .workflows
              .updateStep(token, workflowStepEditId)
              .inputs(inputs)
              .outputs(outputs)
              .stepName(stepName)
              .stepImageUrl(stepImageUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#updateStep");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowsUpdateStepResponse> response = client
              .workflows
              .updateStep(token, workflowStepEditId)
              .inputs(inputs)
              .outputs(outputs)
              .stepName(stepName)
              .stepImageUrl(stepImageUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#updateStep");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;workflow.steps:execute&#x60; | |
| **workflowStepEditId** | **String**| A context identifier provided with &#x60;view_submission&#x60; payloads used to call back to &#x60;workflows.updateStep&#x60;. | |
| **inputs** | **String**| A JSON key-value map of inputs required from a user during configuration. This is the data your app expects to receive when the workflow step starts. **Please note**: the embedded variable format is set and replaced by the workflow system. You cannot create custom variables that will be replaced at runtime. [Read more about variables in workflow steps here](https://slack.dev). | [optional] |
| **outputs** | **String**| An JSON array of output objects used during step execution. This is the data your app agrees to provide when your workflow step was executed. | [optional] |
| **stepName** | **String**| An optional field that can be used to override the step name that is shown in the Workflow Builder. | [optional] |
| **stepImageUrl** | **String**| An optional field that can be used to override app image that is shown in the Workflow Builder. | [optional] |

### Return type

[**WorkflowsUpdateStepResponse**](WorkflowsUpdateStepResponse.md)

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

