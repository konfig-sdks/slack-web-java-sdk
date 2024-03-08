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
import com.konfigthis.client.model.AdminteamsadminsGetAllResponse;
import com.konfigthis.client.model.AdminteamsadminsGetAlldefaultResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminTeamsAdminsApi
 */
@Disabled
public class AdminTeamsAdminsApiTest {

    private static AdminTeamsAdminsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AdminTeamsAdminsApi(apiClient);
    }

    /**
     * List all of the admins on a given workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        String token = null;
        String teamId = null;
        Integer limit = null;
        String cursor = null;
        AdminteamsadminsGetAllResponse response = api.getAll(token, teamId)
                .limit(limit)
                .cursor(cursor)
                .execute();
        // TODO: test validations
    }

}
