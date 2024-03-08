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
import com.konfigthis.client.model.AppspermissionsscopesGetListResponse;
import com.konfigthis.client.model.AppspermissionsscopesGetListdefaultResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppsPermissionsScopesApi
 */
@Disabled
public class AppsPermissionsScopesApiTest {

    private static AppsPermissionsScopesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AppsPermissionsScopesApi(apiClient);
    }

    /**
     * Returns list of scopes this app has on a team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        String token = null;
        AppspermissionsscopesGetListResponse response = api.getList(token)
                .execute();
        // TODO: test validations
    }

}
