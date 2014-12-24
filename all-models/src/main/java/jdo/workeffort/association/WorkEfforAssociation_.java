package jdo.workeffort.association;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;
import jdo.workeffort.WorkEffort;

@Generated(value="Dali", date="2014-12-24T16:34:42.013-0700")
@StaticMetamodel(WorkEfforAssociation.class)
public class WorkEfforAssociation_ {
	public static volatile SingularAttribute<WorkEfforAssociation, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<WorkEfforAssociation, WorkEffort> associatedFrom;
	public static volatile SingularAttribute<WorkEfforAssociation, WorkEffort> associatedTo;
}
