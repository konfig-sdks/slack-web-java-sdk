

# AdminconversationsrestrictAccessAddGroupIdpGroupsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelId** | **String** | The channel to link this group to. |  |
|**groupId** | **String** | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel. |  |
|**teamId** | **String** | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. |  [optional] |
|**token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |  |



