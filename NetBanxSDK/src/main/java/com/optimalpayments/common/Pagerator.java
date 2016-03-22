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

import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

import com.optimalpayments.OptimalApiClient;
import com.optimalpayments.common.impl.BaseDomainObject;
import com.optimalpayments.common.impl.Request;

/**
 * Extend this class to allow iteration of a paged data set.
 *
 * @param <T> the type returned from the iterator
 */
public abstract class Pagerator<T extends BaseDomainObject>
        implements Iterable<T>, BaseDomainObject {

  /**
   * The client.
   */
  protected OptimalApiClient client;

  /**
   * Set the client.
   * 
   * @param client 
   */
  public final void setClient(final OptimalApiClient client) {
    this.client = client;
  }

  /**
   * Get the OptimalApiClient.
   *
   * @return OptimalApiClient
   * @throws OptimalException
   */
  private OptimalApiClient getClient() throws OptimalException {
    if (null == client) {
      throw new OptimalException("You must set the client before attempting any requests.");
    }
    return client;
  }

  /**
   * Used by iterator to ensure that there is a next element.
   * 
   * @param position
   * @return Boolean
   */

  protected final Boolean hasElementAfterPosition(final Integer position) {
	    return position+1 < getResults().size() || null != getNextPageUrl();
	  }

  /**
   * Used by iterator to ensure the requested position is loaded before returning it.
   * @param position 
   */
  protected final void ensurePositionLoaded(final Integer position) {
    if (position >= getResults().size()) {
      if (null != getNextPageUrl()) {
        final Request request = Request.builder()
                .uri(getNextPageUrl())
                .method(Request.RequestType.GET)
                .build();
        try {
          //unchecked type, but safe in practice
          @SuppressWarnings("unchecked")
          Pagerator<T> pgrtr = getClient().processRequest(request, getClass());
          //ensure we don't keep re-requesting the same page.
          if (pgrtr.getNextPageUrl().equals(getNextPageUrl())) {
            throw new RuntimeException("Invalid next page returned from API");
          }
          setNextPageUrl(pgrtr.getNextPageUrl());
          getResults().addAll(pgrtr.getResults());
          //addResults(pgrtr.getResults());
        } catch (OptimalException e) {
          throw new RuntimeException(e.getMessage(), e);
        } catch (IOException e) {
          throw new RuntimeException(e.getMessage(), e);
        }
      } else {
        throw new java.util.NoSuchElementException("No elements to retrieve.");
      }
    }
  }

  /**
   * Used by the iterator to get a specific element.
   * @param index
   * @return T
   */
  protected final T get(final int index) {
    return getResults().get(index);
  }

  /**
   * Get the iterator.
   * 
   * @return PageratorIterator< T >
   */
  @Override
  public final PageratorIterator<T> iterator() {
    return new PageratorIterator<T>(this);
  }

  /**
   * Get the Error.
   * 
   * @return Error
   */
  @Override
  public final Error getError() {
    return null;
  }

  /**
   * Get the current set of elements.
   *
   * @return ArrayList< T >
   */
  protected abstract ArrayList<T> getResults();

  /**
   * Get the url of the next page to be loaded.
   *
   * @return String
   */
  protected abstract String getNextPageUrl();

  /**
   * Set the next page url.
   *
   * @param nextUrl
   */
  protected abstract void setNextPageUrl(String nextUrl);

  /**
   * Class to iterate over the result set, and request additional pages as needed.
   *
   * @param <T> the type to be returned by iterator
   */
  public class PageratorIterator<T extends BaseDomainObject> implements ListIterator<T> {

    public PageratorIterator(final Pagerator<T> parent) {
      this.parent = parent;
      position = -1;
    }

    private final Pagerator<T> parent;
    /**
     * Tracks the current position in the result set.
     */
    private int position = -1;

    /**
     * Implementation for ListIterator.
     *
     * @return Boolean
     */
    @Override
    public final boolean hasNext() {
      return parent.hasElementAfterPosition(position);
    }

    protected final T get(final int index) {
      return parent.get(index);
    }

    @Override
    public final T next() {
      if (!hasNext()) {
        throw new java.util.NoSuchElementException("Unable to retrieve next element.");
      }
      position = nextIndex();
      parent.ensurePositionLoaded(position);
      return get(position);
    }

    /**
     * Implementation for ListIterator.
     *
     * @return int
     */
    @Override
    public final int nextIndex() {
      if (hasNext()) {
        return position + 1;
      } else {
        return position;
      }
    }

    /**
     * Implementation for ListIterator.
     *
     * @return Boolean
     */
    @Override
    public final boolean hasPrevious() {
      return (position > 0);
    }

    /**
     * Implementation for ListIterator.
     *
     * @return T
     */
    @Override
    public final T previous() {
      position = previousIndex();
      return get(position);
    }

    /**
     * Implementation for ListIterator.
     *
     * @return int
     */
    @Override
    public final int previousIndex() {
      if (position >= 0) {
        return position - 1;
      }
      return -1;
    }

    /**
     * Implementation for ListIterator.
     */
    @Override
    public final void remove() {
      throw new RuntimeException("You cannot remove elements from this iterator.");
    }

    /**
     * Implementation for ListIterator.
     *
     * @param unused
     */
    @Override
    public final void set(final T unused) {
      throw new RuntimeException("You cannot set elements in this iterator.");
    }

    /**
     * Implementation for ListIterator.
     *
     * @param unused
     */
    @Override
    public final void add(final T unused) {
      throw new RuntimeException("You cannot add elements to this iterator.");
    }
  }
}
