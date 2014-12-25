package jdo.accounting.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.budget.model.GlBudgetXref;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-24T17:30:44.848-0700")
@StaticMetamodel(GeneralLedgerAccount.class)
public class GeneralLedgerAccount_ extends BasePersistentModel_ {
	public static volatile ListAttribute<GeneralLedgerAccount, OrganizationGlAccount> associatedWith;
	public static volatile ListAttribute<GeneralLedgerAccount, GlBudgetXref> budgetLineItems;
	public static volatile SingularAttribute<GeneralLedgerAccount, String> description;
	public static volatile SingularAttribute<GeneralLedgerAccount, String> name;
}
