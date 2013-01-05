package mbmp.workeffort.requirement;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.product.model.Product;
import mbmp.requirement.model.Requirement_;

@Generated(value="Dali", date="2013-01-04T22:11:23.628-0700")
@StaticMetamodel(WorkRequirement.class)
public class WorkRequirement_ extends Requirement_ {
	public static volatile SingularAttribute<WorkRequirement, Product> producedBy;
	public static volatile SingularAttribute<WorkRequirement, Deliverable> toProduce;
}
