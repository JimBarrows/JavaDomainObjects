package jdo.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-29T23:01:16.318-0700")
@StaticMetamodel(BudgetRole.class)
public class BudgetRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<BudgetRole, Party> forParty;
	public static volatile SingularAttribute<BudgetRole, BudgetRoleType> type;
}
