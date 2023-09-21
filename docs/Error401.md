

# Error401

Error response for 401

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
| AUTHENTICATION_FAILURE | &quot;AUTHENTICATION_FAILURE&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| AUTHENTICATION_FAILED_DUE_TO_MISSING_AUTHORIZATION_HEADER_OR_INVALID_AUTHENTICATION_CREDENTIALS_ | &quot;Authentication failed due to missing authorization header, or invalid authentication credentials.&quot; |



