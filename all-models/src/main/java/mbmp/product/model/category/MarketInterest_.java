package mbmp.product.model.category;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.PartyClassification;

@Generated(value="Dali", date="2013-01-05T07:42:06.964-0700")
@StaticMetamodel(MarketInterest.class)
public class MarketInterest_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<MarketInterest, PartyClassification> interestFor;
	public static volatile SingularAttribute<MarketInterest, ProductCategory> of;
}
