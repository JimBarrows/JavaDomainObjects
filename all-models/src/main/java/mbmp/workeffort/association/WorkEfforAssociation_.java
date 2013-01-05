package mbmp.workeffort.association;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.workeffort.WorkEffort;

@Generated(value="Dali", date="2013-01-05T07:42:07.395-0700")
@StaticMetamodel(WorkEfforAssociation.class)
public class WorkEfforAssociation_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<WorkEfforAssociation, WorkEffort> associatedFrom;
	public static volatile SingularAttribute<WorkEfforAssociation, WorkEffort> associatedTo;
}
