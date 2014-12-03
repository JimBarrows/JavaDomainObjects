package jdo.accounting.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.accounting.model.transaction.detail.TransactionDetail;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;
import jdo.product.model.Product;
import jdo.product.model.category.ProductCategory;

@Entity
public class OrganizationGlAccount extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	private GeneralLedgerAccount		accountFor;

	private List<OrganizationGlAccount>	comprisedOf			= new ArrayList<OrganizationGlAccount>();

	private List<TransactionDetail>		consistingOf		= new ArrayList<TransactionDetail>();

	private PartyRole					internalOrganizationFor;

	private PartyRole					referencingBillToCustomer;

	private PartyRole					referencingSupplier;

	private OrganizationGlAccount		subsidiaryOf;

	private Product						referencingProduct;

	private DateTimeRange				dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public Product getReferencingProduct() {
		return referencingProduct;
	}

	public ProductCategory getReferencingProductCategory() {
		return referencingProductCategory;
	}

	private ProductCategory	referencingProductCategory;

	public void setReferencingProduct(Product referencingProduct) {
		this.referencingProduct = referencingProduct;
	}

	public void setReferencingProductCategory(ProductCategory referencingProductCategory) {
		this.referencingProductCategory = referencingProductCategory;
	}

	@ManyToOne
	public GeneralLedgerAccount getAccountFor() {
		return accountFor;
	}

	@OneToMany(mappedBy = "subsidiaryOf")
	public List<OrganizationGlAccount> getComprisedOf() {
		return comprisedOf;
	}

	@OneToMany
	public List<TransactionDetail> getConsistingOf() {
		return consistingOf;
	}

	public PartyRole getInternalOrganizationFor() {
		return internalOrganizationFor;
	}

	public PartyRole getReferencingBillToCustomer() {
		return referencingBillToCustomer;
	}

	public PartyRole getReferencingSupplier() {
		return referencingSupplier;
	}

	@ManyToOne
	public OrganizationGlAccount getSubsidiaryOf() {
		return subsidiaryOf;
	}

	public void setAccountFor(GeneralLedgerAccount accountFor) {
		this.accountFor = accountFor;
	}

	public void setComprisedOf(List<OrganizationGlAccount> comprisedOf) {
		this.comprisedOf = comprisedOf;
	}

	public void setConsistingOf(List<TransactionDetail> consistingOf) {
		this.consistingOf = consistingOf;
	}

	public void setInternalOrganizationFor(PartyRole internalOrganizationFor) {
		this.internalOrganizationFor = internalOrganizationFor;
	}

	public void setReferencingBillToCustomer(PartyRole referencingBillToCustomer) {
		this.referencingBillToCustomer = referencingBillToCustomer;
	}

	public void setReferencingSupplier(PartyRole referencingSupplier) {
		this.referencingSupplier = referencingSupplier;
	}

	public void setSubsidiaryOf(OrganizationGlAccount subsidiaryOf) {
		this.subsidiaryOf = subsidiaryOf;
	}

}
