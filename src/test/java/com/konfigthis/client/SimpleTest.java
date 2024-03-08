package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://slack.com/api";
        
        // Configure OAuth2 access token for authorization: slackAuth
        configuration.accessToken = "YOUR ACCESS TOKEN";
        SlackWeb client = new SlackWeb(configuration);
        assertNotNull(client);
    }
}
