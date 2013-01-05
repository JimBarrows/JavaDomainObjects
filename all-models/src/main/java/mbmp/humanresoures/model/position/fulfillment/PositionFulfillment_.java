package mbmp.humanresoures.model.position.fulfillment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.humanresoures.model.position.Position;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Person;

@Generated(value="Dali", date="2013-01-05T07:41:45.402-0700")
@StaticMetamodel(PositionFulfillment.class)
public class PositionFulfillment_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PositionFulfillment, Person> acceptedBy;
	public static volatile SingularAttribute<PositionFulfillment, String> comment;
	public static volatile SingularAttribute<PositionFulfillment, Position> fullfillmentOf;
}
