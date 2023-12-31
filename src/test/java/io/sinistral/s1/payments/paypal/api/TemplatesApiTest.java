/*
 * Invoices
 * Use the Invoicing API to create, send, and manage invoices. You can also use the API or webhooks to track invoice payments. When you send an invoice to a customer, the invoice moves from draft to payable state. PayPal then emails the customer a link to the invoice on the PayPal website. Customers with a PayPal account can log in and pay the invoice with PayPal. Alternatively, customers can pay as a guest with a debit card or credit card. For more information, see the <a href=\"/docs/invoicing/\">Invoicing Overview</a> and the <a href=\"/docs/invoicing/basic-integration/\">Invoicing Integration Guide</a>.
 *
 * The version of the OpenAPI document: 2.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.sinistral.s1.payments.paypal.api;

import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.models.Template;
import io.sinistral.s1.payments.paypal.models.Templates;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for TemplatesApi
 */
@Ignore
public class TemplatesApiTest {

    private final TemplatesApi api = new TemplatesApi();

    
    /**
     * Create template
     *
     * Creates an invoice template. You can use details from this template to create an invoice. You can create up to 50 templates.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Every merchant starts with three PayPal system templates that are optimized for the unit type billed. The template includes &#x60;Quantity&#x60;, &#x60;Hours&#x60;, and &#x60;Amount&#x60;.&lt;/blockquote&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templatesCreateTest() throws ApiException {
        Template template = null;
        CompletableFuture<Template> response = 
        api.templatesCreate(template);
        
        // TODO: test validations
    }
    
    /**
     * Delete template
     *
     * Deletes a template, by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templatesDeleteTest() throws ApiException {
        String templateId = null;
        
        CompletableFuture<Void> response = api.templatesDelete(templateId);
        
        // TODO: test validations
    }
    
    /**
     * Show template details
     *
     * Shows details for a template, by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templatesGetTest() throws ApiException {
        String templateId = null;
        CompletableFuture<Template> response = 
        api.templatesGet(templateId);
        
        // TODO: test validations
    }
    
    /**
     * List templates
     *
     * Lists merchant-created templates with associated details. The associated details include the emails, addresses, and phone numbers from the user&#39;s PayPal profile.&lt;br/&gt;The user can select which values to show in the business information section of their template.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templatesListTest() throws ApiException {
        String fields = null;
        Integer page = null;
        Integer pageSize = null;
        CompletableFuture<Templates> response = 
        api.templatesList(fields, page, pageSize);
        
        // TODO: test validations
    }
    
    /**
     * Fully update template
     *
     * Fully updates a template, by ID. In the JSON request body, include a complete &#x60;template&#x60; object. This call does not support partial updates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templatesUpdateTest() throws ApiException {
        String templateId = null;
        Template template = null;
        CompletableFuture<Template> response = 
        api.templatesUpdate(templateId, template);
        
        // TODO: test validations
    }
    
}
