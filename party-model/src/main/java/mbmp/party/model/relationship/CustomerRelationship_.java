package mbmp.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2011-12-07T19:49:02.249-0700")
@StaticMetamodel(CustomerRelationship.class)
public class CustomerRelationship_ extends PartyRelationship_ {
	public static volatile SingularAttribute<CustomerRelationship, PartyRole> relationshipFrom;
	public static volatile SingularAttribute<CustomerRelationship, PartyRole> relationshipTo;
}
