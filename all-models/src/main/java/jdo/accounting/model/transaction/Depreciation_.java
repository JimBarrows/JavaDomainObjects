package jdo.accounting.model.transaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.asset.FixedAsset;

@Generated(value="Dali", date="2014-11-07T22:13:41.992-0700")
@StaticMetamodel(Depreciation.class)
public class Depreciation_ extends InternalAccountingTransaction_ {
	public static volatile SingularAttribute<Depreciation, FixedAsset> forFixedAsset;
}
