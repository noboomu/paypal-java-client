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


package io.sinistral.s1.payments.paypal.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of the invoice.
 */
public enum InvoiceStatus {
  
  DRAFT("DRAFT"),
  
  SENT("SENT"),
  
  SCHEDULED("SCHEDULED"),
  
  PAID("PAID"),
  
  MARKED_AS_PAID("MARKED_AS_PAID"),
  
  CANCELLED("CANCELLED"),
  
  REFUNDED("REFUNDED"),
  
  PARTIALLY_PAID("PARTIALLY_PAID"),
  
  PARTIALLY_REFUNDED("PARTIALLY_REFUNDED"),
  
  MARKED_AS_REFUNDED("MARKED_AS_REFUNDED"),
  
  UNPAID("UNPAID"),
  
  PAYMENT_PENDING("PAYMENT_PENDING");

  private String value;

  InvoiceStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static InvoiceStatus fromValue(String value) {
    for (InvoiceStatus b : InvoiceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }

}

