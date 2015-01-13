package jdo.invoice.model.account;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Entity
public class FinancialAccountRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Party accountFor;

	@ManyToOne
	private FinancialAccountRoleType type;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public Party getAccountFor() {
		return accountFor;
	}

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
