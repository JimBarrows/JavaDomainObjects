package jdo.request.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.requirement.model.Requirement;

@Generated(value="Dali", date="2014-12-24T16:23:57.590-0700")
@StaticMetamodel(RequestItem.class)
public class RequestItem_ {
	public static volatile ListAttribute<RequestItem, RequirementRequest> communicationMethod;
	public static volatile SingularAttribute<RequestItem, String> description;
	public static volatile SingularAttribute<RequestItem, Money> maximumAmount;
	public static volatile SingularAttribute<RequestItem, Requirement> partOf;
	public static volatile SingularAttribute<RequestItem, Date> requiredBy;
	public static volatile SingularAttribute<RequestItem, Integer> quantity;
}
