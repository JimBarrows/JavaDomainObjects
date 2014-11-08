package mbmp.product.model.supplier;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Organization;
import mbmp.product.model.Good;

@Generated(value="Dali", date="2014-11-07T06:11:39.666-0700")
@StaticMetamodel(SupplierProduct.class)
public class SupplierProduct_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<SupplierProduct, PreferenceType> furtherDescribedBy;
	public static volatile SingularAttribute<SupplierProduct, RatingType> ratedBy;
	public static volatile SingularAttribute<SupplierProduct, Organization> suppliedBy;
	public static volatile SingularAttribute<SupplierProduct, Good> validSupplierFor;
	public static volatile SingularAttribute<SupplierProduct, String> comment;
	public static volatile SingularAttribute<SupplierProduct, Long> standardLeadTime;
}
