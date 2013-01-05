package mbmp.invoice.model.status;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.Invoice;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.515-0700")
@StaticMetamodel(InvociceStatus.class)
public class InvociceStatus_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<InvociceStatus, Date> statusDate;
	public static volatile SingularAttribute<InvociceStatus, Invoice> statusFor;
	public static volatile SingularAttribute<InvociceStatus, InvoiceStatusType> type;
}
