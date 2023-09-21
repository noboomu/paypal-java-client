

# RefundDetail

The refund details of the invoice. Includes the refund type, date, amount, and method.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **PaymentType** |  |  [optional] |
|**refundId** | **String** | The ID for a PayPal payment transaction. Required for the &#x60;PAYPAL&#x60; payment type. |  [optional] [readonly] |
|**refundDate** | **String** | The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard &#x60;date_time&#x60; type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years. |  [optional] |
|**amount** | [**Money**](Money.md) |  |  [optional] |
|**method** | **PaymentMethod** |  |  |


