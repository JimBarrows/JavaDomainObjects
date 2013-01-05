package mbmp.accounting.model.transaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.accounting.model.asset.FixedAsset;

@Generated(value="Dali", date="2013-01-04T22:11:19.973-0700")
@StaticMetamodel(Depreciation.class)
public class Depreciation_ extends InternalAccountingTransaction_ {
	public static volatile SingularAttribute<Depreciation, FixedAsset> forFixedAsset;
}
