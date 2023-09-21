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

import com.fasterxml.jackson.annotation.*;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;


/**
 * The request-related [HATEOAS link](/docs/api/reference/api-responses/#hateoas-links) information.
 */
@JsonPropertyOrder({
  LinkDescription.JSON_PROPERTY_HREF,
  LinkDescription.JSON_PROPERTY_REL,
  LinkDescription.JSON_PROPERTY_METHOD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T16:02:23.639524-07:00[America/Los_Angeles]")
public class LinkDescription {
  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_REL = "rel";
  private String rel;

  /**
   * The HTTP method required to make the related call.
   */
  public enum MethodEnum {
    GET("GET"),
    
    POST("POST"),
    
    PUT("PUT"),
    
    DELETE("DELETE"),
    
    HEAD("HEAD"),
    
    CONNECT("CONNECT"),
    
    OPTIONS("OPTIONS"),
    
    PATCH("PATCH");

    private String value;

    MethodEnum(String value) {
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
    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_METHOD = "method";
  private MethodEnum method;

  public LinkDescription() { 
  }

  public LinkDescription href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The complete target URL. To make the related call, combine the method with this [URI Template-formatted](https://tools.ietf.org/html/rfc6570) link. For pre-processing, include the &#x60;$&#x60;, &#x60;(&#x60;, and &#x60;)&#x60; characters. The &#x60;href&#x60; is the key HATEOAS component that links a completed call with a subsequent call.
   * @return href
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHref(String href) {
    this.href = href;
  }


  public LinkDescription rel(String rel) {
    this.rel = rel;
    return this;
  }

   /**
   * The [link relation type](https://tools.ietf.org/html/rfc5988#section-4), which serves as an ID for a link that unambiguously describes the semantics of the link. See [Link Relations](https://www.iana.org/assignments/link-relations/link-relations.xhtml).
   * @return rel
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRel() {
    return rel;
  }


  @JsonProperty(JSON_PROPERTY_REL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRel(String rel) {
    this.rel = rel;
  }


  public LinkDescription method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * The HTTP method required to make the related call.
   * @return method
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MethodEnum getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  /**
   * Return true if this link_description object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkDescription linkDescription = (LinkDescription) o;
    return Objects.equals(this.href, linkDescription.href) &&
        Objects.equals(this.rel, linkDescription.rel) &&
        Objects.equals(this.method, linkDescription.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, rel, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkDescription {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

    // add `href` to the URL query string
    if (getHref() != null) {
      joiner.add(String.format("%shref%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHref()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `rel` to the URL query string
    if (getRel() != null) {
      joiner.add(String.format("%srel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRel()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `method` to the URL query string
    if (getMethod() != null) {
      joiner.add(String.format("%smethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
