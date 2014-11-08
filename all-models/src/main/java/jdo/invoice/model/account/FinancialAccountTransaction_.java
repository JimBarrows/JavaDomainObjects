package jdo.invoice.model.account;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-11-07T22:13:42.494-0700")
@StaticMetamodel(FinancialAccountTransaction.class)
public class FinancialAccountTransaction_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<FinancialAccountTransaction, FinancialAccount> affecting;
	public static volatile SingularAttribute<FinancialAccountTransaction, Date> entryDate;
	public static volatile SingularAttribute<FinancialAccountTransaction, Party> executedBy;
	public static volatile SingularAttribute<FinancialAccountTransaction, Date> transactionDate;
}
