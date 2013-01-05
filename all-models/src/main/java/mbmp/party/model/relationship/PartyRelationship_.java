package mbmp.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2013-01-05T08:07:17.722-0700")
@StaticMetamodel(PartyRelationship.class)
public class PartyRelationship_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyRelationship, RelationshipType> type;
	public static volatile SingularAttribute<PartyRelationship, String> comment;
	public static volatile SingularAttribute<PartyRelationship, PriorityType> priority;
	public static volatile SingularAttribute<PartyRelationship, PartyRole> relationshipFrom;
	public static volatile SingularAttribute<PartyRelationship, PartyRole> relationshipTo;
	public static volatile SingularAttribute<PartyRelationship, StatusType> status;
}
