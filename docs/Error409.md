

# Error409

Error response for 409

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
| RESOURCE_CONFLICT | &quot;RESOURCE_CONFLICT&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| THE_SERVER_HAS_DETECTED_A_CONFLICT_WHILE_PROCESSING_THIS_REQUEST_ | &quot;The server has detected a conflict while processing this request.&quot; |



