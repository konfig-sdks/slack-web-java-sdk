

# AdminusersInviteUserToWorkspaceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelIds** | **String** | A comma-separated list of &#x60;channel_id&#x60;s for this user to join. At least one channel is required. |  |
|**customMessage** | **String** | An optional message to send to the user in the invite email. |  [optional] |
|**email** | **String** | The email address of the person to invite. |  |
|**guestExpirationTs** | **String** | Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date. |  [optional] |
|**isRestricted** | **Boolean** | Is this user a multi-channel guest user? (default: false) |  [optional] |
|**isUltraRestricted** | **Boolean** | Is this user a single channel guest user? (default: false) |  [optional] |
|**realName** | **String** | Full name of the user. |  [optional] |
|**resend** | **Boolean** | Allow this invite to be resent in the future if a user has not signed up yet. (default: false) |  [optional] |
|**teamId** | **String** | The ID (&#x60;T1234&#x60;) of the workspace. |  |



