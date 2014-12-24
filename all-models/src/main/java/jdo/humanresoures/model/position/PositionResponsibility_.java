package jdo.humanresoures.model.position;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-24T16:34:40.502-0700")
@StaticMetamodel(PositionResponsibility.class)
public class PositionResponsibility_ {
	public static volatile SingularAttribute<PositionResponsibility, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PositionResponsibility, Position> associatedWith;
	public static volatile SingularAttribute<PositionResponsibility, ResponsibilityType> type;
	public static volatile SingularAttribute<PositionResponsibility, String> comment;
}
