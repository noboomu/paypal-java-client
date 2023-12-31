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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;
import java.util.StringJoiner;


/**
 * The discount. Can be an item- or invoice-level discount, or both. Can be applied as a percent or amount. If you provide both amount and percent, amount takes precedent.
 */
@JsonPropertyOrder({
  AggregatedDiscount.JSON_PROPERTY_INVOICE_DISCOUNT,
  AggregatedDiscount.JSON_PROPERTY_ITEM_DISCOUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T16:02:23.639524-07:00[America/Los_Angeles]")
public class AggregatedDiscount {
  public static final String JSON_PROPERTY_INVOICE_DISCOUNT = "invoice_discount";
  private Discount invoiceDiscount;

  public static final String JSON_PROPERTY_ITEM_DISCOUNT = "item_discount";
  private Money itemDiscount;

  public AggregatedDiscount() { 
  }

  public AggregatedDiscount invoiceDiscount(Discount invoiceDiscount) {
    this.invoiceDiscount = invoiceDiscount;
    return this;
  }

   /**
   * Get invoiceDiscount
   * @return invoiceDiscount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Discount getInvoiceDiscount() {
    return invoiceDiscount;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceDiscount(Discount invoiceDiscount) {
    this.invoiceDiscount = invoiceDiscount;
  }


  public AggregatedDiscount itemDiscount(Money itemDiscount) {
    this.itemDiscount = itemDiscount;
    return this;
  }

   /**
   * Get itemDiscount
   * @return itemDiscount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEM_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Money getItemDiscount() {
    return itemDiscount;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemDiscount(Money itemDiscount) {
    this.itemDiscount = itemDiscount;
  }


  /**
   * Return true if this aggregated_discount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedDiscount aggregatedDiscount = (AggregatedDiscount) o;
    return Objects.equals(this.invoiceDiscount, aggregatedDiscount.invoiceDiscount) &&
        Objects.equals(this.itemDiscount, aggregatedDiscount.itemDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceDiscount, itemDiscount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedDiscount {\n");
    sb.append("    invoiceDiscount: ").append(toIndentedString(invoiceDiscount)).append("\n");
    sb.append("    itemDiscount: ").append(toIndentedString(itemDiscount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `invoice_discount` to the URL query string
    if (getInvoiceDiscount() != null) {
      joiner.add(getInvoiceDiscount().toUrlQueryString(prefix + "invoice_discount" + suffix));
    }

    // add `item_discount` to the URL query string
    if (getItemDiscount() != null) {
      joiner.add(getItemDiscount().toUrlQueryString(prefix + "item_discount" + suffix));
    }

    return joiner.toString();
  }
}

