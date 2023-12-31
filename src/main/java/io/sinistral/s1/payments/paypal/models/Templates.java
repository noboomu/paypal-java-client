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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;


/**
 * An array of merchant-created templates with associated details that include the emails, addresses, and phone numbers from the user&#39;s PayPal profile.
 */
@JsonPropertyOrder({
  Templates.JSON_PROPERTY_ADDRESSES,
  Templates.JSON_PROPERTY_EMAILS,
  Templates.JSON_PROPERTY_PHONES,
  Templates.JSON_PROPERTY_TEMPLATES,
  Templates.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T16:02:23.639524-07:00[America/Los_Angeles]")
public class Templates {
  public static final String JSON_PROPERTY_ADDRESSES = "addresses";
  private List<AddressPortable> addresses;

  public static final String JSON_PROPERTY_EMAILS = "emails";
  private String emails;

  public static final String JSON_PROPERTY_PHONES = "phones";
  private List<PhoneDetail> phones;

  public static final String JSON_PROPERTY_TEMPLATES = "templates";
  private List<Template> templates;

  public static final String JSON_PROPERTY_LINKS = "links";
  private List<LinkDescription> links;

  public Templates() { 
  }

  @JsonCreator
  public Templates(
    @JsonProperty(JSON_PROPERTY_ADDRESSES) List<AddressPortable> addresses, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<LinkDescription> links
  ) {
  this();
    this.addresses = addresses;
    this.links = links;
  }

   /**
   * An array of addresses in the user&#39;s PayPal profile.
   * @return addresses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AddressPortable> getAddresses() {
    return addresses;
  }




  public Templates emails(String emails) {
    this.emails = emails;
    return this;
  }

   /**
   * The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters are allowed before and 255 characters are allowed after the &lt;code&gt;@&lt;/code&gt; sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted &lt;code&gt;@&lt;/code&gt; sign exists.&lt;/blockquote&gt;
   * @return emails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmails() {
    return emails;
  }


  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmails(String emails) {
    this.emails = emails;
  }


  public Templates phones(List<PhoneDetail> phones) {
    this.phones = phones;
    return this;
  }

  public Templates addPhonesItem(PhoneDetail phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * An array of phone numbers in the user&#39;s PayPal profile.
   * @return phones
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PhoneDetail> getPhones() {
    return phones;
  }


  @JsonProperty(JSON_PROPERTY_PHONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhones(List<PhoneDetail> phones) {
    this.phones = phones;
  }


  public Templates templates(List<Template> templates) {
    this.templates = templates;
    return this;
  }

  public Templates addTemplatesItem(Template templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * An array of details for each template. If &#x60;fields&#x60; is &#x60;none&#x60;, returns only the template name, ID, and default status.
   * @return templates
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Template> getTemplates() {
    return templates;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplates(List<Template> templates) {
    this.templates = templates;
  }


   /**
   * An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LinkDescription> getLinks() {
    return links;
  }




  /**
   * Return true if this templates object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Templates templates = (Templates) o;
    return Objects.equals(this.addresses, templates.addresses) &&
        Objects.equals(this.emails, templates.emails) &&
        Objects.equals(this.phones, templates.phones) &&
        Objects.equals(this.templates, templates.templates) &&
        Objects.equals(this.links, templates.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, emails, phones, templates, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Templates {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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

    // add `addresses` to the URL query string
    if (getAddresses() != null) {
      for (int i = 0; i < getAddresses().size(); i++) {
        if (getAddresses().get(i) != null) {
          joiner.add(getAddresses().get(i).toUrlQueryString(String.format("%saddresses%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `emails` to the URL query string
    if (getEmails() != null) {
      joiner.add(String.format("%semails%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmails()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `phones` to the URL query string
    if (getPhones() != null) {
      for (int i = 0; i < getPhones().size(); i++) {
        if (getPhones().get(i) != null) {
          joiner.add(getPhones().get(i).toUrlQueryString(String.format("%sphones%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `templates` to the URL query string
    if (getTemplates() != null) {
      for (int i = 0; i < getTemplates().size(); i++) {
        if (getTemplates().get(i) != null) {
          joiner.add(getTemplates().get(i).toUrlQueryString(String.format("%stemplates%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
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

