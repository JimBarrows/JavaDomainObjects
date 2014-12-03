package jdo.humanresoures.model.position.type;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-02T21:59:11.272-0700")
@StaticMetamodel(PositionTypeClass.class)
public class PositionTypeClass_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PositionTypeClass, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PositionTypeClass, PositionType> forPositionType;
	public static volatile SingularAttribute<PositionTypeClass, PositionClassificationType> type;
	public static volatile SingularAttribute<PositionTypeClass, Integer> standardHoursePerWeek;
}
