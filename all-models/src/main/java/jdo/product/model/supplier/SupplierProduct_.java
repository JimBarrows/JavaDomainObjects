package jdo.product.model.supplier;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.Organization;
import jdo.product.model.Good;

@Generated(value="Dali", date="2014-11-07T22:13:43.305-0700")
@StaticMetamodel(SupplierProduct.class)
public class SupplierProduct_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<SupplierProduct, PreferenceType> furtherDescribedBy;
	public static volatile SingularAttribute<SupplierProduct, RatingType> ratedBy;
	public static volatile SingularAttribute<SupplierProduct, Organization> suppliedBy;
	public static volatile SingularAttribute<SupplierProduct, Good> validSupplierFor;
	public static volatile SingularAttribute<SupplierProduct, String> comment;
	public static volatile SingularAttribute<SupplierProduct, Long> standardLeadTime;
}
