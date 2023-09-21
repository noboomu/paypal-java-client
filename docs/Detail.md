

# Detail

The details of the invoice like notes, terms and conditions, memo, attachments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reference** | **String** | The reference data. Includes a post office (PO) number. |  [optional] |
|**currencyCode** | **String** | The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/) that identifies the currency. |  |
|**note** | **String** | A note to the invoice recipient. Also appears on the invoice notification email. |  [optional] |
|**termsAndConditions** | **String** | The general terms of the invoice. Can include return or cancellation policy and other terms and conditions. |  [optional] |
|**memo** | **String** | A private bookkeeping memo for the user. |  [optional] |
|**attachments** | [**List&lt;FileReference&gt;**](FileReference.md) | An array of PayPal IDs for the files that are attached to an invoice. |  [optional] |



