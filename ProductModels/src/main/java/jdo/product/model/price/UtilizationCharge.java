package jdo.product.model.price;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.product.model.measurement.CurrencyMeasure;

@Entity
public class UtilizationCharge extends PriceComponent {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private CurrencyMeasure		inTheCurrencyOf;

	
	public CurrencyMeasure getInTheCurrencyOf() {
		return inTheCurrencyOf;
	}

	public void setInTheCurrencyOf(CurrencyMeasure inTheCurrencyOf) {
		this.inTheCurrencyOf = inTheCurrencyOf;
	}
}
