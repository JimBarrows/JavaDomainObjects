package com.nsfwenterprises.biz360.party.services.contactMechanisms;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.party.model.geographicBoundary.GeographicBoundary;

@Name( value="cityList")
public class CityList extends EntityQuery<GeographicBoundary> {

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
		return "select city from City city";
	}
	
}
