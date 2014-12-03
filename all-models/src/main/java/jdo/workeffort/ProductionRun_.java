package jdo.workeffort;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-02T21:45:38.830-0700")
@StaticMetamodel(ProductionRun.class)
public class ProductionRun_ extends Purpose_ {
	public static volatile SingularAttribute<ProductionRun, Long> quantityProduced;
	public static volatile SingularAttribute<ProductionRun, Long> quantityRejected;
	public static volatile SingularAttribute<ProductionRun, Long> quantityToProduce;
}
