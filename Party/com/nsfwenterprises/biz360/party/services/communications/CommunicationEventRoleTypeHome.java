package com.nsfwenterprises.biz360.party.services.communications;

import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import com.nsfwenterprises.biz360.party.model.communication.CommunicationEventRoleType;

@SuppressWarnings("serial")
@Name("communicationEventRoleTypeHome")
public class CommunicationEventRoleTypeHome extends EntityHome<CommunicationEventRoleType> {

	@Factory("communicationEventRoleType")
	public CommunicationEventRoleType communicationEventRoleTypeFactory() {
		return getInstance();
	}

}
