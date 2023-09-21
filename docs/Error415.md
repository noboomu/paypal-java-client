

# Error415

Error response for 415

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
| UNSUPPORTED_MEDIA_TYPE | &quot;UNSUPPORTED_MEDIA_TYPE&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| THE_SERVER_DOES_NOT_SUPPORT_THE_REQUEST_PAYLOAD_S_MEDIA_TYPE_ | &quot;The server does not support the request payload&#39;s media type.&quot; |



