# InvoicesApi

All URIs are relative to *https://api-m.sandbox.paypal.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**invoicesCancel**](InvoicesApi.md#invoicesCancel) | **POST** /v2/invoicing/invoices/{invoice_id}/cancel | Cancel sent invoice |
| [**invoicesCancelWithHttpInfo**](InvoicesApi.md#invoicesCancelWithHttpInfo) | **POST** /v2/invoicing/invoices/{invoice_id}/cancel | Cancel sent invoice |
| [**invoicesCreate**](InvoicesApi.md#invoicesCreate) | **POST** /v2/invoicing/invoices | Create draft invoice |
| [**invoicesCreateWithHttpInfo**](InvoicesApi.md#invoicesCreateWithHttpInfo) | **POST** /v2/invoicing/invoices | Create draft invoice |
| [**invoicesDelete**](InvoicesApi.md#invoicesDelete) | **DELETE** /v2/invoicing/invoices/{invoice_id} | Delete invoice |
| [**invoicesDeleteWithHttpInfo**](InvoicesApi.md#invoicesDeleteWithHttpInfo) | **DELETE** /v2/invoicing/invoices/{invoice_id} | Delete invoice |
| [**invoicesGenerateQrCode**](InvoicesApi.md#invoicesGenerateQrCode) | **POST** /v2/invoicing/invoices/{invoice_id}/generate-qr-code | Generate QR code |
| [**invoicesGenerateQrCodeWithHttpInfo**](InvoicesApi.md#invoicesGenerateQrCodeWithHttpInfo) | **POST** /v2/invoicing/invoices/{invoice_id}/generate-qr-code | Generate QR code |
| [**invoicesGet**](InvoicesApi.md#invoicesGet) | **GET** /v2/invoicing/invoices/{invoice_id} | Show invoice details |
| [**invoicesGetWithHttpInfo**](InvoicesApi.md#invoicesGetWithHttpInfo) | **GET** /v2/invoicing/invoices/{invoice_id} | Show invoice details |
| [**invoicesList**](InvoicesApi.md#invoicesList) | **GET** /v2/invoicing/invoices | List invoices |
| [**invoicesListWithHttpInfo**](InvoicesApi.md#invoicesListWithHttpInfo) | **GET** /v2/invoicing/invoices | List invoices |
| [**invoicesPayments**](InvoicesApi.md#invoicesPayments) | **POST** /v2/invoicing/invoices/{invoice_id}/payments | Record payment for invoice |
| [**invoicesPaymentsWithHttpInfo**](InvoicesApi.md#invoicesPaymentsWithHttpInfo) | **POST** /v2/invoicing/invoices/{invoice_id}/payments | Record payment for invoice |
| [**invoicesPaymentsDelete**](InvoicesApi.md#invoicesPaymentsDelete) | **DELETE** /v2/invoicing/invoices/{invoice_id}/payments/{transaction_id} | Delete external payment |
| [**invoicesPaymentsDeleteWithHttpInfo**](InvoicesApi.md#invoicesPaymentsDeleteWithHttpInfo) | **DELETE** /v2/invoicing/invoices/{invoice_id}/payments/{transaction_id} | Delete external payment |
| [**invoicesRefunds**](InvoicesApi.md#invoicesRefunds) | **POST** /v2/invoicing/invoices/{invoice_id}/refunds | Record refund for invoice |
| [**invoicesRefundsWithHttpInfo**](InvoicesApi.md#invoicesRefundsWithHttpInfo) | **POST** /v2/invoicing/invoices/{invoice_id}/refunds | Record refund for invoice |
| [**invoicesRefundsDelete**](InvoicesApi.md#invoicesRefundsDelete) | **DELETE** /v2/invoicing/invoices/{invoice_id}/refunds/{transaction_id} | Delete external refund |
| [**invoicesRefundsDeleteWithHttpInfo**](InvoicesApi.md#invoicesRefundsDeleteWithHttpInfo) | **DELETE** /v2/invoicing/invoices/{invoice_id}/refunds/{transaction_id} | Delete external refund |
| [**invoicesRemind**](InvoicesApi.md#invoicesRemind) | **POST** /v2/invoicing/invoices/{invoice_id}/remind | Send invoice reminder |
| [**invoicesRemindWithHttpInfo**](InvoicesApi.md#invoicesRemindWithHttpInfo) | **POST** /v2/invoicing/invoices/{invoice_id}/remind | Send invoice reminder |
| [**invoicesSend**](InvoicesApi.md#invoicesSend) | **POST** /v2/invoicing/invoices/{invoice_id}/send | Send invoice |
| [**invoicesSendWithHttpInfo**](InvoicesApi.md#invoicesSendWithHttpInfo) | **POST** /v2/invoicing/invoices/{invoice_id}/send | Send invoice |
| [**invoicesUpdate**](InvoicesApi.md#invoicesUpdate) | **PUT** /v2/invoicing/invoices/{invoice_id} | Fully update invoice |
| [**invoicesUpdateWithHttpInfo**](InvoicesApi.md#invoicesUpdateWithHttpInfo) | **PUT** /v2/invoicing/invoices/{invoice_id} | Fully update invoice |
| [**invoicingGenerateNextInvoiceNumber**](InvoicesApi.md#invoicingGenerateNextInvoiceNumber) | **POST** /v2/invoicing/generate-next-invoice-number | Generate invoice number |
| [**invoicingGenerateNextInvoiceNumberWithHttpInfo**](InvoicesApi.md#invoicingGenerateNextInvoiceNumberWithHttpInfo) | **POST** /v2/invoicing/generate-next-invoice-number | Generate invoice number |



## invoicesCancel

> CompletableFuture<Void> invoicesCancel(invoiceId, notification)

Cancel sent invoice

Cancels a sent invoice, by ID, and, optionally, sends a notification about the cancellation to the payer, merchant, and CC: emails.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        Notification notification = new Notification(); // Notification | The email or SMS notification that will be sent to the payer on cancellation.
        try {
            CompletableFuture<Void> result = apiInstance.invoicesCancel(invoiceId, notification);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesCancel");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **notification** | [**Notification**](Notification.md)| The email or SMS notification that will be sent to the payer on cancellation. | |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |

## invoicesCancelWithHttpInfo

> CompletableFuture<ApiResponse<Void>> invoicesCancel invoicesCancelWithHttpInfo(invoiceId, notification)

Cancel sent invoice

Cancels a sent invoice, by ID, and, optionally, sends a notification about the cancellation to the payer, merchant, and CC: emails.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        Notification notification = new Notification(); // Notification | The email or SMS notification that will be sent to the payer on cancellation.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.invoicesCancelWithHttpInfo(invoiceId, notification);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InvoicesApi#invoicesCancel");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesCancel");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **notification** | [**Notification**](Notification.md)| The email or SMS notification that will be sent to the payer on cancellation. | |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |


## invoicesCreate

> CompletableFuture<Invoice> invoicesCreate(invoice)

Create draft invoice

Creates a draft invoice. To move the invoice from a draft to payable state, you must &lt;a href&#x3D;\&quot;#invoices_send\&quot;&gt;send the invoice&lt;/a&gt;.&lt;br/&gt;&lt;br/&gt;In the JSON request body, include invoice details including merchant information. The &lt;code&gt;invoice&lt;/code&gt; object must include an &lt;code&gt;items&lt;/code&gt; array.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The merchant that you specify in an invoice must have a PayPal account in good standing.&lt;/blockquote&gt;.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        Invoice invoice = new Invoice(); // Invoice | The invoice details which includes all information of the invoice like items, billing information.
        try {
            CompletableFuture<Invoice> result = apiInstance.invoicesCreate(invoice);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoice** | [**Invoice**](Invoice.md)| The invoice details which includes all information of the invoice like items, billing information. | |

### Return type

CompletableFuture<[**Invoice**](Invoice.md)>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A successful request returns the HTTP &#x60;201 Created&#x60; status code. A JSON response body that shows invoice details is returned if you set &lt;code&gt;prefer&#x3D;return&#x3D;representation&lt;/code&gt;. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |

## invoicesCreateWithHttpInfo

> CompletableFuture<ApiResponse<Invoice>> invoicesCreate invoicesCreateWithHttpInfo(invoice)

Create draft invoice

Creates a draft invoice. To move the invoice from a draft to payable state, you must &lt;a href&#x3D;\&quot;#invoices_send\&quot;&gt;send the invoice&lt;/a&gt;.&lt;br/&gt;&lt;br/&gt;In the JSON request body, include invoice details including merchant information. The &lt;code&gt;invoice&lt;/code&gt; object must include an &lt;code&gt;items&lt;/code&gt; array.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The merchant that you specify in an invoice must have a PayPal account in good standing.&lt;/blockquote&gt;.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        Invoice invoice = new Invoice(); // Invoice | The invoice details which includes all information of the invoice like items, billing information.
        try {
            CompletableFuture<ApiResponse<Invoice>> response = apiInstance.invoicesCreateWithHttpInfo(invoice);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InvoicesApi#invoicesCreate");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoice** | [**Invoice**](Invoice.md)| The invoice details which includes all information of the invoice like items, billing information. | |

### Return type

CompletableFuture<ApiResponse<[**Invoice**](Invoice.md)>>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A successful request returns the HTTP &#x60;201 Created&#x60; status code. A JSON response body that shows invoice details is returned if you set &lt;code&gt;prefer&#x3D;return&#x3D;representation&lt;/code&gt;. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |


## invoicesDelete

> CompletableFuture<Void> invoicesDelete(invoiceId)

Delete invoice

Deletes a draft or scheduled invoice, by ID. Deletes invoices in the draft or scheduled state only. For invoices that have already been sent, you can &lt;a href&#x3D;\&quot;/docs/api/invoicing/v2/#invoices_cancel\&quot;&gt;cancel the invoice&lt;/a&gt;. After you delete a draft or scheduled invoice, you can no longer use it or show its details. However, you can reuse its invoice number.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        try {
            CompletableFuture<Void> result = apiInstance.invoicesDelete(invoiceId);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **0** | The default response. |  -  |

## invoicesDeleteWithHttpInfo

> CompletableFuture<ApiResponse<Void>> invoicesDelete invoicesDeleteWithHttpInfo(invoiceId)

Delete invoice

Deletes a draft or scheduled invoice, by ID. Deletes invoices in the draft or scheduled state only. For invoices that have already been sent, you can &lt;a href&#x3D;\&quot;/docs/api/invoicing/v2/#invoices_cancel\&quot;&gt;cancel the invoice&lt;/a&gt;. After you delete a draft or scheduled invoice, you can no longer use it or show its details. However, you can reuse its invoice number.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.invoicesDeleteWithHttpInfo(invoiceId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InvoicesApi#invoicesDelete");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **0** | The default response. |  -  |


## invoicesGenerateQrCode

> CompletableFuture<Void> invoicesGenerateQrCode(invoiceId, qrConfig)

Generate QR code

Generates a QR code for an invoice, by ID. The QR code is a PNG image in &lt;a href&#x3D;\&quot;https://www.base64encode.org/\&quot;&gt;Base64-encoded&lt;/a&gt; format that corresponds to the invoice ID. You can generate a QR code for an invoice and add it to a paper or PDF invoice. When customers use their mobile devices to scan the QR code, they are redirected to the PayPal mobile payment flow where they can view the invoice and pay online with PayPal or a credit card. Before you get a QR code, you must &lt;a href&#x3D;\&quot;#invoices_create\&quot;&gt;create an invoice&lt;/a&gt; and &lt;a href&#x3D;\&quot;#invoices_send\&quot;&gt;send an invoice&lt;/a&gt; to move the invoice from a draft to payable state. Do not include an email address if you do not want the invoice emailed.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        QrConfig qrConfig = new QrConfig(); // QrConfig | Optional configuration parameters to adjust QR code width, height and the encoded URL.
        try {
            CompletableFuture<Void> result = apiInstance.invoicesGenerateQrCode(invoiceId, qrConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesGenerateQrCode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **qrConfig** | [**QrConfig**](QrConfig.md)| Optional configuration parameters to adjust QR code width, height and the encoded URL. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: multipart/mixed, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that shows the QR code as a PNG image. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **0** | The default response. |  -  |

## invoicesGenerateQrCodeWithHttpInfo

> CompletableFuture<ApiResponse<Void>> invoicesGenerateQrCode invoicesGenerateQrCodeWithHttpInfo(invoiceId, qrConfig)

Generate QR code

Generates a QR code for an invoice, by ID. The QR code is a PNG image in &lt;a href&#x3D;\&quot;https://www.base64encode.org/\&quot;&gt;Base64-encoded&lt;/a&gt; format that corresponds to the invoice ID. You can generate a QR code for an invoice and add it to a paper or PDF invoice. When customers use their mobile devices to scan the QR code, they are redirected to the PayPal mobile payment flow where they can view the invoice and pay online with PayPal or a credit card. Before you get a QR code, you must &lt;a href&#x3D;\&quot;#invoices_create\&quot;&gt;create an invoice&lt;/a&gt; and &lt;a href&#x3D;\&quot;#invoices_send\&quot;&gt;send an invoice&lt;/a&gt; to move the invoice from a draft to payable state. Do not include an email address if you do not want the invoice emailed.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        QrConfig qrConfig = new QrConfig(); // QrConfig | Optional configuration parameters to adjust QR code width, height and the encoded URL.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.invoicesGenerateQrCodeWithHttpInfo(invoiceId, qrConfig);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InvoicesApi#invoicesGenerateQrCode");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesGenerateQrCode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **qrConfig** | [**QrConfig**](QrConfig.md)| Optional configuration parameters to adjust QR code width, height and the encoded URL. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: multipart/mixed, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that shows the QR code as a PNG image. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **0** | The default response. |  -  |


## invoicesGet

> CompletableFuture<Invoice> invoicesGet(invoiceId)

Show invoice details

Shows details for an invoice, by ID.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        try {
            CompletableFuture<Invoice> result = apiInstance.invoicesGet(invoiceId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |

### Return type

CompletableFuture<[**Invoice**](Invoice.md)>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that shows invoice details. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |

## invoicesGetWithHttpInfo

> CompletableFuture<ApiResponse<Invoice>> invoicesGet invoicesGetWithHttpInfo(invoiceId)

Show invoice details

Shows details for an invoice, by ID.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        try {
            CompletableFuture<ApiResponse<Invoice>> response = apiInstance.invoicesGetWithHttpInfo(invoiceId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InvoicesApi#invoicesGet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |

### Return type

CompletableFuture<ApiResponse<[**Invoice**](Invoice.md)>>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that shows invoice details. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |


## invoicesList

> CompletableFuture<Invoices> invoicesList(page, pageSize, totalRequired, fields)

List invoices

Lists invoices. To filter the invoices that appear in the response, you can specify one or more optional query parameters.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        Integer page = 1; // Integer | The page number to be retrieved, for the list of templates. So, a combination of `page=1` and `page_size=20` returns the first 20 templates. A combination of `page=2` and `page_size=20` returns the next 20 templates.
        Integer pageSize = 20; // Integer | The maximum number of templates to return in the response.
        Boolean totalRequired = false; // Boolean | Indicates whether the to show <code>total_pages</code> and <code>total_items</code> in the response.
        String fields = "all"; // String | The fields to return in the response. Value is `all` or `none`. To return only the template name, ID, and default attributes, specify `none`.
        try {
            CompletableFuture<Invoices> result = apiInstance.invoicesList(page, pageSize, totalRequired, fields);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| The page number to be retrieved, for the list of templates. So, a combination of &#x60;page&#x3D;1&#x60; and &#x60;page_size&#x3D;20&#x60; returns the first 20 templates. A combination of &#x60;page&#x3D;2&#x60; and &#x60;page_size&#x3D;20&#x60; returns the next 20 templates. | [optional] [default to 1] |
| **pageSize** | **Integer**| The maximum number of templates to return in the response. | [optional] [default to 20] |
| **totalRequired** | **Boolean**| Indicates whether the to show &lt;code&gt;total_pages&lt;/code&gt; and &lt;code&gt;total_items&lt;/code&gt; in the response. | [optional] [default to false] |
| **fields** | **String**| The fields to return in the response. Value is &#x60;all&#x60; or &#x60;none&#x60;. To return only the template name, ID, and default attributes, specify &#x60;none&#x60;. | [optional] [default to all] |

### Return type

CompletableFuture<[**Invoices**](Invoices.md)>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that lists invoices with details. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **0** | The default response. |  -  |

## invoicesListWithHttpInfo

> CompletableFuture<ApiResponse<Invoices>> invoicesList invoicesListWithHttpInfo(page, pageSize, totalRequired, fields)

List invoices

Lists invoices. To filter the invoices that appear in the response, you can specify one or more optional query parameters.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        Integer page = 1; // Integer | The page number to be retrieved, for the list of templates. So, a combination of `page=1` and `page_size=20` returns the first 20 templates. A combination of `page=2` and `page_size=20` returns the next 20 templates.
        Integer pageSize = 20; // Integer | The maximum number of templates to return in the response.
        Boolean totalRequired = false; // Boolean | Indicates whether the to show <code>total_pages</code> and <code>total_items</code> in the response.
        String fields = "all"; // String | The fields to return in the response. Value is `all` or `none`. To return only the template name, ID, and default attributes, specify `none`.
        try {
            CompletableFuture<ApiResponse<Invoices>> response = apiInstance.invoicesListWithHttpInfo(page, pageSize, totalRequired, fields);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InvoicesApi#invoicesList");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| The page number to be retrieved, for the list of templates. So, a combination of &#x60;page&#x3D;1&#x60; and &#x60;page_size&#x3D;20&#x60; returns the first 20 templates. A combination of &#x60;page&#x3D;2&#x60; and &#x60;page_size&#x3D;20&#x60; returns the next 20 templates. | [optional] [default to 1] |
| **pageSize** | **Integer**| The maximum number of templates to return in the response. | [optional] [default to 20] |
| **totalRequired** | **Boolean**| Indicates whether the to show &lt;code&gt;total_pages&lt;/code&gt; and &lt;code&gt;total_items&lt;/code&gt; in the response. | [optional] [default to false] |
| **fields** | **String**| The fields to return in the response. Value is &#x60;all&#x60; or &#x60;none&#x60;. To return only the template name, ID, and default attributes, specify &#x60;none&#x60;. | [optional] [default to all] |

### Return type

CompletableFuture<ApiResponse<[**Invoices**](Invoices.md)>>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that lists invoices with details. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **0** | The default response. |  -  |


## invoicesPayments

> CompletableFuture<PaymentReference> invoicesPayments(invoiceId, paymentDetail)

Record payment for invoice

Records a payment for the invoice. If no payment is due, the invoice is marked as &#x60;PAID&#x60;. Otherwise, the invoice is marked as &#x60;PARTIALLY PAID&#x60;.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        PaymentDetail paymentDetail = new PaymentDetail(); // PaymentDetail | The details of the payment to record against the invoice.
        try {
            CompletableFuture<PaymentReference> result = apiInstance.invoicesPayments(invoiceId, paymentDetail);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesPayments");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **paymentDetail** | [**PaymentDetail**](PaymentDetail.md)| The details of the payment to record against the invoice. | |

### Return type

CompletableFuture<[**PaymentReference**](PaymentReference.md)>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 Created&#x60; status code and a reference to the recorded payment. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |

## invoicesPaymentsWithHttpInfo

> CompletableFuture<ApiResponse<PaymentReference>> invoicesPayments invoicesPaymentsWithHttpInfo(invoiceId, paymentDetail)

Record payment for invoice

Records a payment for the invoice. If no payment is due, the invoice is marked as &#x60;PAID&#x60;. Otherwise, the invoice is marked as &#x60;PARTIALLY PAID&#x60;.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        PaymentDetail paymentDetail = new PaymentDetail(); // PaymentDetail | The details of the payment to record against the invoice.
        try {
            CompletableFuture<ApiResponse<PaymentReference>> response = apiInstance.invoicesPaymentsWithHttpInfo(invoiceId, paymentDetail);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InvoicesApi#invoicesPayments");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesPayments");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **paymentDetail** | [**PaymentDetail**](PaymentDetail.md)| The details of the payment to record against the invoice. | |

### Return type

CompletableFuture<ApiResponse<[**PaymentReference**](PaymentReference.md)>>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 Created&#x60; status code and a reference to the recorded payment. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |


## invoicesPaymentsDelete

> CompletableFuture<Void> invoicesPaymentsDelete(invoiceId, transactionId)

Delete external payment

Deletes an external payment, by invoice ID and transaction ID.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        String transactionId = "transactionId_example"; // String | The ID of the external refund transaction to delete.
        try {
            CompletableFuture<Void> result = apiInstance.invoicesPaymentsDelete(invoiceId, transactionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesPaymentsDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **transactionId** | **String**| The ID of the external refund transaction to delete. | |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |

## invoicesPaymentsDeleteWithHttpInfo

> CompletableFuture<ApiResponse<Void>> invoicesPaymentsDelete invoicesPaymentsDeleteWithHttpInfo(invoiceId, transactionId)

Delete external payment

Deletes an external payment, by invoice ID and transaction ID.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        String transactionId = "transactionId_example"; // String | The ID of the external refund transaction to delete.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.invoicesPaymentsDeleteWithHttpInfo(invoiceId, transactionId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InvoicesApi#invoicesPaymentsDelete");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesPaymentsDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **transactionId** | **String**| The ID of the external refund transaction to delete. | |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |


## invoicesRefunds

> CompletableFuture<RefundReference> invoicesRefunds(invoiceId, refundDetail)

Record refund for invoice

Records a refund for the invoice. If all payments are refunded, the invoice is marked as &#x60;REFUNDED&#x60;. Otherwise, the invoice is marked as &#x60;PARTIALLY REFUNDED&#x60;.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        RefundDetail refundDetail = new RefundDetail(); // RefundDetail | The details of the refund to record against the invoice.
        try {
            CompletableFuture<RefundReference> result = apiInstance.invoicesRefunds(invoiceId, refundDetail);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesRefunds");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **refundDetail** | [**RefundDetail**](RefundDetail.md)| The details of the refund to record against the invoice. | |

### Return type

CompletableFuture<[**RefundReference**](RefundReference.md)>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 Created&#x60; status code and a reference to the recorded refund. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |

## invoicesRefundsWithHttpInfo

> CompletableFuture<ApiResponse<RefundReference>> invoicesRefunds invoicesRefundsWithHttpInfo(invoiceId, refundDetail)

Record refund for invoice

Records a refund for the invoice. If all payments are refunded, the invoice is marked as &#x60;REFUNDED&#x60;. Otherwise, the invoice is marked as &#x60;PARTIALLY REFUNDED&#x60;.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        RefundDetail refundDetail = new RefundDetail(); // RefundDetail | The details of the refund to record against the invoice.
        try {
            CompletableFuture<ApiResponse<RefundReference>> response = apiInstance.invoicesRefundsWithHttpInfo(invoiceId, refundDetail);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InvoicesApi#invoicesRefunds");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesRefunds");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **refundDetail** | [**RefundDetail**](RefundDetail.md)| The details of the refund to record against the invoice. | |

### Return type

CompletableFuture<ApiResponse<[**RefundReference**](RefundReference.md)>>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 Created&#x60; status code and a reference to the recorded refund. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |


## invoicesRefundsDelete

> CompletableFuture<Void> invoicesRefundsDelete(invoiceId, transactionId)

Delete external refund

Deletes an external refund, by invoice ID and transaction ID.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        String transactionId = "transactionId_example"; // String | The ID of the external refund transaction to delete.
        try {
            CompletableFuture<Void> result = apiInstance.invoicesRefundsDelete(invoiceId, transactionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesRefundsDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **transactionId** | **String**| The ID of the external refund transaction to delete. | |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **0** | The default response. |  -  |

## invoicesRefundsDeleteWithHttpInfo

> CompletableFuture<ApiResponse<Void>> invoicesRefundsDelete invoicesRefundsDeleteWithHttpInfo(invoiceId, transactionId)

Delete external refund

Deletes an external refund, by invoice ID and transaction ID.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        String transactionId = "transactionId_example"; // String | The ID of the external refund transaction to delete.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.invoicesRefundsDeleteWithHttpInfo(invoiceId, transactionId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InvoicesApi#invoicesRefundsDelete");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesRefundsDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **transactionId** | **String**| The ID of the external refund transaction to delete. | |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **0** | The default response. |  -  |


## invoicesRemind

> CompletableFuture<Void> invoicesRemind(invoiceId, notification)

Send invoice reminder

Sends a reminder to the payer about an invoice, by ID. In the JSON request body, include a &#x60;notification&#x60; object that defines the subject of the reminder and other details.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        Notification notification = new Notification(); // Notification | The email or SMS notification that will be sent to the payer for reminder.
        try {
            CompletableFuture<Void> result = apiInstance.invoicesRemind(invoiceId, notification);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesRemind");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **notification** | [**Notification**](Notification.md)| The email or SMS notification that will be sent to the payer for reminder. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |

## invoicesRemindWithHttpInfo

> CompletableFuture<ApiResponse<Void>> invoicesRemind invoicesRemindWithHttpInfo(invoiceId, notification)

Send invoice reminder

Sends a reminder to the payer about an invoice, by ID. In the JSON request body, include a &#x60;notification&#x60; object that defines the subject of the reminder and other details.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        Notification notification = new Notification(); // Notification | The email or SMS notification that will be sent to the payer for reminder.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.invoicesRemindWithHttpInfo(invoiceId, notification);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InvoicesApi#invoicesRemind");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesRemind");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **notification** | [**Notification**](Notification.md)| The email or SMS notification that will be sent to the payer for reminder. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |


## invoicesSend

> CompletableFuture<LinkDescription> invoicesSend(invoiceId, notification)

Send invoice

Sends or schedules an invoice, by ID, to be sent to a customer. The action depends on the invoice issue date:&lt;ul&gt;&lt;li&gt;If the invoice issue date is current or in the past, sends the invoice immediately.&lt;/li&gt;&lt;li&gt;If the invoice issue date is in the future, schedules the invoice to be sent on that date.&lt;/li&gt;&lt;/ul&gt;To suppress the merchant&#39;s email notification, set the &#x60;send_to_invoicer&#x60; body parameter to &#x60;false&#x60;. To send the invoice through a share link and not through PayPal, set the &lt;code&gt;send_to_recipient&lt;/code&gt; parameter to &lt;code&gt;false&lt;/code&gt; in the &lt;code&gt;notification&lt;/code&gt; object. The &lt;code&gt;send_to_recipient&lt;/code&gt; parameter does not apply to a future issue date because the invoice is scheduled to be sent through PayPal on that date.&lt;blockquote&gt;&lt;strong&gt;Notes:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;After you send an invoice, resending it has no effect.&lt;/li&gt;&lt;li&gt;To send a notification for updates, &lt;a href&#x3D;\&quot;#invoices_update\&quot;&gt;update the invoice&lt;/a&gt; and set the &lt;code&gt;send_to_recipient&lt;/code&gt; body parameter to &lt;code&gt;true&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;&lt;/blockquote&gt;

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        Notification notification = new Notification(); // Notification | The email or SMS notification to send to the payer when they send an invoice..
        try {
            CompletableFuture<LinkDescription> result = apiInstance.invoicesSend(invoiceId, notification);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesSend");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **notification** | [**Notification**](Notification.md)| The email or SMS notification to send to the payer when they send an invoice.. | [optional] |

### Return type

CompletableFuture<[**LinkDescription**](LinkDescription.md)>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; when the invoice issue date is current date. |  -  |
| **202** | A successful request returns the HTTP &#x60;202 Accepted&#x60; status code with no JSON response body, when the invoice issue date is in future. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |

## invoicesSendWithHttpInfo

> CompletableFuture<ApiResponse<LinkDescription>> invoicesSend invoicesSendWithHttpInfo(invoiceId, notification)

Send invoice

Sends or schedules an invoice, by ID, to be sent to a customer. The action depends on the invoice issue date:&lt;ul&gt;&lt;li&gt;If the invoice issue date is current or in the past, sends the invoice immediately.&lt;/li&gt;&lt;li&gt;If the invoice issue date is in the future, schedules the invoice to be sent on that date.&lt;/li&gt;&lt;/ul&gt;To suppress the merchant&#39;s email notification, set the &#x60;send_to_invoicer&#x60; body parameter to &#x60;false&#x60;. To send the invoice through a share link and not through PayPal, set the &lt;code&gt;send_to_recipient&lt;/code&gt; parameter to &lt;code&gt;false&lt;/code&gt; in the &lt;code&gt;notification&lt;/code&gt; object. The &lt;code&gt;send_to_recipient&lt;/code&gt; parameter does not apply to a future issue date because the invoice is scheduled to be sent through PayPal on that date.&lt;blockquote&gt;&lt;strong&gt;Notes:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;After you send an invoice, resending it has no effect.&lt;/li&gt;&lt;li&gt;To send a notification for updates, &lt;a href&#x3D;\&quot;#invoices_update\&quot;&gt;update the invoice&lt;/a&gt; and set the &lt;code&gt;send_to_recipient&lt;/code&gt; body parameter to &lt;code&gt;true&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;&lt;/blockquote&gt;

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        Notification notification = new Notification(); // Notification | The email or SMS notification to send to the payer when they send an invoice..
        try {
            CompletableFuture<ApiResponse<LinkDescription>> response = apiInstance.invoicesSendWithHttpInfo(invoiceId, notification);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InvoicesApi#invoicesSend");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesSend");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **notification** | [**Notification**](Notification.md)| The email or SMS notification to send to the payer when they send an invoice.. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**LinkDescription**](LinkDescription.md)>>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; when the invoice issue date is current date. |  -  |
| **202** | A successful request returns the HTTP &#x60;202 Accepted&#x60; status code with no JSON response body, when the invoice issue date is in future. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |


## invoicesUpdate

> CompletableFuture<Invoice> invoicesUpdate(invoiceId, invoice, sendToRecipient, sendToInvoicer)

Fully update invoice

Fully updates an invoice, by ID. In the JSON request body, include a complete &#x60;invoice&#x60; object. This call does not support partial updates.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        Invoice invoice = new Invoice(); // Invoice | A representation of changes to make in the invoice.
        Boolean sendToRecipient = true; // Boolean | Indicates whether to send the invoice update notification to the recipient.
        Boolean sendToInvoicer = true; // Boolean | Indicates whether to send the invoice update notification to the merchant.
        try {
            CompletableFuture<Invoice> result = apiInstance.invoicesUpdate(invoiceId, invoice, sendToRecipient, sendToInvoicer);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **invoice** | [**Invoice**](Invoice.md)| A representation of changes to make in the invoice. | |
| **sendToRecipient** | **Boolean**| Indicates whether to send the invoice update notification to the recipient. | [optional] [default to true] |
| **sendToInvoicer** | **Boolean**| Indicates whether to send the invoice update notification to the merchant. | [optional] [default to true] |

### Return type

CompletableFuture<[**Invoice**](Invoice.md)>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code. A JSON response body that shows invoice details is returned if you set &lt;code&gt;prefer&#x3D;return&#x3D;representation&lt;/code&gt;. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |

## invoicesUpdateWithHttpInfo

> CompletableFuture<ApiResponse<Invoice>> invoicesUpdate invoicesUpdateWithHttpInfo(invoiceId, invoice, sendToRecipient, sendToInvoicer)

Fully update invoice

Fully updates an invoice, by ID. In the JSON request body, include a complete &#x60;invoice&#x60; object. This call does not support partial updates.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        String invoiceId = "invoiceId_example"; // String | The ID of the draft invoice to delete.
        Invoice invoice = new Invoice(); // Invoice | A representation of changes to make in the invoice.
        Boolean sendToRecipient = true; // Boolean | Indicates whether to send the invoice update notification to the recipient.
        Boolean sendToInvoicer = true; // Boolean | Indicates whether to send the invoice update notification to the merchant.
        try {
            CompletableFuture<ApiResponse<Invoice>> response = apiInstance.invoicesUpdateWithHttpInfo(invoiceId, invoice, sendToRecipient, sendToInvoicer);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InvoicesApi#invoicesUpdate");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicesUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **invoice** | [**Invoice**](Invoice.md)| A representation of changes to make in the invoice. | |
| **sendToRecipient** | **Boolean**| Indicates whether to send the invoice update notification to the recipient. | [optional] [default to true] |
| **sendToInvoicer** | **Boolean**| Indicates whether to send the invoice update notification to the merchant. | [optional] [default to true] |

### Return type

CompletableFuture<ApiResponse<[**Invoice**](Invoice.md)>>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code. A JSON response body that shows invoice details is returned if you set &lt;code&gt;prefer&#x3D;return&#x3D;representation&lt;/code&gt;. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |


## invoicingGenerateNextInvoiceNumber

> CompletableFuture<InvoiceNumber> invoicingGenerateNextInvoiceNumber()

Generate invoice number

Generates the next invoice number that is available to the merchant. The next invoice number uses the prefix and suffix from the last invoice number and increments the number by one. For example, the next invoice number after &#x60;INVOICE-1234&#x60; is &#x60;INVOICE-1235&#x60;.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        try {
            CompletableFuture<InvoiceNumber> result = apiInstance.invoicingGenerateNextInvoiceNumber();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicingGenerateNextInvoiceNumber");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<[**InvoiceNumber**](InvoiceNumber.md)>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that shows the next invoice number. |  -  |
| **403** | Authorization Error. |  -  |
| **0** | The default response. |  -  |

## invoicingGenerateNextInvoiceNumberWithHttpInfo

> CompletableFuture<ApiResponse<InvoiceNumber>> invoicingGenerateNextInvoiceNumber invoicingGenerateNextInvoiceNumberWithHttpInfo()

Generate invoice number

Generates the next invoice number that is available to the merchant. The next invoice number uses the prefix and suffix from the last invoice number and increments the number by one. For example, the next invoice number after &#x60;INVOICE-1234&#x60; is &#x60;INVOICE-1235&#x60;.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.InvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<InvoiceNumber>> response = apiInstance.invoicingGenerateNextInvoiceNumberWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InvoicesApi#invoicingGenerateNextInvoiceNumber");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#invoicingGenerateNextInvoiceNumber");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**InvoiceNumber**](InvoiceNumber.md)>>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that shows the next invoice number. |  -  |
| **403** | Authorization Error. |  -  |
| **0** | The default response. |  -  |

