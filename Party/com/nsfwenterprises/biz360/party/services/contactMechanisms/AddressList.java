package com.nsfwenterprises.biz360.party.services.contactMechanisms;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.party.model.contactmechanism.PostalAddress;

@Name(value="addressList")
public class AddressList extends EntityQuery<PostalAddress> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jboss.seam.framework.Query#getEjbql()
	 */
	@Override
	public String getEjbql() {
		return "select postalAddress from USPostalAddress postalAddress";
	}
}
