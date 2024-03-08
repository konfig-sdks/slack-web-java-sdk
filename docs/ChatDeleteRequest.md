

# ChatDeleteRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asUser** | **Boolean** | Pass true to delete the message as the authed user with &#x60;chat:write:user&#x60; scope. [Bot users](https://slack.dev) in this context are considered authed users. If unused or false, the message will be deleted with &#x60;chat:write:bot&#x60; scope. |  [optional] |
|**channel** | **String** | Channel containing the message to be deleted. |  [optional] |
|**ts** | **Double** | Timestamp of the message to be deleted. |  [optional] |



