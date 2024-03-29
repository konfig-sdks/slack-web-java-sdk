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
import com.konfigthis.client.model.AdminconversationsArchiveChannelRequest;
import com.konfigthis.client.model.AdminconversationsArchiveChannelResponse;
import com.konfigthis.client.model.AdminconversationsArchiveChanneldefaultResponse;
import com.konfigthis.client.model.AdminconversationsConvertToPrivateChannelRequest;
import com.konfigthis.client.model.AdminconversationsConvertToPrivateChannelResponse;
import com.konfigthis.client.model.AdminconversationsConvertToPrivateChanneldefaultResponse;
import com.konfigthis.client.model.AdminconversationsCreateChannelBasedConversationRequest;
import com.konfigthis.client.model.AdminconversationsCreateChannelBasedConversationResponse;
import com.konfigthis.client.model.AdminconversationsCreateChannelBasedConversationdefaultResponse;
import com.konfigthis.client.model.AdminconversationsDeleteChannelRequest;
import com.konfigthis.client.model.AdminconversationsDeleteChannelResponse;
import com.konfigthis.client.model.AdminconversationsDeleteChanneldefaultResponse;
import com.konfigthis.client.model.AdminconversationsDisconnectSharedChannelRequest;
import com.konfigthis.client.model.AdminconversationsDisconnectSharedChannelResponse;
import com.konfigthis.client.model.AdminconversationsDisconnectSharedChanneldefaultResponse;
import com.konfigthis.client.model.AdminconversationsGetConversationPrefsResponse;
import com.konfigthis.client.model.AdminconversationsGetConversationPrefsdefaultResponse;
import com.konfigthis.client.model.AdminconversationsGetTeamsListResponse;
import com.konfigthis.client.model.AdminconversationsGetTeamsListdefaultResponse;
import com.konfigthis.client.model.AdminconversationsInviteUserToChannelRequest;
import com.konfigthis.client.model.AdminconversationsInviteUserToChannelResponse;
import com.konfigthis.client.model.AdminconversationsInviteUserToChanneldefaultResponse;
import com.konfigthis.client.model.AdminconversationsRenameChannelRequest;
import com.konfigthis.client.model.AdminconversationsRenameChannelResponse;
import com.konfigthis.client.model.AdminconversationsRenameChanneldefaultResponse;
import com.konfigthis.client.model.AdminconversationsSearchChannelsResponse;
import com.konfigthis.client.model.AdminconversationsSearchChannelsdefaultResponse;
import com.konfigthis.client.model.AdminconversationsSetConversationPrefsRequest;
import com.konfigthis.client.model.AdminconversationsSetConversationPrefsResponse;
import com.konfigthis.client.model.AdminconversationsSetConversationPrefsdefaultResponse;
import com.konfigthis.client.model.AdminconversationsSetTeamsWorkspaceConnectionRequest;
import com.konfigthis.client.model.AdminconversationsSetTeamsWorkspaceConnectionResponse;
import com.konfigthis.client.model.AdminconversationsSetTeamsWorkspaceConnectiondefaultResponse;
import com.konfigthis.client.model.AdminconversationsUnarchiveChannelRequest;
import com.konfigthis.client.model.AdminconversationsUnarchiveChannelResponse;
import com.konfigthis.client.model.AdminconversationsUnarchiveChanneldefaultResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminConversationsApi
 */
@Disabled
public class AdminConversationsApiTest {

    private static AdminConversationsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AdminConversationsApi(apiClient);
    }

    /**
     * Archive a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void archiveChannelTest() throws ApiException {
        String token = null;
        String channelId = null;
        AdminconversationsArchiveChannelResponse response = api.archiveChannel(token, channelId)
                .execute();
        // TODO: test validations
    }

    /**
     * Convert a public channel to a private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void convertToPrivateChannelTest() throws ApiException {
        String token = null;
        String channelId = null;
        AdminconversationsConvertToPrivateChannelResponse response = api.convertToPrivateChannel(token, channelId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a public or private channel-based conversation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createChannelBasedConversationTest() throws ApiException {
        String token = null;
        Boolean isPrivate = null;
        String name = null;
        String description = null;
        Boolean orgWide = null;
        String teamId = null;
        AdminconversationsCreateChannelBasedConversationResponse response = api.createChannelBasedConversation(token, isPrivate, name)
                .description(description)
                .orgWide(orgWide)
                .teamId(teamId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteChannelTest() throws ApiException {
        String token = null;
        String channelId = null;
        AdminconversationsDeleteChannelResponse response = api.deleteChannel(token, channelId)
                .execute();
        // TODO: test validations
    }

    /**
     * Disconnect a connected channel from one or more workspaces.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disconnectSharedChannelTest() throws ApiException {
        String token = null;
        String channelId = null;
        String leavingTeamIds = null;
        AdminconversationsDisconnectSharedChannelResponse response = api.disconnectSharedChannel(token, channelId)
                .leavingTeamIds(leavingTeamIds)
                .execute();
        // TODO: test validations
    }

    /**
     * Get conversation preferences for a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConversationPrefsTest() throws ApiException {
        String token = null;
        String channelId = null;
        AdminconversationsGetConversationPrefsResponse response = api.getConversationPrefs(token, channelId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the workspaces a given public or private channel is connected to within this Enterprise org.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTeamsListTest() throws ApiException {
        String token = null;
        String channelId = null;
        String cursor = null;
        Integer limit = null;
        AdminconversationsGetTeamsListResponse response = api.getTeamsList(token, channelId)
                .cursor(cursor)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Invite a user to a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void inviteUserToChannelTest() throws ApiException {
        String token = null;
        String channelId = null;
        String userIds = null;
        AdminconversationsInviteUserToChannelResponse response = api.inviteUserToChannel(token, channelId, userIds)
                .execute();
        // TODO: test validations
    }

    /**
     * Rename a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void renameChannelTest() throws ApiException {
        String token = null;
        String channelId = null;
        String name = null;
        AdminconversationsRenameChannelResponse response = api.renameChannel(token, channelId, name)
                .execute();
        // TODO: test validations
    }

    /**
     * Search for public or private channels in an Enterprise organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchChannelsTest() throws ApiException {
        String token = null;
        String teamIds = null;
        String query = null;
        Integer limit = null;
        String cursor = null;
        String searchChannelTypes = null;
        String sort = null;
        String sortDir = null;
        AdminconversationsSearchChannelsResponse response = api.searchChannels(token)
                .teamIds(teamIds)
                .query(query)
                .limit(limit)
                .cursor(cursor)
                .searchChannelTypes(searchChannelTypes)
                .sort(sort)
                .sortDir(sortDir)
                .execute();
        // TODO: test validations
    }

    /**
     * Set the posting permissions for a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setConversationPrefsTest() throws ApiException {
        String token = null;
        String channelId = null;
        String prefs = null;
        AdminconversationsSetConversationPrefsResponse response = api.setConversationPrefs(token, channelId, prefs)
                .execute();
        // TODO: test validations
    }

    /**
     * Set the workspaces in an Enterprise grid org that connect to a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setTeamsWorkspaceConnectionTest() throws ApiException {
        String token = null;
        String channelId = null;
        Boolean orgChannel = null;
        String targetTeamIds = null;
        String teamId = null;
        AdminconversationsSetTeamsWorkspaceConnectionResponse response = api.setTeamsWorkspaceConnection(token, channelId)
                .orgChannel(orgChannel)
                .targetTeamIds(targetTeamIds)
                .teamId(teamId)
                .execute();
        // TODO: test validations
    }

    /**
     * Unarchive a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unarchiveChannelTest() throws ApiException {
        String token = null;
        String channelId = null;
        AdminconversationsUnarchiveChannelResponse response = api.unarchiveChannel(token, channelId)
                .execute();
        // TODO: test validations
    }

}
