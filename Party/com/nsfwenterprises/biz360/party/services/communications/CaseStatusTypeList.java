package com.nsfwenterprises.biz360.party.services.communications;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.party.model.geographicBoundary.GeographicBoundary;

@SuppressWarnings("serial")
@Name( value="caseStatusTypeList")
public class CaseStatusTypeList extends EntityQuery<GeographicBoundary> {


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jboss.seam.framework.Query#getEjbql()
	 */
	@Override
	public String getEjbql() {
		return "select caseStatusType from CaseStatusType caseStatusType";
	}
	
}
