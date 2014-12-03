package jdo.humanresoures.model.position;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-02T21:59:11.226-0700")
@StaticMetamodel(PositionResponsibility.class)
public class PositionResponsibility_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PositionResponsibility, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PositionResponsibility, Position> associatedWith;
	public static volatile SingularAttribute<PositionResponsibility, ResponsibilityType> type;
	public static volatile SingularAttribute<PositionResponsibility, String> comment;
}
