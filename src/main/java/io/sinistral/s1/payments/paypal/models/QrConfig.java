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
 * The configuration for a QR code.
 */
@JsonPropertyOrder({
  QrConfig.JSON_PROPERTY_WIDTH,
  QrConfig.JSON_PROPERTY_HEIGHT,
  QrConfig.JSON_PROPERTY_ACTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T16:02:23.639524-07:00[America/Los_Angeles]")
public class QrConfig {
  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width = 500;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height = 500;

  public static final String JSON_PROPERTY_ACTION = "action";
  private String action = "pay";

  public QrConfig() { 
  }

  public QrConfig width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width, in pixels, of the QR code image. Value is from &#x60;150&#x60; to &#x60;500&#x60;.
   * minimum: 150
   * maximum: 500
   * @return width
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public QrConfig height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height, in pixels, of the QR code image. Value is from &#x60;150&#x60; to &#x60;500&#x60;.
   * minimum: 150
   * maximum: 500
   * @return height
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  public QrConfig action(String action) {
    this.action = action;
    return this;
  }

   /**
   * The type of URL for which to generate a QR code. Valid values are &#x60;pay&#x60; and &#x60;details&#x60;.
   * @return action
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(String action) {
    this.action = action;
  }


  /**
   * Return true if this qr_config object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QrConfig qrConfig = (QrConfig) o;
    return Objects.equals(this.width, qrConfig.width) &&
        Objects.equals(this.height, qrConfig.height) &&
        Objects.equals(this.action, qrConfig.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QrConfig {\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

    // add `width` to the URL query string
    if (getWidth() != null) {
      joiner.add(String.format("%swidth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWidth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `height` to the URL query string
    if (getHeight() != null) {
      joiner.add(String.format("%sheight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHeight()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `action` to the URL query string
    if (getAction() != null) {
      joiner.add(String.format("%saction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAction()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

