

# ChatUnfurlRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | **String** | Channel ID of the message |  |
|**ts** | **String** | Timestamp of the message to add unfurl behavior to. |  |
|**unfurls** | **String** | URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl blocks or message attachments. |  [optional] |
|**userAuthMessage** | **String** | Provide a simply-formatted string to send as an ephemeral message to the user as invitation to authenticate further and enable full unfurling behavior |  [optional] |
|**userAuthRequired** | **Boolean** | Set to &#x60;true&#x60; or &#x60;1&#x60; to indicate the user must install your Slack app to trigger unfurls for this domain |  [optional] |
|**userAuthUrl** | **String** | Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling. Value should be properly URL-encoded. |  [optional] |



