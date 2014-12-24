package jdo.invoice.model.account;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-24T16:34:40.566-0700")
@StaticMetamodel(FinancialAccountRole.class)
public class FinancialAccountRole_ {
	public static volatile SingularAttribute<FinancialAccountRole, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<FinancialAccountRole, FinancialAccountRoleType> type;
	public static volatile SingularAttribute<FinancialAccountRole, Party> accountFor;
}
