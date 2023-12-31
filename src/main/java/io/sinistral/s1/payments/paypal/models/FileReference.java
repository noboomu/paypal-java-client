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

import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;


/**
 * The file reference. Can be a file in PayPal MediaServ, PayPal DMS, or other custom store.
 */
@JsonPropertyOrder({
  FileReference.JSON_PROPERTY_ID,
  FileReference.JSON_PROPERTY_REFERENCE_URL,
  FileReference.JSON_PROPERTY_CONTENT_TYPE,
  FileReference.JSON_PROPERTY_CREATE_TIME,
  FileReference.JSON_PROPERTY_SIZE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T16:02:23.639524-07:00[America/Los_Angeles]")
public class FileReference {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REFERENCE_URL = "reference_url";
  private URI referenceUrl;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "content_type";
  private String contentType;

  public static final String JSON_PROPERTY_CREATE_TIME = "create_time";
  private String createTime;

  public static final String JSON_PROPERTY_SIZE = "size";
  private String size;

  public FileReference() { 
  }

  public FileReference id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the referenced file.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public FileReference referenceUrl(URI referenceUrl) {
    this.referenceUrl = referenceUrl;
    return this;
  }

   /**
   * The reference URL for the file.
   * @return referenceUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getReferenceUrl() {
    return referenceUrl;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceUrl(URI referenceUrl) {
    this.referenceUrl = referenceUrl;
  }


  public FileReference contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * The [Internet Assigned Numbers Authority (IANA) media type of the file](https://www.iana.org/assignments/media-types/media-types.xhtml).
   * @return contentType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public FileReference createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
   * @return createTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateTime() {
    return createTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public FileReference size(String size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the file, in bytes.
   * @return size
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(String size) {
    this.size = size;
  }


  /**
   * Return true if this file_reference object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileReference fileReference = (FileReference) o;
    return Objects.equals(this.id, fileReference.id) &&
        Objects.equals(this.referenceUrl, fileReference.referenceUrl) &&
        Objects.equals(this.contentType, fileReference.contentType) &&
        Objects.equals(this.createTime, fileReference.createTime) &&
        Objects.equals(this.size, fileReference.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, referenceUrl, contentType, createTime, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileReference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceUrl: ").append(toIndentedString(referenceUrl)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `reference_url` to the URL query string
    if (getReferenceUrl() != null) {
      joiner.add(String.format("%sreference_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReferenceUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `content_type` to the URL query string
    if (getContentType() != null) {
      joiner.add(String.format("%scontent_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContentType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `create_time` to the URL query string
    if (getCreateTime() != null) {
      joiner.add(String.format("%screate_time%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreateTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

