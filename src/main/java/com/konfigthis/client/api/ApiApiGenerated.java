/*
 * Slack Web API
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.ApiTestResponse;
import com.konfigthis.client.model.ApiTestdefaultResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ApiApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ApiApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ApiApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call testCall(String error, String foo, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api.test";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (error != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("error", error));
        }

        if (foo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("foo", foo));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "slackAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call testValidateBeforeCall(String error, String foo, final ApiCallback _callback) throws ApiException {
        return testCall(error, foo, _callback);

    }


    private ApiResponse<ApiTestResponse> testWithHttpInfo(String error, String foo) throws ApiException {
        okhttp3.Call localVarCall = testValidateBeforeCall(error, foo, null);
        Type localVarReturnType = new TypeToken<ApiTestResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call testAsync(String error, String foo, final ApiCallback<ApiTestResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = testValidateBeforeCall(error, foo, _callback);
        Type localVarReturnType = new TypeToken<ApiTestResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class TestRequestBuilder {
        private String error;
        private String foo;

        private TestRequestBuilder() {
        }

        /**
         * Set error
         * @param error Error response to return (optional)
         * @return TestRequestBuilder
         */
        public TestRequestBuilder error(String error) {
            this.error = error;
            return this;
        }
        
        /**
         * Set foo
         * @param foo example property to return (optional)
         * @return TestRequestBuilder
         */
        public TestRequestBuilder foo(String foo) {
            this.foo = foo;
            return this;
        }
        
        /**
         * Build call for test
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standard success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Artificial error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return testCall(error, foo, _callback);
        }


        /**
         * Execute test request
         * @return ApiTestResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standard success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Artificial error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiTestResponse execute() throws ApiException {
            ApiResponse<ApiTestResponse> localVarResp = testWithHttpInfo(error, foo);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute test request with HTTP info returned
         * @return ApiResponse&lt;ApiTestResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standard success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Artificial error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ApiTestResponse> executeWithHttpInfo() throws ApiException {
            return testWithHttpInfo(error, foo);
        }

        /**
         * Execute test request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standard success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Artificial error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ApiTestResponse> _callback) throws ApiException {
            return testAsync(error, foo, _callback);
        }
    }

    /**
     * 
     * Checks API calling code.
     * @return TestRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Standard success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Artificial error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/api.test"> Documentation</a>
     */
    public TestRequestBuilder test() throws IllegalArgumentException {
        return new TestRequestBuilder();
    }
}
