package mbmp.party.model.contactmechanism;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.party.model.PartyPostalAddress;
import mbmp.party.model.geographic_boundary.GeographicBoundary;

@Generated(value="Dali", date="2013-01-05T08:07:17.523-0700")
@StaticMetamodel(PostalAddress.class)
public class PostalAddress_ extends ContactMechanism_ {
	public static volatile SingularAttribute<PostalAddress, String> address;
	public static volatile SingularAttribute<PostalAddress, String> directions;
	public static volatile ListAttribute<PostalAddress, PartyPostalAddress> locationFor;
	public static volatile ListAttribute<PostalAddress, GeographicBoundary> within;
}
