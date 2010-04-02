package com.nsfwenterprises.biz360.ecommerce.model.party.contactmechanism;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.validator.Email;
import org.hibernate.validator.NotEmpty;

@Entity
public class EmailAddress extends ElectronicAddress {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	@Email
	@Override
	@Column(insertable=false, updatable=false)
	public String getAddress() {
		return super.getAddress();
	}	

}
