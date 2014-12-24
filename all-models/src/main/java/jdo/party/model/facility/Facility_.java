package jdo.party.model.facility;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:56.271-0700")
@StaticMetamodel(Facility.class)
public class Facility_ {
	public static volatile ListAttribute<Facility, FacilityContactMechanism> contactedVia;
	public static volatile ListAttribute<Facility, FacilityRole> involving;
	public static volatile ListAttribute<Facility, Facility> madeUpOf;
	public static volatile SingularAttribute<Facility, Facility> partOf;
	public static volatile SingularAttribute<Facility, String> description;
}
