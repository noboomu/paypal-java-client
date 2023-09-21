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
 * The tax information. Includes the tax name and tax rate of invoice items. The tax amount is added to the item total.
 */
@JsonPropertyOrder({
  Tax.JSON_PROPERTY_NAME,
  Tax.JSON_PROPERTY_PERCENT,
  Tax.JSON_PROPERTY_AMOUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T16:02:23.639524-07:00[America/Los_Angeles]")
public class Tax {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PERCENT = "percent";
  private String percent;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Money amount;

  public Tax() { 
  }

  public Tax name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the tax applied on the invoice items.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public Tax percent(String percent) {
    this.percent = percent;
    return this;
  }

   /**
   * The percentage, as a fixed-point, signed decimal number. For example, define a 19.99% interest rate as &#x60;19.99&#x60;.
   * @return percent
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PERCENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPercent() {
    return percent;
  }


  @JsonProperty(JSON_PROPERTY_PERCENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPercent(String percent) {
    this.percent = percent;
  }


  public Tax amount(Money amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Money getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Money amount) {
    this.amount = amount;
  }


  /**
   * Return true if this tax object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax tax = (Tax) o;
    return Objects.equals(this.name, tax.name) &&
        Objects.equals(this.percent, tax.percent) &&
        Objects.equals(this.amount, tax.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, percent, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `percent` to the URL query string
    if (getPercent() != null) {
      joiner.add(String.format("%spercent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPercent()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(getAmount().toUrlQueryString(prefix + "amount" + suffix));
    }

    return joiner.toString();
  }
}

