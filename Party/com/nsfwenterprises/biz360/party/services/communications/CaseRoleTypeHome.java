package com.nsfwenterprises.biz360.party.services.communications;

import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import com.nsfwenterprises.biz360.party.model.communication.CaseRoleType;

@SuppressWarnings("serial")
@Name("caseRoleTypeHome")
public class CaseRoleTypeHome extends EntityHome<CaseRoleType> {

	
	@Factory("caseRoleType")
	public CaseRoleType initCaseRoleType() {
		return getInstance();
	}
}
