package mbmp.requirement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-05T07:42:07.288-0700")
@StaticMetamodel(RequirementRole.class)
public class RequirementRole_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<RequirementRole, Party> assignedTo;
	public static volatile SingularAttribute<RequirementRole, Requirement> relatedTo;
	public static volatile SingularAttribute<RequirementRole, RequirementRoleType> type;
}
