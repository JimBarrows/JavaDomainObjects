package mbmp.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2013-01-05T08:07:17.643-0700")
@StaticMetamodel(CustomerRelationship.class)
public class CustomerRelationship_ extends PartyRelationship_ {
	public static volatile SingularAttribute<CustomerRelationship, PartyRole> relationshipFrom;
	public static volatile SingularAttribute<CustomerRelationship, PartyRole> relationshipTo;
}
