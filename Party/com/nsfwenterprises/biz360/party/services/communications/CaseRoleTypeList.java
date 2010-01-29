package com.nsfwenterprises.biz360.party.services.communications;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.party.model.communication.CaseRoleType;

@SuppressWarnings("serial")
@Name( value="caseRoleTypeList")
public class CaseRoleTypeList extends EntityQuery<CaseRoleType> {


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jboss.seam.framework.Query#getEjbql()
	 */
	@Override
	public String getEjbql() {
		return "select caseRoleType from CaseRoleType caseRoleType";
	}
	
}
