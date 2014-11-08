package jdo.budget.model.revision;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.budget.model.BudgetItem;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.206-0700")
@StaticMetamodel(BudgetRevisionImpact.class)
public class BudgetRevisionImpact_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<BudgetRevisionImpact, BudgetItem> affects;
	public static volatile SingularAttribute<BudgetRevisionImpact, BudgetRevision> fromBudgetRevision;
	public static volatile SingularAttribute<BudgetRevisionImpact, Boolean> add;
	public static volatile SingularAttribute<BudgetRevisionImpact, String> reason;
	public static volatile SingularAttribute<BudgetRevisionImpact, BigDecimal> revisedAmount;
}
