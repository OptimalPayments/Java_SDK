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
package com.optimalpayments.hostedpayment.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

import com.optimalpayments.common.Id;
import com.optimalpayments.common.impl.AddressContainer;
import com.optimalpayments.common.impl.AddressContainerAdapter;
import com.optimalpayments.common.impl.IdAdapter;
import com.optimalpayments.hostedpayment.Order;

/**
 * OrderRebillSerializer class used to properly serialize rebill orders.
 */
public class OrderRebillSerializer implements JsonSerializer<Order> {
  
  private final Gson gsonSerializer;
  
  public OrderRebillSerializer() {
    final GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.excludeFieldsWithoutExposeAnnotation();
    gsonBuilder.registerTypeHierarchyAdapter(
            AddressContainer.class,
            new AddressContainerAdapter());
    gsonBuilder.registerTypeHierarchyAdapter(
            Id.class,
            new IdAdapter());
    gsonSerializer = gsonBuilder.create();
  }

  /**
   * Serialize the object with out disallowed properties.
   *
   * @param rebill
   * @param typeOfSrc
   * @param context
   * @return
   */
  @Override
  public JsonElement serialize(
          final Order rebill,
          final Type typeOfSrc,
          final JsonSerializationContext context) {
    
    final JsonElement base = gsonSerializer.toJsonTree(rebill);
    if (base.isJsonObject()) {
      final JsonObject baseObj = base.getAsJsonObject();
      if (baseObj.has("link")) {
        baseObj.remove("link");
      }
      if (baseObj.has("redirect")) {
        baseObj.remove("redirect");
      }
    }
    return base;
  }
}
