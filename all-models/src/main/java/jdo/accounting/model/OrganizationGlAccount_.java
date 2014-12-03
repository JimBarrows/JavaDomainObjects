package jdo.accounting.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.transaction.detail.TransactionDetail;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;
import jdo.product.model.Product;
import jdo.product.model.category.ProductCategory;

@Generated(value="Dali", date="2014-12-02T21:59:11.005-0700")
@StaticMetamodel(OrganizationGlAccount.class)
public class OrganizationGlAccount_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrganizationGlAccount, DateTimeRange> dateTimeRange;
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
