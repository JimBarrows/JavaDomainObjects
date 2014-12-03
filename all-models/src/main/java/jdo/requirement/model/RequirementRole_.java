package jdo.requirement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-02T21:59:11.760-0700")
@StaticMetamodel(RequirementRole.class)
public class RequirementRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<RequirementRole, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<RequirementRole, Party> assignedTo;
	public static volatile SingularAttribute<RequirementRole, Requirement> relatedTo;
	public static volatile SingularAttribute<RequirementRole, RequirementRoleType> type;
}
