package mbmp.workeffort;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:23.709-0700")
@StaticMetamodel(WorkEffortStatus.class)
public class WorkEffortStatus_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WorkEffortStatus, Date> changedon;
	public static volatile SingularAttribute<WorkEffortStatus, WorkEffortStatusType> type;
}
