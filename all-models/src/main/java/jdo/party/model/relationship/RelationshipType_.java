package jdo.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseType_;
import jdo.party.model.PartyRoleType;

@Generated(value="Dali", date="2014-11-07T22:13:42.980-0700")
@StaticMetamodel(RelationshipType.class)
public class RelationshipType_ extends BaseType_ {
	public static volatile SingularAttribute<RelationshipType, PartyRoleType> fromRoleType;
	public static volatile SingularAttribute<RelationshipType, PartyRoleType> toRoleType;
}
