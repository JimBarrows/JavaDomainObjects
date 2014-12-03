package jdo.requirement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value = "Dali", date = "2014-12-02T21:35:29.489-0700")
@StaticMetamodel(RequirementStatus.class)
public class RequirementStatus_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<RequirementStatus, RequirementStatusType>	type;
	public static volatile SingularAttribute<RequirementStatus, DateTimeRange>			dateTimeRange;
}
