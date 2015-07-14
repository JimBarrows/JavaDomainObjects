package jdo.accounting.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.accounting.model.transaction.detail.TransactionDetail;
import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;

@Entity
public class OrganizationGlAccount extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private GeneralLedgerAccount accountFor;

	@OneToMany(mappedBy = "subsidiaryOf")
	private List<OrganizationGlAccount> comprisedOf = new ArrayList<OrganizationGlAccount>();

	@OneToMany
	private List<TransactionDetail> consistingOf = new ArrayList<TransactionDetail>();

	/**
	 * UUID for PartyRole.
	 * 
	 */
	private UUID internalOrganizationFor;

	/**
	 * UUID for PartyRole.
	 * 
	 */
	private UUID referencingBillToCustomer;

	/**
	 * UUID for PartyRole.
	 * 
	 */
	private UUID referencingSupplier;

	@ManyToOne
	private OrganizationGlAccount subsidiaryOf;

	/**
	 * UUID for Product.
	 * 
	 */
	private UUID referencingProduct;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	/**
	 * UUID for ProductCategory.
	 * 
	 */
	private UUID referencingProductCategory;

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getReferencingProduct() {
		return referencingProduct;
	}

	public UUID getReferencingProductCategory() {
		return referencingProductCategory;
	}

	public void setReferencingProduct(UUID referencingProduct) {
		this.referencingProduct = referencingProduct;
	}

	public void setReferencingProductCategory(UUID referencingProductCategory) {
		this.referencingProductCategory = referencingProductCategory;
	}

	public GeneralLedgerAccount getAccountFor() {
		return accountFor;
	}

	public List<OrganizationGlAccount> getComprisedOf() {
		return comprisedOf;
	}

	public List<TransactionDetail> getConsistingOf() {
		return consistingOf;
	}

	public UUID getInternalOrganizationFor() {
		return internalOrganizationFor;
	}

	public UUID getReferencingBillToCustomer() {
		return referencingBillToCustomer;
	}

	public UUID getReferencingSupplier() {
		return referencingSupplier;
	}

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

	public void setInternalOrganizationFor(UUID internalOrganizationFor) {
		this.internalOrganizationFor = internalOrganizationFor;
	}

	public void setReferencingBillToCustomer(UUID referencingBillToCustomer) {
		this.referencingBillToCustomer = referencingBillToCustomer;
	}

	public void setReferencingSupplier(UUID referencingSupplier) {
		this.referencingSupplier = referencingSupplier;
	}

	public void setSubsidiaryOf(OrganizationGlAccount subsidiaryOf) {
		this.subsidiaryOf = subsidiaryOf;
	}

}
