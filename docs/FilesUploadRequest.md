

# FilesUploadRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Title of file. |  [optional] |
|**channels** | **String** | Comma-separated list of channel names or IDs where the file will be shared. |  [optional] |
|**content** | **String** | File contents via a POST variable. If omitting this parameter, you must provide a &#x60;file&#x60;. |  [optional] |
|**_file** | **String** | File contents via &#x60;multipart/form-data&#x60;. If omitting this parameter, you must submit &#x60;content&#x60;. |  [optional] |
|**filename** | **String** | Filename of file. |  [optional] |
|**filetype** | **String** | A [file type](https://slack.dev) identifier. |  [optional] |
|**initialComment** | **String** | The message text introducing the file in specified &#x60;channels&#x60;. |  [optional] |
|**threadTs** | **Double** | Provide another message&#39;s &#x60;ts&#x60; value to upload this file as a reply. Never use a reply&#39;s &#x60;ts&#x60; value; use its parent instead. |  [optional] |
|**token** | **String** | Authentication token. Requires scope: &#x60;files:write:user&#x60; |  [optional] |



