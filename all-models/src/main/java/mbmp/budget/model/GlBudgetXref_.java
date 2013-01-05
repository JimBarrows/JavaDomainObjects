package mbmp.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.accounting.model.GeneralLedgerAccount;
import mbmp.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2013-01-05T07:41:45.317-0700")
@StaticMetamodel(GlBudgetXref.class)
public class GlBudgetXref_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<GlBudgetXref, Integer> allocationPercentage;
	public static volatile SingularAttribute<GlBudgetXref, BudgetItemType> mappedToBudgetItemType;
	public static volatile SingularAttribute<GlBudgetXref, GeneralLedgerAccount> mappedToGlAccount;
}
