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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;


/**
 * The invoicer business information that appears on the invoice.
 */
@JsonPropertyOrder({
  InvoicerInfo.JSON_PROPERTY_BUSINESS_NAME,
  InvoicerInfo.JSON_PROPERTY_NAME,
  InvoicerInfo.JSON_PROPERTY_ADDRESS,
  InvoicerInfo.JSON_PROPERTY_EMAIL_ADDRESS,
  InvoicerInfo.JSON_PROPERTY_PHONES,
  InvoicerInfo.JSON_PROPERTY_WEBSITE,
  InvoicerInfo.JSON_PROPERTY_TAX_ID,
  InvoicerInfo.JSON_PROPERTY_ADDITIONAL_NOTES,
  InvoicerInfo.JSON_PROPERTY_LOGO_URL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T16:02:23.639524-07:00[America/Los_Angeles]")
public class InvoicerInfo {
  public static final String JSON_PROPERTY_BUSINESS_NAME = "business_name";
  private String businessName;

  public static final String JSON_PROPERTY_NAME = "name";
  private Name name;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private AddressPortable address;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "email_address";
  private String emailAddress;

  public static final String JSON_PROPERTY_PHONES = "phones";
  private List<PhoneDetail> phones;

  public static final String JSON_PROPERTY_WEBSITE = "website";
  private URI website;

  public static final String JSON_PROPERTY_TAX_ID = "tax_id";
  private String taxId;

  public static final String JSON_PROPERTY_ADDITIONAL_NOTES = "additional_notes";
  private String additionalNotes;

  public static final String JSON_PROPERTY_LOGO_URL = "logo_url";
  private URI logoUrl;

  public InvoicerInfo() { 
  }

  public InvoicerInfo businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Required. The business name of the party.
   * @return businessName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessName() {
    return businessName;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public InvoicerInfo name(Name name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Name getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(Name name) {
    this.name = name;
  }


  public InvoicerInfo address(AddressPortable address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddressPortable getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(AddressPortable address) {
    this.address = address;
  }


  public InvoicerInfo emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters are allowed before and 255 characters are allowed after the &lt;code&gt;@&lt;/code&gt; sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted &lt;code&gt;@&lt;/code&gt; sign exists.&lt;/blockquote&gt;
   * @return emailAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public InvoicerInfo phones(List<PhoneDetail> phones) {
    this.phones = phones;
    return this;
  }

  public InvoicerInfo addPhonesItem(PhoneDetail phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * An array of invoicer&#39;s phone numbers. The invoicer can choose to hide the phone number on the invoice.
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


  public InvoicerInfo website(URI website) {
    this.website = website;
    return this;
  }

   /**
   * The invoicer&#39;s website.
   * @return website
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getWebsite() {
    return website;
  }


  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebsite(URI website) {
    this.website = website;
  }


  public InvoicerInfo taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

   /**
   * The invoicer&#39;s tax ID.
   * @return taxId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxId() {
    return taxId;
  }


  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  public InvoicerInfo additionalNotes(String additionalNotes) {
    this.additionalNotes = additionalNotes;
    return this;
  }

   /**
   * Any additional information. Includes business hours.
   * @return additionalNotes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalNotes() {
    return additionalNotes;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalNotes(String additionalNotes) {
    this.additionalNotes = additionalNotes;
  }


  public InvoicerInfo logoUrl(URI logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * The full URL to an external logo image. The logo image must not be larger than 250 pixels wide by 90 pixels high.
   * @return logoUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getLogoUrl() {
    return logoUrl;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoUrl(URI logoUrl) {
    this.logoUrl = logoUrl;
  }


  /**
   * Return true if this invoicer_info object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicerInfo invoicerInfo = (InvoicerInfo) o;
    return Objects.equals(this.businessName, invoicerInfo.businessName) &&
        Objects.equals(this.name, invoicerInfo.name) &&
        Objects.equals(this.address, invoicerInfo.address) &&
        Objects.equals(this.emailAddress, invoicerInfo.emailAddress) &&
        Objects.equals(this.phones, invoicerInfo.phones) &&
        Objects.equals(this.website, invoicerInfo.website) &&
        Objects.equals(this.taxId, invoicerInfo.taxId) &&
        Objects.equals(this.additionalNotes, invoicerInfo.additionalNotes) &&
        Objects.equals(this.logoUrl, invoicerInfo.logoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessName, name, address, emailAddress, phones, website, taxId, additionalNotes, logoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicerInfo {\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    additionalNotes: ").append(toIndentedString(additionalNotes)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
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

    // add `business_name` to the URL query string
    if (getBusinessName() != null) {
      joiner.add(String.format("%sbusiness_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBusinessName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(getName().toUrlQueryString(prefix + "name" + suffix));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `email_address` to the URL query string
    if (getEmailAddress() != null) {
      joiner.add(String.format("%semail_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `website` to the URL query string
    if (getWebsite() != null) {
      joiner.add(String.format("%swebsite%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebsite()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tax_id` to the URL query string
    if (getTaxId() != null) {
      joiner.add(String.format("%stax_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaxId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `additional_notes` to the URL query string
    if (getAdditionalNotes() != null) {
      joiner.add(String.format("%sadditional_notes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdditionalNotes()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `logo_url` to the URL query string
    if (getLogoUrl() != null) {
      joiner.add(String.format("%slogo_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogoUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

