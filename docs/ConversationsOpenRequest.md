

# ConversationsOpenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | **String** | Resume a conversation by supplying an &#x60;im&#x60; or &#x60;mpim&#x60;&#39;s ID. Or provide the &#x60;users&#x60; field instead. |  [optional] |
|**returnIm** | **Boolean** | Boolean, indicates you want the full IM channel definition in the response. |  [optional] |
|**users** | **String** | Comma separated lists of users. If only one user is included, this creates a 1:1 DM.  The ordering of the users is preserved whenever a multi-person direct message is returned. Supply a &#x60;channel&#x60; when not supplying &#x60;users&#x60;. |  [optional] |



