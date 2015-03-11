/*
 * Copyright (c) 2014 Optimal Payments
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.optimalpayments.common.impl;

import com.google.gson.JsonSerializer;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

import com.optimalpayments.common.OptimalException;

/**
 * The Class Request.
 */
public class Request {

  private Request() {

  }

  /**
   * The body.
   */
  private BaseDomainObject body;

  /**
   * The method.
   */
  private RequestType method;

  /**
   * The query str.
   */
  private HashMap<String, String> queryStr;

  /**
   * The uri.
   */
  private String uri;

  /**
   * The serializer.
   */
  private JsonSerializer serializer;

  /**
   * Get the body to be serialized.
   *
   * @return BaseDomainObject
   */
  public final BaseDomainObject getBody() {
    return body;
  }

  /**
   * Get the method of the request.
   *
   * @return RequestType
   */
  public final RequestType getMethod() {
    return method;
  }

  /**
   * Build URL for the optimal API client.
   *
   * @param apiEndPoint
   * @return String
   * @throws OptimalException
   */
  public final String buildUrl(final String apiEndPoint) throws OptimalException {
    if (null == uri) {
      throw new OptimalException("You must specify a uri when building this object");
    }
    //if this is a url, let's make sure that it contains our endpoint
    if (uri.contains("://")) {
      if (uri.indexOf(apiEndPoint) != 0) {
        throw new OptimalException("Unexpected endpoint in url: " + uri + " expected: "
                + apiEndPoint);
      }
      return uri;
    }
    return apiEndPoint + "/" + uri
            + (null == queryStr || queryStr.isEmpty() ? "" : "?" + buildQueryString());
  }

  public JsonSerializer getSerializer() {
    return serializer;
  }

  /**
   * Builds the query string.
   *
   * @return the string
   * @throws RuntimeException
   */
  private String buildQueryString() throws RuntimeException {

    final StringBuilder response = new StringBuilder();
    if (null != queryStr) {
      for (java.util.Map.Entry<String, String> entry : queryStr.entrySet()) {
        if (response.length() > 0) {
          response.append("&");
        }

        try {
          final String value = entry.getValue();
          response.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
          response.append("=");
          response.append(null != value ? URLEncoder.encode(value, "UTF-8") : "");
        } catch (UnsupportedEncodingException ex) {
          throw new RuntimeException("This method requires UTF-8 encoding support", ex);
        }
      }
    }

    return response.toString();
  }

  /**
   * Allow easy building of request objects.
   *
   * @return RequestBuilder
   */
  public static final RequestBuilder builder() {
    return new RequestBuilder();
  }

  /**
   * RequestBuilder class.
   */
  public static class RequestBuilder {

    private final Request request = new Request();

    /**
     * Build this request.
     *
     * @return Request
     */
    public final Request build() {
      return request;
    }

    /**
     * Set the uri.
     *
     * @param uri
     * @return RequestBuilder
     */
    public final RequestBuilder uri(final String uri) {
      request.uri = uri;
      return this;
    }

    /**
     * Set the body.
     *
     * @param body
     * @return RequestBuilder
     */
    public final RequestBuilder body(final BaseDomainObject body) {
      request.body = body;
      return this;
    }

    /**
     * Set the method.
     *
     * @param method
     * @return RequestBuilder
     */
    public final RequestBuilder method(final RequestType method) {
      request.method = method;
      return this;
    }

    /**
     * Set the serializer.
     *
     * @param serializer
     * @return RequestBuilder
     */
    public final RequestBuilder serializer(final JsonSerializer serializer) {
      request.serializer = serializer;
      return this;
    }

    /**
     * Set the queryStr.
     *
     * @param queryStr
     * @return RequestBuilder
     */
    public final RequestBuilder queryStr(final HashMap<String, String> queryStr) {
      request.queryStr = queryStr;
      return this;
    }
  }

  /**
   * The Enum RequestType.
   */
  public enum RequestType {

    /**
     * The delete.
     */
    DELETE,
    /**
     * The get.
     */
    GET,
    /**
     * The post.
     */
    POST,
    /**
     * The put.
     */
    PUT;

  }

}
