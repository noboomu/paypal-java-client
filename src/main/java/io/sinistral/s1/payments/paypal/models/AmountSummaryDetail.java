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
 * The invoice amount summary of item total, discount, tax total, and shipping.
 */
@JsonPropertyOrder({
  AmountSummaryDetail.JSON_PROPERTY_CURRENCY_CODE,
  AmountSummaryDetail.JSON_PROPERTY_VALUE,
  AmountSummaryDetail.JSON_PROPERTY_BREAKDOWN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T16:02:23.639524-07:00[America/Los_Angeles]")
public class AmountSummaryDetail {
  public static final String JSON_PROPERTY_CURRENCY_CODE = "currency_code";
  private String currencyCode;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_BREAKDOWN = "breakdown";
  private AmountWithBreakdown breakdown;

  public AmountSummaryDetail() { 
  }

  public AmountSummaryDetail currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/) that identifies the currency.
   * @return currencyCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public AmountSummaryDetail value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value, which might be:&lt;ul&gt;&lt;li&gt;An integer for currencies like &#x60;JPY&#x60; that are not typically fractional.&lt;/li&gt;&lt;li&gt;A decimal fraction for currencies like &#x60;TND&#x60; that are subdivided into thousandths.&lt;/li&gt;&lt;/ul&gt;For the required number of decimal places for a currency code, see [Currency Codes](/docs/integration/direct/rest/currency-codes/).
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public AmountSummaryDetail breakdown(AmountWithBreakdown breakdown) {
    this.breakdown = breakdown;
    return this;
  }

   /**
   * Get breakdown
   * @return breakdown
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AmountWithBreakdown getBreakdown() {
    return breakdown;
  }


  @JsonProperty(JSON_PROPERTY_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreakdown(AmountWithBreakdown breakdown) {
    this.breakdown = breakdown;
  }


  /**
   * Return true if this amount_summary_detail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountSummaryDetail amountSummaryDetail = (AmountSummaryDetail) o;
    return Objects.equals(this.currencyCode, amountSummaryDetail.currencyCode) &&
        Objects.equals(this.value, amountSummaryDetail.value) &&
        Objects.equals(this.breakdown, amountSummaryDetail.breakdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, value, breakdown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountSummaryDetail {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
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

    // add `currency_code` to the URL query string
    if (getCurrencyCode() != null) {
      joiner.add(String.format("%scurrency_code%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrencyCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format("%svalue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValue()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `breakdown` to the URL query string
    if (getBreakdown() != null) {
      joiner.add(getBreakdown().toUrlQueryString(prefix + "breakdown" + suffix));
    }

    return joiner.toString();
  }
}

