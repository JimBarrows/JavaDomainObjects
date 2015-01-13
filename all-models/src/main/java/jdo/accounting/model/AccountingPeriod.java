package jdo.accounting.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
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

	@Min(0)
	private int					accountingPeriodNumber;

	@ManyToOne
	private PartyRole			accountPeriodFor;

	@ManyToOne
	private PeriodType			definedBy;

	@Embedded
	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public int getAccountingPeriodNumber() {
		return accountingPeriodNumber;
	}


	public PartyRole getAccountPeriodFor() {
		return accountPeriodFor;
	}
	
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
