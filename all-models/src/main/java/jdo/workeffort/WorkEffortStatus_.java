package jdo.workeffort;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2015-01-13T23:31:20.106-0700")
@StaticMetamodel(WorkEffortStatus.class)
public class WorkEffortStatus_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WorkEffortStatus, Date> changedon;
	public static volatile SingularAttribute<WorkEffortStatus, WorkEffortStatusType> type;
}
