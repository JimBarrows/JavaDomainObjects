package jdo.quote.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;

@Generated(value="Dali", date="2014-12-24T16:23:57.571-0700")
@StaticMetamodel(QuoteTerm.class)
public class QuoteTerm_ {
	public static volatile SingularAttribute<QuoteTerm, Money> termValue;
	public static volatile SingularAttribute<QuoteTerm, QuoteItem> conditionForItem;
	public static volatile SingularAttribute<QuoteTerm, Quote> conditionForQuote;
	public static volatile SingularAttribute<QuoteTerm, TermType> termType;
}
