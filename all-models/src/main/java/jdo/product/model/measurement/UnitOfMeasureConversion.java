package jdo.product.model.measurement;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;

import jdo.model.BasePersistentModel;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:39 AM
 * @see Data Model Resource Book Volume 1 Figure 3.4, page 77
 */
@Entity
public class UnitOfMeasureConversion extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private String				conversionFactor;

	private UnitOfMeasure		fromUom;

	private UnitOfMeasure		in;

	@NotNull
	public String getConversionFactor() {
		return conversionFactor;
	}

	@ManyToOne
	public UnitOfMeasure getFromUom() {
		return fromUom;
	}

	@ManyToOne
	@JoinColumn(name = "inUnitOfMeasure")
	public UnitOfMeasure getIn() {
		return in;
	}

	public void setConversionFactor(String conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public void setFromUom(UnitOfMeasure fromUom) {
		this.fromUom = fromUom;
	}

	public void setIn(UnitOfMeasure in) {
		this.in = in;
	}

}