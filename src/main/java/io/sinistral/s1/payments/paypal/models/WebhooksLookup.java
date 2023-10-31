/*
 * Webhooks Management
 * The PayPal REST APIs use <a href=\"/docs/api/notifications/webhooks/\"/>webhooks</a> for event notification. Webhooks are HTTP callbacks that receive notification messages for events. After you configure a webhook listener for your app, you can <a href=\"#webhooks_create\">create a webhook</a>, which subscribes the webhook listener for your app to events. The <code>notifications</code> namespace contains resource collections for webhooks.
 *
 * The version of the OpenAPI document: 1.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.sinistral.s1.payments.paypal.models;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.sinistral.s1.payments.paypal.models.LinkDescription;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The webhook lookup details.
 */
@JsonPropertyOrder({
  WebhooksLookup.JSON_PROPERTY_ID,
  WebhooksLookup.JSON_PROPERTY_CLIENT_ID,
  WebhooksLookup.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-31T16:12:53.797730072-07:00[America/Los_Angeles]")
public class WebhooksLookup {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_LINKS = "links";
  private List<LinkDescription> links;

  public WebhooksLookup() { 
  }

  @JsonCreator
  public WebhooksLookup(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_CLIENT_ID) String clientId, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<LinkDescription> links
  ) {
  this();
    this.id = id;
    this.clientId = clientId;
    this.links = links;
  }

   /**
   * The ID of the webhook lookup.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * The application client ID.
   * @return clientId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }




   /**
   * An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links/).
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LinkDescription> getLinks() {
    return links;
  }




  /**
   * Return true if this webhooks_lookup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksLookup webhooksLookup = (WebhooksLookup) o;
    return Objects.equals(this.id, webhooksLookup.id) &&
        Objects.equals(this.clientId, webhooksLookup.clientId) &&
        Objects.equals(this.links, webhooksLookup.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksLookup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

    // add `client_id` to the URL query string
    if (getClientId() != null) {
      joiner.add(String.format("%sclient_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `links` to the URL query string
    if (getLinks() != null) {
      for (int i = 0; i < getLinks().size(); i++) {
        if (getLinks().get(i) != null) {
          joiner.add(getLinks().get(i).toUrlQueryString(String.format("%slinks%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

