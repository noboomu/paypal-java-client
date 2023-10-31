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

package io.sinistral.s1.payments.paypal.api;

import io.sinistral.s1.payments.paypal.core.ApiClient;
import io.sinistral.s1.payments.paypal.core.ApiException;
import io.sinistral.s1.payments.paypal.core.ApiResponse;
import io.sinistral.s1.payments.paypal.core.Pair;

import io.sinistral.s1.payments.paypal.models.ErrorDefault;
import io.sinistral.s1.payments.paypal.models.EventTypeList;
import io.sinistral.s1.payments.paypal.models.Patch;
import io.sinistral.s1.payments.paypal.models.Webhook;
import io.sinistral.s1.payments.paypal.models.WebhookList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-31T16:12:53.797730072-07:00[America/Los_Angeles]")
public class WebhooksApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public WebhooksApi() {
    this(new ApiClient());
  }

  public WebhooksApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  private ApiException getApiException(String operationId, HttpResponse<String> response) {
    String message = formatExceptionMessage(operationId, response.statusCode(), response.body());
    return new ApiException(response.statusCode(), message, response.headers(), response.body());
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * List event subscriptions for webhook
   * Lists event subscriptions for a webhook, by ID.
   * @param webhookId The ID of the webhook for which to list subscriptions. (required)
   * @return CompletableFuture&lt;EventTypeList&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<EventTypeList> eventTypesList(String webhookId) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = eventTypesListRequestBuilder(webhookId);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("eventTypesList", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<EventTypeList>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * List event subscriptions for webhook
   * Lists event subscriptions for a webhook, by ID.
   * @param webhookId The ID of the webhook for which to list subscriptions. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EventTypeList&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<EventTypeList>> eventTypesListWithHttpInfo(String webhookId) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = eventTypesListRequestBuilder(webhookId);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("eventTypesList", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<EventTypeList>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<EventTypeList>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder eventTypesListRequestBuilder(String webhookId) throws ApiException {
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling eventTypesList");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/notifications/webhooks/{webhook_id}/event-types"
        .replace("{webhook_id}", ApiClient.urlEncode(webhookId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Delete webhook
   * Deletes a webhook, by ID.
   * @param webhookId The ID of the webhook for which to list subscriptions. (required)
   * @return CompletableFuture&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Void> webhooksDelete(String webhookId) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = webhooksDeleteRequestBuilder(webhookId);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("webhooksDelete", localVarResponse));
            }
            return CompletableFuture.completedFuture(null);
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Delete webhook
   * Deletes a webhook, by ID.
   * @param webhookId The ID of the webhook for which to list subscriptions. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Void>> webhooksDeleteWithHttpInfo(String webhookId) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = webhooksDeleteRequestBuilder(webhookId);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("webhooksDelete", localVarResponse));
            }
            return CompletableFuture.completedFuture(
                new ApiResponse<Void>(localVarResponse.statusCode(), localVarResponse.headers().map(), null)
            );
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder webhooksDeleteRequestBuilder(String webhookId) throws ApiException {
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling webhooksDelete");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/notifications/webhooks/{webhook_id}"
        .replace("{webhook_id}", ApiClient.urlEncode(webhookId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Show webhook details
   * Shows details for a webhook, by ID.
   * @param webhookId The ID of the webhook for which to list subscriptions. (required)
   * @return CompletableFuture&lt;Webhook&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Webhook> webhooksGet(String webhookId) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = webhooksGetRequestBuilder(webhookId);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("webhooksGet", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<Webhook>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Show webhook details
   * Shows details for a webhook, by ID.
   * @param webhookId The ID of the webhook for which to list subscriptions. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Webhook&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Webhook>> webhooksGetWithHttpInfo(String webhookId) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = webhooksGetRequestBuilder(webhookId);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("webhooksGet", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<Webhook>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<Webhook>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder webhooksGetRequestBuilder(String webhookId) throws ApiException {
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling webhooksGet");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/notifications/webhooks/{webhook_id}"
        .replace("{webhook_id}", ApiClient.urlEncode(webhookId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * List webhooks
   * Lists webhooks for an app.
   * @param anchorType Filters the webhooks in the response by an anchor type. (optional, default to APPLICATION)
   * @return CompletableFuture&lt;WebhookList&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<WebhookList> webhooksList(String anchorType) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = webhooksListRequestBuilder(anchorType);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("webhooksList", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<WebhookList>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * List webhooks
   * Lists webhooks for an app.
   * @param anchorType Filters the webhooks in the response by an anchor type. (optional, default to APPLICATION)
   * @return CompletableFuture&lt;ApiResponse&lt;WebhookList&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<WebhookList>> webhooksListWithHttpInfo(String anchorType) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = webhooksListRequestBuilder(anchorType);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("webhooksList", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<WebhookList>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<WebhookList>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder webhooksListRequestBuilder(String anchorType) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/notifications/webhooks";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "anchor_type";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("anchor_type", anchorType));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Create webhook
   * Subscribes your webhook listener to events.
   * @param webhook  (optional)
   * @return CompletableFuture&lt;Webhook&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Webhook> webhooksPost(Webhook webhook) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = webhooksPostRequestBuilder(webhook);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("webhooksPost", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<Webhook>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Create webhook
   * Subscribes your webhook listener to events.
   * @param webhook  (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;Webhook&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Webhook>> webhooksPostWithHttpInfo(Webhook webhook) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = webhooksPostRequestBuilder(webhook);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("webhooksPost", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<Webhook>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<Webhook>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder webhooksPostRequestBuilder(Webhook webhook) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/notifications/webhooks";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(webhook);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Update webhook
   * Updates a webhook to replace webhook fields with new values. Supports only the &#x60;replace&#x60; operation. Pass a &#x60;json_patch&#x60; object with &#x60;replace&#x60; operation and &#x60;path&#x60;, which is &#x60;/url&#x60; for a URL or &#x60;/event_types&#x60; for events. The &#x60;value&#x60; is either the URL or a list of events.
   * @param webhookId The ID of the webhook for which to list subscriptions. (required)
   * @param patch  (optional
   * @return CompletableFuture&lt;Webhook&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Webhook> webhooksUpdate(String webhookId, List<Patch> patch) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = webhooksUpdateRequestBuilder(webhookId, patch);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("webhooksUpdate", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<Webhook>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Update webhook
   * Updates a webhook to replace webhook fields with new values. Supports only the &#x60;replace&#x60; operation. Pass a &#x60;json_patch&#x60; object with &#x60;replace&#x60; operation and &#x60;path&#x60;, which is &#x60;/url&#x60; for a URL or &#x60;/event_types&#x60; for events. The &#x60;value&#x60; is either the URL or a list of events.
   * @param webhookId The ID of the webhook for which to list subscriptions. (required)
   * @param patch  (optional
   * @return CompletableFuture&lt;ApiResponse&lt;Webhook&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Webhook>> webhooksUpdateWithHttpInfo(String webhookId, List<Patch> patch) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = webhooksUpdateRequestBuilder(webhookId, patch);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("webhooksUpdate", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<Webhook>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<Webhook>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder webhooksUpdateRequestBuilder(String webhookId, List<Patch> patch) throws ApiException {
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling webhooksUpdate");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/notifications/webhooks/{webhook_id}"
        .replace("{webhook_id}", ApiClient.urlEncode(webhookId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(patch);
      localVarRequestBuilder.method("PATCH", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}