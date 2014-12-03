package jdo.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.GeneralLedgerAccount;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-02T21:59:11.064-0700")
@StaticMetamodel(GlBudgetXref.class)
public class GlBudgetXref_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<GlBudgetXref, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<GlBudgetXref, BudgetItemType> mappedToBudgetItemType;
	public static volatile SingularAttribute<GlBudgetXref, GeneralLedgerAccount> mappedToGlAccount;
	public static volatile SingularAttribute<GlBudgetXref, Integer> allocationPercentage;
}
