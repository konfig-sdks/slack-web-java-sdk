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
import com.konfigthis.client.model.OauthAccessResponse;
import com.konfigthis.client.model.OauthAccessdefaultResponse;
import com.konfigthis.client.model.OauthTokenResponse;
import com.konfigthis.client.model.OauthTokendefaultResponse;
import com.konfigthis.client.model.Oauthv2ExchangeTokenResponse;
import com.konfigthis.client.model.Oauthv2ExchangeTokendefaultResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OauthApi
 */
@Disabled
public class OauthApiTest {

    private static OauthApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new OauthApi(apiClient);
    }

    /**
     * Exchanges a temporary OAuth verifier code for an access token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accessTest() throws ApiException {
        String clientId = null;
        String clientSecret = null;
        String code = null;
        String redirectUri = null;
        Boolean singleChannel = null;
        OauthAccessResponse response = api.access()
                .clientId(clientId)
                .clientSecret(clientSecret)
                .code(code)
                .redirectUri(redirectUri)
                .singleChannel(singleChannel)
                .execute();
        // TODO: test validations
    }

    /**
     * Exchanges a temporary OAuth verifier code for an access token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exchangeTokenTest() throws ApiException {
        String code = null;
        String clientId = null;
        String clientSecret = null;
        String redirectUri = null;
        Oauthv2ExchangeTokenResponse response = api.exchangeToken(code)
                .clientId(clientId)
                .clientSecret(clientSecret)
                .redirectUri(redirectUri)
                .execute();
        // TODO: test validations
    }

    /**
     * Exchanges a temporary OAuth verifier code for a workspace token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tokenTest() throws ApiException {
        String clientId = null;
        String clientSecret = null;
        String code = null;
        String redirectUri = null;
        Boolean singleChannel = null;
        OauthTokenResponse response = api.token()
                .clientId(clientId)
                .clientSecret(clientSecret)
                .code(code)
                .redirectUri(redirectUri)
                .singleChannel(singleChannel)
                .execute();
        // TODO: test validations
    }

}
