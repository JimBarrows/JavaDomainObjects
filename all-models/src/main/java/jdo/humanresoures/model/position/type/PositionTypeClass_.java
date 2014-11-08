package jdo.humanresoures.model.position.type;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.393-0700")
@StaticMetamodel(PositionTypeClass.class)
public class PositionTypeClass_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PositionTypeClass, PositionType> forPositionType;
	public static volatile SingularAttribute<PositionTypeClass, PositionClassificationType> type;
	public static volatile SingularAttribute<PositionTypeClass, Integer> standardHoursePerWeek;
}
