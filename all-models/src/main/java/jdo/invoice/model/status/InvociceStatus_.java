package jdo.invoice.model.status;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.Invoice;

@Generated(value="Dali", date="2014-12-24T16:23:55.890-0700")
@StaticMetamodel(InvociceStatus.class)
public class InvociceStatus_ {
	public static volatile SingularAttribute<InvociceStatus, Date> statusDate;
	public static volatile SingularAttribute<InvociceStatus, Invoice> statusFor;
	public static volatile SingularAttribute<InvociceStatus, InvoiceStatusType> type;
}
