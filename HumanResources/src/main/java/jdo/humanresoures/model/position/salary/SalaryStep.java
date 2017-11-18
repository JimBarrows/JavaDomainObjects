package jdo.humanresoures.model.position.salary;

import jdo.fields.Money;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class SalaryStep extends PersistentEntity {

	/**
	 * 
	 */
	private static final long				serialVersionUID	= 1L;

	@Embedded
	private Money										amount;

	private Date										dateModified;

	@ManyToOne
	private PayGrade								grade;

	@OneToMany
	private List<PayHistory>				history;

	@OneToMany
	private List<PositionTypeRate>	positionTypeRates;

	private int											sequence;

	public Money getAmount() {
		return amount;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public PayGrade getGrade() {
		return grade;
	}

	public List<PayHistory> getHistory() {
		return history;
	}

	public List<PositionTypeRate> getPositionTypeRates() {
		return positionTypeRates;
	}

	public int getSequence() {
		return sequence;
	}

	public void setAmount(Money amount) {
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
