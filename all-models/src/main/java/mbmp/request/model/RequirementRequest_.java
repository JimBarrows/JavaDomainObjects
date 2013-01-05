package mbmp.request.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.requirement.model.Requirement;

@Generated(value="Dali", date="2013-01-04T22:11:23.074-0700")
@StaticMetamodel(RequirementRequest.class)
public class RequirementRequest_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<RequirementRequest, Requirement> associatedTo;
	public static volatile SingularAttribute<RequirementRequest, RequestItem> communicatedVia;
}
