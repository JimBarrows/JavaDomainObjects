package jdo.requirement.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.budget.model.RequirementBudgetAllocation;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;
import jdo.party.model.facility.Facility;

@Generated(value = "Dali", date = "2014-12-02T21:35:29.442-0700")
@StaticMetamodel(Requirement.class)
public class Requirement_ extends BasePersistentModel_ {
	public static volatile ListAttribute<Requirement, RequirementBudgetAllocation>	allocatedVia;
	public static volatile ListAttribute<Requirement, OrderRequirementCommitment>	commitmentOf;
	public static volatile SingularAttribute<Requirement, Date>						creationDate;
	public static volatile SingularAttribute<Requirement, String>					description;
	public static volatile SingularAttribute<Requirement, Facility>					neededAt;
	public static volatile SingularAttribute<Requirement, String>					reason;
	public static volatile SingularAttribute<Requirement, Date>						requiredBy;
	public static volatile ListAttribute<Requirement, RequirementStatus>			status;
	public static volatile ListAttribute<Requirement, Requirement>					subRequirements;
	public static volatile SingularAttribute<Requirement, Integer>					quantity;
	public static volatile SingularAttribute<Requirement, Money>					estimatedBudget;
}
