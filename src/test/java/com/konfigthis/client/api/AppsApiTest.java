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
import com.konfigthis.client.model.AppsUninstallResponse;
import com.konfigthis.client.model.AppsUninstalldefaultResponse;
import com.konfigthis.client.model.AppseventauthorizationsGetListResponse;
import com.konfigthis.client.model.AppseventauthorizationsGetListdefaultResponse;
import com.konfigthis.client.model.AppspermissionsAdditionalScopesRequestResponse;
import com.konfigthis.client.model.AppspermissionsAdditionalScopesRequestdefaultResponse;
import com.konfigthis.client.model.AppspermissionsListPermissionsResponse;
import com.konfigthis.client.model.AppspermissionsListPermissionsdefaultResponse;
import com.konfigthis.client.model.AppspermissionsresourcesGetResourcesListResponse;
import com.konfigthis.client.model.AppspermissionsresourcesGetResourcesListdefaultResponse;
import com.konfigthis.client.model.AppspermissionsscopesGetListResponse;
import com.konfigthis.client.model.AppspermissionsscopesGetListdefaultResponse;
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
 * API tests for AppsApi
 */
@Disabled
public class AppsApiTest {

    private static AppsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AppsApi(apiClient);
    }

    /**
     * Allows an app to request additional scopes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void additionalScopesRequestTest() throws ApiException {
        String token = null;
        String scopes = null;
        String triggerId = null;
        AppspermissionsAdditionalScopesRequestResponse response = api.additionalScopesRequest(token, scopes, triggerId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a list of authorizations for the given event context. Each authorization represents an app installation that the event is visible to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        String token = null;
        String eventContext = null;
        String cursor = null;
        Integer limit = null;
        AppseventauthorizationsGetListResponse response = api.getList(token, eventContext)
                .cursor(cursor)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns list of scopes this app has on a team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getList_0Test() throws ApiException {
        String token = null;
        AppspermissionsscopesGetListResponse response = api.getList_0(token)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns list of resource grants this app has on a team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResourcesListTest() throws ApiException {
        String token = null;
        String cursor = null;
        Integer limit = null;
        AppspermissionsresourcesGetResourcesListResponse response = api.getResourcesList(token)
                .cursor(cursor)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns list of permissions this app has on a team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPermissionsTest() throws ApiException {
        String token = null;
        AppspermissionsListPermissionsResponse response = api.listPermissions()
                .token(token)
                .execute();
        // TODO: test validations
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

    /**
     * Uninstalls your app from a workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uninstallTest() throws ApiException {
        String token = null;
        String clientId = null;
        String clientSecret = null;
        AppsUninstallResponse response = api.uninstall()
                .token(token)
                .clientId(clientId)
                .clientSecret(clientSecret)
                .execute();
        // TODO: test validations
    }

}
