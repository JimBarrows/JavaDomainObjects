package mbmp.invoice.model.term;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.Invoice;
import mbmp.invoice.model.InvoiceItem;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.519-0700")
@StaticMetamodel(InvoiceTerm.class)
public class InvoiceTerm_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<InvoiceTerm, Invoice> conditionForInvoice;
	public static volatile SingularAttribute<InvoiceTerm, InvoiceItem> conditionForInvoiceItem;
	public static volatile SingularAttribute<InvoiceTerm, Integer> termValue;
	public static volatile SingularAttribute<InvoiceTerm, InvoiceTermType> type;
}
