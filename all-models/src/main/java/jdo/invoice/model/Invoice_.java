package jdo.invoice.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.billingaccount.BillingAccount;
import jdo.invoice.model.term.InvoiceTerm;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;
import jdo.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2014-12-29T22:42:32.367-0700")
@StaticMetamodel(Invoice.class)
public class Invoice_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Invoice, ContactMechanism> addressedTo;
	public static volatile SingularAttribute<Invoice, Party> billedFrom;
	public static volatile SingularAttribute<Invoice, BillingAccount> billedToAccount;
	public static volatile SingularAttribute<Invoice, Party> billedToParty;
	public static volatile ListAttribute<Invoice, InvoiceItem> composedOf;
	public static volatile SingularAttribute<Invoice, String> description;
	public static volatile SingularAttribute<Invoice, Date> invoiceDate;
	public static volatile ListAttribute<Invoice, InvoiceRole> involving;
	public static volatile SingularAttribute<Invoice, String> message;
	public static volatile SingularAttribute<Invoice, ContactMechanism> sentFrom;
	public static volatile ListAttribute<Invoice, InvoiceTerm> terms;
}
