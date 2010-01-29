package com.nsfwenterprises.biz360.ecommerce.model.party.contactmechanism;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.Pattern;

/**
 * 
 * @author Jim.Barrows@gmail.com
 * @See "The Data Model Resource Book, Revised Edition Volume 2 Figure 2.7 pg 421"
 */
@Entity
public class IpAddress extends ElectronicAddress {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	@Pattern(regex = "[012][012345][012345].[012][012345][012345].[012][012345][012345].[012][012345][012345]")
	@Override
	@Column(insertable=false, updatable=false)
	public String getAddress() {
		return super.getAddress();
	}	

}
