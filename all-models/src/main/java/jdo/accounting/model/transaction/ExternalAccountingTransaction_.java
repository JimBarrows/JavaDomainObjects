package jdo.accounting.model.transaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-02T21:45:36.750-0700")
@StaticMetamodel(ExternalAccountingTransaction.class)
public class ExternalAccountingTransaction_ extends AccountingTransaction_ {
	public static volatile SingularAttribute<ExternalAccountingTransaction, Party> partyFrom;
	public static volatile SingularAttribute<ExternalAccountingTransaction, Party> partyTo;
}
