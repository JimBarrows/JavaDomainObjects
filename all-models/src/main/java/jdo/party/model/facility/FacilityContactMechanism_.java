package jdo.party.model.facility;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;
import jdo.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2014-12-24T16:34:41.429-0700")
@StaticMetamodel(FacilityContactMechanism.class)
public class FacilityContactMechanism_ {
	public static volatile SingularAttribute<FacilityContactMechanism, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<FacilityContactMechanism, Facility> mechansimToContact;
	public static volatile SingularAttribute<FacilityContactMechanism, ContactMechanism> specifiedVia;
}
