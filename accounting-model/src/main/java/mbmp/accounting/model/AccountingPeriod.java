package mbmp.accounting.model;

import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import mbmp.accounting.model.asset.PeriodType;

import org.hibernate.annotations.Entity;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.PartyRole;

@Entity
public class AccountingPeriod extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
		
	private int accountingPeriodNumber;
	
	private PartyRole accountPeriodFor;

	private PeriodType definedBy;

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
