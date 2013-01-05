package mbmp.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.contactmechanism.PostalAddress;

@Generated(value="Dali", date="2013-01-05T07:41:45.964-0700")
@StaticMetamodel(PartyPostalAddress.class)
public class PartyPostalAddress_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyPostalAddress, String> comment;
	public static volatile SingularAttribute<PartyPostalAddress, PostalAddress> locatedAt;
	public static volatile SingularAttribute<PartyPostalAddress, Party> specifiedFor;
}
