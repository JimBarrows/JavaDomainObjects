package jdo.product.model.measurement;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:39 AM
 * @see Data Model Resource Book Volume 1 Figure 3.4, page 77
 */
@Entity
public class UnitOfMeasureConversion extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
	private String conversionFactor;
	@ManyToOne
	private UnitOfMeasure fromUom;
	@ManyToOne
	@JoinColumn(name = "inUnitOfMeasure")
	private UnitOfMeasure in;

	public String getConversionFactor() {
		return conversionFactor;
	}

	public UnitOfMeasure getFromUom() {
		return fromUom;
	}

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