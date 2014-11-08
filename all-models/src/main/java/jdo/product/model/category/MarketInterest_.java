package jdo.product.model.category;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.PartyClassification;

@Generated(value="Dali", date="2014-11-07T22:13:43.000-0700")
@StaticMetamodel(MarketInterest.class)
public class MarketInterest_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<MarketInterest, PartyClassification> interestFor;
	public static volatile SingularAttribute<MarketInterest, ProductCategory> of;
}
