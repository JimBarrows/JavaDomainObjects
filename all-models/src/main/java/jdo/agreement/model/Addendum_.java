package jdo.agreement.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-24T17:30:45.414-0700")
@StaticMetamodel(Addendum.class)
public class Addendum_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Addendum, Date> creationDate;
	public static volatile SingularAttribute<Addendum, Date> effectiveDate;
	public static volatile SingularAttribute<Addendum, String> text;
}
