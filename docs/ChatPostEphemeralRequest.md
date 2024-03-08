

# ChatPostEphemeralRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asUser** | **Boolean** | Pass true to post the message as the authed user. Defaults to true if the chat:write:bot scope is not included. Otherwise, defaults to false. |  [optional] |
|**attachments** | **String** | A JSON-based array of structured attachments, presented as a URL-encoded string. |  [optional] |
|**blocks** | **String** | A JSON-based array of structured blocks, presented as a URL-encoded string. |  [optional] |
|**channel** | **String** | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. |  |
|**iconEmoji** | **String** | Emoji to use as the icon for this message. Overrides &#x60;icon_url&#x60;. Must be used in conjunction with &#x60;as_user&#x60; set to &#x60;false&#x60;, otherwise ignored. See [authorship](https://slack.dev) below. |  [optional] |
|**iconUrl** | **String** | URL to an image to use as the icon for this message. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](https://slack.dev) below. |  [optional] |
|**linkNames** | **Boolean** | Find and link channel names and usernames. |  [optional] |
|**parse** | **String** | Change how messages are treated. Defaults to &#x60;none&#x60;. See [below](https://slack.dev). |  [optional] |
|**text** | **String** | How this field works and whether it is required depends on other fields you use in your API call. [See below](https://slack.dev) for more detail. |  [optional] |
|**threadTs** | **String** | Provide another message&#39;s &#x60;ts&#x60; value to post this message in a thread. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent&#39;s value instead. Ephemeral messages in threads are only shown if there is already an active thread. |  [optional] |
|**user** | **String** | &#x60;id&#x60; of the user who will receive the ephemeral message. The user should be in the channel specified by the &#x60;channel&#x60; argument. |  |
|**username** | **String** | Set your bot&#39;s user name. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](https://slack.dev) below. |  [optional] |



