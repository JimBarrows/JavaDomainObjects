package jdo.workeffort;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.model.BasePersistentModel_;

@Generated(value = "Dali", date = "2014-12-02T21:35:29.814-0700")
@StaticMetamodel(WorkEffortStatus.class)
public class WorkEffortStatus_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WorkEffortStatus, Date>					changedon;
	public static volatile SingularAttribute<WorkEffortStatus, WorkEffortStatusType>	type;
}
