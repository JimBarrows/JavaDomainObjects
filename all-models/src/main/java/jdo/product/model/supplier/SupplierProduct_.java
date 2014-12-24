package jdo.product.model.supplier;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;
import jdo.party.model.Organization;
import jdo.product.model.Good;

@Generated(value="Dali", date="2014-12-24T16:34:41.980-0700")
@StaticMetamodel(SupplierProduct.class)
public class SupplierProduct_ {
	public static volatile SingularAttribute<SupplierProduct, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<SupplierProduct, PreferenceType> furtherDescribedBy;
	public static volatile SingularAttribute<SupplierProduct, RatingType> ratedBy;
	public static volatile SingularAttribute<SupplierProduct, Organization> suppliedBy;
	public static volatile SingularAttribute<SupplierProduct, Good> validSupplierFor;
	public static volatile SingularAttribute<SupplierProduct, String> comment;
	public static volatile SingularAttribute<SupplierProduct, Long> standardLeadTime;
}
