package jdo.invoice.model.billingaccount;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Entity
public class BillingAccountRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	private Party					accountFor;

	private BillingAccount			roleFor;

	private BillingAccountRoleType	type;

	private DateTimeRange			dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public Party getAccountFor() {
		return accountFor;
	}

	@ManyToOne
	public BillingAccount getRoleFor() {
		return roleFor;
	}

	@ManyToOne
	public BillingAccountRoleType getType() {
		return type;
	}

	public void setAccountFor(Party accountFor) {
		this.accountFor = accountFor;
	}

	public void setRoleFor(BillingAccount roleFor) {
		this.roleFor = roleFor;
	}

	public void setType(BillingAccountRoleType type) {
		this.type = type;
	}
}
