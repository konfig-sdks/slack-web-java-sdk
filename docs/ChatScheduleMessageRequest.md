

# ChatScheduleMessageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asUser** | **Boolean** | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [chat.postMessage](chat.postMessage#authorship). |  [optional] |
|**attachments** | **String** | A JSON-based array of structured attachments, presented as a URL-encoded string. |  [optional] |
|**blocks** | **String** | A JSON-based array of structured blocks, presented as a URL-encoded string. |  [optional] |
|**channel** | **String** | Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See [below](https://slack.dev) for more details. |  [optional] |
|**linkNames** | **Boolean** | Find and link channel names and usernames. |  [optional] |
|**parse** | **String** | Change how messages are treated. Defaults to &#x60;none&#x60;. See [chat.postMessage](chat.postMessage#formatting). |  [optional] |
|**postAt** | **String** | Unix EPOCH timestamp of time in future to send the message. |  [optional] |
|**replyBroadcast** | **Boolean** | Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;. |  [optional] |
|**text** | **String** | How this field works and whether it is required depends on other fields you use in your API call. [See below](https://slack.dev) for more detail. |  [optional] |
|**threadTs** | **Double** | Provide another message&#39;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent instead. |  [optional] |
|**unfurlLinks** | **Boolean** | Pass true to enable unfurling of primarily text-based content. |  [optional] |
|**unfurlMedia** | **Boolean** | Pass false to disable unfurling of media content. |  [optional] |



