package jdo.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-12-02T21:00:30.205-0700")
@StaticMetamodel(PartyRelationship.class)
public class PartyRelationship_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PartyRelationship, RelationshipType> type;
	public static volatile SingularAttribute<PartyRelationship, PriorityType> priority;
	public static volatile SingularAttribute<PartyRelationship, PartyRole> relationshipFrom;
	public static volatile SingularAttribute<PartyRelationship, PartyRole> relationshipTo;
	public static volatile SingularAttribute<PartyRelationship, StatusType> status;
	public static volatile SingularAttribute<PartyRelationship, String> comment;
	public static volatile SingularAttribute<PartyRelationship, DateTimeRange> dateTimeRange;
}
