package jdo.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.contactmechanism.PostalAddress;

@Generated(value="Dali", date="2014-11-07T22:13:42.935-0700")
@StaticMetamodel(PartyPostalAddress.class)
public class PartyPostalAddress_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyPostalAddress, String> comment;
	public static volatile SingularAttribute<PartyPostalAddress, PostalAddress> locatedAt;
	public static volatile SingularAttribute<PartyPostalAddress, Party> specifiedFor;
}
