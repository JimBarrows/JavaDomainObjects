package jdo.humanresoures.model.position;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.336-0700")
@StaticMetamodel(PositionResponsibility.class)
public class PositionResponsibility_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PositionResponsibility, Position> associatedWith;
	public static volatile SingularAttribute<PositionResponsibility, ResponsibilityType> type;
	public static volatile SingularAttribute<PositionResponsibility, String> comment;
}
