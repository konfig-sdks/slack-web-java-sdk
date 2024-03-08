

# FilesremoteUpdateRemoteFileRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Title of the file being shared. |  [optional] |
|**externalId** | **String** | Creator defined GUID for the file. |  [optional] |
|**externalUrl** | **String** | URL of the remote file. |  [optional] |
|**_file** | **String** | Specify a file by providing its ID. |  [optional] |
|**filetype** | **String** | type of file |  [optional] |
|**indexableFileContents** | **String** | File containing contents that can be used to improve searchability for the remote file. |  [optional] |
|**previewImage** | **String** | Preview of the document via &#x60;multipart/form-data&#x60;. |  [optional] |
|**token** | **String** | Authentication token. Requires scope: &#x60;remote_files:write&#x60; |  [optional] |



