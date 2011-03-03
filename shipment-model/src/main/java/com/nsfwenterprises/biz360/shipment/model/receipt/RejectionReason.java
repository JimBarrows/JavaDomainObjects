package com.nsfwenterprises.biz360.shipment.model.receipt;

import javax.persistence.Entity;
import javax.persistence.Lob;

import org.hibernate.validator.constraints.NotEmpty;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class RejectionReason extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String description;

	@Lob
	@NotEmpty
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
