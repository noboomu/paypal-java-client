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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;


/**
 * Error response for 400
 */
@JsonPropertyOrder({
        Error.JSON_PROPERTY_NAME,
        Error.JSON_PROPERTY_MESSAGE,
        Error.JSON_PROPERTY_ISSUES,
        Error.JSON_PROPERTY_DEBUG_ID,
        Error.JSON_PROPERTY_INFORMATION_LINK
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T16:02:23.639524-07:00[America/Los_Angeles]")
public class Error {
    /**
     * Gets or Sets name
     */
    public enum NameEnum {
        INVALID_REQUEST("INVALID_REQUEST"),
        AUTHENTICATION_FAILURE("AUTHENTICATION_FAILURE"),
        NOT_AUTHORIZED("NOT_AUTHORIZED"),
        RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND"),
        RESOURCE_CONFLICT("RESOURCE_CONFLICT"),
        SERVICE_UNAVAILABLE("SERVICE_UNAVAILABLE"),
        UNSUPPORTED_MEDIA_TYPE("UNSUPPORTED_MEDIA_TYPE"),
        UNPROCESSABLE_ENTITY("UNPROCESSABLE_ENTITY");


        private String value;

        NameEnum(String value) {
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
        public static NameEnum fromValue(String value) {
            for (NameEnum b : NameEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_NAME = "name";
    private NameEnum name;

    /**
     * Gets or Sets message
     */
    public enum MessageEnum {
        THE_REQUESTED_ACTION_COULD_NOT_BE_PERFORMED_SEMANTICALLY_INCORRECT_OR_FAILED_BUSINESS_VALIDATION_("The requested action could not be performed, semantically incorrect, or failed business validation."),

        THE_SERVER_DOES_NOT_SUPPORT_THE_REQUEST_PAYLOAD_S_MEDIA_TYPE_("The server does not support the request payload's media type."),
        THE_SPECIFIED_RESOURCE_DOES_NOT_EXIST_("The specified resource does not exist."),
        THE_SERVER_HAS_DETECTED_A_CONFLICT_WHILE_PROCESSING_THIS_REQUEST_("The server has detected a conflict while processing this request."),
        REQUEST_IS_NOT_WELL_FORMED_SYNTACTICALLY_INCORRECT_OR_VIOLATES_SCHEMA_("Request is not well-formed, syntactically incorrect, or violates schema."),
        AUTHORIZATION_FAILED_DUE_TO_INSUFFICIENT_PERMISSIONS_("Authorization failed due to insufficient permissions."),
        AN_INTERNAL_SERVER_ERROR_OCCURRED_("An internal server error occurred."),
        AUTHENTICATION_FAILED_DUE_TO_MISSING_AUTHORIZATION_HEADER_OR_INVALID_AUTHENTICATION_CREDENTIALS_("Authentication failed due to missing authorization header, or invalid authentication credentials."),
        SERVICE_UNAVAILABLE_("Service Unavailable.");

        private String value;

        MessageEnum(String value) {
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
        public static MessageEnum fromValue(String value) {
            for (MessageEnum b : MessageEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_MESSAGE = "message";
    private MessageEnum message;

    public static final String JSON_PROPERTY_ISSUES = "issues";
    private List<ErrorDetails> issues;

    public static final String JSON_PROPERTY_DEBUG_ID = "debug_id";
    private String debugId;

    public static final String JSON_PROPERTY_INFORMATION_LINK = "information_link";
    private String informationLink;

    public Error() {
    }

    @JsonCreator
    public Error(
            @JsonProperty(JSON_PROPERTY_INFORMATION_LINK) String informationLink
    ) {
        this();
        this.informationLink = informationLink;
    }

    public Error name(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public NameEnum getName() {
        return name;
    }


    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(NameEnum name) {
        this.name = name;
    }


    public Error message(MessageEnum message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     **/
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public MessageEnum getMessage() {
        return message;
    }


    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessage(MessageEnum message) {
        this.message = message;
    }


    public Error issues(List<ErrorDetails> issues) {
        this.issues = issues;
        return this;
    }

    public Error addIssuesItem(ErrorDetails issuesItem) {
        if (this.issues == null) {
            this.issues = new ArrayList<>();
        }
        this.issues.add(issuesItem);
        return this;
    }

    /**
     * Get issues
     *
     * @return issues
     **/
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ISSUES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ErrorDetails> getIssues() {
        return issues;
    }


    @JsonProperty(JSON_PROPERTY_ISSUES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIssues(List<ErrorDetails> issues) {
        this.issues = issues;
    }


    public Error debugId(String debugId) {
        this.debugId = debugId;
        return this;
    }

    /**
     * The PayPal internal ID. Used for correlation purposes.
     *
     * @return debugId
     **/
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DEBUG_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getDebugId() {
        return debugId;
    }


    @JsonProperty(JSON_PROPERTY_DEBUG_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDebugId(String debugId) {
        this.debugId = debugId;
    }


    /**
     * The information link, or URI, that shows detailed information about this error for the developer.
     *
     * @return informationLink
     **/
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_INFORMATION_LINK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getInformationLink() {
        return informationLink;
    }


    /**
     * Return true if this error_400 object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return Objects.equals(this.name, error.name) &&
                Objects.equals(this.message, error.message) &&
                Objects.equals(this.issues, error.issues) &&
                Objects.equals(this.debugId, error.debugId) &&
                Objects.equals(this.informationLink, error.informationLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, message, issues, debugId, informationLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class error {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
        sb.append("    debugId: ").append(toIndentedString(debugId)).append("\n");
        sb.append("    informationLink: ").append(toIndentedString(informationLink)).append("\n");
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

        // add `message` to the URL query string
        if (getMessage() != null) {
            joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        // add `issues` to the URL query string
        if (getIssues() != null) {
            for (int i = 0; i < getIssues().size(); i++) {
                if (getIssues().get(i) != null) {
                    joiner.add(getIssues().get(i).toUrlQueryString(String.format("%sissues%s%s", prefix, suffix,
                            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
                }
            }
        }

        // add `debug_id` to the URL query string
        if (getDebugId() != null) {
            joiner.add(String.format("%sdebug_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDebugId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        // add `information_link` to the URL query string
        if (getInformationLink() != null) {
            joiner.add(String.format("%sinformation_link%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInformationLink()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}

