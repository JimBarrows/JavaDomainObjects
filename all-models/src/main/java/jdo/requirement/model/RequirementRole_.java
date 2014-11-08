package jdo.requirement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-11-07T22:13:43.492-0700")
@StaticMetamodel(RequirementRole.class)
public class RequirementRole_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<RequirementRole, Party> assignedTo;
	public static volatile SingularAttribute<RequirementRole, Requirement> relatedTo;
	public static volatile SingularAttribute<RequirementRole, RequirementRoleType> type;
}
