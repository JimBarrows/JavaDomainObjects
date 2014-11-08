package jdo.invoice.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.574-0700")
@StaticMetamodel(InvoiceRole.class)
public class InvoiceRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<InvoiceRole, Integer> percentage;
	public static volatile SingularAttribute<InvoiceRole, Date> performedOn;
}
