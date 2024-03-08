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
import com.konfigthis.client.model.AdminappsApproveAppInstallationRequest;
import com.konfigthis.client.model.AdminappsApproveAppInstallationResponse;
import com.konfigthis.client.model.AdminappsApproveAppInstallationdefaultResponse;
import com.konfigthis.client.model.AdminappsRestrictAppRequest;
import com.konfigthis.client.model.AdminappsRestrictAppResponse;
import com.konfigthis.client.model.AdminappsRestrictAppdefaultResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminAppsApi
 */
@Disabled
public class AdminAppsApiTest {

    private static AdminAppsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AdminAppsApi(apiClient);
    }

    /**
     * Approve an app for installation on a workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void approveAppInstallationTest() throws ApiException {
        String token = null;
        String appId = null;
        String requestId = null;
        String teamId = null;
        AdminappsApproveAppInstallationResponse response = api.approveAppInstallation(token)
                .appId(appId)
                .requestId(requestId)
                .teamId(teamId)
                .execute();
        // TODO: test validations
    }

    /**
     * Restrict an app for installation on a workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void restrictAppTest() throws ApiException {
        String token = null;
        String appId = null;
        String requestId = null;
        String teamId = null;
        AdminappsRestrictAppResponse response = api.restrictApp(token)
                .appId(appId)
                .requestId(requestId)
                .teamId(teamId)
                .execute();
        // TODO: test validations
    }

}
