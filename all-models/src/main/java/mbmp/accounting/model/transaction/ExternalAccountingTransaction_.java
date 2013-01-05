package mbmp.accounting.model.transaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-04T22:11:19.989-0700")
@StaticMetamodel(ExternalAccountingTransaction.class)
public class ExternalAccountingTransaction_ extends AccountingTransaction_ {
	public static volatile SingularAttribute<ExternalAccountingTransaction, Party> partyFrom;
	public static volatile SingularAttribute<ExternalAccountingTransaction, Party> partyTo;
}
