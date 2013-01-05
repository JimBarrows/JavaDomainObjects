package mbmp.accounting.model.asset;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.party.model.contactmechanism.PostalAddress;

@Generated(value="Dali", date="2013-01-04T22:26:57.141-0700")
@StaticMetamodel(Property.class)
public class Property_ extends FixedAsset_ {
	public static volatile SingularAttribute<Property, PostalAddress> address;
}
