package jdo.quote.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-24T17:30:47.951-0700")
@StaticMetamodel(QuoteTerm.class)
public class QuoteTerm_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<QuoteTerm, Money> termValue;
	public static volatile SingularAttribute<QuoteTerm, QuoteItem> conditionForItem;
	public static volatile SingularAttribute<QuoteTerm, Quote> conditionForQuote;
	public static volatile SingularAttribute<QuoteTerm, TermType> termType;
}
