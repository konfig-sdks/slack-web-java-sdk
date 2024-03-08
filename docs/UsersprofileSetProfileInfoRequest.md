

# UsersprofileSetProfileInfoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of a single key to set. Usable only if &#x60;profile&#x60; is not passed. |  [optional] |
|**profile** | **String** | Collection of key:value pairs presented as a URL-encoded JSON hash. At most 50 fields may be set. Each field name is limited to 255 characters. |  [optional] |
|**user** | **String** | ID of user to change. This argument may only be specified by team admins on paid teams. |  [optional] |
|**value** | **String** | Value to set a single key to. Usable only if &#x60;profile&#x60; is not passed. |  [optional] |



