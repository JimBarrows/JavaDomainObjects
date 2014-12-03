package jdo.humanresoures.model.position.fulfillment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.position.Position;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.Person;

@Generated(value="Dali", date="2014-12-02T21:59:11.207-0700")
@StaticMetamodel(PositionFulfillment.class)
public class PositionFulfillment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PositionFulfillment, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PositionFulfillment, Position> fullfillmentOf;
	public static volatile SingularAttribute<PositionFulfillment, Person> acceptedBy;
	public static volatile SingularAttribute<PositionFulfillment, String> comment;
}
