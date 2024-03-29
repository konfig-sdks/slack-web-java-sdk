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
import com.konfigthis.client.model.AdminusergroupsAddDefaultChannelsRequest;
import com.konfigthis.client.model.AdminusergroupsAddDefaultChannelsResponse;
import com.konfigthis.client.model.AdminusergroupsAddDefaultChannelsdefaultResponse;
import com.konfigthis.client.model.AdminusergroupsAssociateDefaultWorkspacesRequest;
import com.konfigthis.client.model.AdminusergroupsAssociateDefaultWorkspacesResponse;
import com.konfigthis.client.model.AdminusergroupsAssociateDefaultWorkspacesdefaultResponse;
import com.konfigthis.client.model.AdminusergroupsListChannelsGetResponse;
import com.konfigthis.client.model.AdminusergroupsListChannelsGetdefaultResponse;
import com.konfigthis.client.model.AdminusergroupsRemoveChannelsRequest;
import com.konfigthis.client.model.AdminusergroupsRemoveChannelsResponse;
import com.konfigthis.client.model.AdminusergroupsRemoveChannelsdefaultResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminUsergroupsApi
 */
@Disabled
public class AdminUsergroupsApiTest {

    private static AdminUsergroupsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AdminUsergroupsApi(apiClient);
    }

    /**
     * Add one or more default channels to an IDP group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addDefaultChannelsTest() throws ApiException {
        String token = null;
        String channelIds = null;
        String usergroupId = null;
        String teamId = null;
        AdminusergroupsAddDefaultChannelsResponse response = api.addDefaultChannels(token, channelIds, usergroupId)
                .teamId(teamId)
                .execute();
        // TODO: test validations
    }

    /**
     * Associate one or more default workspaces with an organization-wide IDP group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void associateDefaultWorkspacesTest() throws ApiException {
        String token = null;
        String teamIds = null;
        String usergroupId = null;
        Boolean autoProvision = null;
        AdminusergroupsAssociateDefaultWorkspacesResponse response = api.associateDefaultWorkspaces(token, teamIds, usergroupId)
                .autoProvision(autoProvision)
                .execute();
        // TODO: test validations
    }

    /**
     * List the channels linked to an org-level IDP group (user group).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listChannelsGetTest() throws ApiException {
        String token = null;
        String usergroupId = null;
        String teamId = null;
        Boolean includeNumMembers = null;
        AdminusergroupsListChannelsGetResponse response = api.listChannelsGet(token, usergroupId)
                .teamId(teamId)
                .includeNumMembers(includeNumMembers)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove one or more default channels from an org-level IDP group (user group).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeChannelsTest() throws ApiException {
        String token = null;
        String channelIds = null;
        String usergroupId = null;
        AdminusergroupsRemoveChannelsResponse response = api.removeChannels(token, channelIds, usergroupId)
                .execute();
        // TODO: test validations
    }

}
