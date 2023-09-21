

# InvoicesRemind403Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**NameEnum**](#NameEnum) |  |  [optional] |
|**message** | [**MessageEnum**](#MessageEnum) |  |  [optional] |
|**issues** | [**List&lt;AnyOf&gt;**](AnyOf.md) |  |  [optional] |
|**debugId** | **String** | The PayPal internal ID. Used for correlation purposes. |  [optional] |
|**informationLink** | **String** | The information link, or URI, that shows detailed information about this error for the developer. |  [optional] [readonly] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| NOT_AUTHORIZED | &quot;NOT_AUTHORIZED&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| AUTHORIZATION_FAILED_DUE_TO_INSUFFICIENT_PERMISSIONS_ | &quot;Authorization failed due to insufficient permissions.&quot; |



