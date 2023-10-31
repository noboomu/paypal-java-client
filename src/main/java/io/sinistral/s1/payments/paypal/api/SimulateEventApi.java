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
import io.sinistral.s1.payments.paypal.models.Event;
import io.sinistral.s1.payments.paypal.models.SimulateEvent;

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
public class SimulateEventApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SimulateEventApi() {
    this(new ApiClient());
  }

  public SimulateEventApi(ApiClient apiClient) {
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
   * Simulate webhook event
   * Simulates a webhook event. In the JSON request body, specify a sample payload.&lt;br&gt;You need to subscribe to the following webhook events for Pay upon Invoice:&lt;br&gt;&lt;table&gt;&lt;thead&gt;&lt;tr&gt;&lt;th&gt;Event&lt;/th&gt;&lt;th&gt;Trigger&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt;&lt;tbody&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;PAYMENT.CAPTURE.COMPLETED&lt;/code&gt;&lt;/td&gt;&lt;td&gt;A payment capture completes.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;PAYMENT.CAPTURE.DENIED&lt;/code&gt;&lt;/td&gt;&lt;td&gt;A payment capture is denied.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;CHECKOUT.PAYMENT-APPROVAL.REVERSED&lt;/code&gt;&lt;/td&gt;&lt;td&gt;PayPal reverses a payment capture.&lt;/td&gt;&lt;/tr&gt;&lt;/tbody&gt;&lt;/table&gt;
   * @param simulateEvent  (optional)
   * @return CompletableFuture&lt;Event&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Event> simulateEventPost(SimulateEvent simulateEvent) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = simulateEventPostRequestBuilder(simulateEvent);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("simulateEventPost", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<Event>() {})
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
   * Simulate webhook event
   * Simulates a webhook event. In the JSON request body, specify a sample payload.&lt;br&gt;You need to subscribe to the following webhook events for Pay upon Invoice:&lt;br&gt;&lt;table&gt;&lt;thead&gt;&lt;tr&gt;&lt;th&gt;Event&lt;/th&gt;&lt;th&gt;Trigger&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt;&lt;tbody&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;PAYMENT.CAPTURE.COMPLETED&lt;/code&gt;&lt;/td&gt;&lt;td&gt;A payment capture completes.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;PAYMENT.CAPTURE.DENIED&lt;/code&gt;&lt;/td&gt;&lt;td&gt;A payment capture is denied.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;CHECKOUT.PAYMENT-APPROVAL.REVERSED&lt;/code&gt;&lt;/td&gt;&lt;td&gt;PayPal reverses a payment capture.&lt;/td&gt;&lt;/tr&gt;&lt;/tbody&gt;&lt;/table&gt;
   * @param simulateEvent  (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;Event&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Event>> simulateEventPostWithHttpInfo(SimulateEvent simulateEvent) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = simulateEventPostRequestBuilder(simulateEvent);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("simulateEventPost", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<Event>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<Event>() {}))
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

  private HttpRequest.Builder simulateEventPostRequestBuilder(SimulateEvent simulateEvent) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/notifications/simulate-event";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(simulateEvent);
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
}