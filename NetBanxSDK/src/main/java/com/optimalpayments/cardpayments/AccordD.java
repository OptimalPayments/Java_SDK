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
package com.optimalpayments.cardpayments;

import com.google.gson.annotations.Expose;

import com.optimalpayments.common.impl.DomainObject;
import com.optimalpayments.common.impl.GenericBuilder;
import com.optimalpayments.common.impl.NestedBuilder;

/**
 * The Class AccordD.
 */
public class AccordD implements DomainObject {

  @Expose
  private FinancingType financingType;
  @Expose
  private String plan;
  @Expose
  private Integer gracePeriod;
  @Expose
  private Integer term;
  
  public final FinancingType getFinancingType() {
    return financingType;
  }

  public final void setFinancingType(final FinancingType financingType) {
    this.financingType = financingType;
  }

  public final String getPlan() {
    return plan;
  }

  public final void setPlan(final String plan) {
    this.plan = plan;
  }

  public final Integer getGracePeriod() {
    return gracePeriod;
  }

  public final void setGracePeriod(final Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
  }

  public final Integer getTerm() {
    return term;
  }

  public final void setTerm(final Integer term) {
    this.term = term;
  }

  /**
   * The sub-builder class for AccordD.
   *
   * @param <BLDRT> the parent builder
   */
  public static class AccordDBuilder<BLDRT extends GenericBuilder>
          extends NestedBuilder<AccordD, BLDRT> {

    private final AccordD accordD = new AccordD();

    public AccordDBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this accordD object.
     *
     * @return AccordD
     */
    @Override
    public final AccordD build() {
      return accordD;
    }

    /**
     * Set the financingType property.
     *
     * @param financingType
     * @return AccordDBuilder< BLDRT >
     */
    public final AccordDBuilder<BLDRT> financingType(final FinancingType financingType) {
      accordD.setFinancingType(financingType);
      return this;
    }

    /**
     * Set the plan property.
     *
     * @param plan
     * @return AccordDBuilder< BLDRT >
     */
    public final AccordDBuilder<BLDRT> plan(
            final String plan) {
      accordD.setPlan(plan);
      return this;
    }

    /**
     * Set the gracePeriod property.
     *
     * @param gracePeriod
     * @return AccordDBuilder< BLDRT >
     */
    public final AccordDBuilder<BLDRT> gracePeriod(final Integer gracePeriod) {
      accordD.setGracePeriod(gracePeriod);
      return this;
    }

    /**
     * Set the term property.
     *
     * @param term
     * @return AccordDBuilder< BLDRT >
     */
    public final AccordDBuilder<BLDRT> term(final Integer term) {
      accordD.setTerm(term);
      return this;
    }
  }
}
