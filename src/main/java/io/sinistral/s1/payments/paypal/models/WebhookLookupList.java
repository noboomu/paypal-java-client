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
import io.sinistral.s1.payments.paypal.models.WebhooksLookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A list of webhook lookups.
 */
@JsonPropertyOrder({
  WebhookLookupList.JSON_PROPERTY_WEBHOOKS_LOOKUPS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-31T16:12:53.797730072-07:00[America/Los_Angeles]")
public class WebhookLookupList {
  public static final String JSON_PROPERTY_WEBHOOKS_LOOKUPS = "webhooks_lookups";
  private List<WebhooksLookup> webhooksLookups;

  public WebhookLookupList() { 
  }

  public WebhookLookupList webhooksLookups(List<WebhooksLookup> webhooksLookups) {
    this.webhooksLookups = webhooksLookups;
    return this;
  }

  public WebhookLookupList addWebhooksLookupsItem(WebhooksLookup webhooksLookupsItem) {
    if (this.webhooksLookups == null) {
      this.webhooksLookups = new ArrayList<>();
    }
    this.webhooksLookups.add(webhooksLookupsItem);
    return this;
  }

   /**
   * An array of webhook lookups.
   * @return webhooksLookups
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBHOOKS_LOOKUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WebhooksLookup> getWebhooksLookups() {
    return webhooksLookups;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOKS_LOOKUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhooksLookups(List<WebhooksLookup> webhooksLookups) {
    this.webhooksLookups = webhooksLookups;
  }


  /**
   * Return true if this WebhookLookupList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookLookupList webhookLookupList = (WebhookLookupList) o;
    return Objects.equals(this.webhooksLookups, webhookLookupList.webhooksLookups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhooksLookups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookLookupList {\n");
    sb.append("    webhooksLookups: ").append(toIndentedString(webhooksLookups)).append("\n");
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

    // add `webhooks_lookups` to the URL query string
    if (getWebhooksLookups() != null) {
      for (int i = 0; i < getWebhooksLookups().size(); i++) {
        if (getWebhooksLookups().get(i) != null) {
          joiner.add(getWebhooksLookups().get(i).toUrlQueryString(String.format("%swebhooks_lookups%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

