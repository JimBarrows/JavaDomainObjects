package jdo.quote.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.validation.constraints.AssertTrue;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;

@Entity
public class QuoteTerm extends BasePersistentModel {

	private static final long	serialVersionUID	= 1L;

	private QuoteItem			conditionForItem;

	private Quote				conditionForQuote;

	private TermType			termType;

	private Money				termValue;

	public QuoteItem getConditionForItem() {
		return conditionForItem;
	}

	public Quote getConditionForQuote() {
		return conditionForQuote;
	}

	public TermType getTermType() {
		return termType;
	}

	@Embedded
	public Money getTermValue() {
		return termValue;
	}

	@AssertTrue
	public boolean onlyItemOrQuoteSet() {
		return (conditionForItem == null && conditionForQuote != null) || (conditionForItem != null && conditionForQuote == null);
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

	public void setTermValue(Money termValue) {
		this.termValue = termValue;
	}
}
