package mbmp.accounting.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.budget.model.GlBudgetXref;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:26:57.172-0700")
@StaticMetamodel(GeneralLedgerAccount.class)
public class GeneralLedgerAccount_ extends BasePersistentModel_ {
	public static volatile ListAttribute<GeneralLedgerAccount, OrganizationGlAccount> associatedWith;
	public static volatile ListAttribute<GeneralLedgerAccount, GlBudgetXref> budgetLineItems;
	public static volatile SingularAttribute<GeneralLedgerAccount, String> description;
	public static volatile SingularAttribute<GeneralLedgerAccount, String> name;
}
