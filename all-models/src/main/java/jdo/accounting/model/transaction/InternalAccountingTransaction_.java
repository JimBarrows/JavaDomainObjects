package jdo.accounting.model.transaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.party.model.PartyRole;

@Generated(value = "Dali", date = "2014-12-02T21:35:28.393-0700")
@StaticMetamodel(InternalAccountingTransaction.class)
public class InternalAccountingTransaction_ extends AccountingTransaction_ {
	public static volatile SingularAttribute<InternalAccountingTransaction, PartyRole>	transactionFrom;
}
