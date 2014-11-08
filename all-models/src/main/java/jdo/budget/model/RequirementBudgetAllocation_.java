package jdo.budget.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.requirement.model.Requirement;

@Generated(value="Dali", date="2014-11-07T22:13:42.178-0700")
@StaticMetamodel(RequirementBudgetAllocation.class)
public class RequirementBudgetAllocation_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<RequirementBudgetAllocation, Requirement> allocationOf;
	public static volatile SingularAttribute<RequirementBudgetAllocation, BigDecimal> amount;
	public static volatile SingularAttribute<RequirementBudgetAllocation, BudgetItem> allocatedTo;
}
