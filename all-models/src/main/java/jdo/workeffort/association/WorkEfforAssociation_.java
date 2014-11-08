package jdo.workeffort.association;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.workeffort.WorkEffort;

@Generated(value="Dali", date="2014-11-07T22:13:43.641-0700")
@StaticMetamodel(WorkEfforAssociation.class)
public class WorkEfforAssociation_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<WorkEfforAssociation, WorkEffort> associatedFrom;
	public static volatile SingularAttribute<WorkEfforAssociation, WorkEffort> associatedTo;
}
