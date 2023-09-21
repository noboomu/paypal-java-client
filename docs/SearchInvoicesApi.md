# SearchInvoicesApi

All URIs are relative to *https://api-m.sandbox.paypal.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**invoicesSearchInvoices**](SearchInvoicesApi.md#invoicesSearchInvoices) | **POST** /v2/invoicing/search-invoices | Search for invoices |
| [**invoicesSearchInvoicesWithHttpInfo**](SearchInvoicesApi.md#invoicesSearchInvoicesWithHttpInfo) | **POST** /v2/invoicing/search-invoices | Search for invoices |



## invoicesSearchInvoices

> CompletableFuture<Invoices> invoicesSearchInvoices(page, pageSize, totalRequired, searchData)

Search for invoices

Searches for and lists invoices that match search criteria. If you pass multiple criteria, the response lists invoices that match all criteria.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.SearchInvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SearchInvoicesApi apiInstance = new SearchInvoicesApi(defaultClient);
        Integer page = 1; // Integer | The page number to be retrieved, for the list of templates. So, a combination of `page=1` and `page_size=20` returns the first 20 templates. A combination of `page=2` and `page_size=20` returns the next 20 templates.
        Integer pageSize = 20; // Integer | The maximum number of templates to return in the response.
        Boolean totalRequired = false; // Boolean | Indicates whether the to show <code>total_pages</code> and <code>total_items</code> in the response.
        SearchData searchData = new SearchData(); // SearchData | The invoice search can be used to retrieve the invoices based on the search parameters.
        try {
            CompletableFuture<Invoices> result = apiInstance.invoicesSearchInvoices(page, pageSize, totalRequired, searchData);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchInvoicesApi#invoicesSearchInvoices");
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
| **searchData** | [**SearchData**](SearchData.md)| The invoice search can be used to retrieve the invoices based on the search parameters. | [optional] |

### Return type

CompletableFuture<[**Invoices**](Invoices.md)>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that lists the invoices that match the search criteria. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **0** | The default response. |  -  |

## invoicesSearchInvoicesWithHttpInfo

> CompletableFuture<ApiResponse<Invoices>> invoicesSearchInvoices invoicesSearchInvoicesWithHttpInfo(page, pageSize, totalRequired, searchData)

Search for invoices

Searches for and lists invoices that match search criteria. If you pass multiple criteria, the response lists invoices that match all criteria.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.SearchInvoicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SearchInvoicesApi apiInstance = new SearchInvoicesApi(defaultClient);
        Integer page = 1; // Integer | The page number to be retrieved, for the list of templates. So, a combination of `page=1` and `page_size=20` returns the first 20 templates. A combination of `page=2` and `page_size=20` returns the next 20 templates.
        Integer pageSize = 20; // Integer | The maximum number of templates to return in the response.
        Boolean totalRequired = false; // Boolean | Indicates whether the to show <code>total_pages</code> and <code>total_items</code> in the response.
        SearchData searchData = new SearchData(); // SearchData | The invoice search can be used to retrieve the invoices based on the search parameters.
        try {
            CompletableFuture<ApiResponse<Invoices>> response = apiInstance.invoicesSearchInvoicesWithHttpInfo(page, pageSize, totalRequired, searchData);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SearchInvoicesApi#invoicesSearchInvoices");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchInvoicesApi#invoicesSearchInvoices");
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
| **searchData** | [**SearchData**](SearchData.md)| The invoice search can be used to retrieve the invoices based on the search parameters. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**Invoices**](Invoices.md)>>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that lists the invoices that match the search criteria. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **0** | The default response. |  -  |

