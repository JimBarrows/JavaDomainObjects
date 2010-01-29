package com.nsfwenterprises.biz360.humanresoures.model.position.salary;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class SalaryStep extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigDecimal amount;
	
	private Date dateModified;
	
	private PayGrade grade;
	
	private List<PayHistory> history;
	
	private List<PositionTypeRate> positionTypeRates;
	
	private int sequence;

	public BigDecimal getAmount() {
		return amount;
	}

	public Date getDateModified() {
		return dateModified;
	}

	@ManyToOne
	public PayGrade getGrade() {
		return grade;
	}

	@OneToMany
	public List<PayHistory> getHistory() {
		return history;
	}

	@OneToMany
	public List<PositionTypeRate> getPositionTypeRates() {
		return positionTypeRates;
	}

	public int getSequence() {
		return sequence;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public void setGrade(PayGrade grade) {
		this.grade = grade;
	}

	public void setHistory(List<PayHistory> history) {
		this.history = history;
	}

	public void setPositionTypeRates(List<PositionTypeRate> positionTypeRates) {
		this.positionTypeRates = positionTypeRates;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

}
