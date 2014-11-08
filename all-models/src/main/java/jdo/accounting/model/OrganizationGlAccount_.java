package jdo.accounting.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.transaction.detail.TransactionDetail;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.PartyRole;
import jdo.product.model.Product;
import jdo.product.model.category.ProductCategory;

@Generated(value="Dali", date="2014-11-07T22:13:41.969-0700")
@StaticMetamodel(OrganizationGlAccount.class)
public class OrganizationGlAccount_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<OrganizationGlAccount, GeneralLedgerAccount> accountFor;
	public static volatile ListAttribute<OrganizationGlAccount, OrganizationGlAccount> comprisedOf;
	public static volatile ListAttribute<OrganizationGlAccount, TransactionDetail> consistingOf;
	public static volatile SingularAttribute<OrganizationGlAccount, OrganizationGlAccount> subsidiaryOf;
	public static volatile SingularAttribute<OrganizationGlAccount, Product> referencingProduct;
	public static volatile SingularAttribute<OrganizationGlAccount, ProductCategory> referencingProductCategory;
	public static volatile SingularAttribute<OrganizationGlAccount, PartyRole> internalOrganizationFor;
	public static volatile SingularAttribute<OrganizationGlAccount, PartyRole> referencingBillToCustomer;
	public static volatile SingularAttribute<OrganizationGlAccount, PartyRole> referencingSupplier;
}
