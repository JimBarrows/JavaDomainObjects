package jdo.humanresoures.model.position.structure;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.position.Position;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-24T17:30:45.933-0700")
@StaticMetamodel(PositionReportingStructure.class)
public class PositionReportingStructure_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PositionReportingStructure, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PositionReportingStructure, Position> manager;
	public static volatile SingularAttribute<PositionReportingStructure, Position> subordinate;
	public static volatile SingularAttribute<PositionReportingStructure, Boolean> primary;
	public static volatile SingularAttribute<PositionReportingStructure, String> comment;
}
