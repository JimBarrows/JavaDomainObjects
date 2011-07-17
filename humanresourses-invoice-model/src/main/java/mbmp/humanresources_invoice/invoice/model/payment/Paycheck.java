package mbmp.humanresources_invoice.invoice.model.payment;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import mbmp.humanresources_invoice.humanresources.model.payroll.Deduction;
import mbmp.invoice.model.payment.Disbursement;
import mbmp.party.model.PartyRole;

@Entity
public class Paycheck extends Disbursement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Deduction> deductions;
	
	private PartyRole issuedFrom;
	
	private PartyRole issuedTo;

	@OneToMany
	public List<Deduction> getDeductions() {
		return deductions;
	}

	public PartyRole getIssuedFrom() {
		return issuedFrom;
	}

	public PartyRole getIssuedTo() {
		return issuedTo;
	}

	public void setDeductions(List<Deduction> deductions) {
		this.deductions = deductions;
	}

	public void setIssuedFrom(PartyRole issuedFrom) {
		this.issuedFrom = issuedFrom;
	}

	public void setIssuedTo(PartyRole issuedTo) {
		this.issuedTo = issuedTo;
	}

}
