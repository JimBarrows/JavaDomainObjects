package jdo.humanresoures.model.position.fulfillment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-24T17:30:45.860-0700")
@StaticMetamodel(PositionStatus.class)
public class PositionStatus_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PositionStatus, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PositionStatus, PositionStatusType> type;
}
