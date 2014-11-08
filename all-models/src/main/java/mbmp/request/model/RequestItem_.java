package mbmp.request.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.requirement.model.Requirement;

@Generated(value="Dali", date="2014-11-07T06:11:39.684-0700")
@StaticMetamodel(RequestItem.class)
public class RequestItem_ extends BasePersistentModel_ {
	public static volatile ListAttribute<RequestItem, RequirementRequest> communicationMethod;
	public static volatile SingularAttribute<RequestItem, String> description;
	public static volatile SingularAttribute<RequestItem, Requirement> partOf;
	public static volatile SingularAttribute<RequestItem, Date> requiredBy;
	public static volatile SingularAttribute<RequestItem, BigDecimal> maximumAmount;
	public static volatile SingularAttribute<RequestItem, Integer> quantity;
}
