

# ChatDeleteScheduledMessagedefaultResponse

Schema for error response from chat.deleteScheduledMessage method

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callstack** | **String** | Note: PHP callstack is only visible in dev/qa |  [optional] |
|**error** | [**ErrorEnum**](#ErrorEnum) |  |  |
|**ok** | **DefsOkFalse** |  |  |



## Enum: ErrorEnum

| Name | Value |
|---- | -----|
| INVALID_SCHEDULED_MESSAGE_ID | &quot;invalid_scheduled_message_id&quot; |
| CHANNEL_NOT_FOUND | &quot;channel_not_found&quot; |
| BAD_TOKEN | &quot;bad_token&quot; |
| NOT_AUTHED | &quot;not_authed&quot; |
| INVALID_AUTH | &quot;invalid_auth&quot; |
| ACCOUNT_INACTIVE | &quot;account_inactive&quot; |
| TOKEN_REVOKED | &quot;token_revoked&quot; |
| NO_PERMISSION | &quot;no_permission&quot; |
| ORG_LOGIN_REQUIRED | &quot;org_login_required&quot; |
| EKM_ACCESS_DENIED | &quot;ekm_access_denied&quot; |
| MISSING_SCOPE | &quot;missing_scope&quot; |
| INVALID_ARGUMENTS | &quot;invalid_arguments&quot; |
| INVALID_ARG_NAME | &quot;invalid_arg_name&quot; |
| INVALID_CHARSET | &quot;invalid_charset&quot; |
| INVALID_FORM_DATA | &quot;invalid_form_data&quot; |
| INVALID_POST_TYPE | &quot;invalid_post_type&quot; |
| MISSING_POST_TYPE | &quot;missing_post_type&quot; |
| TEAM_ADDED_TO_ORG | &quot;team_added_to_org&quot; |
| INVALID_JSON | &quot;invalid_json&quot; |
| JSON_NOT_OBJECT | &quot;json_not_object&quot; |
| REQUEST_TIMEOUT | &quot;request_timeout&quot; |
| UPGRADE_REQUIRED | &quot;upgrade_required&quot; |
| FATAL_ERROR | &quot;fatal_error&quot; |



