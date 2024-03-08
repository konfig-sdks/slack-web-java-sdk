

# AdminconversationsSetTeamsWorkspaceConnectionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelId** | **String** | The encoded &#x60;channel_id&#x60; to add or remove to workspaces. |  |
|**orgChannel** | **Boolean** | True if channel has to be converted to an org channel |  [optional] |
|**targetTeamIds** | **String** | A comma-separated list of workspaces to which the channel should be shared. Not required if the channel is being shared org-wide. |  [optional] |
|**teamId** | **String** | The workspace to which the channel belongs. Omit this argument if the channel is a cross-workspace shared channel. |  [optional] |



