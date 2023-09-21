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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;


/**
 * The partial payment details. Includes the minimum amount that the invoicer expects from the payer.
 */
@JsonPropertyOrder({
  PartialPayment.JSON_PROPERTY_ALLOW_PARTIAL_PAYMENT,
  PartialPayment.JSON_PROPERTY_MINIMUM_AMOUNT_DUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T16:02:23.639524-07:00[America/Los_Angeles]")
public class PartialPayment {
  public static final String JSON_PROPERTY_ALLOW_PARTIAL_PAYMENT = "allow_partial_payment";
  private Boolean allowPartialPayment = false;

  public static final String JSON_PROPERTY_MINIMUM_AMOUNT_DUE = "minimum_amount_due";
  private Money minimumAmountDue;

  public PartialPayment() { 
  }

  public PartialPayment allowPartialPayment(Boolean allowPartialPayment) {
    this.allowPartialPayment = allowPartialPayment;
    return this;
  }

   /**
   * Indicates whether the invoice allows a partial payment. If &#x60;false&#x60;, the invoice must be paid in full. If &#x60;true&#x60;, the invoice allows partial payments.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature is not available for users in &#x60;India&#x60;, &#x60;Brazil&#x60;, or &#x60;Israel&#x60;.&lt;/blockquote&gt;
   * @return allowPartialPayment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_PARTIAL_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowPartialPayment() {
    return allowPartialPayment;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_PARTIAL_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowPartialPayment(Boolean allowPartialPayment) {
    this.allowPartialPayment = allowPartialPayment;
  }


  public PartialPayment minimumAmountDue(Money minimumAmountDue) {
    this.minimumAmountDue = minimumAmountDue;
    return this;
  }

   /**
   * Get minimumAmountDue
   * @return minimumAmountDue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMUM_AMOUNT_DUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Money getMinimumAmountDue() {
    return minimumAmountDue;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_AMOUNT_DUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumAmountDue(Money minimumAmountDue) {
    this.minimumAmountDue = minimumAmountDue;
  }


  /**
   * Return true if this partial_payment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartialPayment partialPayment = (PartialPayment) o;
    return Objects.equals(this.allowPartialPayment, partialPayment.allowPartialPayment) &&
        Objects.equals(this.minimumAmountDue, partialPayment.minimumAmountDue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowPartialPayment, minimumAmountDue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialPayment {\n");
    sb.append("    allowPartialPayment: ").append(toIndentedString(allowPartialPayment)).append("\n");
    sb.append("    minimumAmountDue: ").append(toIndentedString(minimumAmountDue)).append("\n");
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

    // add `allow_partial_payment` to the URL query string
    if (getAllowPartialPayment() != null) {
      joiner.add(String.format("%sallow_partial_payment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowPartialPayment()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `minimum_amount_due` to the URL query string
    if (getMinimumAmountDue() != null) {
      joiner.add(getMinimumAmountDue().toUrlQueryString(prefix + "minimum_amount_due" + suffix));
    }

    return joiner.toString();
  }
}
