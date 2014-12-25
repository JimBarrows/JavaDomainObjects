package jdo.product.model.category;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyClassification;

@Generated(value="Dali", date="2014-12-24T17:30:47.705-0700")
@StaticMetamodel(MarketInterest.class)
public class MarketInterest_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<MarketInterest, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<MarketInterest, PartyClassification> interestFor;
	public static volatile SingularAttribute<MarketInterest, ProductCategory> of;
}
