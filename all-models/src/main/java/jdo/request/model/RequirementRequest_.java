package jdo.request.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.requirement.model.Requirement;

@Generated(value="Dali", date="2014-12-02T21:45:38.503-0700")
@StaticMetamodel(RequirementRequest.class)
public class RequirementRequest_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<RequirementRequest, Requirement> associatedTo;
	public static volatile SingularAttribute<RequirementRequest, RequestItem> communicatedVia;
}
