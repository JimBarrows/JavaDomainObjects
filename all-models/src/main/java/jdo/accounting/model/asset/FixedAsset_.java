package jdo.accounting.model.asset;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-02T21:45:36.629-0700")
@StaticMetamodel(FixedAsset.class)
public class FixedAsset_ extends BasePersistentModel_ {
	public static volatile ListAttribute<FixedAsset, FixedAssetDepreciationMethod> depreciatedVia;
	public static volatile SingularAttribute<FixedAsset, Date> dateAcquired;
	public static volatile SingularAttribute<FixedAsset, Date> dateLastServiced;
	public static volatile SingularAttribute<FixedAsset, String> description;
	public static volatile SingularAttribute<FixedAsset, String> name;
	public static volatile SingularAttribute<FixedAsset, Date> nextService;
	public static volatile SingularAttribute<FixedAsset, Integer> productionCapacity;
}
