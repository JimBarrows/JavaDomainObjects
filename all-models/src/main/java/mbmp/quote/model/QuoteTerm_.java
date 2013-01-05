package mbmp.quote.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:22.997-0700")
@StaticMetamodel(QuoteTerm.class)
public class QuoteTerm_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<QuoteTerm, QuoteItem> conditionForItem;
	public static volatile SingularAttribute<QuoteTerm, Quote> conditionForQuote;
	public static volatile SingularAttribute<QuoteTerm, TermType> termType;
	public static volatile SingularAttribute<QuoteTerm, BigDecimal> termValue;
}
