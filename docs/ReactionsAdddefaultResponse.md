

# ReactionsAdddefaultResponse

Schema for error response from reactions.add method

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callstack** | **String** | Note: PHP callstack is only visible in dev/qa |  [optional] |
|**error** | [**ErrorEnum**](#ErrorEnum) |  |  |
|**ok** | **DefsOkFalse** |  |  |



## Enum: ErrorEnum

| Name | Value |
|---- | -----|
| BAD_TIMESTAMP | &quot;bad_timestamp&quot; |
| MESSAGE_NOT_FOUND | &quot;message_not_found&quot; |
| NO_ITEM_SPECIFIED | &quot;no_item_specified&quot; |
| INVALID_NAME | &quot;invalid_name&quot; |
| ALREADY_REACTED | &quot;already_reacted&quot; |
| TOO_MANY_EMOJI | &quot;too_many_emoji&quot; |
| TOO_MANY_REACTIONS | &quot;too_many_reactions&quot; |
| NOT_AUTHED | &quot;not_authed&quot; |
| INVALID_AUTH | &quot;invalid_auth&quot; |
| ACCOUNT_INACTIVE | &quot;account_inactive&quot; |
| NO_PERMISSION | &quot;no_permission&quot; |
| INVALID_ARG_NAME | &quot;invalid_arg_name&quot; |
| INVALID_ARRAY_ARG | &quot;invalid_array_arg&quot; |
| INVALID_CHARSET | &quot;invalid_charset&quot; |
| INVALID_FORM_DATA | &quot;invalid_form_data&quot; |
| INVALID_POST_TYPE | &quot;invalid_post_type&quot; |
| MISSING_POST_TYPE | &quot;missing_post_type&quot; |
| TEAM_ADDED_TO_ORG | &quot;team_added_to_org&quot; |
| INVALID_JSON | &quot;invalid_json&quot; |
| JSON_NOT_OBJECT | &quot;json_not_object&quot; |
| REQUEST_TIMEOUT | &quot;request_timeout&quot; |
| UPGRADE_REQUIRED | &quot;upgrade_required&quot; |



