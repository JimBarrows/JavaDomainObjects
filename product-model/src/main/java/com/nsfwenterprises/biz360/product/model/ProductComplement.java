package com.nsfwenterprises.biz360.product.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.NotNull;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;

/** Indicates that a product is well suited to function with other products.
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:35 AM
 */
@Entity
public class ProductComplement extends BaseDateRangeModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Product aUseOf;

	@ManyToOne
	private Product complementFor;
	@NotNull
	private String reason;
	
	public Product getAUseOf() {
		return aUseOf;
	}

	public Product getComplementFor() {
		return complementFor;
	}

	public String getReason() {
		return reason;
	}

	public void setAUseOf(Product useOf) {
		aUseOf = useOf;
	}

	public void setComplementFor(Product complementFor) {
		this.complementFor = complementFor;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}