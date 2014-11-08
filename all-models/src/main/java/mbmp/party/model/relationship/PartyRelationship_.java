package mbmp.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2014-11-07T06:11:39.575-0700")
@StaticMetamodel(PartyRelationship.class)
public class PartyRelationship_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyRelationship, RelationshipType> type;
	public static volatile SingularAttribute<PartyRelationship, PriorityType> priority;
	public static volatile SingularAttribute<PartyRelationship, PartyRole> relationshipFrom;
	public static volatile SingularAttribute<PartyRelationship, PartyRole> relationshipTo;
	public static volatile SingularAttribute<PartyRelationship, StatusType> status;
	public static volatile SingularAttribute<PartyRelationship, String> comment;
}
