package mbmp.humanresoures.model.position.type;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2013-01-05T07:41:45.583-0700")
@StaticMetamodel(PositionTypeClass.class)
public class PositionTypeClass_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PositionTypeClass, PositionType> forPositionType;
	public static volatile SingularAttribute<PositionTypeClass, Integer> standardHoursePerWeek;
	public static volatile SingularAttribute<PositionTypeClass, PositionClassificationType> type;
}
