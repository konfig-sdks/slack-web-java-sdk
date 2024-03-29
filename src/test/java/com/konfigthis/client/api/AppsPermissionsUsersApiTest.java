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
import com.konfigthis.client.model.AppspermissionsusersListUserGrantsResponse;
import com.konfigthis.client.model.AppspermissionsusersListUserGrantsdefaultResponse;
import com.konfigthis.client.model.AppspermissionsusersRequestModalResponse;
import com.konfigthis.client.model.AppspermissionsusersRequestModaldefaultResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppsPermissionsUsersApi
 */
@Disabled
public class AppsPermissionsUsersApiTest {

    private static AppsPermissionsUsersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AppsPermissionsUsersApi(apiClient);
    }

    /**
     * Returns list of user grants and corresponding scopes this app has on a team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserGrantsTest() throws ApiException {
        String token = null;
        String cursor = null;
        Integer limit = null;
        AppspermissionsusersListUserGrantsResponse response = api.listUserGrants(token)
                .cursor(cursor)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Enables an app to trigger a permissions modal to grant an app access to a user access scope.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void requestModalTest() throws ApiException {
        String token = null;
        String scopes = null;
        String triggerId = null;
        String user = null;
        AppspermissionsusersRequestModalResponse response = api.requestModal(token, scopes, triggerId, user)
                .execute();
        // TODO: test validations
    }

}
