

# InvoicesRemind422Response


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
| UNPROCESSABLE_ENTITY | &quot;UNPROCESSABLE_ENTITY&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| THE_REQUESTED_ACTION_COULD_NOT_BE_PERFORMED_SEMANTICALLY_INCORRECT_OR_FAILED_BUSINESS_VALIDATION_ | &quot;The requested action could not be performed, semantically incorrect, or failed business validation.&quot; |



