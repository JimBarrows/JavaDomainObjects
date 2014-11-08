package jdo.accounting.model.transaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.Invoice;

@Generated(value="Dali", date="2014-11-07T22:13:42.035-0700")
@StaticMetamodel(SalesAccountingTransaction.class)
public class SalesAccountingTransaction_ extends ObligationAccountingTransaction_ {
	public static volatile SingularAttribute<SalesAccountingTransaction, Invoice> orignatedFrom;
}
