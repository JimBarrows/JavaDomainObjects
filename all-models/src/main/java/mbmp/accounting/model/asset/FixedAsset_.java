package mbmp.accounting.model.asset;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:28:13.362-0700")
@StaticMetamodel(FixedAsset.class)
public class FixedAsset_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<FixedAsset, Date> dateAcquired;
	public static volatile SingularAttribute<FixedAsset, Date> dateLastServiced;
	public static volatile ListAttribute<FixedAsset, FixedAssetDepreciationMethod> depreciatedVia;
	public static volatile SingularAttribute<FixedAsset, String> description;
	public static volatile SingularAttribute<FixedAsset, String> name;
	public static volatile SingularAttribute<FixedAsset, Date> nextService;
	public static volatile SingularAttribute<FixedAsset, Integer> productionCapacity;
}
