package jdo.workeffort.association;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.workeffort.WorkEffort;

@Generated(value="Dali", date="2015-01-13T23:32:10.716-0700")
@StaticMetamodel(WorkEfforAssociation.class)
public class WorkEfforAssociation_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WorkEfforAssociation, WorkEffort> associatedFrom;
	public static volatile SingularAttribute<WorkEfforAssociation, WorkEffort> associatedTo;
	public static volatile SingularAttribute<WorkEfforAssociation, DateTimeRange> dateTimeRange;
}
