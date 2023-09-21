

# Error404

Error response for 404

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**NameEnum**](#NameEnum) |  |  [optional] |
|**message** | [**MessageEnum**](#MessageEnum) |  |  [optional] |
|**issues** | [**List&lt;ErrorDetails&gt;**](ErrorDetails.md) |  |  [optional] |
|**debugId** | **String** | The PayPal internal ID. Used for correlation purposes. |  [optional] |
|**informationLink** | **String** | The information link, or URI, that shows detailed information about this error for the developer. |  [optional] [readonly] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| RESOURCE_NOT_FOUND | &quot;RESOURCE_NOT_FOUND&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| THE_SPECIFIED_RESOURCE_DOES_NOT_EXIST_ | &quot;The specified resource does not exist.&quot; |



