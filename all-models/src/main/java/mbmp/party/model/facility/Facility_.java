package mbmp.party.model.facility;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-12-07T19:49:02.125-0700")
@StaticMetamodel(Facility.class)
public class Facility_ {
	public static volatile ListAttribute<Facility, FacilityContactMechanism> contactedVia;
	public static volatile SingularAttribute<Facility, String> description;
	public static volatile ListAttribute<Facility, FacilityRole> involving;
	public static volatile ListAttribute<Facility, Facility> madeUpOf;
	public static volatile SingularAttribute<Facility, Facility> partOf;
}
