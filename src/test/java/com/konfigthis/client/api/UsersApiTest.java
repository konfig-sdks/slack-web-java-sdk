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
import com.konfigthis.client.model.UsersConversationsResponse;
import com.konfigthis.client.model.UsersConversationsdefaultResponse;
import com.konfigthis.client.model.UsersDeletePhotoRequest;
import com.konfigthis.client.model.UsersDeletePhotoResponse;
import com.konfigthis.client.model.UsersDeletePhotodefaultResponse;
import com.konfigthis.client.model.UsersGetPresenceResponse;
import com.konfigthis.client.model.UsersGetPresencedefaultResponse;
import com.konfigthis.client.model.UsersIdentityResponseInner;
import com.konfigthis.client.model.UsersIdentitydefaultResponse;
import com.konfigthis.client.model.UsersInfoResponse;
import com.konfigthis.client.model.UsersInfodefaultResponse;
import com.konfigthis.client.model.UsersListResponse;
import com.konfigthis.client.model.UsersListdefaultResponse;
import com.konfigthis.client.model.UsersLookupByEmailResponse;
import com.konfigthis.client.model.UsersLookupByEmaildefaultResponse;
import com.konfigthis.client.model.UsersSetActiveResponse;
import com.konfigthis.client.model.UsersSetActivedefaultResponse;
import com.konfigthis.client.model.UsersSetPhotoRequest;
import com.konfigthis.client.model.UsersSetPhotoResponse;
import com.konfigthis.client.model.UsersSetPhotodefaultResponse;
import com.konfigthis.client.model.UsersSetPresenceRequest;
import com.konfigthis.client.model.UsersSetPresenceResponse;
import com.konfigthis.client.model.UsersSetPresencedefaultResponse;
import com.konfigthis.client.model.UsersprofileGetProfileInfoResponse;
import com.konfigthis.client.model.UsersprofileGetProfileInfodefaultResponse;
import com.konfigthis.client.model.UsersprofileSetProfileInfoRequest;
import com.konfigthis.client.model.UsersprofileSetProfileInfoResponse;
import com.konfigthis.client.model.UsersprofileSetProfileInfodefaultResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Disabled
public class UsersApiTest {

    private static UsersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UsersApi(apiClient);
    }

    /**
     * List conversations the calling user may access.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsTest() throws ApiException {
        String token = null;
        String user = null;
        String types = null;
        Boolean excludeArchived = null;
        Integer limit = null;
        String cursor = null;
        UsersConversationsResponse response = api.conversations()
                .token(token)
                .user(user)
                .types(types)
                .excludeArchived(excludeArchived)
                .limit(limit)
                .cursor(cursor)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete the user profile photo
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePhotoTest() throws ApiException {
        String token = null;
        UsersDeletePhotoResponse response = api.deletePhoto(token)
                .execute();
        // TODO: test validations
    }

    /**
     * Gets user presence information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPresenceTest() throws ApiException {
        String token = null;
        String user = null;
        UsersGetPresenceResponse response = api.getPresence(token)
                .user(user)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a user&#39;s profile information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProfileInfoTest() throws ApiException {
        String token = null;
        Boolean includeLabels = null;
        String user = null;
        UsersprofileGetProfileInfoResponse response = api.getProfileInfo(token)
                .includeLabels(includeLabels)
                .user(user)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a user&#39;s identity.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void identityTest() throws ApiException {
        String token = null;
        List<UsersIdentityResponseInner> response = api.identity()
                .token(token)
                .execute();
        // TODO: test validations
    }

    /**
     * Gets information about a user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void infoTest() throws ApiException {
        String token = null;
        Boolean includeLocale = null;
        String user = null;
        UsersInfoResponse response = api.info(token)
                .includeLocale(includeLocale)
                .user(user)
                .execute();
        // TODO: test validations
    }

    /**
     * Lists all users in a Slack team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        String token = null;
        Integer limit = null;
        String cursor = null;
        Boolean includeLocale = null;
        UsersListResponse response = api.list()
                .token(token)
                .limit(limit)
                .cursor(cursor)
                .includeLocale(includeLocale)
                .execute();
        // TODO: test validations
    }

    /**
     * Find a user with an email address.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lookupByEmailTest() throws ApiException {
        String token = null;
        String email = null;
        UsersLookupByEmailResponse response = api.lookupByEmail(token, email)
                .execute();
        // TODO: test validations
    }

    /**
     * Marked a user as active. Deprecated and non-functional.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setActiveTest() throws ApiException {
        String token = null;
        UsersSetActiveResponse response = api.setActive(token)
                .execute();
        // TODO: test validations
    }

    /**
     * Set the user profile photo
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setPhotoTest() throws ApiException {
        String token = null;
        String cropW = null;
        String cropX = null;
        String cropY = null;
        String image = null;
        UsersSetPhotoResponse response = api.setPhoto(token)
                .cropW(cropW)
                .cropX(cropX)
                .cropY(cropY)
                .image(image)
                .execute();
        // TODO: test validations
    }

    /**
     * Manually sets user presence.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setPresenceTest() throws ApiException {
        String token = null;
        String presence = null;
        UsersSetPresenceResponse response = api.setPresence(token, presence)
                .execute();
        // TODO: test validations
    }

    /**
     * Set the profile information for a user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setProfileInfoTest() throws ApiException {
        String token = null;
        String name = null;
        String profile = null;
        String user = null;
        String value = null;
        UsersprofileSetProfileInfoResponse response = api.setProfileInfo(token)
                .name(name)
                .profile(profile)
                .user(user)
                .value(value)
                .execute();
        // TODO: test validations
    }

}