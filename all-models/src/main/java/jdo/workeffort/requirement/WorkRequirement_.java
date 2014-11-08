package jdo.workeffort.requirement;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.product.model.Product;
import jdo.requirement.model.Requirement_;

@Generated(value="Dali", date="2014-11-07T22:13:43.686-0700")
@StaticMetamodel(WorkRequirement.class)
public class WorkRequirement_ extends Requirement_ {
	public static volatile SingularAttribute<WorkRequirement, Product> producedBy;
	public static volatile SingularAttribute<WorkRequirement, Deliverable> toProduce;
}
