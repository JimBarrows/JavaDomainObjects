package com.nsfwenterprises.biz360.invoice.model.payment;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.humanresoures.model.payroll.Deduction;
import com.nsfwenterprises.biz360.party.model.role.Employee;
import com.nsfwenterprises.biz360.party.model.role.InternalOrganization;

@Entity
public class Paycheck extends Disbursement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Deduction> deductions;
	
	private InternalOrganization issuedFrom;
	
	private Employee issuedTo;

	@OneToMany
	public List<Deduction> getDeductions() {
		return deductions;
	}

	public InternalOrganization getIssuedFrom() {
		return issuedFrom;
	}

	public Employee getIssuedTo() {
		return issuedTo;
	}

	public void setDeductions(List<Deduction> deductions) {
		this.deductions = deductions;
	}

	public void setIssuedFrom(InternalOrganization issuedFrom) {
		this.issuedFrom = issuedFrom;
	}

	public void setIssuedTo(Employee issuedTo) {
		this.issuedTo = issuedTo;
	}

}
