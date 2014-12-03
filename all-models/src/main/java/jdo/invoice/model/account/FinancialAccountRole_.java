package jdo.invoice.model.account;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-02T20:54:49.544-0700")
@StaticMetamodel(FinancialAccountRole.class)
public class FinancialAccountRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<FinancialAccountRole, FinancialAccountRoleType> type;
	public static volatile SingularAttribute<FinancialAccountRole, Party> accountFor;
	public static volatile SingularAttribute<FinancialAccountRole, DateTimeRange> dateTimeRange;
}
