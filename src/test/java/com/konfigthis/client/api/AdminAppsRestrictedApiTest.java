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
import com.konfigthis.client.model.AdminappsrestrictedGetListResponse;
import com.konfigthis.client.model.AdminappsrestrictedGetListdefaultResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminAppsRestrictedApi
 */
@Disabled
public class AdminAppsRestrictedApiTest {

    private static AdminAppsRestrictedApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AdminAppsRestrictedApi(apiClient);
    }

    /**
     * List restricted apps for an org or workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        String token = null;
        Integer limit = null;
        String cursor = null;
        String teamId = null;
        String enterpriseId = null;
        AdminappsrestrictedGetListResponse response = api.getList(token)
                .limit(limit)
                .cursor(cursor)
                .teamId(teamId)
                .enterpriseId(enterpriseId)
                .execute();
        // TODO: test validations
    }

}
