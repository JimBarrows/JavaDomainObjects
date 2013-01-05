package mbmp.request.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-04T22:11:23.061-0700")
@StaticMetamodel(RequestRole.class)
public class RequestRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<RequestRole, Party> party;
	public static volatile SingularAttribute<RequestRole, RequestRoleType> roleType;
}
