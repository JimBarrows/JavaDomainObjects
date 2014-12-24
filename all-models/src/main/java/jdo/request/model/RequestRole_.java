package jdo.request.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-24T16:23:57.595-0700")
@StaticMetamodel(RequestRole.class)
public class RequestRole_ {
	public static volatile SingularAttribute<RequestRole, Party> party;
	public static volatile SingularAttribute<RequestRole, RequestRoleType> roleType;
}
