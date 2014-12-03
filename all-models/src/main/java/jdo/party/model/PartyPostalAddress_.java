package jdo.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.contactmechanism.PostalAddress;

@Generated(value="Dali", date="2014-12-02T21:59:11.631-0700")
@StaticMetamodel(PartyPostalAddress.class)
public class PartyPostalAddress_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PartyPostalAddress, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PartyPostalAddress, String> comment;
	public static volatile SingularAttribute<PartyPostalAddress, PostalAddress> locatedAt;
	public static volatile SingularAttribute<PartyPostalAddress, Party> specifiedFor;
}
