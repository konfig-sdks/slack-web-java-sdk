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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ViewsOpenResponse;
import com.konfigthis.client.model.ViewsOpendefaultResponse;
import com.konfigthis.client.model.ViewsPublishResponse;
import com.konfigthis.client.model.ViewsPublishdefaultResponse;
import com.konfigthis.client.model.ViewsPushResponse;
import com.konfigthis.client.model.ViewsPushdefaultResponse;
import com.konfigthis.client.model.ViewsUpdateResponse;
import com.konfigthis.client.model.ViewsUpdatedefaultResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ViewsApi
 */
@Disabled
public class ViewsApiTest {

    private static ViewsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ViewsApi(apiClient);
    }

    /**
     * Open a view for a user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void openTest() throws ApiException {
        String token = null;
        String triggerId = null;
        String view = null;
        ViewsOpenResponse response = api.open(token, triggerId, view)
                .execute();
        // TODO: test validations
    }

    /**
     * Publish a static view for a User.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void publishTest() throws ApiException {
        String token = null;
        String userId = null;
        String view = null;
        String hash = null;
        ViewsPublishResponse response = api.publish(token, userId, view)
                .hash(hash)
                .execute();
        // TODO: test validations
    }

    /**
     * Push a view onto the stack of a root view.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pushTest() throws ApiException {
        String token = null;
        String triggerId = null;
        String view = null;
        ViewsPushResponse response = api.push(token, triggerId, view)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing view.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        String token = null;
        String viewId = null;
        String externalId = null;
        String view = null;
        String hash = null;
        ViewsUpdateResponse response = api.update(token)
                .viewId(viewId)
                .externalId(externalId)
                .view(view)
                .hash(hash)
                .execute();
        // TODO: test validations
    }

}
