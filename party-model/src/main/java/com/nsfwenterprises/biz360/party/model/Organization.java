package com.nsfwenterprises.biz360.party.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * An organization, such as a family, company, government agency etc.
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:32 AM
 * @see Data Model Resource Book Volume 1 Figure 3.5, page 82
 */
@Entity
public class Organization extends Party {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String name;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}