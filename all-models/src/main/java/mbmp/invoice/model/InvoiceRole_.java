package mbmp.invoice.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.496-0700")
@StaticMetamodel(InvoiceRole.class)
public class InvoiceRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<InvoiceRole, Integer> percentage;
	public static volatile SingularAttribute<InvoiceRole, Date> performedOn;
}
