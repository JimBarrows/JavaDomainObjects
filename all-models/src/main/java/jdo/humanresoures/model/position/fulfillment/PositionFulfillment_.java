package jdo.humanresoures.model.position.fulfillment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.position.Position;
import jdo.model.DateTimeRange;
import jdo.party.model.Person;

@Generated(value="Dali", date="2014-12-24T16:34:40.473-0700")
@StaticMetamodel(PositionFulfillment.class)
public class PositionFulfillment_ {
	public static volatile SingularAttribute<PositionFulfillment, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PositionFulfillment, Position> fullfillmentOf;
	public static volatile SingularAttribute<PositionFulfillment, Person> acceptedBy;
	public static volatile SingularAttribute<PositionFulfillment, String> comment;
}
