package jdo.accounting.model;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import jdo.accounting.model.asset.PeriodType;
import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;

@Entity
public class AccountingPeriod extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Min(0)
	private int					accountingPeriodNumber;

	/**UUID of PartyRole.
	 * 
	 */
	private UUID			accountPeriodFor;

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


	public UUID getAccountPeriodFor() {
		return accountPeriodFor;
	}
	
	public PeriodType getDefinedBy() {
		return definedBy;
	}

	public void setAccountingPeriodNumber(int accountingPeriodNumber) {
		this.accountingPeriodNumber = accountingPeriodNumber;
	}

	public void setAccountPeriodFor(UUID accountPeriodFor) {
		this.accountPeriodFor = accountPeriodFor;
	}

	public void setDefinedBy(PeriodType definedBy) {
		this.definedBy = definedBy;
	}

}
