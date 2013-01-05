package mbmp.agreement.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.039-0700")
@StaticMetamodel(Addendum.class)
public class Addendum_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Addendum, Date> creationDate;
	public static volatile SingularAttribute<Addendum, Date> effectiveDate;
	public static volatile SingularAttribute<Addendum, String> text;
}
