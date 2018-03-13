package jdo.invoice.model.billingaccount;

import jdo.fields.DateTimeRange;
import jdo.invoice.model.Invoice;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
public class BillingAccount extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID of ContactMechanism.
	 * 
	 */
	private UUID billedAt;

	@OneToMany
	private List<Invoice> billedFor;

	@Lob
	private String description;

	@OneToMany
	private List<BillingAccountRole> usedBy;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getBilledAt() {
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

	public void setBilledAt(UUID billedAt) {
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
