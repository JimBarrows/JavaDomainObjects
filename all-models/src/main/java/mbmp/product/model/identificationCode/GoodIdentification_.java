package mbmp.product.model.identificationCode;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.product.model.Good;

@Generated(value="Dali", date="2013-01-04T22:11:22.676-0700")
@StaticMetamodel(GoodIdentification.class)
public class GoodIdentification_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<GoodIdentification, IdentificationType> definedAs;
	public static volatile SingularAttribute<GoodIdentification, Good> identifierFor;
	public static volatile SingularAttribute<GoodIdentification, String> idValue;
}
