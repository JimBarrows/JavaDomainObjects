package jdo.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-24T16:23:53.957-0700")
@StaticMetamodel(BudgetRole.class)
public class BudgetRole_ {
	public static volatile SingularAttribute<BudgetRole, BudgetRoleType> type;
	public static volatile SingularAttribute<BudgetRole, Party> forParty;
}
