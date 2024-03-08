

# ChatPostMessageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asUser** | **String** | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [authorship](https://slack.dev) below. |  [optional] |
|**attachments** | **String** | A JSON-based array of structured attachments, presented as a URL-encoded string. |  [optional] |
|**blocks** | **String** | A JSON-based array of structured blocks, presented as a URL-encoded string. |  [optional] |
|**channel** | **String** | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. See [below](https://slack.dev) for more details. |  |
|**iconEmoji** | **String** | Emoji to use as the icon for this message. Overrides &#x60;icon_url&#x60;. Must be used in conjunction with &#x60;as_user&#x60; set to &#x60;false&#x60;, otherwise ignored. See [authorship](https://slack.dev) below. |  [optional] |
|**iconUrl** | **String** | URL to an image to use as the icon for this message. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](https://slack.dev) below. |  [optional] |
|**linkNames** | **Boolean** | Find and link channel names and usernames. |  [optional] |
|**mrkdwn** | **Boolean** | Disable Slack markup parsing by setting to &#x60;false&#x60;. Enabled by default. |  [optional] |
|**parse** | **String** | Change how messages are treated. Defaults to &#x60;none&#x60;. See [below](https://slack.dev). |  [optional] |
|**replyBroadcast** | **Boolean** | Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;. |  [optional] |
|**text** | **String** | How this field works and whether it is required depends on other fields you use in your API call. [See below](https://slack.dev) for more detail. |  [optional] |
|**threadTs** | **String** | Provide another message&#39;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent instead. |  [optional] |
|**unfurlLinks** | **Boolean** | Pass true to enable unfurling of primarily text-based content. |  [optional] |
|**unfurlMedia** | **Boolean** | Pass false to disable unfurling of media content. |  [optional] |
|**username** | **String** | Set your bot&#39;s user name. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](https://slack.dev) below. |  [optional] |



