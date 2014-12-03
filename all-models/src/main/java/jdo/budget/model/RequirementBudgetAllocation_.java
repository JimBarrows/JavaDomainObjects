package jdo.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;
import jdo.requirement.model.Requirement;

@Generated(value="Dali", date="2014-12-02T21:59:11.089-0700")
@StaticMetamodel(RequirementBudgetAllocation.class)
public class RequirementBudgetAllocation_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<RequirementBudgetAllocation, Money> amount;
	public static volatile SingularAttribute<RequirementBudgetAllocation, Requirement> allocationOf;
	public static volatile SingularAttribute<RequirementBudgetAllocation, BudgetItem> allocatedTo;
}
