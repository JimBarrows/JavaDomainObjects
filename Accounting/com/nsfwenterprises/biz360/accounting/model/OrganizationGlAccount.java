package com.nsfwenterprises.biz360.accounting.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.accounting.model.transaction.detail.TransactionDetail;
import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.role.BillToCustomer;
import com.nsfwenterprises.biz360.party.model.role.InternalOrganization;
import com.nsfwenterprises.biz360.party.model.role.Supplier;
import com.nsfwenterprises.biz360.product.model.Product;
import com.nsfwenterprises.biz360.product.model.category.ProductCategory;

@Entity
public class OrganizationGlAccount extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 
	private GeneralLedgerAccount accountFor;
	
	private List<OrganizationGlAccount> comprisedOf = new ArrayList<OrganizationGlAccount>(); 
	
	private List< TransactionDetail> consistingOf = new ArrayList<TransactionDetail>();
	
	private InternalOrganization internalOrganizationFor;
	
	private BillToCustomer referencingBillToCustomer;
		
	private Product referencingProduct;
		
	private ProductCategory referencingProductCategory;
		
	private Supplier referencingSupplier;

	private OrganizationGlAccount subsidiaryOf;

	@ManyToOne
	public GeneralLedgerAccount getAccountFor() {
		return accountFor;
	}

	@OneToMany(mappedBy="subsidiaryOf")
	public List<OrganizationGlAccount> getComprisedOf() {
		return comprisedOf;
	}

	@OneToMany
	public List<TransactionDetail> getConsistingOf() {
		return consistingOf;
	}

	public InternalOrganization getInternalOrganizationFor() {
		return internalOrganizationFor;
	}

	public BillToCustomer getReferencingBillToCustomer() {
		return referencingBillToCustomer;
	}

	public Product getReferencingProduct() {
		return referencingProduct;
	}

	public ProductCategory getReferencingProductCategory() {
		return referencingProductCategory;
	}

	public Supplier getReferencingSupplier() {
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

	public void setInternalOrganizationFor(
			InternalOrganization internalOrganizationFor) {
		this.internalOrganizationFor = internalOrganizationFor;
	}

	public void setReferencingBillToCustomer(
			BillToCustomer referencingBillToCustomer) {
		this.referencingBillToCustomer = referencingBillToCustomer;
	}

	public void setReferencingProduct(Product referencingProduct) {
		this.referencingProduct = referencingProduct;
	}

	public void setReferencingProductCategory(
			ProductCategory referencingProductCategory) {
		this.referencingProductCategory = referencingProductCategory;
	}

	public void setReferencingSupplier(Supplier referencingSupplier) {
		this.referencingSupplier = referencingSupplier;
	}

	public void setSubsidiaryOf(OrganizationGlAccount subsidiaryOf) {
		this.subsidiaryOf = subsidiaryOf;
	}
}
