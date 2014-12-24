package jdo.request.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.requirement.model.Requirement;

@Generated(value="Dali", date="2014-12-24T16:23:57.604-0700")
@StaticMetamodel(RequirementRequest.class)
public class RequirementRequest_ {
	public static volatile SingularAttribute<RequirementRequest, Requirement> associatedTo;
	public static volatile SingularAttribute<RequirementRequest, RequestItem> communicatedVia;
}
