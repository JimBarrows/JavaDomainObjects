package jdo.accounting.model.asset;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-02T20:42:34.240-0700")
@StaticMetamodel(FixedAssetDepreciationMethod.class)
public class FixedAssetDepreciationMethod_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<FixedAssetDepreciationMethod, DepreciationMethod> depreciationMethod;
	public static volatile SingularAttribute<FixedAssetDepreciationMethod, DateTimeRange> dateTimeRange;
}
