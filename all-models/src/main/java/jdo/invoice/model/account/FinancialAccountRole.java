package jdo.invoice.model.account;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BaseDateRangeModel;
import jdo.party.model.Party;

@Entity
public class FinancialAccountRole extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Party accountFor;
	
	private FinancialAccountRoleType type;

	public Party getAccountFor() {
		return accountFor;
	}

	@ManyToOne
	public FinancialAccountRoleType getType() {
		return type;
	}

	public void setAccountFor(Party accountFor) {
		this.accountFor = accountFor;
	}

	public void setType(FinancialAccountRoleType type) {
		this.type = type;
	}

}
