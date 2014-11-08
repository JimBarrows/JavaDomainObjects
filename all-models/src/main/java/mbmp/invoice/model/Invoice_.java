package mbmp.invoice.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.billingaccount.BillingAccount;
import mbmp.invoice.model.term.InvoiceTerm;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;
import mbmp.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2014-11-07T06:11:39.455-0700")
@StaticMetamodel(Invoice.class)
public class Invoice_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Invoice, BillingAccount> billedToAccount;
	public static volatile ListAttribute<Invoice, InvoiceItem> composedOf;
	public static volatile SingularAttribute<Invoice, String> description;
	public static volatile ListAttribute<Invoice, InvoiceRole> involving;
	public static volatile SingularAttribute<Invoice, String> message;
	public static volatile ListAttribute<Invoice, InvoiceTerm> terms;
	public static volatile SingularAttribute<Invoice, ContactMechanism> addressedTo;
	public static volatile SingularAttribute<Invoice, Party> billedFrom;
	public static volatile SingularAttribute<Invoice, Party> billedToParty;
	public static volatile SingularAttribute<Invoice, Date> invoiceDate;
	public static volatile SingularAttribute<Invoice, ContactMechanism> sentFrom;
}
