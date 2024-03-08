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


import com.konfigthis.client.model.AdminappsApproveAppInstallationRequest;
import com.konfigthis.client.model.AdminappsApproveAppInstallationResponse;
import com.konfigthis.client.model.AdminappsApproveAppInstallationdefaultResponse;
import com.konfigthis.client.model.AdminappsRestrictAppRequest;
import com.konfigthis.client.model.AdminappsRestrictAppResponse;
import com.konfigthis.client.model.AdminappsRestrictAppdefaultResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AdminAppsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AdminAppsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AdminAppsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call approveAppInstallationCall(String token, String appId, String requestId, String teamId, AdminappsApproveAppInstallationRequest adminappsApproveAppInstallationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = adminappsApproveAppInstallationRequest;

        // create path and map variables
        String localVarPath = "/admin.apps.approve";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (appId != null) {
            localVarFormParams.put("app_id", appId);
        }

        if (requestId != null) {
            localVarFormParams.put("request_id", requestId);
        }

        if (teamId != null) {
            localVarFormParams.put("team_id", teamId);
        }

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
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "slackAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call approveAppInstallationValidateBeforeCall(String token, String appId, String requestId, String teamId, AdminappsApproveAppInstallationRequest adminappsApproveAppInstallationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling approveAppInstallation(Async)");
        }

        return approveAppInstallationCall(token, appId, requestId, teamId, adminappsApproveAppInstallationRequest, _callback);

    }


    private ApiResponse<AdminappsApproveAppInstallationResponse> approveAppInstallationWithHttpInfo(String token, String appId, String requestId, String teamId, AdminappsApproveAppInstallationRequest adminappsApproveAppInstallationRequest) throws ApiException {
        okhttp3.Call localVarCall = approveAppInstallationValidateBeforeCall(token, appId, requestId, teamId, adminappsApproveAppInstallationRequest, null);
        Type localVarReturnType = new TypeToken<AdminappsApproveAppInstallationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call approveAppInstallationAsync(String token, String appId, String requestId, String teamId, AdminappsApproveAppInstallationRequest adminappsApproveAppInstallationRequest, final ApiCallback<AdminappsApproveAppInstallationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = approveAppInstallationValidateBeforeCall(token, appId, requestId, teamId, adminappsApproveAppInstallationRequest, _callback);
        Type localVarReturnType = new TypeToken<AdminappsApproveAppInstallationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ApproveAppInstallationRequestBuilder {
        private final String token;
        private String appId;
        private String requestId;
        private String teamId;

        private ApproveAppInstallationRequestBuilder(String token) {
            this.token = token;
        }

        /**
         * Set appId
         * @param appId The id of the app to approve. (optional)
         * @return ApproveAppInstallationRequestBuilder
         */
        public ApproveAppInstallationRequestBuilder appId(String appId) {
            this.appId = appId;
            return this;
        }
        
        /**
         * Set requestId
         * @param requestId The id of the request to approve. (optional)
         * @return ApproveAppInstallationRequestBuilder
         */
        public ApproveAppInstallationRequestBuilder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        
        /**
         * Set teamId
         * @param teamId  (optional)
         * @return ApproveAppInstallationRequestBuilder
         */
        public ApproveAppInstallationRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        
        /**
         * Build call for approveAppInstallation
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
            AdminappsApproveAppInstallationRequest adminappsApproveAppInstallationRequest = buildBodyParams();
            return approveAppInstallationCall(token, appId, requestId, teamId, adminappsApproveAppInstallationRequest, _callback);
        }

        private AdminappsApproveAppInstallationRequest buildBodyParams() {
            AdminappsApproveAppInstallationRequest adminappsApproveAppInstallationRequest = new AdminappsApproveAppInstallationRequest();
            adminappsApproveAppInstallationRequest.appId(this.appId);
            adminappsApproveAppInstallationRequest.requestId(this.requestId);
            adminappsApproveAppInstallationRequest.teamId(this.teamId);
            return adminappsApproveAppInstallationRequest;
        }

        /**
         * Execute approveAppInstallation request
         * @return AdminappsApproveAppInstallationResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public AdminappsApproveAppInstallationResponse execute() throws ApiException {
            AdminappsApproveAppInstallationRequest adminappsApproveAppInstallationRequest = buildBodyParams();
            ApiResponse<AdminappsApproveAppInstallationResponse> localVarResp = approveAppInstallationWithHttpInfo(token, appId, requestId, teamId, adminappsApproveAppInstallationRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute approveAppInstallation request with HTTP info returned
         * @return ApiResponse&lt;AdminappsApproveAppInstallationResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AdminappsApproveAppInstallationResponse> executeWithHttpInfo() throws ApiException {
            AdminappsApproveAppInstallationRequest adminappsApproveAppInstallationRequest = buildBodyParams();
            return approveAppInstallationWithHttpInfo(token, appId, requestId, teamId, adminappsApproveAppInstallationRequest);
        }

        /**
         * Execute approveAppInstallation request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<AdminappsApproveAppInstallationResponse> _callback) throws ApiException {
            AdminappsApproveAppInstallationRequest adminappsApproveAppInstallationRequest = buildBodyParams();
            return approveAppInstallationAsync(token, appId, requestId, teamId, adminappsApproveAppInstallationRequest, _callback);
        }
    }

    /**
     * 
     * Approve an app for installation on a workspace.
     * @param token Authentication token. Requires scope: &#x60;admin.apps:write&#x60; (required)
     * @return ApproveAppInstallationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/admin.apps.approve"> Documentation</a>
     */
    public ApproveAppInstallationRequestBuilder approveAppInstallation(String token) throws IllegalArgumentException {
        if (token == null) throw new IllegalArgumentException("\"token\" is required but got null");
            

        return new ApproveAppInstallationRequestBuilder(token);
    }
    private okhttp3.Call restrictAppCall(String token, String appId, String requestId, String teamId, AdminappsRestrictAppRequest adminappsRestrictAppRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = adminappsRestrictAppRequest;

        // create path and map variables
        String localVarPath = "/admin.apps.restrict";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (appId != null) {
            localVarFormParams.put("app_id", appId);
        }

        if (requestId != null) {
            localVarFormParams.put("request_id", requestId);
        }

        if (teamId != null) {
            localVarFormParams.put("team_id", teamId);
        }

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
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "slackAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call restrictAppValidateBeforeCall(String token, String appId, String requestId, String teamId, AdminappsRestrictAppRequest adminappsRestrictAppRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling restrictApp(Async)");
        }

        return restrictAppCall(token, appId, requestId, teamId, adminappsRestrictAppRequest, _callback);

    }


    private ApiResponse<AdminappsRestrictAppResponse> restrictAppWithHttpInfo(String token, String appId, String requestId, String teamId, AdminappsRestrictAppRequest adminappsRestrictAppRequest) throws ApiException {
        okhttp3.Call localVarCall = restrictAppValidateBeforeCall(token, appId, requestId, teamId, adminappsRestrictAppRequest, null);
        Type localVarReturnType = new TypeToken<AdminappsRestrictAppResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call restrictAppAsync(String token, String appId, String requestId, String teamId, AdminappsRestrictAppRequest adminappsRestrictAppRequest, final ApiCallback<AdminappsRestrictAppResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = restrictAppValidateBeforeCall(token, appId, requestId, teamId, adminappsRestrictAppRequest, _callback);
        Type localVarReturnType = new TypeToken<AdminappsRestrictAppResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class RestrictAppRequestBuilder {
        private final String token;
        private String appId;
        private String requestId;
        private String teamId;

        private RestrictAppRequestBuilder(String token) {
            this.token = token;
        }

        /**
         * Set appId
         * @param appId The id of the app to restrict. (optional)
         * @return RestrictAppRequestBuilder
         */
        public RestrictAppRequestBuilder appId(String appId) {
            this.appId = appId;
            return this;
        }
        
        /**
         * Set requestId
         * @param requestId The id of the request to restrict. (optional)
         * @return RestrictAppRequestBuilder
         */
        public RestrictAppRequestBuilder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        
        /**
         * Set teamId
         * @param teamId  (optional)
         * @return RestrictAppRequestBuilder
         */
        public RestrictAppRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        
        /**
         * Build call for restrictApp
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
            AdminappsRestrictAppRequest adminappsRestrictAppRequest = buildBodyParams();
            return restrictAppCall(token, appId, requestId, teamId, adminappsRestrictAppRequest, _callback);
        }

        private AdminappsRestrictAppRequest buildBodyParams() {
            AdminappsRestrictAppRequest adminappsRestrictAppRequest = new AdminappsRestrictAppRequest();
            adminappsRestrictAppRequest.appId(this.appId);
            adminappsRestrictAppRequest.requestId(this.requestId);
            adminappsRestrictAppRequest.teamId(this.teamId);
            return adminappsRestrictAppRequest;
        }

        /**
         * Execute restrictApp request
         * @return AdminappsRestrictAppResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public AdminappsRestrictAppResponse execute() throws ApiException {
            AdminappsRestrictAppRequest adminappsRestrictAppRequest = buildBodyParams();
            ApiResponse<AdminappsRestrictAppResponse> localVarResp = restrictAppWithHttpInfo(token, appId, requestId, teamId, adminappsRestrictAppRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute restrictApp request with HTTP info returned
         * @return ApiResponse&lt;AdminappsRestrictAppResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AdminappsRestrictAppResponse> executeWithHttpInfo() throws ApiException {
            AdminappsRestrictAppRequest adminappsRestrictAppRequest = buildBodyParams();
            return restrictAppWithHttpInfo(token, appId, requestId, teamId, adminappsRestrictAppRequest);
        }

        /**
         * Execute restrictApp request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<AdminappsRestrictAppResponse> _callback) throws ApiException {
            AdminappsRestrictAppRequest adminappsRestrictAppRequest = buildBodyParams();
            return restrictAppAsync(token, appId, requestId, teamId, adminappsRestrictAppRequest, _callback);
        }
    }

    /**
     * 
     * Restrict an app for installation on a workspace.
     * @param token Authentication token. Requires scope: &#x60;admin.apps:write&#x60; (required)
     * @return RestrictAppRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/admin.apps.restrict"> Documentation</a>
     */
    public RestrictAppRequestBuilder restrictApp(String token) throws IllegalArgumentException {
        if (token == null) throw new IllegalArgumentException("\"token\" is required but got null");
            

        return new RestrictAppRequestBuilder(token);
    }
}