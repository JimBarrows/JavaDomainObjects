package jdo.request.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2015-01-12T07:11:57.848-0700")
@StaticMetamodel(RequestRole.class)
public class RequestRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<RequestRole, Party> party;
	public static volatile SingularAttribute<RequestRole, RequestRoleType> roleType;
}
