

# ChatUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asUser** | **String** | Pass true to update the message as the authed user. [Bot users](https://slack.dev) in this context are considered authed users. |  [optional] |
|**attachments** | **String** | A JSON-based array of structured attachments, presented as a URL-encoded string. This field is required when not presenting &#x60;text&#x60;. If you don&#39;t include this field, the message&#39;s previous &#x60;attachments&#x60; will be retained. To remove previous &#x60;attachments&#x60;, include an empty array for this field. |  [optional] |
|**blocks** | **String** | A JSON-based array of [structured blocks](https://slack.dev), presented as a URL-encoded string. If you don&#39;t include this field, the message&#39;s previous &#x60;blocks&#x60; will be retained. To remove previous &#x60;blocks&#x60;, include an empty array for this field. |  [optional] |
|**channel** | **String** | Channel containing the message to be updated. |  |
|**linkNames** | **String** | Find and link channel names and usernames. Defaults to &#x60;none&#x60;. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, &#x60;none&#x60;. |  [optional] |
|**parse** | **String** | Change how messages are treated. Defaults to &#x60;client&#x60;, unlike &#x60;chat.postMessage&#x60;. Accepts either &#x60;none&#x60; or &#x60;full&#x60;. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, &#x60;client&#x60;. |  [optional] |
|**text** | **String** | New text for the message, using the [default formatting rules](https://slack.dev). It&#39;s not required when presenting &#x60;blocks&#x60; or &#x60;attachments&#x60;. |  [optional] |
|**ts** | **String** | Timestamp of the message to be updated. |  |



