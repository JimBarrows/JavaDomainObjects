package jdo.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.GeneralLedgerAccount;
import jdo.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.166-0700")
@StaticMetamodel(GlBudgetXref.class)
public class GlBudgetXref_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<GlBudgetXref, BudgetItemType> mappedToBudgetItemType;
	public static volatile SingularAttribute<GlBudgetXref, GeneralLedgerAccount> mappedToGlAccount;
	public static volatile SingularAttribute<GlBudgetXref, Integer> allocationPercentage;
}
