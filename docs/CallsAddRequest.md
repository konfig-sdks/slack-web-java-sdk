

# CallsAddRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The name of the Call. |  [optional] |
|**createdBy** | **String** | The valid Slack user ID of the user who created this Call. When this method is called with a user token, the &#x60;created_by&#x60; field is optional and defaults to the authed user of the token. Otherwise, the field is required. |  [optional] |
|**dateStart** | **Integer** | Call start time in UTC UNIX timestamp format |  [optional] |
|**desktopAppJoinUrl** | **String** | When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. |  [optional] |
|**externalDisplayId** | **String** | An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object. |  [optional] |
|**externalUniqueId** | **String** | An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service. |  |
|**joinUrl** | **String** | The URL required for a client to join the Call. |  |
|**users** | **String** | The list of users to register as participants in the Call. [Read more on how to specify users here](https://slack.dev). |  [optional] |



