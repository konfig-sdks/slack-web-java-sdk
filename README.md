<div align="center">

[![Visit Slack](./header.png)](https://slack.dev)

# [Slack](https://slack.dev)

One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Slack&serviceName=Web&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>slack-web-java-sdk</artifactId>
  <version>1.7.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:slack-web-java-sdk:1.7.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/slack-web-java-sdk-1.7.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SlackWeb;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://slack.com/api";
    
    // Configure OAuth2 access token for authorization: slackAuth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    SlackWeb client = new SlackWeb(configuration);
    String token = "token_example"; // Authentication token. Requires scope: `admin.usergroups:write`
    String channelIds = "channelIds_example"; // Comma separated string of channel IDs.
    String usergroupId = "usergroupId_example"; // ID of the IDP group to add default channels for.
    String teamId = "teamId_example"; // The workspace to add default channels in.
    try {
      AdminusergroupsAddDefaultChannelsResponse result = client
              .admin
              .addDefaultChannels(token, channelIds, usergroupId)
              .teamId(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOk());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#addDefaultChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminusergroupsAddDefaultChannelsResponse> response = client
              .admin
              .addDefaultChannels(token, channelIds, usergroupId)
              .teamId(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#addDefaultChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://slack.com/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**addDefaultChannels**](docs/AdminApi.md#addDefaultChannels) | **POST** /admin.usergroups.addChannels | 
*AdminApi* | [**addEmoji**](docs/AdminApi.md#addEmoji) | **POST** /admin.emoji.add | 
*AdminApi* | [**addGroupIdpGroups**](docs/AdminApi.md#addGroupIdpGroups) | **POST** /admin.conversations.restrictAccess.addGroup | 
*AdminApi* | [**addWorkspaceUser**](docs/AdminApi.md#addWorkspaceUser) | **POST** /admin.users.assign | 
*AdminApi* | [**aliasAdd**](docs/AdminApi.md#aliasAdd) | **POST** /admin.emoji.addAlias | 
*AdminApi* | [**approveAppInstallation**](docs/AdminApi.md#approveAppInstallation) | **POST** /admin.apps.approve | 
*AdminApi* | [**approveRequest**](docs/AdminApi.md#approveRequest) | **POST** /admin.inviteRequests.approve | 
*AdminApi* | [**archiveChannel**](docs/AdminApi.md#archiveChannel) | **POST** /admin.conversations.archive | 
*AdminApi* | [**associateDefaultWorkspaces**](docs/AdminApi.md#associateDefaultWorkspaces) | **POST** /admin.usergroups.addTeams | 
*AdminApi* | [**convertToPrivateChannel**](docs/AdminApi.md#convertToPrivateChannel) | **POST** /admin.conversations.convertToPrivate | 
*AdminApi* | [**createChannelBasedConversation**](docs/AdminApi.md#createChannelBasedConversation) | **POST** /admin.conversations.create | 
*AdminApi* | [**createEnterpriseTeam**](docs/AdminApi.md#createEnterpriseTeam) | **POST** /admin.teams.create | 
*AdminApi* | [**deleteChannel**](docs/AdminApi.md#deleteChannel) | **POST** /admin.conversations.delete | 
*AdminApi* | [**denyRequest**](docs/AdminApi.md#denyRequest) | **POST** /admin.inviteRequests.deny | 
*AdminApi* | [**disconnectSharedChannel**](docs/AdminApi.md#disconnectSharedChannel) | **POST** /admin.conversations.disconnectShared | 
*AdminApi* | [**getAll**](docs/AdminApi.md#getAll) | **GET** /admin.teams.admins.list | 
*AdminApi* | [**getConversationPrefs**](docs/AdminApi.md#getConversationPrefs) | **GET** /admin.conversations.getConversationPrefs | 
*AdminApi* | [**getInfo**](docs/AdminApi.md#getInfo) | **GET** /admin.teams.settings.info | 
*AdminApi* | [**getList**](docs/AdminApi.md#getList) | **GET** /admin.apps.restricted.list | 
*AdminApi* | [**getTeamsList**](docs/AdminApi.md#getTeamsList) | **GET** /admin.conversations.getTeams | 
*AdminApi* | [**invalidateSession**](docs/AdminApi.md#invalidateSession) | **POST** /admin.users.session.invalidate | 
*AdminApi* | [**inviteUserToChannel**](docs/AdminApi.md#inviteUserToChannel) | **POST** /admin.conversations.invite | 
*AdminApi* | [**inviteUserToWorkspace**](docs/AdminApi.md#inviteUserToWorkspace) | **POST** /admin.users.invite | 
*AdminApi* | [**list**](docs/AdminApi.md#list) | **GET** /admin.apps.approved.list | 
*AdminApi* | [**listAll**](docs/AdminApi.md#listAll) | **GET** /admin.teams.list | 
*AdminApi* | [**listChannelsGet**](docs/AdminApi.md#listChannelsGet) | **GET** /admin.usergroups.listChannels | 
*AdminApi* | [**listEnterpriseEmoji**](docs/AdminApi.md#listEnterpriseEmoji) | **GET** /admin.emoji.list | 
*AdminApi* | [**listGroups**](docs/AdminApi.md#listGroups) | **GET** /admin.conversations.restrictAccess.listGroups | 
*AdminApi* | [**listOriginalConnectedChannelInfo**](docs/AdminApi.md#listOriginalConnectedChannelInfo) | **GET** /admin.conversations.ekm.listOriginalConnectedChannelInfo | 
*AdminApi* | [**listOwners**](docs/AdminApi.md#listOwners) | **GET** /admin.teams.owners.list | 
*AdminApi* | [**listPendingWorkspaceInviteRequests**](docs/AdminApi.md#listPendingWorkspaceInviteRequests) | **GET** /admin.inviteRequests.list | 
*AdminApi* | [**listWorkspaceUsers**](docs/AdminApi.md#listWorkspaceUsers) | **GET** /admin.users.list | 
*AdminApi* | [**list_0**](docs/AdminApi.md#list_0) | **GET** /admin.apps.requests.list | 
*AdminApi* | [**list_1**](docs/AdminApi.md#list_1) | **GET** /admin.inviteRequests.approved.list | 
*AdminApi* | [**list_2**](docs/AdminApi.md#list_2) | **GET** /admin.inviteRequests.denied.list | 
*AdminApi* | [**removeChannels**](docs/AdminApi.md#removeChannels) | **POST** /admin.usergroups.removeChannels | 
*AdminApi* | [**removeEnterpriseEmoji**](docs/AdminApi.md#removeEnterpriseEmoji) | **POST** /admin.emoji.remove | 
*AdminApi* | [**removeIdpGroup**](docs/AdminApi.md#removeIdpGroup) | **POST** /admin.conversations.restrictAccess.removeGroup | 
*AdminApi* | [**removeUserFromWorkspace**](docs/AdminApi.md#removeUserFromWorkspace) | **POST** /admin.users.remove | 
*AdminApi* | [**renameChannel**](docs/AdminApi.md#renameChannel) | **POST** /admin.conversations.rename | 
*AdminApi* | [**renameEmoji**](docs/AdminApi.md#renameEmoji) | **POST** /admin.emoji.rename | 
*AdminApi* | [**resetSessions**](docs/AdminApi.md#resetSessions) | **POST** /admin.users.session.reset | 
*AdminApi* | [**restrictApp**](docs/AdminApi.md#restrictApp) | **POST** /admin.apps.restrict | 
*AdminApi* | [**searchChannels**](docs/AdminApi.md#searchChannels) | **GET** /admin.conversations.search | 
*AdminApi* | [**setAdminUser**](docs/AdminApi.md#setAdminUser) | **POST** /admin.users.setAdmin | 
*AdminApi* | [**setConversationPrefs**](docs/AdminApi.md#setConversationPrefs) | **POST** /admin.conversations.setConversationPrefs | 
*AdminApi* | [**setDefaultChannels**](docs/AdminApi.md#setDefaultChannels) | **POST** /admin.teams.settings.setDefaultChannels | 
*AdminApi* | [**setDescription**](docs/AdminApi.md#setDescription) | **POST** /admin.teams.settings.setDescription | 
*AdminApi* | [**setDiscoverabilityOfWorkspace**](docs/AdminApi.md#setDiscoverabilityOfWorkspace) | **POST** /admin.teams.settings.setDiscoverability | 
*AdminApi* | [**setExpirationGuest**](docs/AdminApi.md#setExpirationGuest) | **POST** /admin.users.setExpiration | 
*AdminApi* | [**setIcon**](docs/AdminApi.md#setIcon) | **POST** /admin.teams.settings.setIcon | 
*AdminApi* | [**setName**](docs/AdminApi.md#setName) | **POST** /admin.teams.settings.setName | 
*AdminApi* | [**setRegularUser**](docs/AdminApi.md#setRegularUser) | **POST** /admin.users.setRegular | 
*AdminApi* | [**setTeamsWorkspaceConnection**](docs/AdminApi.md#setTeamsWorkspaceConnection) | **POST** /admin.conversations.setTeams | 
*AdminApi* | [**setWorkspaceOwner**](docs/AdminApi.md#setWorkspaceOwner) | **POST** /admin.users.setOwner | 
*AdminApi* | [**unarchiveChannel**](docs/AdminApi.md#unarchiveChannel) | **POST** /admin.conversations.unarchive | 
*AdminAppsApi* | [**approveAppInstallation**](docs/AdminAppsApi.md#approveAppInstallation) | **POST** /admin.apps.approve | 
*AdminAppsApi* | [**restrictApp**](docs/AdminAppsApi.md#restrictApp) | **POST** /admin.apps.restrict | 
*AdminAppsApprovedApi* | [**list**](docs/AdminAppsApprovedApi.md#list) | **GET** /admin.apps.approved.list | 
*AdminAppsRequestsApi* | [**list**](docs/AdminAppsRequestsApi.md#list) | **GET** /admin.apps.requests.list | 
*AdminAppsRestrictedApi* | [**getList**](docs/AdminAppsRestrictedApi.md#getList) | **GET** /admin.apps.restricted.list | 
*AdminConversationsApi* | [**archiveChannel**](docs/AdminConversationsApi.md#archiveChannel) | **POST** /admin.conversations.archive | 
*AdminConversationsApi* | [**convertToPrivateChannel**](docs/AdminConversationsApi.md#convertToPrivateChannel) | **POST** /admin.conversations.convertToPrivate | 
*AdminConversationsApi* | [**createChannelBasedConversation**](docs/AdminConversationsApi.md#createChannelBasedConversation) | **POST** /admin.conversations.create | 
*AdminConversationsApi* | [**deleteChannel**](docs/AdminConversationsApi.md#deleteChannel) | **POST** /admin.conversations.delete | 
*AdminConversationsApi* | [**disconnectSharedChannel**](docs/AdminConversationsApi.md#disconnectSharedChannel) | **POST** /admin.conversations.disconnectShared | 
*AdminConversationsApi* | [**getConversationPrefs**](docs/AdminConversationsApi.md#getConversationPrefs) | **GET** /admin.conversations.getConversationPrefs | 
*AdminConversationsApi* | [**getTeamsList**](docs/AdminConversationsApi.md#getTeamsList) | **GET** /admin.conversations.getTeams | 
*AdminConversationsApi* | [**inviteUserToChannel**](docs/AdminConversationsApi.md#inviteUserToChannel) | **POST** /admin.conversations.invite | 
*AdminConversationsApi* | [**renameChannel**](docs/AdminConversationsApi.md#renameChannel) | **POST** /admin.conversations.rename | 
*AdminConversationsApi* | [**searchChannels**](docs/AdminConversationsApi.md#searchChannels) | **GET** /admin.conversations.search | 
*AdminConversationsApi* | [**setConversationPrefs**](docs/AdminConversationsApi.md#setConversationPrefs) | **POST** /admin.conversations.setConversationPrefs | 
*AdminConversationsApi* | [**setTeamsWorkspaceConnection**](docs/AdminConversationsApi.md#setTeamsWorkspaceConnection) | **POST** /admin.conversations.setTeams | 
*AdminConversationsApi* | [**unarchiveChannel**](docs/AdminConversationsApi.md#unarchiveChannel) | **POST** /admin.conversations.unarchive | 
*AdminConversationsEkmApi* | [**listOriginalConnectedChannelInfo**](docs/AdminConversationsEkmApi.md#listOriginalConnectedChannelInfo) | **GET** /admin.conversations.ekm.listOriginalConnectedChannelInfo | 
*AdminConversationsRestrictAccessApi* | [**addGroupIdpGroups**](docs/AdminConversationsRestrictAccessApi.md#addGroupIdpGroups) | **POST** /admin.conversations.restrictAccess.addGroup | 
*AdminConversationsRestrictAccessApi* | [**listGroups**](docs/AdminConversationsRestrictAccessApi.md#listGroups) | **GET** /admin.conversations.restrictAccess.listGroups | 
*AdminConversationsRestrictAccessApi* | [**removeIdpGroup**](docs/AdminConversationsRestrictAccessApi.md#removeIdpGroup) | **POST** /admin.conversations.restrictAccess.removeGroup | 
*AdminEmojiApi* | [**addEmoji**](docs/AdminEmojiApi.md#addEmoji) | **POST** /admin.emoji.add | 
*AdminEmojiApi* | [**aliasAdd**](docs/AdminEmojiApi.md#aliasAdd) | **POST** /admin.emoji.addAlias | 
*AdminEmojiApi* | [**listEnterpriseEmoji**](docs/AdminEmojiApi.md#listEnterpriseEmoji) | **GET** /admin.emoji.list | 
*AdminEmojiApi* | [**removeEnterpriseEmoji**](docs/AdminEmojiApi.md#removeEnterpriseEmoji) | **POST** /admin.emoji.remove | 
*AdminEmojiApi* | [**renameEmoji**](docs/AdminEmojiApi.md#renameEmoji) | **POST** /admin.emoji.rename | 
*AdminInviteRequestsApi* | [**approveRequest**](docs/AdminInviteRequestsApi.md#approveRequest) | **POST** /admin.inviteRequests.approve | 
*AdminInviteRequestsApi* | [**denyRequest**](docs/AdminInviteRequestsApi.md#denyRequest) | **POST** /admin.inviteRequests.deny | 
*AdminInviteRequestsApi* | [**listPendingWorkspaceInviteRequests**](docs/AdminInviteRequestsApi.md#listPendingWorkspaceInviteRequests) | **GET** /admin.inviteRequests.list | 
*AdminInviteRequestsApprovedApi* | [**list**](docs/AdminInviteRequestsApprovedApi.md#list) | **GET** /admin.inviteRequests.approved.list | 
*AdminInviteRequestsDeniedApi* | [**list**](docs/AdminInviteRequestsDeniedApi.md#list) | **GET** /admin.inviteRequests.denied.list | 
*AdminTeamsApi* | [**createEnterpriseTeam**](docs/AdminTeamsApi.md#createEnterpriseTeam) | **POST** /admin.teams.create | 
*AdminTeamsApi* | [**listAll**](docs/AdminTeamsApi.md#listAll) | **GET** /admin.teams.list | 
*AdminTeamsAdminsApi* | [**getAll**](docs/AdminTeamsAdminsApi.md#getAll) | **GET** /admin.teams.admins.list | 
*AdminTeamsOwnersApi* | [**listOwners**](docs/AdminTeamsOwnersApi.md#listOwners) | **GET** /admin.teams.owners.list | 
*AdminTeamsSettingsApi* | [**getInfo**](docs/AdminTeamsSettingsApi.md#getInfo) | **GET** /admin.teams.settings.info | 
*AdminTeamsSettingsApi* | [**setDefaultChannels**](docs/AdminTeamsSettingsApi.md#setDefaultChannels) | **POST** /admin.teams.settings.setDefaultChannels | 
*AdminTeamsSettingsApi* | [**setDescription**](docs/AdminTeamsSettingsApi.md#setDescription) | **POST** /admin.teams.settings.setDescription | 
*AdminTeamsSettingsApi* | [**setDiscoverabilityOfWorkspace**](docs/AdminTeamsSettingsApi.md#setDiscoverabilityOfWorkspace) | **POST** /admin.teams.settings.setDiscoverability | 
*AdminTeamsSettingsApi* | [**setIcon**](docs/AdminTeamsSettingsApi.md#setIcon) | **POST** /admin.teams.settings.setIcon | 
*AdminTeamsSettingsApi* | [**setName**](docs/AdminTeamsSettingsApi.md#setName) | **POST** /admin.teams.settings.setName | 
*AdminUsergroupsApi* | [**addDefaultChannels**](docs/AdminUsergroupsApi.md#addDefaultChannels) | **POST** /admin.usergroups.addChannels | 
*AdminUsergroupsApi* | [**associateDefaultWorkspaces**](docs/AdminUsergroupsApi.md#associateDefaultWorkspaces) | **POST** /admin.usergroups.addTeams | 
*AdminUsergroupsApi* | [**listChannelsGet**](docs/AdminUsergroupsApi.md#listChannelsGet) | **GET** /admin.usergroups.listChannels | 
*AdminUsergroupsApi* | [**removeChannels**](docs/AdminUsergroupsApi.md#removeChannels) | **POST** /admin.usergroups.removeChannels | 
*AdminUsersApi* | [**addWorkspaceUser**](docs/AdminUsersApi.md#addWorkspaceUser) | **POST** /admin.users.assign | 
*AdminUsersApi* | [**inviteUserToWorkspace**](docs/AdminUsersApi.md#inviteUserToWorkspace) | **POST** /admin.users.invite | 
*AdminUsersApi* | [**listWorkspaceUsers**](docs/AdminUsersApi.md#listWorkspaceUsers) | **GET** /admin.users.list | 
*AdminUsersApi* | [**removeUserFromWorkspace**](docs/AdminUsersApi.md#removeUserFromWorkspace) | **POST** /admin.users.remove | 
*AdminUsersApi* | [**setAdminUser**](docs/AdminUsersApi.md#setAdminUser) | **POST** /admin.users.setAdmin | 
*AdminUsersApi* | [**setExpirationGuest**](docs/AdminUsersApi.md#setExpirationGuest) | **POST** /admin.users.setExpiration | 
*AdminUsersApi* | [**setRegularUser**](docs/AdminUsersApi.md#setRegularUser) | **POST** /admin.users.setRegular | 
*AdminUsersApi* | [**setWorkspaceOwner**](docs/AdminUsersApi.md#setWorkspaceOwner) | **POST** /admin.users.setOwner | 
*AdminUsersSessionApi* | [**invalidateSession**](docs/AdminUsersSessionApi.md#invalidateSession) | **POST** /admin.users.session.invalidate | 
*AdminUsersSessionApi* | [**resetSessions**](docs/AdminUsersSessionApi.md#resetSessions) | **POST** /admin.users.session.reset | 
*ApiApi* | [**test**](docs/ApiApi.md#test) | **GET** /api.test | 
*AppsApi* | [**additionalScopesRequest**](docs/AppsApi.md#additionalScopesRequest) | **GET** /apps.permissions.request | 
*AppsApi* | [**getList**](docs/AppsApi.md#getList) | **GET** /apps.event.authorizations.list | 
*AppsApi* | [**getList_0**](docs/AppsApi.md#getList_0) | **GET** /apps.permissions.scopes.list | 
*AppsApi* | [**getResourcesList**](docs/AppsApi.md#getResourcesList) | **GET** /apps.permissions.resources.list | 
*AppsApi* | [**listPermissions**](docs/AppsApi.md#listPermissions) | **GET** /apps.permissions.info | 
*AppsApi* | [**listUserGrants**](docs/AppsApi.md#listUserGrants) | **GET** /apps.permissions.users.list | 
*AppsApi* | [**requestModal**](docs/AppsApi.md#requestModal) | **GET** /apps.permissions.users.request | 
*AppsApi* | [**uninstall**](docs/AppsApi.md#uninstall) | **GET** /apps.uninstall | 
*AppsEventAuthorizationsApi* | [**getList**](docs/AppsEventAuthorizationsApi.md#getList) | **GET** /apps.event.authorizations.list | 
*AppsPermissionsApi* | [**additionalScopesRequest**](docs/AppsPermissionsApi.md#additionalScopesRequest) | **GET** /apps.permissions.request | 
*AppsPermissionsApi* | [**listPermissions**](docs/AppsPermissionsApi.md#listPermissions) | **GET** /apps.permissions.info | 
*AppsPermissionsResourcesApi* | [**getResourcesList**](docs/AppsPermissionsResourcesApi.md#getResourcesList) | **GET** /apps.permissions.resources.list | 
*AppsPermissionsScopesApi* | [**getList**](docs/AppsPermissionsScopesApi.md#getList) | **GET** /apps.permissions.scopes.list | 
*AppsPermissionsUsersApi* | [**listUserGrants**](docs/AppsPermissionsUsersApi.md#listUserGrants) | **GET** /apps.permissions.users.list | 
*AppsPermissionsUsersApi* | [**requestModal**](docs/AppsPermissionsUsersApi.md#requestModal) | **GET** /apps.permissions.users.request | 
*AuthApi* | [**revoke**](docs/AuthApi.md#revoke) | **GET** /auth.revoke | 
*AuthApi* | [**test**](docs/AuthApi.md#test) | **GET** /auth.test | 
*BotsApi* | [**info**](docs/BotsApi.md#info) | **GET** /bots.info | 
*CallsApi* | [**add**](docs/CallsApi.md#add) | **POST** /calls.add | 
*CallsApi* | [**addNewParticipant**](docs/CallsApi.md#addNewParticipant) | **POST** /calls.participants.add | 
*CallsApi* | [**end**](docs/CallsApi.md#end) | **POST** /calls.end | 
*CallsApi* | [**info**](docs/CallsApi.md#info) | **GET** /calls.info | 
*CallsApi* | [**registerRemoved**](docs/CallsApi.md#registerRemoved) | **POST** /calls.participants.remove | 
*CallsApi* | [**update**](docs/CallsApi.md#update) | **POST** /calls.update | 
*CallsParticipantsApi* | [**addNewParticipant**](docs/CallsParticipantsApi.md#addNewParticipant) | **POST** /calls.participants.add | 
*CallsParticipantsApi* | [**registerRemoved**](docs/CallsParticipantsApi.md#registerRemoved) | **POST** /calls.participants.remove | 
*ChatApi* | [**delete**](docs/ChatApi.md#delete) | **POST** /chat.delete | 
*ChatApi* | [**deleteScheduledMessage**](docs/ChatApi.md#deleteScheduledMessage) | **POST** /chat.deleteScheduledMessage | 
*ChatApi* | [**getPermalink**](docs/ChatApi.md#getPermalink) | **GET** /chat.getPermalink | 
*ChatApi* | [**list**](docs/ChatApi.md#list) | **GET** /chat.scheduledMessages.list | 
*ChatApi* | [**meMessage**](docs/ChatApi.md#meMessage) | **POST** /chat.meMessage | 
*ChatApi* | [**postEphemeral**](docs/ChatApi.md#postEphemeral) | **POST** /chat.postEphemeral | 
*ChatApi* | [**postMessage**](docs/ChatApi.md#postMessage) | **POST** /chat.postMessage | 
*ChatApi* | [**scheduleMessage**](docs/ChatApi.md#scheduleMessage) | **POST** /chat.scheduleMessage | 
*ChatApi* | [**unfurl**](docs/ChatApi.md#unfurl) | **POST** /chat.unfurl | 
*ChatApi* | [**update**](docs/ChatApi.md#update) | **POST** /chat.update | 
*ChatScheduledMessagesApi* | [**list**](docs/ChatScheduledMessagesApi.md#list) | **GET** /chat.scheduledMessages.list | 
*ConversationsApi* | [**archive**](docs/ConversationsApi.md#archive) | **POST** /conversations.archive | 
*ConversationsApi* | [**close**](docs/ConversationsApi.md#close) | **POST** /conversations.close | 
*ConversationsApi* | [**create**](docs/ConversationsApi.md#create) | **POST** /conversations.create | 
*ConversationsApi* | [**history**](docs/ConversationsApi.md#history) | **GET** /conversations.history | 
*ConversationsApi* | [**info**](docs/ConversationsApi.md#info) | **GET** /conversations.info | 
*ConversationsApi* | [**invite**](docs/ConversationsApi.md#invite) | **POST** /conversations.invite | 
*ConversationsApi* | [**join**](docs/ConversationsApi.md#join) | **POST** /conversations.join | 
*ConversationsApi* | [**kick**](docs/ConversationsApi.md#kick) | **POST** /conversations.kick | 
*ConversationsApi* | [**leave**](docs/ConversationsApi.md#leave) | **POST** /conversations.leave | 
*ConversationsApi* | [**list**](docs/ConversationsApi.md#list) | **GET** /conversations.list | 
*ConversationsApi* | [**mark**](docs/ConversationsApi.md#mark) | **POST** /conversations.mark | 
*ConversationsApi* | [**members**](docs/ConversationsApi.md#members) | **GET** /conversations.members | 
*ConversationsApi* | [**open**](docs/ConversationsApi.md#open) | **POST** /conversations.open | 
*ConversationsApi* | [**rename**](docs/ConversationsApi.md#rename) | **POST** /conversations.rename | 
*ConversationsApi* | [**replies**](docs/ConversationsApi.md#replies) | **GET** /conversations.replies | 
*ConversationsApi* | [**setPurpose**](docs/ConversationsApi.md#setPurpose) | **POST** /conversations.setPurpose | 
*ConversationsApi* | [**setTopic**](docs/ConversationsApi.md#setTopic) | **POST** /conversations.setTopic | 
*ConversationsApi* | [**unarchive**](docs/ConversationsApi.md#unarchive) | **POST** /conversations.unarchive | 
*DialogApi* | [**open**](docs/DialogApi.md#open) | **GET** /dialog.open | 
*DndApi* | [**endDnd**](docs/DndApi.md#endDnd) | **POST** /dnd.endDnd | 
*DndApi* | [**endSnooze**](docs/DndApi.md#endSnooze) | **POST** /dnd.endSnooze | 
*DndApi* | [**info**](docs/DndApi.md#info) | **GET** /dnd.info | 
*DndApi* | [**setSnooze**](docs/DndApi.md#setSnooze) | **POST** /dnd.setSnooze | 
*DndApi* | [**teamInfo**](docs/DndApi.md#teamInfo) | **GET** /dnd.teamInfo | 
*EmojiApi* | [**list**](docs/EmojiApi.md#list) | **GET** /emoji.list | 
*FilesApi* | [**addFromRemote**](docs/FilesApi.md#addFromRemote) | **POST** /files.remote.add | 
*FilesApi* | [**delete**](docs/FilesApi.md#delete) | **POST** /files.delete | 
*FilesApi* | [**deleteComment**](docs/FilesApi.md#deleteComment) | **POST** /files.comments.delete | 
*FilesApi* | [**deleteFile**](docs/FilesApi.md#deleteFile) | **POST** /files.remote.remove | 
*FilesApi* | [**getInfo**](docs/FilesApi.md#getInfo) | **GET** /files.remote.info | 
*FilesApi* | [**info**](docs/FilesApi.md#info) | **GET** /files.info | 
*FilesApi* | [**list**](docs/FilesApi.md#list) | **GET** /files.list | 
*FilesApi* | [**listRemoteFiles**](docs/FilesApi.md#listRemoteFiles) | **GET** /files.remote.list | 
*FilesApi* | [**revokePublicURL**](docs/FilesApi.md#revokePublicURL) | **POST** /files.revokePublicURL | 
*FilesApi* | [**shareRemoteFile**](docs/FilesApi.md#shareRemoteFile) | **GET** /files.remote.share | 
*FilesApi* | [**sharedPublicURL**](docs/FilesApi.md#sharedPublicURL) | **POST** /files.sharedPublicURL | 
*FilesApi* | [**updateRemoteFile**](docs/FilesApi.md#updateRemoteFile) | **POST** /files.remote.update | 
*FilesApi* | [**upload**](docs/FilesApi.md#upload) | **POST** /files.upload | 
*FilesCommentsApi* | [**deleteComment**](docs/FilesCommentsApi.md#deleteComment) | **POST** /files.comments.delete | 
*FilesRemoteApi* | [**addFromRemote**](docs/FilesRemoteApi.md#addFromRemote) | **POST** /files.remote.add | 
*FilesRemoteApi* | [**deleteFile**](docs/FilesRemoteApi.md#deleteFile) | **POST** /files.remote.remove | 
*FilesRemoteApi* | [**getInfo**](docs/FilesRemoteApi.md#getInfo) | **GET** /files.remote.info | 
*FilesRemoteApi* | [**listRemoteFiles**](docs/FilesRemoteApi.md#listRemoteFiles) | **GET** /files.remote.list | 
*FilesRemoteApi* | [**shareRemoteFile**](docs/FilesRemoteApi.md#shareRemoteFile) | **GET** /files.remote.share | 
*FilesRemoteApi* | [**updateRemoteFile**](docs/FilesRemoteApi.md#updateRemoteFile) | **POST** /files.remote.update | 
*MigrationApi* | [**exchange**](docs/MigrationApi.md#exchange) | **GET** /migration.exchange | 
*OauthApi* | [**access**](docs/OauthApi.md#access) | **GET** /oauth.access | 
*OauthApi* | [**exchangeToken**](docs/OauthApi.md#exchangeToken) | **GET** /oauth.v2.access | 
*OauthApi* | [**token**](docs/OauthApi.md#token) | **GET** /oauth.token | 
*OauthV2Api* | [**exchangeToken**](docs/OauthV2Api.md#exchangeToken) | **GET** /oauth.v2.access | 
*PinsApi* | [**add**](docs/PinsApi.md#add) | **POST** /pins.add | 
*PinsApi* | [**list**](docs/PinsApi.md#list) | **GET** /pins.list | 
*PinsApi* | [**remove**](docs/PinsApi.md#remove) | **POST** /pins.remove | 
*ReactionsApi* | [**add**](docs/ReactionsApi.md#add) | **POST** /reactions.add | 
*ReactionsApi* | [**get**](docs/ReactionsApi.md#get) | **GET** /reactions.get | 
*ReactionsApi* | [**list**](docs/ReactionsApi.md#list) | **GET** /reactions.list | 
*ReactionsApi* | [**remove**](docs/ReactionsApi.md#remove) | **POST** /reactions.remove | 
*RemindersApi* | [**add**](docs/RemindersApi.md#add) | **POST** /reminders.add | 
*RemindersApi* | [**complete**](docs/RemindersApi.md#complete) | **POST** /reminders.complete | 
*RemindersApi* | [**delete**](docs/RemindersApi.md#delete) | **POST** /reminders.delete | 
*RemindersApi* | [**info**](docs/RemindersApi.md#info) | **GET** /reminders.info | 
*RemindersApi* | [**list**](docs/RemindersApi.md#list) | **GET** /reminders.list | 
*RtmApi* | [**connect**](docs/RtmApi.md#connect) | **GET** /rtm.connect | 
*SearchApi* | [**messages**](docs/SearchApi.md#messages) | **GET** /search.messages | 
*StarsApi* | [**add**](docs/StarsApi.md#add) | **POST** /stars.add | 
*StarsApi* | [**list**](docs/StarsApi.md#list) | **GET** /stars.list | 
*StarsApi* | [**remove**](docs/StarsApi.md#remove) | **POST** /stars.remove | 
*TeamApi* | [**accessLogs**](docs/TeamApi.md#accessLogs) | **GET** /team.accessLogs | 
*TeamApi* | [**billableInfo**](docs/TeamApi.md#billableInfo) | **GET** /team.billableInfo | 
*TeamApi* | [**getProfile**](docs/TeamApi.md#getProfile) | **GET** /team.profile.get | 
*TeamApi* | [**info**](docs/TeamApi.md#info) | **GET** /team.info | 
*TeamApi* | [**integrationLogs**](docs/TeamApi.md#integrationLogs) | **GET** /team.integrationLogs | 
*TeamProfileApi* | [**getProfile**](docs/TeamProfileApi.md#getProfile) | **GET** /team.profile.get | 
*UsergroupsApi* | [**create**](docs/UsergroupsApi.md#create) | **POST** /usergroups.create | 
*UsergroupsApi* | [**disable**](docs/UsergroupsApi.md#disable) | **POST** /usergroups.disable | 
*UsergroupsApi* | [**enable**](docs/UsergroupsApi.md#enable) | **POST** /usergroups.enable | 
*UsergroupsApi* | [**list**](docs/UsergroupsApi.md#list) | **GET** /usergroups.list | 
*UsergroupsApi* | [**listAllUsers**](docs/UsergroupsApi.md#listAllUsers) | **GET** /usergroups.users.list | 
*UsergroupsApi* | [**update**](docs/UsergroupsApi.md#update) | **POST** /usergroups.update | 
*UsergroupsApi* | [**updateList**](docs/UsergroupsApi.md#updateList) | **POST** /usergroups.users.update | 
*UsergroupsUsersApi* | [**listAllUsers**](docs/UsergroupsUsersApi.md#listAllUsers) | **GET** /usergroups.users.list | 
*UsergroupsUsersApi* | [**updateList**](docs/UsergroupsUsersApi.md#updateList) | **POST** /usergroups.users.update | 
*UsersApi* | [**conversations**](docs/UsersApi.md#conversations) | **GET** /users.conversations | 
*UsersApi* | [**deletePhoto**](docs/UsersApi.md#deletePhoto) | **POST** /users.deletePhoto | 
*UsersApi* | [**getPresence**](docs/UsersApi.md#getPresence) | **GET** /users.getPresence | 
*UsersApi* | [**getProfileInfo**](docs/UsersApi.md#getProfileInfo) | **GET** /users.profile.get | 
*UsersApi* | [**identity**](docs/UsersApi.md#identity) | **GET** /users.identity | 
*UsersApi* | [**info**](docs/UsersApi.md#info) | **GET** /users.info | 
*UsersApi* | [**list**](docs/UsersApi.md#list) | **GET** /users.list | 
*UsersApi* | [**lookupByEmail**](docs/UsersApi.md#lookupByEmail) | **GET** /users.lookupByEmail | 
*UsersApi* | [**setActive**](docs/UsersApi.md#setActive) | **POST** /users.setActive | 
*UsersApi* | [**setPhoto**](docs/UsersApi.md#setPhoto) | **POST** /users.setPhoto | 
*UsersApi* | [**setPresence**](docs/UsersApi.md#setPresence) | **POST** /users.setPresence | 
*UsersApi* | [**setProfileInfo**](docs/UsersApi.md#setProfileInfo) | **POST** /users.profile.set | 
*UsersProfileApi* | [**getProfileInfo**](docs/UsersProfileApi.md#getProfileInfo) | **GET** /users.profile.get | 
*UsersProfileApi* | [**setProfileInfo**](docs/UsersProfileApi.md#setProfileInfo) | **POST** /users.profile.set | 
*ViewsApi* | [**open**](docs/ViewsApi.md#open) | **GET** /views.open | 
*ViewsApi* | [**publish**](docs/ViewsApi.md#publish) | **GET** /views.publish | 
*ViewsApi* | [**push**](docs/ViewsApi.md#push) | **GET** /views.push | 
*ViewsApi* | [**update**](docs/ViewsApi.md#update) | **GET** /views.update | 
*WorkflowsApi* | [**stepCompleted**](docs/WorkflowsApi.md#stepCompleted) | **GET** /workflows.stepCompleted | 
*WorkflowsApi* | [**stepFailed**](docs/WorkflowsApi.md#stepFailed) | **GET** /workflows.stepFailed | 
*WorkflowsApi* | [**updateStep**](docs/WorkflowsApi.md#updateStep) | **GET** /workflows.updateStep | 


## Documentation for Models

 - [AdminappsApproveAppInstallationRequest](docs/AdminappsApproveAppInstallationRequest.md)
 - [AdminappsApproveAppInstallationResponse](docs/AdminappsApproveAppInstallationResponse.md)
 - [AdminappsApproveAppInstallationdefaultResponse](docs/AdminappsApproveAppInstallationdefaultResponse.md)
 - [AdminappsRestrictAppRequest](docs/AdminappsRestrictAppRequest.md)
 - [AdminappsRestrictAppResponse](docs/AdminappsRestrictAppResponse.md)
 - [AdminappsRestrictAppdefaultResponse](docs/AdminappsRestrictAppdefaultResponse.md)
 - [AdminappsapprovedListResponse](docs/AdminappsapprovedListResponse.md)
 - [AdminappsapprovedListdefaultResponse](docs/AdminappsapprovedListdefaultResponse.md)
 - [AdminappsrequestsListResponse](docs/AdminappsrequestsListResponse.md)
 - [AdminappsrequestsListdefaultResponse](docs/AdminappsrequestsListdefaultResponse.md)
 - [AdminappsrestrictedGetListResponse](docs/AdminappsrestrictedGetListResponse.md)
 - [AdminappsrestrictedGetListdefaultResponse](docs/AdminappsrestrictedGetListdefaultResponse.md)
 - [AdminconversationsArchiveChannelRequest](docs/AdminconversationsArchiveChannelRequest.md)
 - [AdminconversationsArchiveChannelResponse](docs/AdminconversationsArchiveChannelResponse.md)
 - [AdminconversationsArchiveChanneldefaultResponse](docs/AdminconversationsArchiveChanneldefaultResponse.md)
 - [AdminconversationsConvertToPrivateChannelRequest](docs/AdminconversationsConvertToPrivateChannelRequest.md)
 - [AdminconversationsConvertToPrivateChannelResponse](docs/AdminconversationsConvertToPrivateChannelResponse.md)
 - [AdminconversationsConvertToPrivateChanneldefaultResponse](docs/AdminconversationsConvertToPrivateChanneldefaultResponse.md)
 - [AdminconversationsCreateChannelBasedConversationRequest](docs/AdminconversationsCreateChannelBasedConversationRequest.md)
 - [AdminconversationsCreateChannelBasedConversationResponse](docs/AdminconversationsCreateChannelBasedConversationResponse.md)
 - [AdminconversationsCreateChannelBasedConversationdefaultResponse](docs/AdminconversationsCreateChannelBasedConversationdefaultResponse.md)
 - [AdminconversationsDeleteChannelRequest](docs/AdminconversationsDeleteChannelRequest.md)
 - [AdminconversationsDeleteChannelResponse](docs/AdminconversationsDeleteChannelResponse.md)
 - [AdminconversationsDeleteChanneldefaultResponse](docs/AdminconversationsDeleteChanneldefaultResponse.md)
 - [AdminconversationsDisconnectSharedChannelRequest](docs/AdminconversationsDisconnectSharedChannelRequest.md)
 - [AdminconversationsDisconnectSharedChannelResponse](docs/AdminconversationsDisconnectSharedChannelResponse.md)
 - [AdminconversationsDisconnectSharedChanneldefaultResponse](docs/AdminconversationsDisconnectSharedChanneldefaultResponse.md)
 - [AdminconversationsGetConversationPrefsResponse](docs/AdminconversationsGetConversationPrefsResponse.md)
 - [AdminconversationsGetConversationPrefsResponsePrefs](docs/AdminconversationsGetConversationPrefsResponsePrefs.md)
 - [AdminconversationsGetConversationPrefsResponsePrefsCanThread](docs/AdminconversationsGetConversationPrefsResponsePrefsCanThread.md)
 - [AdminconversationsGetConversationPrefsdefaultResponse](docs/AdminconversationsGetConversationPrefsdefaultResponse.md)
 - [AdminconversationsGetTeamsListResponse](docs/AdminconversationsGetTeamsListResponse.md)
 - [AdminconversationsGetTeamsListResponseResponseMetadata](docs/AdminconversationsGetTeamsListResponseResponseMetadata.md)
 - [AdminconversationsGetTeamsListdefaultResponse](docs/AdminconversationsGetTeamsListdefaultResponse.md)
 - [AdminconversationsInviteUserToChannelRequest](docs/AdminconversationsInviteUserToChannelRequest.md)
 - [AdminconversationsInviteUserToChannelResponse](docs/AdminconversationsInviteUserToChannelResponse.md)
 - [AdminconversationsInviteUserToChanneldefaultResponse](docs/AdminconversationsInviteUserToChanneldefaultResponse.md)
 - [AdminconversationsRenameChannelRequest](docs/AdminconversationsRenameChannelRequest.md)
 - [AdminconversationsRenameChannelResponse](docs/AdminconversationsRenameChannelResponse.md)
 - [AdminconversationsRenameChanneldefaultResponse](docs/AdminconversationsRenameChanneldefaultResponse.md)
 - [AdminconversationsSearchChannelsResponse](docs/AdminconversationsSearchChannelsResponse.md)
 - [AdminconversationsSearchChannelsdefaultResponse](docs/AdminconversationsSearchChannelsdefaultResponse.md)
 - [AdminconversationsSetConversationPrefsRequest](docs/AdminconversationsSetConversationPrefsRequest.md)
 - [AdminconversationsSetConversationPrefsResponse](docs/AdminconversationsSetConversationPrefsResponse.md)
 - [AdminconversationsSetConversationPrefsdefaultResponse](docs/AdminconversationsSetConversationPrefsdefaultResponse.md)
 - [AdminconversationsSetTeamsWorkspaceConnectionRequest](docs/AdminconversationsSetTeamsWorkspaceConnectionRequest.md)
 - [AdminconversationsSetTeamsWorkspaceConnectionResponse](docs/AdminconversationsSetTeamsWorkspaceConnectionResponse.md)
 - [AdminconversationsSetTeamsWorkspaceConnectiondefaultResponse](docs/AdminconversationsSetTeamsWorkspaceConnectiondefaultResponse.md)
 - [AdminconversationsUnarchiveChannelRequest](docs/AdminconversationsUnarchiveChannelRequest.md)
 - [AdminconversationsUnarchiveChannelResponse](docs/AdminconversationsUnarchiveChannelResponse.md)
 - [AdminconversationsUnarchiveChanneldefaultResponse](docs/AdminconversationsUnarchiveChanneldefaultResponse.md)
 - [AdminconversationsekmListOriginalConnectedChannelInfoResponse](docs/AdminconversationsekmListOriginalConnectedChannelInfoResponse.md)
 - [AdminconversationsekmListOriginalConnectedChannelInfodefaultResponse](docs/AdminconversationsekmListOriginalConnectedChannelInfodefaultResponse.md)
 - [AdminconversationsrestrictAccessAddGroupIdpGroupsRequest](docs/AdminconversationsrestrictAccessAddGroupIdpGroupsRequest.md)
 - [AdminconversationsrestrictAccessAddGroupIdpGroupsResponse](docs/AdminconversationsrestrictAccessAddGroupIdpGroupsResponse.md)
 - [AdminconversationsrestrictAccessAddGroupIdpGroupsdefaultResponse](docs/AdminconversationsrestrictAccessAddGroupIdpGroupsdefaultResponse.md)
 - [AdminconversationsrestrictAccessListGroupsResponse](docs/AdminconversationsrestrictAccessListGroupsResponse.md)
 - [AdminconversationsrestrictAccessListGroupsdefaultResponse](docs/AdminconversationsrestrictAccessListGroupsdefaultResponse.md)
 - [AdminconversationsrestrictAccessRemoveIdpGroupRequest](docs/AdminconversationsrestrictAccessRemoveIdpGroupRequest.md)
 - [AdminconversationsrestrictAccessRemoveIdpGroupResponse](docs/AdminconversationsrestrictAccessRemoveIdpGroupResponse.md)
 - [AdminconversationsrestrictAccessRemoveIdpGroupdefaultResponse](docs/AdminconversationsrestrictAccessRemoveIdpGroupdefaultResponse.md)
 - [AdminemojiAddEmojiRequest](docs/AdminemojiAddEmojiRequest.md)
 - [AdminemojiAddEmojiResponse](docs/AdminemojiAddEmojiResponse.md)
 - [AdminemojiAddEmojidefaultResponse](docs/AdminemojiAddEmojidefaultResponse.md)
 - [AdminemojiAliasAddRequest](docs/AdminemojiAliasAddRequest.md)
 - [AdminemojiAliasAddResponse](docs/AdminemojiAliasAddResponse.md)
 - [AdminemojiAliasAdddefaultResponse](docs/AdminemojiAliasAdddefaultResponse.md)
 - [AdminemojiListEnterpriseEmojiResponse](docs/AdminemojiListEnterpriseEmojiResponse.md)
 - [AdminemojiListEnterpriseEmojidefaultResponse](docs/AdminemojiListEnterpriseEmojidefaultResponse.md)
 - [AdminemojiRemoveEnterpriseEmojiRequest](docs/AdminemojiRemoveEnterpriseEmojiRequest.md)
 - [AdminemojiRemoveEnterpriseEmojiResponse](docs/AdminemojiRemoveEnterpriseEmojiResponse.md)
 - [AdminemojiRemoveEnterpriseEmojidefaultResponse](docs/AdminemojiRemoveEnterpriseEmojidefaultResponse.md)
 - [AdminemojiRenameEmojiRequest](docs/AdminemojiRenameEmojiRequest.md)
 - [AdminemojiRenameEmojiResponse](docs/AdminemojiRenameEmojiResponse.md)
 - [AdminemojiRenameEmojidefaultResponse](docs/AdminemojiRenameEmojidefaultResponse.md)
 - [AdmininviteRequestsApproveRequestRequest](docs/AdmininviteRequestsApproveRequestRequest.md)
 - [AdmininviteRequestsApproveRequestResponse](docs/AdmininviteRequestsApproveRequestResponse.md)
 - [AdmininviteRequestsApproveRequestdefaultResponse](docs/AdmininviteRequestsApproveRequestdefaultResponse.md)
 - [AdmininviteRequestsDenyRequestResponse](docs/AdmininviteRequestsDenyRequestResponse.md)
 - [AdmininviteRequestsDenyRequestdefaultResponse](docs/AdmininviteRequestsDenyRequestdefaultResponse.md)
 - [AdmininviteRequestsListPendingWorkspaceInviteRequestsResponse](docs/AdmininviteRequestsListPendingWorkspaceInviteRequestsResponse.md)
 - [AdmininviteRequestsListPendingWorkspaceInviteRequestsdefaultResponse](docs/AdmininviteRequestsListPendingWorkspaceInviteRequestsdefaultResponse.md)
 - [AdmininviteRequestsapprovedListResponse](docs/AdmininviteRequestsapprovedListResponse.md)
 - [AdmininviteRequestsapprovedListdefaultResponse](docs/AdmininviteRequestsapprovedListdefaultResponse.md)
 - [AdmininviteRequestsdeniedListResponse](docs/AdmininviteRequestsdeniedListResponse.md)
 - [AdmininviteRequestsdeniedListdefaultResponse](docs/AdmininviteRequestsdeniedListdefaultResponse.md)
 - [AdminteamsCreateEnterpriseTeamRequest](docs/AdminteamsCreateEnterpriseTeamRequest.md)
 - [AdminteamsCreateEnterpriseTeamResponse](docs/AdminteamsCreateEnterpriseTeamResponse.md)
 - [AdminteamsCreateEnterpriseTeamdefaultResponse](docs/AdminteamsCreateEnterpriseTeamdefaultResponse.md)
 - [AdminteamsListAllResponse](docs/AdminteamsListAllResponse.md)
 - [AdminteamsListAlldefaultResponse](docs/AdminteamsListAlldefaultResponse.md)
 - [AdminteamsadminsGetAllResponse](docs/AdminteamsadminsGetAllResponse.md)
 - [AdminteamsadminsGetAlldefaultResponse](docs/AdminteamsadminsGetAlldefaultResponse.md)
 - [AdminteamsownersListOwnersResponse](docs/AdminteamsownersListOwnersResponse.md)
 - [AdminteamsownersListOwnersdefaultResponse](docs/AdminteamsownersListOwnersdefaultResponse.md)
 - [AdminteamssettingsGetInfoResponse](docs/AdminteamssettingsGetInfoResponse.md)
 - [AdminteamssettingsGetInfodefaultResponse](docs/AdminteamssettingsGetInfodefaultResponse.md)
 - [AdminteamssettingsSetDefaultChannelsRequest](docs/AdminteamssettingsSetDefaultChannelsRequest.md)
 - [AdminteamssettingsSetDefaultChannelsResponse](docs/AdminteamssettingsSetDefaultChannelsResponse.md)
 - [AdminteamssettingsSetDefaultChannelsdefaultResponse](docs/AdminteamssettingsSetDefaultChannelsdefaultResponse.md)
 - [AdminteamssettingsSetDescriptionRequest](docs/AdminteamssettingsSetDescriptionRequest.md)
 - [AdminteamssettingsSetDescriptionResponse](docs/AdminteamssettingsSetDescriptionResponse.md)
 - [AdminteamssettingsSetDescriptiondefaultResponse](docs/AdminteamssettingsSetDescriptiondefaultResponse.md)
 - [AdminteamssettingsSetDiscoverabilityOfWorkspaceRequest](docs/AdminteamssettingsSetDiscoverabilityOfWorkspaceRequest.md)
 - [AdminteamssettingsSetDiscoverabilityOfWorkspaceResponse](docs/AdminteamssettingsSetDiscoverabilityOfWorkspaceResponse.md)
 - [AdminteamssettingsSetDiscoverabilityOfWorkspacedefaultResponse](docs/AdminteamssettingsSetDiscoverabilityOfWorkspacedefaultResponse.md)
 - [AdminteamssettingsSetIconRequest](docs/AdminteamssettingsSetIconRequest.md)
 - [AdminteamssettingsSetIconResponse](docs/AdminteamssettingsSetIconResponse.md)
 - [AdminteamssettingsSetIcondefaultResponse](docs/AdminteamssettingsSetIcondefaultResponse.md)
 - [AdminteamssettingsSetNameRequest](docs/AdminteamssettingsSetNameRequest.md)
 - [AdminteamssettingsSetNameResponse](docs/AdminteamssettingsSetNameResponse.md)
 - [AdminteamssettingsSetNamedefaultResponse](docs/AdminteamssettingsSetNamedefaultResponse.md)
 - [AdminusergroupsAddDefaultChannelsRequest](docs/AdminusergroupsAddDefaultChannelsRequest.md)
 - [AdminusergroupsAddDefaultChannelsResponse](docs/AdminusergroupsAddDefaultChannelsResponse.md)
 - [AdminusergroupsAddDefaultChannelsdefaultResponse](docs/AdminusergroupsAddDefaultChannelsdefaultResponse.md)
 - [AdminusergroupsAssociateDefaultWorkspacesRequest](docs/AdminusergroupsAssociateDefaultWorkspacesRequest.md)
 - [AdminusergroupsAssociateDefaultWorkspacesResponse](docs/AdminusergroupsAssociateDefaultWorkspacesResponse.md)
 - [AdminusergroupsAssociateDefaultWorkspacesdefaultResponse](docs/AdminusergroupsAssociateDefaultWorkspacesdefaultResponse.md)
 - [AdminusergroupsListChannelsGetResponse](docs/AdminusergroupsListChannelsGetResponse.md)
 - [AdminusergroupsListChannelsGetdefaultResponse](docs/AdminusergroupsListChannelsGetdefaultResponse.md)
 - [AdminusergroupsRemoveChannelsRequest](docs/AdminusergroupsRemoveChannelsRequest.md)
 - [AdminusergroupsRemoveChannelsResponse](docs/AdminusergroupsRemoveChannelsResponse.md)
 - [AdminusergroupsRemoveChannelsdefaultResponse](docs/AdminusergroupsRemoveChannelsdefaultResponse.md)
 - [AdminusersAddWorkspaceUserRequest](docs/AdminusersAddWorkspaceUserRequest.md)
 - [AdminusersAddWorkspaceUserResponse](docs/AdminusersAddWorkspaceUserResponse.md)
 - [AdminusersAddWorkspaceUserdefaultResponse](docs/AdminusersAddWorkspaceUserdefaultResponse.md)
 - [AdminusersInviteUserToWorkspaceRequest](docs/AdminusersInviteUserToWorkspaceRequest.md)
 - [AdminusersInviteUserToWorkspaceResponse](docs/AdminusersInviteUserToWorkspaceResponse.md)
 - [AdminusersInviteUserToWorkspacedefaultResponse](docs/AdminusersInviteUserToWorkspacedefaultResponse.md)
 - [AdminusersListWorkspaceUsersResponse](docs/AdminusersListWorkspaceUsersResponse.md)
 - [AdminusersListWorkspaceUsersdefaultResponse](docs/AdminusersListWorkspaceUsersdefaultResponse.md)
 - [AdminusersRemoveUserFromWorkspaceRequest](docs/AdminusersRemoveUserFromWorkspaceRequest.md)
 - [AdminusersRemoveUserFromWorkspaceResponse](docs/AdminusersRemoveUserFromWorkspaceResponse.md)
 - [AdminusersRemoveUserFromWorkspacedefaultResponse](docs/AdminusersRemoveUserFromWorkspacedefaultResponse.md)
 - [AdminusersSetAdminUserRequest](docs/AdminusersSetAdminUserRequest.md)
 - [AdminusersSetAdminUserResponse](docs/AdminusersSetAdminUserResponse.md)
 - [AdminusersSetAdminUserdefaultResponse](docs/AdminusersSetAdminUserdefaultResponse.md)
 - [AdminusersSetExpirationGuestRequest](docs/AdminusersSetExpirationGuestRequest.md)
 - [AdminusersSetExpirationGuestResponse](docs/AdminusersSetExpirationGuestResponse.md)
 - [AdminusersSetExpirationGuestdefaultResponse](docs/AdminusersSetExpirationGuestdefaultResponse.md)
 - [AdminusersSetRegularUserRequest](docs/AdminusersSetRegularUserRequest.md)
 - [AdminusersSetRegularUserResponse](docs/AdminusersSetRegularUserResponse.md)
 - [AdminusersSetRegularUserdefaultResponse](docs/AdminusersSetRegularUserdefaultResponse.md)
 - [AdminusersSetWorkspaceOwnerRequest](docs/AdminusersSetWorkspaceOwnerRequest.md)
 - [AdminusersSetWorkspaceOwnerResponse](docs/AdminusersSetWorkspaceOwnerResponse.md)
 - [AdminusersSetWorkspaceOwnerdefaultResponse](docs/AdminusersSetWorkspaceOwnerdefaultResponse.md)
 - [AdminuserssessionInvalidateSessionRequest](docs/AdminuserssessionInvalidateSessionRequest.md)
 - [AdminuserssessionInvalidateSessionResponse](docs/AdminuserssessionInvalidateSessionResponse.md)
 - [AdminuserssessionInvalidateSessiondefaultResponse](docs/AdminuserssessionInvalidateSessiondefaultResponse.md)
 - [AdminuserssessionResetSessionsRequest](docs/AdminuserssessionResetSessionsRequest.md)
 - [AdminuserssessionResetSessionsResponse](docs/AdminuserssessionResetSessionsResponse.md)
 - [AdminuserssessionResetSessionsdefaultResponse](docs/AdminuserssessionResetSessionsdefaultResponse.md)
 - [ApiTestResponse](docs/ApiTestResponse.md)
 - [ApiTestdefaultResponse](docs/ApiTestdefaultResponse.md)
 - [AppsUninstallResponse](docs/AppsUninstallResponse.md)
 - [AppsUninstalldefaultResponse](docs/AppsUninstalldefaultResponse.md)
 - [AppseventauthorizationsGetListResponse](docs/AppseventauthorizationsGetListResponse.md)
 - [AppseventauthorizationsGetListdefaultResponse](docs/AppseventauthorizationsGetListdefaultResponse.md)
 - [AppspermissionsAdditionalScopesRequestResponse](docs/AppspermissionsAdditionalScopesRequestResponse.md)
 - [AppspermissionsAdditionalScopesRequestdefaultResponse](docs/AppspermissionsAdditionalScopesRequestdefaultResponse.md)
 - [AppspermissionsListPermissionsResponse](docs/AppspermissionsListPermissionsResponse.md)
 - [AppspermissionsListPermissionsResponseInfo](docs/AppspermissionsListPermissionsResponseInfo.md)
 - [AppspermissionsListPermissionsResponseInfoAppHome](docs/AppspermissionsListPermissionsResponseInfoAppHome.md)
 - [AppspermissionsListPermissionsResponseInfoTeam](docs/AppspermissionsListPermissionsResponseInfoTeam.md)
 - [AppspermissionsListPermissionsdefaultResponse](docs/AppspermissionsListPermissionsdefaultResponse.md)
 - [AppspermissionsresourcesGetResourcesListResponse](docs/AppspermissionsresourcesGetResourcesListResponse.md)
 - [AppspermissionsresourcesGetResourcesListResponseResourcesInner](docs/AppspermissionsresourcesGetResourcesListResponseResourcesInner.md)
 - [AppspermissionsresourcesGetResourcesListResponseResponseMetadata](docs/AppspermissionsresourcesGetResourcesListResponseResponseMetadata.md)
 - [AppspermissionsresourcesGetResourcesListdefaultResponse](docs/AppspermissionsresourcesGetResourcesListdefaultResponse.md)
 - [AppspermissionsscopesGetListResponse](docs/AppspermissionsscopesGetListResponse.md)
 - [AppspermissionsscopesGetListResponseScopes](docs/AppspermissionsscopesGetListResponseScopes.md)
 - [AppspermissionsscopesGetListdefaultResponse](docs/AppspermissionsscopesGetListdefaultResponse.md)
 - [AppspermissionsusersListUserGrantsResponse](docs/AppspermissionsusersListUserGrantsResponse.md)
 - [AppspermissionsusersListUserGrantsdefaultResponse](docs/AppspermissionsusersListUserGrantsdefaultResponse.md)
 - [AppspermissionsusersRequestModalResponse](docs/AppspermissionsusersRequestModalResponse.md)
 - [AppspermissionsusersRequestModaldefaultResponse](docs/AppspermissionsusersRequestModaldefaultResponse.md)
 - [AuthRevokeResponse](docs/AuthRevokeResponse.md)
 - [AuthRevokedefaultResponse](docs/AuthRevokedefaultResponse.md)
 - [AuthTestResponse](docs/AuthTestResponse.md)
 - [AuthTestdefaultResponse](docs/AuthTestdefaultResponse.md)
 - [BlocksInner](docs/BlocksInner.md)
 - [BotsInfoResponse](docs/BotsInfoResponse.md)
 - [BotsInfoResponseBot](docs/BotsInfoResponseBot.md)
 - [BotsInfodefaultResponse](docs/BotsInfodefaultResponse.md)
 - [CallsAddRequest](docs/CallsAddRequest.md)
 - [CallsAddResponse](docs/CallsAddResponse.md)
 - [CallsAdddefaultResponse](docs/CallsAdddefaultResponse.md)
 - [CallsEndRequest](docs/CallsEndRequest.md)
 - [CallsEndResponse](docs/CallsEndResponse.md)
 - [CallsEnddefaultResponse](docs/CallsEnddefaultResponse.md)
 - [CallsInfoResponse](docs/CallsInfoResponse.md)
 - [CallsInfodefaultResponse](docs/CallsInfodefaultResponse.md)
 - [CallsUpdateRequest](docs/CallsUpdateRequest.md)
 - [CallsUpdateResponse](docs/CallsUpdateResponse.md)
 - [CallsUpdatedefaultResponse](docs/CallsUpdatedefaultResponse.md)
 - [CallsparticipantsAddNewParticipantRequest](docs/CallsparticipantsAddNewParticipantRequest.md)
 - [CallsparticipantsAddNewParticipantResponse](docs/CallsparticipantsAddNewParticipantResponse.md)
 - [CallsparticipantsAddNewParticipantdefaultResponse](docs/CallsparticipantsAddNewParticipantdefaultResponse.md)
 - [CallsparticipantsRegisterRemovedRequest](docs/CallsparticipantsRegisterRemovedRequest.md)
 - [CallsparticipantsRegisterRemovedResponse](docs/CallsparticipantsRegisterRemovedResponse.md)
 - [CallsparticipantsRegisterRemoveddefaultResponse](docs/CallsparticipantsRegisterRemoveddefaultResponse.md)
 - [ChatDeleteRequest](docs/ChatDeleteRequest.md)
 - [ChatDeleteResponse](docs/ChatDeleteResponse.md)
 - [ChatDeleteScheduledMessageRequest](docs/ChatDeleteScheduledMessageRequest.md)
 - [ChatDeleteScheduledMessageResponse](docs/ChatDeleteScheduledMessageResponse.md)
 - [ChatDeleteScheduledMessagedefaultResponse](docs/ChatDeleteScheduledMessagedefaultResponse.md)
 - [ChatDeletedefaultResponse](docs/ChatDeletedefaultResponse.md)
 - [ChatGetPermalinkResponse](docs/ChatGetPermalinkResponse.md)
 - [ChatGetPermalinkdefaultResponse](docs/ChatGetPermalinkdefaultResponse.md)
 - [ChatMeMessageRequest](docs/ChatMeMessageRequest.md)
 - [ChatMeMessageResponse](docs/ChatMeMessageResponse.md)
 - [ChatMeMessagedefaultResponse](docs/ChatMeMessagedefaultResponse.md)
 - [ChatPostEphemeralRequest](docs/ChatPostEphemeralRequest.md)
 - [ChatPostEphemeralResponse](docs/ChatPostEphemeralResponse.md)
 - [ChatPostEphemeraldefaultResponse](docs/ChatPostEphemeraldefaultResponse.md)
 - [ChatPostMessageRequest](docs/ChatPostMessageRequest.md)
 - [ChatPostMessageResponse](docs/ChatPostMessageResponse.md)
 - [ChatPostMessagedefaultResponse](docs/ChatPostMessagedefaultResponse.md)
 - [ChatScheduleMessageRequest](docs/ChatScheduleMessageRequest.md)
 - [ChatScheduleMessageResponse](docs/ChatScheduleMessageResponse.md)
 - [ChatScheduleMessageResponseMessage](docs/ChatScheduleMessageResponseMessage.md)
 - [ChatScheduleMessagedefaultResponse](docs/ChatScheduleMessagedefaultResponse.md)
 - [ChatUnfurlRequest](docs/ChatUnfurlRequest.md)
 - [ChatUnfurlResponse](docs/ChatUnfurlResponse.md)
 - [ChatUnfurldefaultResponse](docs/ChatUnfurldefaultResponse.md)
 - [ChatUpdateRequest](docs/ChatUpdateRequest.md)
 - [ChatUpdateResponse](docs/ChatUpdateResponse.md)
 - [ChatUpdatedefaultResponse](docs/ChatUpdatedefaultResponse.md)
 - [ChatscheduledMessagesListResponse](docs/ChatscheduledMessagesListResponse.md)
 - [ChatscheduledMessagesListResponseScheduledMessagesInner](docs/ChatscheduledMessagesListResponseScheduledMessagesInner.md)
 - [ChatscheduledMessagesListdefaultResponse](docs/ChatscheduledMessagesListdefaultResponse.md)
 - [ConversationObject](docs/ConversationObject.md)
 - [ConversationObjectDisplayCounts](docs/ConversationObjectDisplayCounts.md)
 - [ConversationObjectPurpose](docs/ConversationObjectPurpose.md)
 - [ConversationObjectSharesInner](docs/ConversationObjectSharesInner.md)
 - [ConversationsArchiveRequest](docs/ConversationsArchiveRequest.md)
 - [ConversationsArchiveResponse](docs/ConversationsArchiveResponse.md)
 - [ConversationsArchivedefaultResponse](docs/ConversationsArchivedefaultResponse.md)
 - [ConversationsCloseRequest](docs/ConversationsCloseRequest.md)
 - [ConversationsCloseResponse](docs/ConversationsCloseResponse.md)
 - [ConversationsClosedefaultResponse](docs/ConversationsClosedefaultResponse.md)
 - [ConversationsCreateRequest](docs/ConversationsCreateRequest.md)
 - [ConversationsCreateResponse](docs/ConversationsCreateResponse.md)
 - [ConversationsCreatedefaultResponse](docs/ConversationsCreatedefaultResponse.md)
 - [ConversationsHistoryResponse](docs/ConversationsHistoryResponse.md)
 - [ConversationsHistorydefaultResponse](docs/ConversationsHistorydefaultResponse.md)
 - [ConversationsInfoResponse](docs/ConversationsInfoResponse.md)
 - [ConversationsInfodefaultResponse](docs/ConversationsInfodefaultResponse.md)
 - [ConversationsInviteRequest](docs/ConversationsInviteRequest.md)
 - [ConversationsInviteResponse](docs/ConversationsInviteResponse.md)
 - [ConversationsInvitedefaultResponse](docs/ConversationsInvitedefaultResponse.md)
 - [ConversationsJoinRequest](docs/ConversationsJoinRequest.md)
 - [ConversationsJoinResponse](docs/ConversationsJoinResponse.md)
 - [ConversationsJoindefaultResponse](docs/ConversationsJoindefaultResponse.md)
 - [ConversationsKickRequest](docs/ConversationsKickRequest.md)
 - [ConversationsKickResponse](docs/ConversationsKickResponse.md)
 - [ConversationsKickdefaultResponse](docs/ConversationsKickdefaultResponse.md)
 - [ConversationsLeaveRequest](docs/ConversationsLeaveRequest.md)
 - [ConversationsLeaveResponse](docs/ConversationsLeaveResponse.md)
 - [ConversationsLeavedefaultResponse](docs/ConversationsLeavedefaultResponse.md)
 - [ConversationsListResponse](docs/ConversationsListResponse.md)
 - [ConversationsListdefaultResponse](docs/ConversationsListdefaultResponse.md)
 - [ConversationsMarkRequest](docs/ConversationsMarkRequest.md)
 - [ConversationsMarkResponse](docs/ConversationsMarkResponse.md)
 - [ConversationsMarkdefaultResponse](docs/ConversationsMarkdefaultResponse.md)
 - [ConversationsMembersResponse](docs/ConversationsMembersResponse.md)
 - [ConversationsMembersdefaultResponse](docs/ConversationsMembersdefaultResponse.md)
 - [ConversationsOpenRequest](docs/ConversationsOpenRequest.md)
 - [ConversationsOpenResponse](docs/ConversationsOpenResponse.md)
 - [ConversationsOpendefaultResponse](docs/ConversationsOpendefaultResponse.md)
 - [ConversationsRenameRequest](docs/ConversationsRenameRequest.md)
 - [ConversationsRenameResponse](docs/ConversationsRenameResponse.md)
 - [ConversationsRenamedefaultResponse](docs/ConversationsRenamedefaultResponse.md)
 - [ConversationsRepliesResponse](docs/ConversationsRepliesResponse.md)
 - [ConversationsRepliesResponseMessagesInnerInner](docs/ConversationsRepliesResponseMessagesInnerInner.md)
 - [ConversationsRepliesResponseMessagesInnerInnerUserProfile](docs/ConversationsRepliesResponseMessagesInnerInnerUserProfile.md)
 - [ConversationsRepliesdefaultResponse](docs/ConversationsRepliesdefaultResponse.md)
 - [ConversationsSetPurposeRequest](docs/ConversationsSetPurposeRequest.md)
 - [ConversationsSetPurposeResponse](docs/ConversationsSetPurposeResponse.md)
 - [ConversationsSetPurposedefaultResponse](docs/ConversationsSetPurposedefaultResponse.md)
 - [ConversationsSetTopicRequest](docs/ConversationsSetTopicRequest.md)
 - [ConversationsSetTopicResponse](docs/ConversationsSetTopicResponse.md)
 - [ConversationsSetTopicdefaultResponse](docs/ConversationsSetTopicdefaultResponse.md)
 - [ConversationsUnarchiveRequest](docs/ConversationsUnarchiveRequest.md)
 - [ConversationsUnarchiveResponse](docs/ConversationsUnarchiveResponse.md)
 - [ConversationsUnarchivedefaultResponse](docs/ConversationsUnarchivedefaultResponse.md)
 - [DefsOkFalse](docs/DefsOkFalse.md)
 - [DefsOkTrue](docs/DefsOkTrue.md)
 - [DialogOpenResponse](docs/DialogOpenResponse.md)
 - [DialogOpendefaultResponse](docs/DialogOpendefaultResponse.md)
 - [DndEndDndResponse](docs/DndEndDndResponse.md)
 - [DndEndDnddefaultResponse](docs/DndEndDnddefaultResponse.md)
 - [DndEndSnoozeResponse](docs/DndEndSnoozeResponse.md)
 - [DndEndSnoozedefaultResponse](docs/DndEndSnoozedefaultResponse.md)
 - [DndInfoResponse](docs/DndInfoResponse.md)
 - [DndInfodefaultResponse](docs/DndInfodefaultResponse.md)
 - [DndSetSnoozeRequest](docs/DndSetSnoozeRequest.md)
 - [DndSetSnoozeResponse](docs/DndSetSnoozeResponse.md)
 - [DndSetSnoozedefaultResponse](docs/DndSetSnoozedefaultResponse.md)
 - [DndTeamInfoResponse](docs/DndTeamInfoResponse.md)
 - [DndTeamInfodefaultResponse](docs/DndTeamInfodefaultResponse.md)
 - [EmojiListResponse](docs/EmojiListResponse.md)
 - [EmojiListdefaultResponse](docs/EmojiListdefaultResponse.md)
 - [ErrorsIsReturnedWhenAnErrorAssociatesAnUserPropertyInner](docs/ErrorsIsReturnedWhenAnErrorAssociatesAnUserPropertyInner.md)
 - [ExternalOrgMigrationsProperty](docs/ExternalOrgMigrationsProperty.md)
 - [ExternalOrgMigrationsPropertyCurrentInner](docs/ExternalOrgMigrationsPropertyCurrentInner.md)
 - [FileObjectProperty](docs/FileObjectProperty.md)
 - [FilePin](docs/FilePin.md)
 - [FilesDeleteRequest](docs/FilesDeleteRequest.md)
 - [FilesDeleteResponse](docs/FilesDeleteResponse.md)
 - [FilesDeletedefaultResponse](docs/FilesDeletedefaultResponse.md)
 - [FilesInfoResponse](docs/FilesInfoResponse.md)
 - [FilesInfodefaultResponse](docs/FilesInfodefaultResponse.md)
 - [FilesListResponse](docs/FilesListResponse.md)
 - [FilesListdefaultResponse](docs/FilesListdefaultResponse.md)
 - [FilesRevokePublicUrlRequest](docs/FilesRevokePublicUrlRequest.md)
 - [FilesRevokePublicUrlResponse](docs/FilesRevokePublicUrlResponse.md)
 - [FilesRevokePublicUrldefaultResponse](docs/FilesRevokePublicUrldefaultResponse.md)
 - [FilesSharedPublicUrlRequest](docs/FilesSharedPublicUrlRequest.md)
 - [FilesSharedPublicUrlResponse](docs/FilesSharedPublicUrlResponse.md)
 - [FilesSharedPublicUrldefaultResponse](docs/FilesSharedPublicUrldefaultResponse.md)
 - [FilesUploadRequest](docs/FilesUploadRequest.md)
 - [FilesUploadResponse](docs/FilesUploadResponse.md)
 - [FilesUploaddefaultResponse](docs/FilesUploaddefaultResponse.md)
 - [FilescommentsDeleteCommentRequest](docs/FilescommentsDeleteCommentRequest.md)
 - [FilescommentsDeleteCommentResponse](docs/FilescommentsDeleteCommentResponse.md)
 - [FilescommentsDeleteCommentdefaultResponse](docs/FilescommentsDeleteCommentdefaultResponse.md)
 - [FilesremoteAddFromRemoteRequest](docs/FilesremoteAddFromRemoteRequest.md)
 - [FilesremoteAddFromRemoteResponse](docs/FilesremoteAddFromRemoteResponse.md)
 - [FilesremoteAddFromRemotedefaultResponse](docs/FilesremoteAddFromRemotedefaultResponse.md)
 - [FilesremoteDeleteFileRequest](docs/FilesremoteDeleteFileRequest.md)
 - [FilesremoteDeleteFileResponse](docs/FilesremoteDeleteFileResponse.md)
 - [FilesremoteDeleteFiledefaultResponse](docs/FilesremoteDeleteFiledefaultResponse.md)
 - [FilesremoteGetInfoResponse](docs/FilesremoteGetInfoResponse.md)
 - [FilesremoteGetInfodefaultResponse](docs/FilesremoteGetInfodefaultResponse.md)
 - [FilesremoteListRemoteFilesResponse](docs/FilesremoteListRemoteFilesResponse.md)
 - [FilesremoteListRemoteFilesdefaultResponse](docs/FilesremoteListRemoteFilesdefaultResponse.md)
 - [FilesremoteShareRemoteFileResponse](docs/FilesremoteShareRemoteFileResponse.md)
 - [FilesremoteShareRemoteFiledefaultResponse](docs/FilesremoteShareRemoteFiledefaultResponse.md)
 - [FilesremoteUpdateRemoteFileRequest](docs/FilesremoteUpdateRemoteFileRequest.md)
 - [FilesremoteUpdateRemoteFileResponse](docs/FilesremoteUpdateRemoteFileResponse.md)
 - [FilesremoteUpdateRemoteFiledefaultResponse](docs/FilesremoteUpdateRemoteFiledefaultResponse.md)
 - [MessageObjectProperty](docs/MessageObjectProperty.md)
 - [MigrationExchangeResponse](docs/MigrationExchangeResponse.md)
 - [MigrationExchangedefaultResponse](docs/MigrationExchangedefaultResponse.md)
 - [NewPagingStyle](docs/NewPagingStyle.md)
 - [OauthAccessResponse](docs/OauthAccessResponse.md)
 - [OauthAccessdefaultResponse](docs/OauthAccessdefaultResponse.md)
 - [OauthTokenResponse](docs/OauthTokenResponse.md)
 - [OauthTokendefaultResponse](docs/OauthTokendefaultResponse.md)
 - [Oauthv2ExchangeTokenResponse](docs/Oauthv2ExchangeTokenResponse.md)
 - [Oauthv2ExchangeTokendefaultResponse](docs/Oauthv2ExchangeTokendefaultResponse.md)
 - [ObjsBotProfile](docs/ObjsBotProfile.md)
 - [ObjsBotProfileIcons](docs/ObjsBotProfileIcons.md)
 - [ObjsChannel](docs/ObjsChannel.md)
 - [ObjsChannelPurpose](docs/ObjsChannelPurpose.md)
 - [ObjsComment](docs/ObjsComment.md)
 - [ObjsEnterpriseUser](docs/ObjsEnterpriseUser.md)
 - [ObjsExternalOrgMigrations](docs/ObjsExternalOrgMigrations.md)
 - [ObjsFile](docs/ObjsFile.md)
 - [ObjsFileShares](docs/ObjsFileShares.md)
 - [ObjsIcon](docs/ObjsIcon.md)
 - [ObjsMessage](docs/ObjsMessage.md)
 - [ObjsMessageAttachmentsInner](docs/ObjsMessageAttachmentsInner.md)
 - [ObjsMessageIcons](docs/ObjsMessageIcons.md)
 - [ObjsPaging](docs/ObjsPaging.md)
 - [ObjsPrimaryOwner](docs/ObjsPrimaryOwner.md)
 - [ObjsReaction](docs/ObjsReaction.md)
 - [ObjsReminder](docs/ObjsReminder.md)
 - [ObjsResources](docs/ObjsResources.md)
 - [ObjsSubteam](docs/ObjsSubteam.md)
 - [ObjsSubteamPrefs](docs/ObjsSubteamPrefs.md)
 - [ObjsTeam](docs/ObjsTeam.md)
 - [ObjsTeamProfileField](docs/ObjsTeamProfileField.md)
 - [ObjsTeamProfileFieldOption](docs/ObjsTeamProfileFieldOption.md)
 - [ObjsUserInner](docs/ObjsUserInner.md)
 - [ObjsUserInnerEnterpriseUser](docs/ObjsUserInnerEnterpriseUser.md)
 - [ObjsUserInnerTeamProfile](docs/ObjsUserInnerTeamProfile.md)
 - [ObjsUserInnerTeamProfileFieldsInner](docs/ObjsUserInnerTeamProfileFieldsInner.md)
 - [ObjsUserProfile](docs/ObjsUserProfile.md)
 - [ObjsUserProfileShort](docs/ObjsUserProfileShort.md)
 - [PinsAddRequest](docs/PinsAddRequest.md)
 - [PinsAddResponse](docs/PinsAddResponse.md)
 - [PinsAdddefaultResponse](docs/PinsAdddefaultResponse.md)
 - [PinsListResponseInner](docs/PinsListResponseInner.md)
 - [PinsListdefaultResponse](docs/PinsListdefaultResponse.md)
 - [PinsRemoveRequest](docs/PinsRemoveRequest.md)
 - [PinsRemoveResponse](docs/PinsRemoveResponse.md)
 - [PinsRemovedefaultResponse](docs/PinsRemovedefaultResponse.md)
 - [ReactionObject](docs/ReactionObject.md)
 - [ReactionsAddRequest](docs/ReactionsAddRequest.md)
 - [ReactionsAddResponse](docs/ReactionsAddResponse.md)
 - [ReactionsAdddefaultResponse](docs/ReactionsAdddefaultResponse.md)
 - [ReactionsGetdefaultResponse](docs/ReactionsGetdefaultResponse.md)
 - [ReactionsListResponse](docs/ReactionsListResponse.md)
 - [ReactionsListResponseItemsInnerInner](docs/ReactionsListResponseItemsInnerInner.md)
 - [ReactionsListdefaultResponse](docs/ReactionsListdefaultResponse.md)
 - [ReactionsRemoveRequest](docs/ReactionsRemoveRequest.md)
 - [ReactionsRemoveResponse](docs/ReactionsRemoveResponse.md)
 - [ReactionsRemovedefaultResponse](docs/ReactionsRemovedefaultResponse.md)
 - [RemindersAddRequest](docs/RemindersAddRequest.md)
 - [RemindersAddResponse](docs/RemindersAddResponse.md)
 - [RemindersAdddefaultResponse](docs/RemindersAdddefaultResponse.md)
 - [RemindersCompleteRequest](docs/RemindersCompleteRequest.md)
 - [RemindersCompleteResponse](docs/RemindersCompleteResponse.md)
 - [RemindersCompletedefaultResponse](docs/RemindersCompletedefaultResponse.md)
 - [RemindersDeleteRequest](docs/RemindersDeleteRequest.md)
 - [RemindersDeleteResponse](docs/RemindersDeleteResponse.md)
 - [RemindersDeletedefaultResponse](docs/RemindersDeletedefaultResponse.md)
 - [RemindersInfoResponse](docs/RemindersInfoResponse.md)
 - [RemindersInfodefaultResponse](docs/RemindersInfodefaultResponse.md)
 - [RemindersListResponse](docs/RemindersListResponse.md)
 - [RemindersListdefaultResponse](docs/RemindersListdefaultResponse.md)
 - [ResponseMetadataProperty](docs/ResponseMetadataProperty.md)
 - [RtmConnectResponse](docs/RtmConnectResponse.md)
 - [RtmConnectResponseSelf](docs/RtmConnectResponseSelf.md)
 - [RtmConnectResponseTeam](docs/RtmConnectResponseTeam.md)
 - [RtmConnectdefaultResponse](docs/RtmConnectdefaultResponse.md)
 - [SearchMessagesResponse](docs/SearchMessagesResponse.md)
 - [SearchMessagesdefaultResponse](docs/SearchMessagesdefaultResponse.md)
 - [StarsAddRequest](docs/StarsAddRequest.md)
 - [StarsAddResponse](docs/StarsAddResponse.md)
 - [StarsAdddefaultResponse](docs/StarsAdddefaultResponse.md)
 - [StarsListResponse](docs/StarsListResponse.md)
 - [StarsListResponseItemsInnerInner](docs/StarsListResponseItemsInnerInner.md)
 - [StarsListdefaultResponse](docs/StarsListdefaultResponse.md)
 - [StarsRemoveRequest](docs/StarsRemoveRequest.md)
 - [StarsRemoveResponse](docs/StarsRemoveResponse.md)
 - [StarsRemovedefaultResponse](docs/StarsRemovedefaultResponse.md)
 - [TeamAccessLogsResponse](docs/TeamAccessLogsResponse.md)
 - [TeamAccessLogsResponseLoginsInner](docs/TeamAccessLogsResponseLoginsInner.md)
 - [TeamAccessLogsdefaultResponse](docs/TeamAccessLogsdefaultResponse.md)
 - [TeamBillableInfoResponse](docs/TeamBillableInfoResponse.md)
 - [TeamBillableInfodefaultResponse](docs/TeamBillableInfodefaultResponse.md)
 - [TeamInfoResponse](docs/TeamInfoResponse.md)
 - [TeamInfodefaultResponse](docs/TeamInfodefaultResponse.md)
 - [TeamIntegrationLogsResponse](docs/TeamIntegrationLogsResponse.md)
 - [TeamIntegrationLogsResponseLogsInner](docs/TeamIntegrationLogsResponseLogsInner.md)
 - [TeamIntegrationLogsdefaultResponse](docs/TeamIntegrationLogsdefaultResponse.md)
 - [TeamObjectProperty](docs/TeamObjectProperty.md)
 - [TeamObjectPropertyIcon](docs/TeamObjectPropertyIcon.md)
 - [TeamObjectPropertyPrimaryOwner](docs/TeamObjectPropertyPrimaryOwner.md)
 - [TeamObjectPropertySsoProvider](docs/TeamObjectPropertySsoProvider.md)
 - [TeamprofileGetProfileResponse](docs/TeamprofileGetProfileResponse.md)
 - [TeamprofileGetProfileResponseProfile](docs/TeamprofileGetProfileResponseProfile.md)
 - [TeamprofileGetProfiledefaultResponse](docs/TeamprofileGetProfiledefaultResponse.md)
 - [UserProfileObjectProperty](docs/UserProfileObjectProperty.md)
 - [UsergroupsCreateRequest](docs/UsergroupsCreateRequest.md)
 - [UsergroupsCreateResponse](docs/UsergroupsCreateResponse.md)
 - [UsergroupsCreatedefaultResponse](docs/UsergroupsCreatedefaultResponse.md)
 - [UsergroupsDisableRequest](docs/UsergroupsDisableRequest.md)
 - [UsergroupsDisableResponse](docs/UsergroupsDisableResponse.md)
 - [UsergroupsDisabledefaultResponse](docs/UsergroupsDisabledefaultResponse.md)
 - [UsergroupsEnableRequest](docs/UsergroupsEnableRequest.md)
 - [UsergroupsEnableResponse](docs/UsergroupsEnableResponse.md)
 - [UsergroupsEnabledefaultResponse](docs/UsergroupsEnabledefaultResponse.md)
 - [UsergroupsListResponse](docs/UsergroupsListResponse.md)
 - [UsergroupsListdefaultResponse](docs/UsergroupsListdefaultResponse.md)
 - [UsergroupsUpdateRequest](docs/UsergroupsUpdateRequest.md)
 - [UsergroupsUpdateResponse](docs/UsergroupsUpdateResponse.md)
 - [UsergroupsUpdatedefaultResponse](docs/UsergroupsUpdatedefaultResponse.md)
 - [UsergroupsusersListAllUsersResponse](docs/UsergroupsusersListAllUsersResponse.md)
 - [UsergroupsusersListAllUsersdefaultResponse](docs/UsergroupsusersListAllUsersdefaultResponse.md)
 - [UsergroupsusersUpdateListRequest](docs/UsergroupsusersUpdateListRequest.md)
 - [UsergroupsusersUpdateListResponse](docs/UsergroupsusersUpdateListResponse.md)
 - [UsergroupsusersUpdateListdefaultResponse](docs/UsergroupsusersUpdateListdefaultResponse.md)
 - [UsersConversationsResponse](docs/UsersConversationsResponse.md)
 - [UsersConversationsdefaultResponse](docs/UsersConversationsdefaultResponse.md)
 - [UsersDeletePhotoRequest](docs/UsersDeletePhotoRequest.md)
 - [UsersDeletePhotoResponse](docs/UsersDeletePhotoResponse.md)
 - [UsersDeletePhotodefaultResponse](docs/UsersDeletePhotodefaultResponse.md)
 - [UsersGetPresenceResponse](docs/UsersGetPresenceResponse.md)
 - [UsersGetPresencedefaultResponse](docs/UsersGetPresencedefaultResponse.md)
 - [UsersIdentityResponseInner](docs/UsersIdentityResponseInner.md)
 - [UsersIdentityResponseInnerTeam](docs/UsersIdentityResponseInnerTeam.md)
 - [UsersIdentityResponseInnerUser](docs/UsersIdentityResponseInnerUser.md)
 - [UsersIdentitydefaultResponse](docs/UsersIdentitydefaultResponse.md)
 - [UsersInfoResponse](docs/UsersInfoResponse.md)
 - [UsersInfodefaultResponse](docs/UsersInfodefaultResponse.md)
 - [UsersListResponse](docs/UsersListResponse.md)
 - [UsersListdefaultResponse](docs/UsersListdefaultResponse.md)
 - [UsersLookupByEmailResponse](docs/UsersLookupByEmailResponse.md)
 - [UsersLookupByEmaildefaultResponse](docs/UsersLookupByEmaildefaultResponse.md)
 - [UsersSetActiveResponse](docs/UsersSetActiveResponse.md)
 - [UsersSetActivedefaultResponse](docs/UsersSetActivedefaultResponse.md)
 - [UsersSetPhotoRequest](docs/UsersSetPhotoRequest.md)
 - [UsersSetPhotoResponse](docs/UsersSetPhotoResponse.md)
 - [UsersSetPhotoResponseProfile](docs/UsersSetPhotoResponseProfile.md)
 - [UsersSetPhotodefaultResponse](docs/UsersSetPhotodefaultResponse.md)
 - [UsersSetPresenceRequest](docs/UsersSetPresenceRequest.md)
 - [UsersSetPresenceResponse](docs/UsersSetPresenceResponse.md)
 - [UsersSetPresencedefaultResponse](docs/UsersSetPresencedefaultResponse.md)
 - [UsersprofileGetProfileInfoResponse](docs/UsersprofileGetProfileInfoResponse.md)
 - [UsersprofileGetProfileInfodefaultResponse](docs/UsersprofileGetProfileInfodefaultResponse.md)
 - [UsersprofileSetProfileInfoRequest](docs/UsersprofileSetProfileInfoRequest.md)
 - [UsersprofileSetProfileInfoResponse](docs/UsersprofileSetProfileInfoResponse.md)
 - [UsersprofileSetProfileInfodefaultResponse](docs/UsersprofileSetProfileInfodefaultResponse.md)
 - [ViewsOpenResponse](docs/ViewsOpenResponse.md)
 - [ViewsOpendefaultResponse](docs/ViewsOpendefaultResponse.md)
 - [ViewsPublishResponse](docs/ViewsPublishResponse.md)
 - [ViewsPublishdefaultResponse](docs/ViewsPublishdefaultResponse.md)
 - [ViewsPushResponse](docs/ViewsPushResponse.md)
 - [ViewsPushdefaultResponse](docs/ViewsPushdefaultResponse.md)
 - [ViewsUpdateResponse](docs/ViewsUpdateResponse.md)
 - [ViewsUpdatedefaultResponse](docs/ViewsUpdatedefaultResponse.md)
 - [WorkflowsStepCompletedResponse](docs/WorkflowsStepCompletedResponse.md)
 - [WorkflowsStepCompleteddefaultResponse](docs/WorkflowsStepCompleteddefaultResponse.md)
 - [WorkflowsStepFailedResponse](docs/WorkflowsStepFailedResponse.md)
 - [WorkflowsStepFaileddefaultResponse](docs/WorkflowsStepFaileddefaultResponse.md)
 - [WorkflowsUpdateStepResponse](docs/WorkflowsUpdateStepResponse.md)
 - [WorkflowsUpdateStepdefaultResponse](docs/WorkflowsUpdateStepdefaultResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
