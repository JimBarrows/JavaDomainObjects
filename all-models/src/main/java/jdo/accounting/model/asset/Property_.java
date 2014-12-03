package jdo.accounting.model.asset;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.contactmechanism.PostalAddress;

@Generated(value="Dali", date="2014-12-02T21:45:36.650-0700")
@StaticMetamodel(Property.class)
public class Property_ extends FixedAsset_ {
	public static volatile SingularAttribute<Property, PostalAddress> address;
}
