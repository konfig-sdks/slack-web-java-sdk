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


import com.konfigthis.client.model.StarsAddRequest;
import com.konfigthis.client.model.StarsAddResponse;
import com.konfigthis.client.model.StarsAdddefaultResponse;
import com.konfigthis.client.model.StarsListResponse;
import com.konfigthis.client.model.StarsListdefaultResponse;
import com.konfigthis.client.model.StarsRemoveRequest;
import com.konfigthis.client.model.StarsRemoveResponse;
import com.konfigthis.client.model.StarsRemovedefaultResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class StarsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public StarsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call addCall(String token, String channel, String _file, String fileComment, String timestamp, StarsAddRequest starsAddRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = starsAddRequest;

        // create path and map variables
        String localVarPath = "/stars.add";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (channel != null) {
            localVarFormParams.put("channel", channel);
        }

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (fileComment != null) {
            localVarFormParams.put("file_comment", fileComment);
        }

        if (timestamp != null) {
            localVarFormParams.put("timestamp", timestamp);
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
    private okhttp3.Call addValidateBeforeCall(String token, String channel, String _file, String fileComment, String timestamp, StarsAddRequest starsAddRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling add(Async)");
        }

        return addCall(token, channel, _file, fileComment, timestamp, starsAddRequest, _callback);

    }


    private ApiResponse<StarsAddResponse> addWithHttpInfo(String token, String channel, String _file, String fileComment, String timestamp, StarsAddRequest starsAddRequest) throws ApiException {
        okhttp3.Call localVarCall = addValidateBeforeCall(token, channel, _file, fileComment, timestamp, starsAddRequest, null);
        Type localVarReturnType = new TypeToken<StarsAddResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call addAsync(String token, String channel, String _file, String fileComment, String timestamp, StarsAddRequest starsAddRequest, final ApiCallback<StarsAddResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = addValidateBeforeCall(token, channel, _file, fileComment, timestamp, starsAddRequest, _callback);
        Type localVarReturnType = new TypeToken<StarsAddResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class AddRequestBuilder {
        private final String token;
        private String channel;
        private String _file;
        private String fileComment;
        private String timestamp;

        private AddRequestBuilder(String token) {
            this.token = token;
        }

        /**
         * Set channel
         * @param channel Channel to add star to, or channel where the message to add star to was posted (used with &#x60;timestamp&#x60;). (optional)
         * @return AddRequestBuilder
         */
        public AddRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }
        
        /**
         * Set _file
         * @param _file File to add star to. (optional)
         * @return AddRequestBuilder
         */
        public AddRequestBuilder _file(String _file) {
            this._file = _file;
            return this;
        }
        
        /**
         * Set fileComment
         * @param fileComment File comment to add star to. (optional)
         * @return AddRequestBuilder
         */
        public AddRequestBuilder fileComment(String fileComment) {
            this.fileComment = fileComment;
            return this;
        }
        
        /**
         * Set timestamp
         * @param timestamp Timestamp of the message to add star to. (optional)
         * @return AddRequestBuilder
         */
        public AddRequestBuilder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        
        /**
         * Build call for add
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
            StarsAddRequest starsAddRequest = buildBodyParams();
            return addCall(token, channel, _file, fileComment, timestamp, starsAddRequest, _callback);
        }

        private StarsAddRequest buildBodyParams() {
            StarsAddRequest starsAddRequest = new StarsAddRequest();
            starsAddRequest.channel(this.channel);
            starsAddRequest._file(this._file);
            starsAddRequest.fileComment(this.fileComment);
            starsAddRequest.timestamp(this.timestamp);
            return starsAddRequest;
        }

        /**
         * Execute add request
         * @return StarsAddResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public StarsAddResponse execute() throws ApiException {
            StarsAddRequest starsAddRequest = buildBodyParams();
            ApiResponse<StarsAddResponse> localVarResp = addWithHttpInfo(token, channel, _file, fileComment, timestamp, starsAddRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute add request with HTTP info returned
         * @return ApiResponse&lt;StarsAddResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<StarsAddResponse> executeWithHttpInfo() throws ApiException {
            StarsAddRequest starsAddRequest = buildBodyParams();
            return addWithHttpInfo(token, channel, _file, fileComment, timestamp, starsAddRequest);
        }

        /**
         * Execute add request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<StarsAddResponse> _callback) throws ApiException {
            StarsAddRequest starsAddRequest = buildBodyParams();
            return addAsync(token, channel, _file, fileComment, timestamp, starsAddRequest, _callback);
        }
    }

    /**
     * 
     * Adds a star to an item.
     * @param token Authentication token. Requires scope: &#x60;stars:write&#x60; (required)
     * @return AddRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/stars.add"> Documentation</a>
     */
    public AddRequestBuilder add(String token) throws IllegalArgumentException {
        if (token == null) throw new IllegalArgumentException("\"token\" is required but got null");
            

        return new AddRequestBuilder(token);
    }
    private okhttp3.Call listCall(String token, String count, String page, String cursor, Integer limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/stars.list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call listValidateBeforeCall(String token, String count, String page, String cursor, Integer limit, final ApiCallback _callback) throws ApiException {
        return listCall(token, count, page, cursor, limit, _callback);

    }


    private ApiResponse<StarsListResponse> listWithHttpInfo(String token, String count, String page, String cursor, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(token, count, page, cursor, limit, null);
        Type localVarReturnType = new TypeToken<StarsListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(String token, String count, String page, String cursor, Integer limit, final ApiCallback<StarsListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(token, count, page, cursor, limit, _callback);
        Type localVarReturnType = new TypeToken<StarsListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private String token;
        private String count;
        private String page;
        private String cursor;
        private Integer limit;

        private ListRequestBuilder() {
        }

        /**
         * Set token
         * @param token Authentication token. Requires scope: &#x60;stars:read&#x60; (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }
        
        /**
         * Set count
         * @param count  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder count(String count) {
            this.count = count;
            return this;
        }
        
        /**
         * Set page
         * @param page  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder page(String page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set cursor
         * @param cursor Parameter for pagination. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection. See [pagination](https://slack.dev) for more details. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
        
        /**
         * Set limit
         * @param limit The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Build call for list
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
            return listCall(token, count, page, cursor, limit, _callback);
        }


        /**
         * Execute list request
         * @return StarsListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public StarsListResponse execute() throws ApiException {
            ApiResponse<StarsListResponse> localVarResp = listWithHttpInfo(token, count, page, cursor, limit);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;StarsListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<StarsListResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(token, count, page, cursor, limit);
        }

        /**
         * Execute list request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<StarsListResponse> _callback) throws ApiException {
            return listAsync(token, count, page, cursor, limit, _callback);
        }
    }

    /**
     * 
     * Lists stars for a user.
     * @return ListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/stars.list"> Documentation</a>
     */
    public ListRequestBuilder list() throws IllegalArgumentException {
        return new ListRequestBuilder();
    }
    private okhttp3.Call removeCall(String token, String channel, String _file, String fileComment, String timestamp, StarsRemoveRequest starsRemoveRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = starsRemoveRequest;

        // create path and map variables
        String localVarPath = "/stars.remove";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (channel != null) {
            localVarFormParams.put("channel", channel);
        }

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (fileComment != null) {
            localVarFormParams.put("file_comment", fileComment);
        }

        if (timestamp != null) {
            localVarFormParams.put("timestamp", timestamp);
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
    private okhttp3.Call removeValidateBeforeCall(String token, String channel, String _file, String fileComment, String timestamp, StarsRemoveRequest starsRemoveRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling remove(Async)");
        }

        return removeCall(token, channel, _file, fileComment, timestamp, starsRemoveRequest, _callback);

    }


    private ApiResponse<StarsRemoveResponse> removeWithHttpInfo(String token, String channel, String _file, String fileComment, String timestamp, StarsRemoveRequest starsRemoveRequest) throws ApiException {
        okhttp3.Call localVarCall = removeValidateBeforeCall(token, channel, _file, fileComment, timestamp, starsRemoveRequest, null);
        Type localVarReturnType = new TypeToken<StarsRemoveResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call removeAsync(String token, String channel, String _file, String fileComment, String timestamp, StarsRemoveRequest starsRemoveRequest, final ApiCallback<StarsRemoveResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeValidateBeforeCall(token, channel, _file, fileComment, timestamp, starsRemoveRequest, _callback);
        Type localVarReturnType = new TypeToken<StarsRemoveResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class RemoveRequestBuilder {
        private final String token;
        private String channel;
        private String _file;
        private String fileComment;
        private String timestamp;

        private RemoveRequestBuilder(String token) {
            this.token = token;
        }

        /**
         * Set channel
         * @param channel Channel to remove star from, or channel where the message to remove star from was posted (used with &#x60;timestamp&#x60;). (optional)
         * @return RemoveRequestBuilder
         */
        public RemoveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }
        
        /**
         * Set _file
         * @param _file File to remove star from. (optional)
         * @return RemoveRequestBuilder
         */
        public RemoveRequestBuilder _file(String _file) {
            this._file = _file;
            return this;
        }
        
        /**
         * Set fileComment
         * @param fileComment File comment to remove star from. (optional)
         * @return RemoveRequestBuilder
         */
        public RemoveRequestBuilder fileComment(String fileComment) {
            this.fileComment = fileComment;
            return this;
        }
        
        /**
         * Set timestamp
         * @param timestamp Timestamp of the message to remove star from. (optional)
         * @return RemoveRequestBuilder
         */
        public RemoveRequestBuilder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        
        /**
         * Build call for remove
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
            StarsRemoveRequest starsRemoveRequest = buildBodyParams();
            return removeCall(token, channel, _file, fileComment, timestamp, starsRemoveRequest, _callback);
        }

        private StarsRemoveRequest buildBodyParams() {
            StarsRemoveRequest starsRemoveRequest = new StarsRemoveRequest();
            starsRemoveRequest.channel(this.channel);
            starsRemoveRequest._file(this._file);
            starsRemoveRequest.fileComment(this.fileComment);
            starsRemoveRequest.timestamp(this.timestamp);
            return starsRemoveRequest;
        }

        /**
         * Execute remove request
         * @return StarsRemoveResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public StarsRemoveResponse execute() throws ApiException {
            StarsRemoveRequest starsRemoveRequest = buildBodyParams();
            ApiResponse<StarsRemoveResponse> localVarResp = removeWithHttpInfo(token, channel, _file, fileComment, timestamp, starsRemoveRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute remove request with HTTP info returned
         * @return ApiResponse&lt;StarsRemoveResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<StarsRemoveResponse> executeWithHttpInfo() throws ApiException {
            StarsRemoveRequest starsRemoveRequest = buildBodyParams();
            return removeWithHttpInfo(token, channel, _file, fileComment, timestamp, starsRemoveRequest);
        }

        /**
         * Execute remove request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<StarsRemoveResponse> _callback) throws ApiException {
            StarsRemoveRequest starsRemoveRequest = buildBodyParams();
            return removeAsync(token, channel, _file, fileComment, timestamp, starsRemoveRequest, _callback);
        }
    }

    /**
     * 
     * Removes a star from an item.
     * @param token Authentication token. Requires scope: &#x60;stars:write&#x60; (required)
     * @return RemoveRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/stars.remove"> Documentation</a>
     */
    public RemoveRequestBuilder remove(String token) throws IllegalArgumentException {
        if (token == null) throw new IllegalArgumentException("\"token\" is required but got null");
            

        return new RemoveRequestBuilder(token);
    }
}
