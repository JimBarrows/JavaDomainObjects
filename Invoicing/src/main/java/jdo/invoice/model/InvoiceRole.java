package jdo.invoice.model;

import jdo.model.PersistentEntity;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class InvoiceRole extends PersistentEntity {

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
