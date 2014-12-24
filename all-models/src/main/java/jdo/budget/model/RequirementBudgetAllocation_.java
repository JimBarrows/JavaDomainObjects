package jdo.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.requirement.model.Requirement;

@Generated(value="Dali", date="2014-12-24T16:23:54.059-0700")
@StaticMetamodel(RequirementBudgetAllocation.class)
public class RequirementBudgetAllocation_ {
	public static volatile SingularAttribute<RequirementBudgetAllocation, Money> amount;
	public static volatile SingularAttribute<RequirementBudgetAllocation, Requirement> allocationOf;
	public static volatile SingularAttribute<RequirementBudgetAllocation, BudgetItem> allocatedTo;
}
