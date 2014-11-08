package jdo.invoice.model.billingaccount;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import jdo.invoice.model.Invoice;
import jdo.model.BaseDateRangeModel;
import jdo.party.model.contactmechanism.ContactMechanism;

@Entity
public class BillingAccount extends BaseDateRangeModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ContactMechanism billedAt;
	
	private List<Invoice> billedFor;
	
	private String description;
	
	private List<BillingAccountRole> usedBy;

	public ContactMechanism getBilledAt() {
		return billedAt;
	}

	@OneToMany
	public List<Invoice> getBilledFor() {
		return billedFor;
	}

	public String getDescription() {
		return description;
	}

	@OneToMany
	public List<BillingAccountRole> getUsedBy() {
		return usedBy;
	}

	public void setBilledAt(ContactMechanism billedAt) {
		this.billedAt = billedAt;
	}

	public void setBilledFor(List<Invoice> billedFor) {
		this.billedFor = billedFor;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setUsedBy(List<BillingAccountRole> usedBy) {
		this.usedBy = usedBy;
	}
	
	
}
