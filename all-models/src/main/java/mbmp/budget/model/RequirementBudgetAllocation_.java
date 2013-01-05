package mbmp.budget.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.requirement.model.Requirement;

@Generated(value="Dali", date="2013-01-05T06:28:54.431-0700")
@StaticMetamodel(RequirementBudgetAllocation.class)
public class RequirementBudgetAllocation_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<RequirementBudgetAllocation, Requirement> allocationOf;
	public static volatile SingularAttribute<RequirementBudgetAllocation, BigDecimal> amount;
	public static volatile SingularAttribute<RequirementBudgetAllocation, BudgetItem> allocatedTo;
}
