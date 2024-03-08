

# ConversationObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **Integer** |  |  [optional] |
|**acceptedUser** | **String** |  |  [optional] |
|**connectedTeamIds** | **Set&lt;String&gt;** |  |  [optional] |
|**conversationHostId** | **String** |  |  [optional] |
|**created** | **Integer** |  |  |
|**creator** | **String** |  |  [optional] |
|**displayCounts** | [**ConversationObjectDisplayCounts**](ConversationObjectDisplayCounts.md) |  |  [optional] |
|**enterpriseId** | **String** |  |  [optional] |
|**hasPins** | **Boolean** |  |  [optional] |
|**id** | **String** |  |  |
|**internalTeamIds** | **Set&lt;String&gt;** |  |  [optional] |
|**isArchived** | **Boolean** |  |  [optional] |
|**isChannel** | **Boolean** |  |  [optional] |
|**isExtShared** | **Boolean** |  |  [optional] |
|**isFrozen** | **Boolean** |  |  [optional] |
|**isGeneral** | **Boolean** |  |  [optional] |
|**isGlobalShared** | **Boolean** |  |  [optional] |
|**isGroup** | **Boolean** |  |  [optional] |
|**isIm** | **Boolean** |  |  |
|**isMember** | **Boolean** |  |  [optional] |
|**isMoved** | **Integer** |  |  [optional] |
|**isMpim** | [**IsMpimEnum**](#IsMpimEnum) |  |  [optional] |
|**isNonThreadable** | **Boolean** |  |  [optional] |
|**isOpen** | **Boolean** |  |  [optional] |
|**isOrgDefault** | **Boolean** |  |  [optional] |
|**isOrgMandatory** | **Boolean** |  |  [optional] |
|**isOrgShared** | **Boolean** |  |  |
|**isPendingExtShared** | **Boolean** |  |  [optional] |
|**isPrivate** | **Boolean** |  |  [optional] |
|**isReadOnly** | **Boolean** |  |  [optional] |
|**isShared** | **Boolean** |  |  [optional] |
|**isStarred** | **Boolean** |  |  [optional] |
|**isThreadOnly** | **Boolean** |  |  [optional] |
|**lastRead** | **String** |  |  [optional] |
|**latest** | **Object** |  |  [optional] |
|**members** | **Set&lt;String&gt;** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**nameNormalized** | **String** |  |  [optional] |
|**numMembers** | **Integer** |  |  [optional] |
|**parentConversation** | **Object** |  |  [optional] |
|**pendingConnectedTeamIds** | **Set&lt;String&gt;** |  |  [optional] |
|**pendingShared** | **Set&lt;String&gt;** |  |  [optional] |
|**pinCount** | **Integer** |  |  [optional] |
|**previousNames** | **Set&lt;String&gt;** |  |  [optional] |
|**priority** | **Double** |  |  [optional] |
|**purpose** | [**ConversationObjectPurpose**](ConversationObjectPurpose.md) |  |  [optional] |
|**sharedTeamIds** | **Set&lt;String&gt;** |  |  [optional] |
|**shares** | [**Set&lt;ConversationObjectSharesInner&gt;**](ConversationObjectSharesInner.md) |  |  [optional] |
|**timezoneCount** | **Integer** |  |  [optional] |
|**topic** | [**ConversationObjectPurpose**](ConversationObjectPurpose.md) |  |  [optional] |
|**unlinked** | **Integer** |  |  [optional] |
|**unreadCount** | **Integer** |  |  [optional] |
|**unreadCountDisplay** | **Integer** |  |  [optional] |
|**useCase** | **String** |  |  [optional] |
|**user** | **String** |  |  [optional] |
|**isUserDeleted** | **Boolean** |  |  [optional] |



## Enum: IsMpimEnum

| Name | Value |
|---- | -----|
| FALSE | &quot;false&quot; |



