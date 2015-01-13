package jdo.invoice.model.billingaccount;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.invoice.model.Invoice;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.contactmechanism.ContactMechanism;

@Entity
public class BillingAccount extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	@ManyToOne
	private ContactMechanism			billedAt;

	@OneToMany
	private List<Invoice>				billedFor;

	@Lob
	private String						description;

	@OneToMany
	private List<BillingAccountRole>	usedBy;

	@Embedded
	private DateTimeRange				dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public ContactMechanism getBilledAt() {
		return billedAt;
	}

	
	public List<Invoice> getBilledFor() {
		return billedFor;
	}

	public String getDescription() {
		return description;
	}
	
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
