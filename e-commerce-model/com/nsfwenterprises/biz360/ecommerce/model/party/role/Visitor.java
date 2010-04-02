package com.nsfwenterprises.biz360.ecommerce.model.party.role;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.ecommerce.model.webvisit.Visit;
import com.nsfwenterprises.biz360.party.model.role.Consumer;

@Entity
public class Visitor extends Consumer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Visit> visits;

	@OneToMany
	public List<Visit> getVisits() {
		return visits;
	}

	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}
}
