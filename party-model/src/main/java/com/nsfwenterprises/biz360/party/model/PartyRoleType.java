package com.nsfwenterprises.biz360.party.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.nsfwenterprises.biz360.model.BaseType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PartyRoleType extends BaseType{

	public PartyRoleType(String description) {
		this.setDescription(description);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
