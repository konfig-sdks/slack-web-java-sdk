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


import com.konfigthis.client.model.AuthRevokeResponse;
import com.konfigthis.client.model.AuthRevokedefaultResponse;
import com.konfigthis.client.model.AuthTestResponse;
import com.konfigthis.client.model.AuthTestdefaultResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AuthApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AuthApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call revokeCall(String token, Boolean test, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/auth.revoke";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        if (test != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("test", test));
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
    private okhttp3.Call revokeValidateBeforeCall(String token, Boolean test, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling revoke(Async)");
        }

        return revokeCall(token, test, _callback);

    }


    private ApiResponse<AuthRevokeResponse> revokeWithHttpInfo(String token, Boolean test) throws ApiException {
        okhttp3.Call localVarCall = revokeValidateBeforeCall(token, test, null);
        Type localVarReturnType = new TypeToken<AuthRevokeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call revokeAsync(String token, Boolean test, final ApiCallback<AuthRevokeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = revokeValidateBeforeCall(token, test, _callback);
        Type localVarReturnType = new TypeToken<AuthRevokeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class RevokeRequestBuilder {
        private final String token;
        private Boolean test;

        private RevokeRequestBuilder(String token) {
            this.token = token;
        }

        /**
         * Set test
         * @param test Setting this parameter to &#x60;1&#x60; triggers a _testing mode_ where the specified token will not actually be revoked. (optional)
         * @return RevokeRequestBuilder
         */
        public RevokeRequestBuilder test(Boolean test) {
            this.test = test;
            return this;
        }
        
        /**
         * Build call for revoke
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return revokeCall(token, test, _callback);
        }


        /**
         * Execute revoke request
         * @return AuthRevokeResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public AuthRevokeResponse execute() throws ApiException {
            ApiResponse<AuthRevokeResponse> localVarResp = revokeWithHttpInfo(token, test);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute revoke request with HTTP info returned
         * @return ApiResponse&lt;AuthRevokeResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AuthRevokeResponse> executeWithHttpInfo() throws ApiException {
            return revokeWithHttpInfo(token, test);
        }

        /**
         * Execute revoke request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AuthRevokeResponse> _callback) throws ApiException {
            return revokeAsync(token, test, _callback);
        }
    }

    /**
     * 
     * Revokes a token.
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @return RevokeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/auth.revoke"> Documentation</a>
     */
    public RevokeRequestBuilder revoke(String token) throws IllegalArgumentException {
        if (token == null) throw new IllegalArgumentException("\"token\" is required but got null");
            

        return new RevokeRequestBuilder(token);
    }
    private okhttp3.Call testCall(String token, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/auth.test";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (token != null) {
            localVarHeaderParams.put("token", localVarApiClient.parameterToString(token));
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
    private okhttp3.Call testValidateBeforeCall(String token, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling test(Async)");
        }

        return testCall(token, _callback);

    }


    private ApiResponse<AuthTestResponse> testWithHttpInfo(String token) throws ApiException {
        okhttp3.Call localVarCall = testValidateBeforeCall(token, null);
        Type localVarReturnType = new TypeToken<AuthTestResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call testAsync(String token, final ApiCallback<AuthTestResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = testValidateBeforeCall(token, _callback);
        Type localVarReturnType = new TypeToken<AuthTestResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class TestRequestBuilder {
        private final String token;

        private TestRequestBuilder(String token) {
            this.token = token;
        }

        /**
         * Build call for test
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standard success response when used with a user token </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Standard failure response when used with an invalid token </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return testCall(token, _callback);
        }


        /**
         * Execute test request
         * @return AuthTestResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standard success response when used with a user token </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Standard failure response when used with an invalid token </td><td>  -  </td></tr>
         </table>
         */
        public AuthTestResponse execute() throws ApiException {
            ApiResponse<AuthTestResponse> localVarResp = testWithHttpInfo(token);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute test request with HTTP info returned
         * @return ApiResponse&lt;AuthTestResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standard success response when used with a user token </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Standard failure response when used with an invalid token </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AuthTestResponse> executeWithHttpInfo() throws ApiException {
            return testWithHttpInfo(token);
        }

        /**
         * Execute test request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Standard success response when used with a user token </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Standard failure response when used with an invalid token </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AuthTestResponse> _callback) throws ApiException {
            return testAsync(token, _callback);
        }
    }

    /**
     * 
     * Checks authentication &amp; identity.
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @return TestRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Standard success response when used with a user token </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Standard failure response when used with an invalid token </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/auth.test"> Documentation</a>
     */
    public TestRequestBuilder test(String token) throws IllegalArgumentException {
        if (token == null) throw new IllegalArgumentException("\"token\" is required but got null");
            

        return new TestRequestBuilder(token);
    }
}
