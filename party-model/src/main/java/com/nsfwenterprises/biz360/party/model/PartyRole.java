package com.nsfwenterprises.biz360.party.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

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

	private PartyRoleType type;

	private Party roleFor;

	public PartyRole(PartyRoleType type) {
		super();
		this.type = type;
	}

	@ManyToOne
	public Party getRoleFor() {
		return roleFor;
	}

	public void setRoleFor(Party roleFor) {
		this.roleFor = roleFor;
	}
	
	@NotNull
	@ManyToOne
	public PartyRoleType getType() {
		return type;
	}

	public void setType(PartyRoleType type) {
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((roleFor == null) ? 0 : roleFor.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PartyRole other = (PartyRole) obj;
		if (roleFor == null) {
			if (other.roleFor != null)
				return false;
		} else if (!roleFor.equals(other.roleFor))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	private static final long serialVersionUID = 1L;
}
