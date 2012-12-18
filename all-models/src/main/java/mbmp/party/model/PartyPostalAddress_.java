package mbmp.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import mbmp.party.model.contactmechanism.PostalAddress;

@Generated(value="Dali", date="2011-12-07T19:49:02.232-0700")
@StaticMetamodel(PartyPostalAddress.class)
public class PartyPostalAddress_ {
	public static volatile SingularAttribute<PartyPostalAddress, String> comment;
	public static volatile SingularAttribute<PartyPostalAddress, PostalAddress> locatedAt;
	public static volatile SingularAttribute<PartyPostalAddress, Party> specifiedFor;
}
