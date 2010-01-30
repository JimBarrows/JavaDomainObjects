package com.nsfwenterprises.biz360.product.model.price;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.product.model.measurement.CurrencyMeasure;
@Entity
public class UtilizationCharge extends PriceComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CurrencyMeasure inTheCurrencyOf;

	@ManyToOne
	public CurrencyMeasure getInTheCurrencyOf() {
		return inTheCurrencyOf;
	}

	public void setInTheCurrencyOf(CurrencyMeasure inTheCurrencyOf) {
		this.inTheCurrencyOf = inTheCurrencyOf;
	}
}
