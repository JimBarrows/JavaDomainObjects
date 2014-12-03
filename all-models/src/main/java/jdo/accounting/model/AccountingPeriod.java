package jdo.accounting.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import jdo.accounting.model.asset.PeriodType;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;

@Entity
public class AccountingPeriod extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private int					accountingPeriodNumber;

	private PartyRole			accountPeriodFor;

	private PeriodType			definedBy;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();
	
	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}
	

	@Min(0)
	public int getAccountingPeriodNumber() {
		return accountingPeriodNumber;
	}

	@ManyToOne
	public PartyRole getAccountPeriodFor() {
		return accountPeriodFor;
	}

	@ManyToOne
	public PeriodType getDefinedBy() {
		return definedBy;
	}

	public void setAccountingPeriodNumber(int accountingPeriodNumber) {
		this.accountingPeriodNumber = accountingPeriodNumber;
	}

	public void setAccountPeriodFor(PartyRole accountPeriodFor) {
		this.accountPeriodFor = accountPeriodFor;
	}

	public void setDefinedBy(PeriodType definedBy) {
		this.definedBy = definedBy;
	}

}
