package mbmp.party.model.facility;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2013-01-05T07:41:45.885-0700")
@StaticMetamodel(FacilityContactMechanism.class)
public class FacilityContactMechanism_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<FacilityContactMechanism, Facility> mechansimToContact;
	public static volatile SingularAttribute<FacilityContactMechanism, ContactMechanism> specifiedVia;
}
