

# TeamObjectProperty


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**archived** | **Boolean** |  |  [optional] |
|**avatarBaseUrl** | **URI** |  |  [optional] |
|**created** | **Integer** |  |  [optional] |
|**dateCreate** | **Integer** |  |  [optional] |
|**deleted** | **Boolean** |  |  [optional] |
|**discoverable** | **Object** |  |  [optional] |
|**domain** | **String** |  |  |
|**emailDomain** | **String** |  |  |
|**enterpriseId** | **String** |  |  [optional] |
|**enterpriseName** | **String** |  |  [optional] |
|**externalOrgMigrations** | [**ExternalOrgMigrationsProperty**](ExternalOrgMigrationsProperty.md) |  |  [optional] |
|**hasComplianceExport** | **Boolean** |  |  [optional] |
|**icon** | [**TeamObjectPropertyIcon**](TeamObjectPropertyIcon.md) |  |  |
|**id** | **String** |  |  |
|**isAssigned** | **Boolean** |  |  [optional] |
|**isEnterprise** | **Integer** |  |  [optional] |
|**isOverStorageLimit** | **Boolean** |  |  [optional] |
|**limitTs** | **Integer** |  |  [optional] |
|**locale** | **String** |  |  [optional] |
|**messagesCount** | **Integer** |  |  [optional] |
|**msgEditWindowMins** | **Integer** |  |  [optional] |
|**name** | **String** |  |  |
|**overIntegrationsLimit** | **Boolean** |  |  [optional] |
|**overStorageLimit** | **Boolean** |  |  [optional] |
|**payProdCur** | **String** |  |  [optional] |
|**plan** | [**PlanEnum**](#PlanEnum) |  |  [optional] |
|**primaryOwner** | [**TeamObjectPropertyPrimaryOwner**](TeamObjectPropertyPrimaryOwner.md) |  |  [optional] |
|**ssoProvider** | [**TeamObjectPropertySsoProvider**](TeamObjectPropertySsoProvider.md) |  |  [optional] |



## Enum: PlanEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| STD | &quot;std&quot; |
| PLUS | &quot;plus&quot; |
| COMPLIANCE | &quot;compliance&quot; |
| ENTERPRISE | &quot;enterprise&quot; |



