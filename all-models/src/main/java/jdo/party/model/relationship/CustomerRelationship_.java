package jdo.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-11-07T22:13:42.949-0700")
@StaticMetamodel(CustomerRelationship.class)
public class CustomerRelationship_ extends PartyRelationship_ {
	public static volatile SingularAttribute<CustomerRelationship, PartyRole> relationshipFrom;
	public static volatile SingularAttribute<CustomerRelationship, PartyRole> relationshipTo;
}
