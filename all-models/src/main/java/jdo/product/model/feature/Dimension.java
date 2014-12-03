package jdo.product.model.feature;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.product.model.measurement.UnitOfMeasure;

/**
 * 
 * @author Jim.Barrows
 * @see "Data Model Resource Book Volume 1 Figure 3.4, page 77"
 */
@Entity
public class Dimension extends ProductFeature {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private UnitOfMeasure		measuredUsing;

	public UnitOfMeasure getMeasuredUsing() {
		return measuredUsing;
	}

	public void setMeasuredUsing(UnitOfMeasure measuredUsing) {
		this.measuredUsing = measuredUsing;
	}

}
