package jdo.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-12-24T16:34:41.514-0700")
@StaticMetamodel(PartyRelationship.class)
public class PartyRelationship_ {
	public static volatile SingularAttribute<PartyRelationship, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PartyRelationship, String> comment;
	public static volatile SingularAttribute<PartyRelationship, PriorityType> priority;
	public static volatile SingularAttribute<PartyRelationship, PartyRole> relationshipFrom;
	public static volatile SingularAttribute<PartyRelationship, PartyRole> relationshipTo;
	public static volatile SingularAttribute<PartyRelationship, StatusType> status;
}
