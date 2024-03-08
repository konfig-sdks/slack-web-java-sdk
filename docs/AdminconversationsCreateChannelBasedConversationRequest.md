

# AdminconversationsCreateChannelBasedConversationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the public or private channel to create. |  [optional] |
|**isPrivate** | **Boolean** | When &#x60;true&#x60;, creates a private channel instead of a public channel |  |
|**name** | **String** | Name of the public or private channel to create. |  |
|**orgWide** | **Boolean** | When &#x60;true&#x60;, the channel will be available org-wide. Note: if the channel is not &#x60;org_wide&#x3D;true&#x60;, you must specify a &#x60;team_id&#x60; for this channel |  [optional] |
|**teamId** | **String** | The workspace to create the channel in. Note: this argument is required unless you set &#x60;org_wide&#x3D;true&#x60;. |  [optional] |



