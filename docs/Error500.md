

# Error500

Error response for 500

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**NameEnum**](#NameEnum) |  |  [optional] |
|**message** | [**MessageEnum**](#MessageEnum) |  |  [optional] |
|**debugId** | **String** | The PayPal internal ID. Used for correlation purposes. |  [optional] |
|**informationLink** | [**InformationLinkEnum**](#InformationLinkEnum) | The information link, or URI, that shows detailed information about this error for the developer. |  [optional] [readonly] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| INTERNAL_SERVER_ERROR | &quot;INTERNAL_SERVER_ERROR&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| AN_INTERNAL_SERVER_ERROR_OCCURRED_ | &quot;An internal server error occurred.&quot; |



## Enum: InformationLinkEnum

| Name | Value |
|---- | -----|
| HTTPS_DEVELOPER_PAYPAL_COM_API_ORDERS_V2_ERROR_INTERNAL_SERVER_ERROR | &quot;https://developer.paypal.com/api/orders/v2/#error-INTERNAL_SERVER_ERROR&quot; |



