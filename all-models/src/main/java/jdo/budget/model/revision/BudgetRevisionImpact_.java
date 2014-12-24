package jdo.budget.model.revision;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.budget.model.BudgetItem;
import jdo.fields.Money;

@Generated(value="Dali", date="2014-12-24T16:23:54.084-0700")
@StaticMetamodel(BudgetRevisionImpact.class)
public class BudgetRevisionImpact_ {
	public static volatile SingularAttribute<BudgetRevisionImpact, BudgetItem> affects;
	public static volatile SingularAttribute<BudgetRevisionImpact, BudgetRevision> fromBudgetRevision;
	public static volatile SingularAttribute<BudgetRevisionImpact, Money> revisedAmount;
	public static volatile SingularAttribute<BudgetRevisionImpact, Boolean> add;
	public static volatile SingularAttribute<BudgetRevisionImpact, String> reason;
}
