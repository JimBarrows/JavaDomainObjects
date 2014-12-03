package jdo.invoice.model.status;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.Invoice;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-02T21:45:37.495-0700")
@StaticMetamodel(InvociceStatus.class)
public class InvociceStatus_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<InvociceStatus, Date> statusDate;
	public static volatile SingularAttribute<InvociceStatus, Invoice> statusFor;
	public static volatile SingularAttribute<InvociceStatus, InvoiceStatusType> type;
}
