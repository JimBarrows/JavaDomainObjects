package jdo.party.model.facility;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2015-01-11T23:24:33.844-0700")
@StaticMetamodel(Facility.class)
public class Facility_ extends BasePersistentModel_ {
	public static volatile ListAttribute<Facility, FacilityContactMechanism> contactedVia;
	public static volatile SingularAttribute<Facility, String> description;
	public static volatile ListAttribute<Facility, FacilityRole> involving;
	public static volatile ListAttribute<Facility, Facility> madeUpOf;
	public static volatile SingularAttribute<Facility, Facility> partOf;
}
