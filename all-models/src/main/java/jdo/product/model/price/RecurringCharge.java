package jdo.product.model.price;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.product.model.measurement.TimeFrequencyMeasure;

@Entity
public class RecurringCharge extends PriceComponent {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	private TimeFrequencyMeasure	per;

	@ManyToOne
	@JoinColumn(name = "perTimeFrequencyMeasure")
	@NotNull
	public TimeFrequencyMeasure getPer() {
		return per;
	}

	public void setPer(TimeFrequencyMeasure per) {
		this.per = per;
	}
}
