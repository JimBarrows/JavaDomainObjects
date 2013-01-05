package mbmp.accounting.model.transaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.Invoice;

@Generated(value="Dali", date="2013-01-04T22:11:20.035-0700")
@StaticMetamodel(SalesAccountingTransaction.class)
public class SalesAccountingTransaction_ extends ObligationAccountingTransaction_ {
	public static volatile SingularAttribute<SalesAccountingTransaction, Invoice> orignatedFrom;
}
