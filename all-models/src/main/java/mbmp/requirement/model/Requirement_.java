package mbmp.requirement.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.budget.model.RequirementBudgetAllocation;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.facility.Facility;

@Generated(value="Dali", date="2013-01-05T06:28:54.891-0700")
@StaticMetamodel(Requirement.class)
public class Requirement_ extends BasePersistentModel_ {
	public static volatile ListAttribute<Requirement, RequirementBudgetAllocation> allocatedVia;
	public static volatile ListAttribute<Requirement, OrderRequirementCommitment> commitmentOf;
	public static volatile SingularAttribute<Requirement, Date> creationDate;
	public static volatile SingularAttribute<Requirement, String> description;
	public static volatile SingularAttribute<Requirement, BigDecimal> estimatedBudget;
	public static volatile SingularAttribute<Requirement, Facility> neededAt;
	public static volatile SingularAttribute<Requirement, Integer> quantity;
	public static volatile SingularAttribute<Requirement, String> reason;
	public static volatile SingularAttribute<Requirement, Date> requiredBy;
	public static volatile ListAttribute<Requirement, RequirementStatus> status;
	public static volatile ListAttribute<Requirement, Requirement> subRequirements;
}
