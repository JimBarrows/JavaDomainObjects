package com.nsfwenterprises.biz360.party.services.communications;

import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import com.nsfwenterprises.biz360.party.model.communication.CaseStatusType;

@SuppressWarnings("serial")
@Name("caseStatusTypeHome")
public class CaseStatusTypeHome extends EntityHome<CaseStatusType> {	
	
	@Factory("caseStatusType")
	public CaseStatusType initCaseRoleType() {
		return getInstance();
	}
}
