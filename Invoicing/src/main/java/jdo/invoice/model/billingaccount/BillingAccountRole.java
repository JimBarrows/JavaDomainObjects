package jdo.invoice.model.billingaccount;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class BillingAccountRole extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID of Party.
	 * 
	 */
	private UUID accountFor;

	@ManyToOne
	private BillingAccount roleFor;

	@ManyToOne
	private BillingAccountRoleType type;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getAccountFor() {
		return accountFor;
	}

	public BillingAccount getRoleFor() {
		return roleFor;
	}

	public BillingAccountRoleType getType() {
		return type;
	}

	public void setAccountFor(UUID accountFor) {
		this.accountFor = accountFor;
	}

	public void setRoleFor(BillingAccount roleFor) {
		this.roleFor = roleFor;
	}

	public void setType(BillingAccountRoleType type) {
		this.type = type;
	}
}
