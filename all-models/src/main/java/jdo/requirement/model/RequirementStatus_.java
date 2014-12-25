package jdo.requirement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-24T17:30:48.676-0700")
@StaticMetamodel(RequirementStatus.class)
public class RequirementStatus_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<RequirementStatus, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<RequirementStatus, RequirementStatusType> type;
}
