

# PinsRemovedefaultResponse

Schema for error response from pins.remove method

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
| FILE_NOT_FOUND | &quot;file_not_found&quot; |
| FILE_COMMENT_NOT_FOUND | &quot;file_comment_not_found&quot; |
| MESSAGE_NOT_FOUND | &quot;message_not_found&quot; |
| NO_ITEM_SPECIFIED | &quot;no_item_specified&quot; |
| NOT_PINNED | &quot;not_pinned&quot; |
| PERMISSION_DENIED | &quot;permission_denied&quot; |
| NOT_AUTHED | &quot;not_authed&quot; |
| INVALID_AUTH | &quot;invalid_auth&quot; |
| ACCOUNT_INACTIVE | &quot;account_inactive&quot; |
| NO_PERMISSION | &quot;no_permission&quot; |
| INVALID_ARG_NAME | &quot;invalid_arg_name&quot; |
| INVALID_ARRAY_ARG | &quot;invalid_array_arg&quot; |
| INVALID_CHARSET | &quot;invalid_charset&quot; |
| INVALID_FORM_DATA | &quot;invalid_form_data&quot; |
| INVALID_POST_TYP | &quot;invalid_post_typ&quot; |
| MISSING_POST_TYP | &quot;missing_post_typ&quot; |
| TEAM_ADDED_TO_ORG | &quot;team_added_to_org&quot; |
| INVALID_JSON | &quot;invalid_json&quot; |
| JSON_NOT_OBJECT | &quot;json_not_object&quot; |
| REQUEST_TIMEOU | &quot;request_timeou&quot; |
| UPGRADE_REQUIRED | &quot;upgrade_required&quot; |



