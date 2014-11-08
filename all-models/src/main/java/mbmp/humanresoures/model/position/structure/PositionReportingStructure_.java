package mbmp.humanresoures.model.position.structure;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.humanresoures.model.position.Position;
import mbmp.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2014-11-07T06:11:39.351-0700")
@StaticMetamodel(PositionReportingStructure.class)
public class PositionReportingStructure_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PositionReportingStructure, Position> manager;
	public static volatile SingularAttribute<PositionReportingStructure, Position> subordinate;
	public static volatile SingularAttribute<PositionReportingStructure, Boolean> primary;
	public static volatile SingularAttribute<PositionReportingStructure, String> comment;
}
