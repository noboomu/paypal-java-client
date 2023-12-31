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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;


/**
 * The template settings. Sets a template as the default template or edit template.
 */
@JsonPropertyOrder({
  TemplateSettings.JSON_PROPERTY_TEMPLATE_ITEM_SETTINGS,
  TemplateSettings.JSON_PROPERTY_TEMPLATE_SUBTOTAL_SETTINGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T16:02:23.639524-07:00[America/Los_Angeles]")
public class TemplateSettings {
  public static final String JSON_PROPERTY_TEMPLATE_ITEM_SETTINGS = "template_item_settings";
  private List<TemplateItemSetting> templateItemSettings;

  public static final String JSON_PROPERTY_TEMPLATE_SUBTOTAL_SETTINGS = "template_subtotal_settings";
  private List<TemplateSubtotalSetting> templateSubtotalSettings;

  public TemplateSettings() { 
  }

  public TemplateSettings templateItemSettings(List<TemplateItemSetting> templateItemSettings) {
    this.templateItemSettings = templateItemSettings;
    return this;
  }

  public TemplateSettings addTemplateItemSettingsItem(TemplateItemSetting templateItemSettingsItem) {
    if (this.templateItemSettings == null) {
      this.templateItemSettings = new ArrayList<>();
    }
    this.templateItemSettings.add(templateItemSettingsItem);
    return this;
  }

   /**
   * The template item headers display preference.
   * @return templateItemSettings
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ITEM_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TemplateItemSetting> getTemplateItemSettings() {
    return templateItemSettings;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_ITEM_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateItemSettings(List<TemplateItemSetting> templateItemSettings) {
    this.templateItemSettings = templateItemSettings;
  }


  public TemplateSettings templateSubtotalSettings(List<TemplateSubtotalSetting> templateSubtotalSettings) {
    this.templateSubtotalSettings = templateSubtotalSettings;
    return this;
  }

  public TemplateSettings addTemplateSubtotalSettingsItem(TemplateSubtotalSetting templateSubtotalSettingsItem) {
    if (this.templateSubtotalSettings == null) {
      this.templateSubtotalSettings = new ArrayList<>();
    }
    this.templateSubtotalSettings.add(templateSubtotalSettingsItem);
    return this;
  }

   /**
   * The template subtotal headers display preference.
   * @return templateSubtotalSettings
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_SUBTOTAL_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TemplateSubtotalSetting> getTemplateSubtotalSettings() {
    return templateSubtotalSettings;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_SUBTOTAL_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateSubtotalSettings(List<TemplateSubtotalSetting> templateSubtotalSettings) {
    this.templateSubtotalSettings = templateSubtotalSettings;
  }


  /**
   * Return true if this template_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateSettings templateSettings = (TemplateSettings) o;
    return Objects.equals(this.templateItemSettings, templateSettings.templateItemSettings) &&
        Objects.equals(this.templateSubtotalSettings, templateSettings.templateSubtotalSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateItemSettings, templateSubtotalSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateSettings {\n");
    sb.append("    templateItemSettings: ").append(toIndentedString(templateItemSettings)).append("\n");
    sb.append("    templateSubtotalSettings: ").append(toIndentedString(templateSubtotalSettings)).append("\n");
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

    // add `template_item_settings` to the URL query string
    if (getTemplateItemSettings() != null) {
      for (int i = 0; i < getTemplateItemSettings().size(); i++) {
        if (getTemplateItemSettings().get(i) != null) {
          joiner.add(getTemplateItemSettings().get(i).toUrlQueryString(String.format("%stemplate_item_settings%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `template_subtotal_settings` to the URL query string
    if (getTemplateSubtotalSettings() != null) {
      for (int i = 0; i < getTemplateSubtotalSettings().size(); i++) {
        if (getTemplateSubtotalSettings().get(i) != null) {
          joiner.add(getTemplateSubtotalSettings().get(i).toUrlQueryString(String.format("%stemplate_subtotal_settings%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

