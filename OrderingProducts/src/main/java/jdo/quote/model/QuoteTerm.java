package jdo.quote.model;

import jdo.fields.Money;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.AssertTrue;

@Entity
public class QuoteTerm extends PersistentEntity {

	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private QuoteItem			conditionForItem;

	@ManyToOne
	private Quote				conditionForQuote;

	@ManyToOne
	private TermType			termType;
	@Embedded
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
