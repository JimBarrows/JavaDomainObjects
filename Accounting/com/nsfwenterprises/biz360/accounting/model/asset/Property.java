package com.nsfwenterprises.biz360.accounting.model.asset;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.party.model.contactmechanism.PostalAddress;

@Entity
public class Property extends FixedAsset {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PostalAddress address;

	public PostalAddress getAddress() {
		return address;
	}

	public void setAddress(PostalAddress address) {
		this.address = address;
	}
}
