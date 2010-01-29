package com.nsfwenterprises.biz360.party.services.communications;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.party.model.communication.Case;

@SuppressWarnings("serial")
@Name("caseList")
public class CaseList extends EntityQuery<Case> {

	private String description="";	

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jboss.seam.framework.Query#getEjbql()
	 */
	@Override
	public String getEjbql() {
		return "select aCase from Case aCase" + " where "
				+ "(lower(aCase.description) like lower(concat('" + description
				+ "','%')))";
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
