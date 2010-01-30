package com.nsfwenterprises.biz360.accounting.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.Min;

import com.nsfwenterprises.biz360.accounting.model.asset.PeriodType;
import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.role.InternalOrganization;

@Entity
public class AccountingPeriod extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
		
	private int accountingPeriodNumber;
	
	private InternalOrganization accountPeriodFor;

	private PeriodType definedBy;

	@Min(0)
	public int getAccountingPeriodNumber() {
		return accountingPeriodNumber;
	}

	@ManyToOne
	public InternalOrganization getAccountPeriodFor() {
		return accountPeriodFor;
	}

	@ManyToOne
	public PeriodType getDefinedBy() {
		return definedBy;
	}

	public void setAccountingPeriodNumber(int accountingPeriodNumber) {
		this.accountingPeriodNumber = accountingPeriodNumber;
	}

	public void setAccountPeriodFor(InternalOrganization accountPeriodFor) {
		this.accountPeriodFor = accountPeriodFor;
	}

	public void setDefinedBy(PeriodType definedBy) {
		this.definedBy = definedBy;
	}

}