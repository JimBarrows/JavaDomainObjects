package mbmp.humanresoures.model.position.fulfillment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.humanresoures.model.position.Position;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Person;

@Generated(value="Dali", date="2014-11-07T06:11:39.305-0700")
@StaticMetamodel(PositionFulfillment.class)
public class PositionFulfillment_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PositionFulfillment, Position> fullfillmentOf;
	public static volatile SingularAttribute<PositionFulfillment, Person> acceptedBy;
	public static volatile SingularAttribute<PositionFulfillment, String> comment;
}
