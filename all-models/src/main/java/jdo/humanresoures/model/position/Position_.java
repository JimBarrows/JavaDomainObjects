package jdo.humanresoures.model.position;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.budget.model.BudgetItem;
import jdo.humanresoures.model.position.fulfillment.PositionFulfillment;
import jdo.humanresoures.model.position.fulfillment.PositionStatus;
import jdo.humanresoures.model.position.structure.PositionReportingStructure;
import jdo.humanresoures.model.position.type.PositionType;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.Organization;

@Generated(value="Dali", date="2014-11-07T22:13:42.330-0700")
@StaticMetamodel(Position.class)
public class Position_ extends BaseDateRangeModel_ {
	public static volatile ListAttribute<Position, PositionResponsibility> assigendTo;
	public static volatile SingularAttribute<Position, Date> estimatedFromDate;
	public static volatile SingularAttribute<Position, Date> estimatedThruDate;
	public static volatile ListAttribute<Position, PositionFulfillment> filledBy;
	public static volatile ListAttribute<Position, PositionReportingStructure> manages;
	public static volatile ListAttribute<Position, PositionReportingStructure> reportsTo;
	public static volatile SingularAttribute<Position, PositionStatus> status;
	public static volatile SingularAttribute<Position, PositionType> type;
	public static volatile SingularAttribute<Position, Boolean> temporary;
	public static volatile SingularAttribute<Position, BudgetItem> approvedThru;
	public static volatile SingularAttribute<Position, Organization> within;
	public static volatile SingularAttribute<Position, Boolean> exempt;
	public static volatile SingularAttribute<Position, Boolean> fulltime;
	public static volatile SingularAttribute<Position, Boolean> salary;
}
