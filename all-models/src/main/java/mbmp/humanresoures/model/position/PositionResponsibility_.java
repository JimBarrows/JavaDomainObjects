package mbmp.humanresoures.model.position;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2014-11-07T06:11:39.321-0700")
@StaticMetamodel(PositionResponsibility.class)
public class PositionResponsibility_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PositionResponsibility, Position> associatedWith;
	public static volatile SingularAttribute<PositionResponsibility, ResponsibilityType> type;
	public static volatile SingularAttribute<PositionResponsibility, String> comment;
}
