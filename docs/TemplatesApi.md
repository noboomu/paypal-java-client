# TemplatesApi

All URIs are relative to *https://api-m.sandbox.paypal.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**templatesCreate**](TemplatesApi.md#templatesCreate) | **POST** /v2/invoicing/templates | Create template |
| [**templatesCreateWithHttpInfo**](TemplatesApi.md#templatesCreateWithHttpInfo) | **POST** /v2/invoicing/templates | Create template |
| [**templatesDelete**](TemplatesApi.md#templatesDelete) | **DELETE** /v2/invoicing/templates/{template_id} | Delete template |
| [**templatesDeleteWithHttpInfo**](TemplatesApi.md#templatesDeleteWithHttpInfo) | **DELETE** /v2/invoicing/templates/{template_id} | Delete template |
| [**templatesGet**](TemplatesApi.md#templatesGet) | **GET** /v2/invoicing/templates/{template_id} | Show template details |
| [**templatesGetWithHttpInfo**](TemplatesApi.md#templatesGetWithHttpInfo) | **GET** /v2/invoicing/templates/{template_id} | Show template details |
| [**templatesList**](TemplatesApi.md#templatesList) | **GET** /v2/invoicing/templates | List templates |
| [**templatesListWithHttpInfo**](TemplatesApi.md#templatesListWithHttpInfo) | **GET** /v2/invoicing/templates | List templates |
| [**templatesUpdate**](TemplatesApi.md#templatesUpdate) | **PUT** /v2/invoicing/templates/{template_id} | Fully update template |
| [**templatesUpdateWithHttpInfo**](TemplatesApi.md#templatesUpdateWithHttpInfo) | **PUT** /v2/invoicing/templates/{template_id} | Fully update template |



## templatesCreate

> CompletableFuture<Template> templatesCreate(template)

Create template

Creates an invoice template. You can use details from this template to create an invoice. You can create up to 50 templates.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Every merchant starts with three PayPal system templates that are optimized for the unit type billed. The template includes &#x60;Quantity&#x60;, &#x60;Hours&#x60;, and &#x60;Amount&#x60;.&lt;/blockquote&gt;

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.TemplatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        Template template = new Template(); // Template | 
        try {
            CompletableFuture<Template> result = apiInstance.templatesCreate(template);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesCreate");
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
| **template** | [**Template**](Template.md)|  | |

### Return type

CompletableFuture<[**Template**](Template.md)>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A successful request returns the HTTP &#x60;201 Created&#x60; status code. A JSON response body that shows template details is returned if you set &lt;code&gt;prefer&#x3D;return&#x3D;representation&lt;/code&gt;. |  -  |
| **400** | Invalid request. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |

## templatesCreateWithHttpInfo

> CompletableFuture<ApiResponse<Template>> templatesCreate templatesCreateWithHttpInfo(template)

Create template

Creates an invoice template. You can use details from this template to create an invoice. You can create up to 50 templates.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Every merchant starts with three PayPal system templates that are optimized for the unit type billed. The template includes &#x60;Quantity&#x60;, &#x60;Hours&#x60;, and &#x60;Amount&#x60;.&lt;/blockquote&gt;

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.TemplatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        Template template = new Template(); // Template | 
        try {
            CompletableFuture<ApiResponse<Template>> response = apiInstance.templatesCreateWithHttpInfo(template);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TemplatesApi#templatesCreate");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesCreate");
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
| **template** | [**Template**](Template.md)|  | |

### Return type

CompletableFuture<ApiResponse<[**Template**](Template.md)>>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A successful request returns the HTTP &#x60;201 Created&#x60; status code. A JSON response body that shows template details is returned if you set &lt;code&gt;prefer&#x3D;return&#x3D;representation&lt;/code&gt;. |  -  |
| **400** | Invalid request. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |


## templatesDelete

> CompletableFuture<Void> templatesDelete(templateId)

Delete template

Deletes a template, by ID.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.TemplatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String templateId = "templateId_example"; // String | The ID of the template to delete.
        try {
            CompletableFuture<Void> result = apiInstance.templatesDelete(templateId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesDelete");
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
| **templateId** | **String**| The ID of the template to delete. | |

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
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |

## templatesDeleteWithHttpInfo

> CompletableFuture<ApiResponse<Void>> templatesDelete templatesDeleteWithHttpInfo(templateId)

Delete template

Deletes a template, by ID.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.TemplatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String templateId = "templateId_example"; // String | The ID of the template to delete.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.templatesDeleteWithHttpInfo(templateId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TemplatesApi#templatesDelete");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesDelete");
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
| **templateId** | **String**| The ID of the template to delete. | |

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
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |


## templatesGet

> CompletableFuture<Template> templatesGet(templateId)

Show template details

Shows details for a template, by ID.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.TemplatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String templateId = "templateId_example"; // String | The ID of the template to delete.
        try {
            CompletableFuture<Template> result = apiInstance.templatesGet(templateId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesGet");
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
| **templateId** | **String**| The ID of the template to delete. | |

### Return type

CompletableFuture<[**Template**](Template.md)>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that shows template details. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **0** | The default response. |  -  |

## templatesGetWithHttpInfo

> CompletableFuture<ApiResponse<Template>> templatesGet templatesGetWithHttpInfo(templateId)

Show template details

Shows details for a template, by ID.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.TemplatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String templateId = "templateId_example"; // String | The ID of the template to delete.
        try {
            CompletableFuture<ApiResponse<Template>> response = apiInstance.templatesGetWithHttpInfo(templateId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TemplatesApi#templatesGet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesGet");
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
| **templateId** | **String**| The ID of the template to delete. | |

### Return type

CompletableFuture<ApiResponse<[**Template**](Template.md)>>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that shows template details. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **0** | The default response. |  -  |


## templatesList

> CompletableFuture<Templates> templatesList(fields, page, pageSize)

List templates

Lists merchant-created templates with associated details. The associated details include the emails, addresses, and phone numbers from the user&#39;s PayPal profile.&lt;br/&gt;The user can select which values to show in the business information section of their template.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.TemplatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String fields = "all"; // String | The fields to return in the response. Value is `all` or `none`. To return only the template name, ID, and default attributes, specify `none`.
        Integer page = 1; // Integer | The page number to be retrieved, for the list of templates. So, a combination of `page=1` and `page_size=20` returns the first 20 templates. A combination of `page=2` and `page_size=20` returns the next 20 templates.
        Integer pageSize = 20; // Integer | The maximum number of templates to return in the response.
        try {
            CompletableFuture<Templates> result = apiInstance.templatesList(fields, page, pageSize);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesList");
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
| **fields** | **String**| The fields to return in the response. Value is &#x60;all&#x60; or &#x60;none&#x60;. To return only the template name, ID, and default attributes, specify &#x60;none&#x60;. | [optional] [default to all] |
| **page** | **Integer**| The page number to be retrieved, for the list of templates. So, a combination of &#x60;page&#x3D;1&#x60; and &#x60;page_size&#x3D;20&#x60; returns the first 20 templates. A combination of &#x60;page&#x3D;2&#x60; and &#x60;page_size&#x3D;20&#x60; returns the next 20 templates. | [optional] [default to 1] |
| **pageSize** | **Integer**| The maximum number of templates to return in the response. | [optional] [default to 20] |

### Return type

CompletableFuture<[**Templates**](Templates.md)>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that lists invoices. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **0** | The default response. |  -  |

## templatesListWithHttpInfo

> CompletableFuture<ApiResponse<Templates>> templatesList templatesListWithHttpInfo(fields, page, pageSize)

List templates

Lists merchant-created templates with associated details. The associated details include the emails, addresses, and phone numbers from the user&#39;s PayPal profile.&lt;br/&gt;The user can select which values to show in the business information section of their template.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.TemplatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String fields = "all"; // String | The fields to return in the response. Value is `all` or `none`. To return only the template name, ID, and default attributes, specify `none`.
        Integer page = 1; // Integer | The page number to be retrieved, for the list of templates. So, a combination of `page=1` and `page_size=20` returns the first 20 templates. A combination of `page=2` and `page_size=20` returns the next 20 templates.
        Integer pageSize = 20; // Integer | The maximum number of templates to return in the response.
        try {
            CompletableFuture<ApiResponse<Templates>> response = apiInstance.templatesListWithHttpInfo(fields, page, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TemplatesApi#templatesList");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesList");
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
| **fields** | **String**| The fields to return in the response. Value is &#x60;all&#x60; or &#x60;none&#x60;. To return only the template name, ID, and default attributes, specify &#x60;none&#x60;. | [optional] [default to all] |
| **page** | **Integer**| The page number to be retrieved, for the list of templates. So, a combination of &#x60;page&#x3D;1&#x60; and &#x60;page_size&#x3D;20&#x60; returns the first 20 templates. A combination of &#x60;page&#x3D;2&#x60; and &#x60;page_size&#x3D;20&#x60; returns the next 20 templates. | [optional] [default to 1] |
| **pageSize** | **Integer**| The maximum number of templates to return in the response. | [optional] [default to 20] |

### Return type

CompletableFuture<ApiResponse<[**Templates**](Templates.md)>>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that lists invoices. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **0** | The default response. |  -  |


## templatesUpdate

> CompletableFuture<Template> templatesUpdate(templateId, template)

Fully update template

Fully updates a template, by ID. In the JSON request body, include a complete &#x60;template&#x60; object. This call does not support partial updates.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.TemplatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String templateId = "templateId_example"; // String | The ID of the template to delete.
        Template template = new Template(); // Template | A representation of changes to make in the template.
        try {
            CompletableFuture<Template> result = apiInstance.templatesUpdate(templateId, template);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUpdate");
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
| **templateId** | **String**| The ID of the template to delete. | |
| **template** | [**Template**](Template.md)| A representation of changes to make in the template. | |

### Return type

CompletableFuture<[**Template**](Template.md)>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code. A JSON response body that shows template details is returned if you set &lt;code&gt;prefer&#x3D;return&#x3D;representation&lt;/code&gt;. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |

## templatesUpdateWithHttpInfo

> CompletableFuture<ApiResponse<Template>> templatesUpdate templatesUpdateWithHttpInfo(templateId, template)

Fully update template

Fully updates a template, by ID. In the JSON request body, include a complete &#x60;template&#x60; object. This call does not support partial updates.

### Example

```java
// Import classes:
import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Configuration;
import io.sinistral.s1.payments.paypal.core.auth.*;
import io.sinistral.s1.payments.paypal.core.models.*;
import io.sinistral.s1.payments.paypal.api.TemplatesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-m.sandbox.paypal.com");
        
        // Configure OAuth2 access token for authorization: Oauth2
        OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
        Oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String templateId = "templateId_example"; // String | The ID of the template to delete.
        Template template = new Template(); // Template | A representation of changes to make in the template.
        try {
            CompletableFuture<ApiResponse<Template>> response = apiInstance.templatesUpdateWithHttpInfo(templateId, template);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TemplatesApi#templatesUpdate");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#templatesUpdate");
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
| **templateId** | **String**| The ID of the template to delete. | |
| **template** | [**Template**](Template.md)| A representation of changes to make in the template. | |

### Return type

CompletableFuture<ApiResponse<[**Template**](Template.md)>>


### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code. A JSON response body that shows template details is returned if you set &lt;code&gt;prefer&#x3D;return&#x3D;representation&lt;/code&gt;. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Authorization Error. |  -  |
| **404** | Resource Not Found. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **0** | The default response. |  -  |

