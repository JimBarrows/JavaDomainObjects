package mbmp.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseType_;
import mbmp.party.model.PartyRoleType;

@Generated(value="Dali", date="2013-01-05T08:07:17.755-0700")
@StaticMetamodel(RelationshipType.class)
public class RelationshipType_ extends BaseType_ {
	public static volatile SingularAttribute<RelationshipType, PartyRoleType> fromRoleType;
	public static volatile SingularAttribute<RelationshipType, PartyRoleType> toRoleType;
}
