package com.nsfwenterprises.biz360.quote.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.validation.constraints.AssertTrue;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class QuoteTerm extends BasePersistentModel {

	private static final long serialVersionUID = 1L;

	private QuoteItem conditionForItem;

	private Quote conditionForQuote;

	private TermType termType;

	private BigDecimal termValue;

	public QuoteItem getConditionForItem() {
		return conditionForItem;
	}

	public Quote getConditionForQuote() {
		return conditionForQuote;
	}

	public TermType getTermType() {
		return termType;
	}

	public BigDecimal getTermValue() {
		return termValue;
	}

	@AssertTrue
	public boolean onlyItemOrQuoteSet() {
		return (conditionForItem == null && conditionForQuote != null)
				|| (conditionForItem != null && conditionForQuote == null);
	}

	public void setConditionForItem(QuoteItem conditionForItem) {
		this.conditionForItem = conditionForItem;
	}

	public void setConditionForQuote(Quote conditionForQuote) {
		this.conditionForQuote = conditionForQuote;
	}

	public void setTermType(TermType termType) {
		this.termType = termType;
	}

	public void setTermValue(BigDecimal termValue) {
		this.termValue = termValue;
	}
}
