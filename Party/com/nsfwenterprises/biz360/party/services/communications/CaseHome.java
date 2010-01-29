package com.nsfwenterprises.biz360.party.services.communications;

import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import com.nsfwenterprises.biz360.party.model.communication.Case;
import com.nsfwenterprises.biz360.party.model.communication.CaseRole;

@SuppressWarnings("serial")
@Name("caseHome")
public class CaseHome extends EntityHome<Case> {

	@Factory
	public Case getCase() {
		return getInstance();
	}
	
	public void addCaseRole() {
		CaseRole caseRole = new CaseRole();
		getInstance().addCaseRole( caseRole);
	}
	
	public void deleteCaseRole(CaseRole caseRole) {
		
		getInstance().removeCaseRole( caseRole);
		getEntityManager().remove(caseRole);
		
	}
	
}
