package jdo.product.model.identificationCode;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.product.model.Good;

@Generated(value="Dali", date="2014-12-24T16:23:56.489-0700")
@StaticMetamodel(GoodIdentification.class)
public class GoodIdentification_ {
	public static volatile SingularAttribute<GoodIdentification, IdentificationType> definedAs;
	public static volatile SingularAttribute<GoodIdentification, Good> identifierFor;
	public static volatile SingularAttribute<GoodIdentification, String> idValue;
}
