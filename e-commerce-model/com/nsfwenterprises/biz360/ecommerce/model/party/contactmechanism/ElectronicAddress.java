package com.nsfwenterprises.biz360.ecommerce.model.party.contactmechanism;

import javax.persistence.Entity;

import org.hibernate.validator.NotEmpty;

import com.nsfwenterprises.biz360.party.model.contactmechanism.ContactMechanism;

@Entity
public class ElectronicAddress extends ContactMechanism {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String address;

	@NotEmpty
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
