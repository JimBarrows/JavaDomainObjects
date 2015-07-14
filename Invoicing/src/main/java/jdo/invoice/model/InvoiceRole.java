package jdo.invoice.model;

import java.util.Date;

import javax.persistence.Entity;

import jdo.model.BasePersistentModel;

import org.hibernate.validator.constraints.Range;

@Entity
public class InvoiceRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private int					percentage;

	private Date				performedOn;

	@Range(min = 0, max = 100)
	public int getPercentage() {
		return percentage;
	}

	public Date getPerformedOn() {
		return performedOn;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public void setPerformedOn(Date performedOn) {
		this.performedOn = performedOn;
	}
}
