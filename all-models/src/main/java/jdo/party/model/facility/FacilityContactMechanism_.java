package jdo.party.model.facility;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2014-12-02T21:59:11.598-0700")
@StaticMetamodel(FacilityContactMechanism.class)
public class FacilityContactMechanism_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<FacilityContactMechanism, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<FacilityContactMechanism, Facility> mechansimToContact;
	public static volatile SingularAttribute<FacilityContactMechanism, ContactMechanism> specifiedVia;
}
