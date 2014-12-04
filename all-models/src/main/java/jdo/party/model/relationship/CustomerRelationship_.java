package jdo.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.roles.Customer;
import jdo.party.model.roles.InternalOrganization;

@Generated(value="Dali", date="2014-12-03T08:43:20.493-0700")
@StaticMetamodel(CustomerRelationship.class)
public class CustomerRelationship_ extends PartyRelationship_ {
	public static volatile SingularAttribute<CustomerRelationship, InternalOrganization> relationshipFrom;
	public static volatile SingularAttribute<CustomerRelationship, Customer> relationshipTo;
}
