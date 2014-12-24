package jdo.invoice.model.account;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-24T16:23:55.750-0700")
@StaticMetamodel(FinancialAccountTransaction.class)
public class FinancialAccountTransaction_ {
	public static volatile SingularAttribute<FinancialAccountTransaction, FinancialAccount> affecting;
	public static volatile SingularAttribute<FinancialAccountTransaction, Date> entryDate;
	public static volatile SingularAttribute<FinancialAccountTransaction, Party> executedBy;
	public static volatile SingularAttribute<FinancialAccountTransaction, Date> transactionDate;
}
