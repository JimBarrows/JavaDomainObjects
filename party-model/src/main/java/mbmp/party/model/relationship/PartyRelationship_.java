package mbmp.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2011-12-07T19:49:02.264-0700")
@StaticMetamodel(PartyRelationship.class)
public class PartyRelationship_ {
	public static volatile SingularAttribute<PartyRelationship, RelationshipType> type;
	public static volatile SingularAttribute<PartyRelationship, String> comment;
	public static volatile SingularAttribute<PartyRelationship, PriorityType> priority;
	public static volatile SingularAttribute<PartyRelationship, PartyRole> relationshipFrom;
	public static volatile SingularAttribute<PartyRelationship, PartyRole> relationshipTo;
	public static volatile SingularAttribute<PartyRelationship, StatusType> status;
}
