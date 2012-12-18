package mbmp.invoice.model.billingaccount;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mbmp.model.BaseDateRangeModel;
import mbmp.party.model.Party;

@Entity
public class BillingAccountRole extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Party accountFor;
	
	private BillingAccount roleFor;
	
	private BillingAccountRoleType type;

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
