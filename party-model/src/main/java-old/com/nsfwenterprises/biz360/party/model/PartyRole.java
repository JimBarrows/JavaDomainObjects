package com.nsfwenterprises.biz360.party.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;

/**
 * A person or organization may play any number of roles such as a customer,
 * supplier, employee or internal organization. Because the same party may play
 * different roles over time, we keep track of from and thru dates.
 * 
 * @author Jim.Barrows@gmail.com
 * @see "Data Model Resource Book Volume 1 Figure 2.4, page 34"
 * 
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class PartyRole extends BaseDateRangeModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Party roleFor;

	
	@ManyToOne
	public Party getRoleFor() {
		return roleFor;
	}

	public void setRoleFor(Party roleFor) {
		this.roleFor = roleFor;
	}

}
