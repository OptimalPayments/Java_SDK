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
package com.optimalpayments.common;

import com.optimalpayments.common.impl.BaseDomainObject;

/**
 * All internal exceptions extend or implement this type.
 */
public class OptimalException extends Exception {

  private final BaseDomainObject rawResponse;
  private final String code;

  public OptimalException(final String message) {
    this(message, null);
  }

  public OptimalException(final String message, final Throwable cause) {
    super(message, cause);
    rawResponse = null;
    code = null;
  }

  public OptimalException(final BaseDomainObject obj, final Throwable cause) {
    super(null == obj || null == obj.getError()
            ? "An unknown error has occurred"
            : obj.getError().getMessage(),
            cause);
    rawResponse = obj;
    code = null == obj || null == obj.getError()
            ? null
            : obj.getError().getCode();

  }

  public final BaseDomainObject getRawResponse() {
    return rawResponse;
  }

  public final String getCode() {
    return code;
  }
}
