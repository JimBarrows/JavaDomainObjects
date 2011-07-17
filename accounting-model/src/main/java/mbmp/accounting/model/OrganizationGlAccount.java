package mbmp.accounting.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import mbmp.accounting.model.transaction.detail.TransactionDetail;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.PartyRole;

@Entity
public class OrganizationGlAccount extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 
	private GeneralLedgerAccount accountFor;
	
	private List<OrganizationGlAccount> comprisedOf = new ArrayList<OrganizationGlAccount>(); 
	
	private List< TransactionDetail> consistingOf = new ArrayList<TransactionDetail>();
	
	private PartyRole internalOrganizationFor;
	
	private PartyRole referencingBillToCustomer;	
		
	private PartyRole referencingSupplier;

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

	public void setInternalOrganizationFor(
			PartyRole internalOrganizationFor) {
		this.internalOrganizationFor = internalOrganizationFor;
	}

	public void setReferencingBillToCustomer(
			PartyRole referencingBillToCustomer) {
		this.referencingBillToCustomer = referencingBillToCustomer;
	}

	

	public void setReferencingSupplier(PartyRole referencingSupplier) {
		this.referencingSupplier = referencingSupplier;
	}

	public void setSubsidiaryOf(OrganizationGlAccount subsidiaryOf) {
		this.subsidiaryOf = subsidiaryOf;
	}
}
