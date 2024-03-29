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


import com.konfigthis.client.model.SearchMessagesResponse;
import com.konfigthis.client.model.SearchMessagesdefaultResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SearchApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SearchApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call messagesCall(String token, String query, Integer count, Boolean highlight, Integer page, String sort, String sortDir, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/search.messages";

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

        if (highlight != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("highlight", highlight));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (query != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query", query));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (sortDir != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort_dir", sortDir));
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
    private okhttp3.Call messagesValidateBeforeCall(String token, String query, Integer count, Boolean highlight, Integer page, String sort, String sortDir, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling messages(Async)");
        }

        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling messages(Async)");
        }

        return messagesCall(token, query, count, highlight, page, sort, sortDir, _callback);

    }


    private ApiResponse<SearchMessagesResponse> messagesWithHttpInfo(String token, String query, Integer count, Boolean highlight, Integer page, String sort, String sortDir) throws ApiException {
        okhttp3.Call localVarCall = messagesValidateBeforeCall(token, query, count, highlight, page, sort, sortDir, null);
        Type localVarReturnType = new TypeToken<SearchMessagesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call messagesAsync(String token, String query, Integer count, Boolean highlight, Integer page, String sort, String sortDir, final ApiCallback<SearchMessagesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = messagesValidateBeforeCall(token, query, count, highlight, page, sort, sortDir, _callback);
        Type localVarReturnType = new TypeToken<SearchMessagesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class MessagesRequestBuilder {
        private final String token;
        private final String query;
        private Integer count;
        private Boolean highlight;
        private Integer page;
        private String sort;
        private String sortDir;

        private MessagesRequestBuilder(String token, String query) {
            this.token = token;
            this.query = query;
        }

        /**
         * Set count
         * @param count Pass the number of results you want per \&quot;page\&quot;. Maximum of &#x60;100&#x60;. (optional)
         * @return MessagesRequestBuilder
         */
        public MessagesRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }
        
        /**
         * Set highlight
         * @param highlight Pass a value of &#x60;true&#x60; to enable query highlight markers (see below). (optional)
         * @return MessagesRequestBuilder
         */
        public MessagesRequestBuilder highlight(Boolean highlight) {
            this.highlight = highlight;
            return this;
        }
        
        /**
         * Set page
         * @param page  (optional)
         * @return MessagesRequestBuilder
         */
        public MessagesRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set sort
         * @param sort Return matches sorted by either &#x60;score&#x60; or &#x60;timestamp&#x60;. (optional)
         * @return MessagesRequestBuilder
         */
        public MessagesRequestBuilder sort(String sort) {
            this.sort = sort;
            return this;
        }
        
        /**
         * Set sortDir
         * @param sortDir Change sort direction to ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). (optional)
         * @return MessagesRequestBuilder
         */
        public MessagesRequestBuilder sortDir(String sortDir) {
            this.sortDir = sortDir;
            return this;
        }
        
        /**
         * Build call for messages
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
            return messagesCall(token, query, count, highlight, page, sort, sortDir, _callback);
        }


        /**
         * Execute messages request
         * @return SearchMessagesResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public SearchMessagesResponse execute() throws ApiException {
            ApiResponse<SearchMessagesResponse> localVarResp = messagesWithHttpInfo(token, query, count, highlight, page, sort, sortDir);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute messages request with HTTP info returned
         * @return ApiResponse&lt;SearchMessagesResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SearchMessagesResponse> executeWithHttpInfo() throws ApiException {
            return messagesWithHttpInfo(token, query, count, highlight, page, sort, sortDir);
        }

        /**
         * Execute messages request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<SearchMessagesResponse> _callback) throws ApiException {
            return messagesAsync(token, query, count, highlight, page, sort, sortDir, _callback);
        }
    }

    /**
     * 
     * Searches for messages matching a query.
     * @param token Authentication token. Requires scope: &#x60;search:read&#x60; (required)
     * @param query Search query. (required)
     * @return MessagesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/search.messages"> Documentation</a>
     */
    public MessagesRequestBuilder messages(String token, String query) throws IllegalArgumentException {
        if (token == null) throw new IllegalArgumentException("\"token\" is required but got null");
            

        if (query == null) throw new IllegalArgumentException("\"query\" is required but got null");
            

        return new MessagesRequestBuilder(token, query);
    }
}
