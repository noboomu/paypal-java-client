

# TemplatesUpdate400Response


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
| INVALID_REQUEST | &quot;INVALID_REQUEST&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| REQUEST_IS_NOT_WELL_FORMED_SYNTACTICALLY_INCORRECT_OR_VIOLATES_SCHEMA_ | &quot;Request is not well-formed, syntactically incorrect, or violates schema.&quot; |



