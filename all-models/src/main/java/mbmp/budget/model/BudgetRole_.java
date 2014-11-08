package mbmp.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2014-11-07T06:11:38.690-0700")
@StaticMetamodel(BudgetRole.class)
public class BudgetRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<BudgetRole, BudgetRoleType> type;
	public static volatile SingularAttribute<BudgetRole, Party> forParty;
}
