package jdo.invoice.model.term;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.Invoice;
import jdo.invoice.model.InvoiceItem;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.637-0700")
@StaticMetamodel(InvoiceTerm.class)
public class InvoiceTerm_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<InvoiceTerm, Invoice> conditionForInvoice;
	public static volatile SingularAttribute<InvoiceTerm, InvoiceItem> conditionForInvoiceItem;
	public static volatile SingularAttribute<InvoiceTerm, InvoiceTermType> type;
	public static volatile SingularAttribute<InvoiceTerm, Integer> termValue;
}
