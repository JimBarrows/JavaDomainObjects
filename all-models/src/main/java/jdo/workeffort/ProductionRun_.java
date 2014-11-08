package jdo.workeffort;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-01-04T22:11:23.569-0700")
@StaticMetamodel(ProductionRun.class)
public class ProductionRun_ extends Purpose_ {
	public static volatile SingularAttribute<ProductionRun, Long> quantityProduced;
	public static volatile SingularAttribute<ProductionRun, Long> quantityRejected;
	public static volatile SingularAttribute<ProductionRun, Long> quantityToProduce;
}
