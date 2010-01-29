package com.nsfwenterprises.biz360.party.services.communications;

import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import com.nsfwenterprises.biz360.party.model.communication.CommunicationEventPurposeType;

@SuppressWarnings("serial")
@Name("communicationEventPurposeHome")
public class CommunicationEventPurposeHome extends
		EntityHome<CommunicationEventPurposeType> {

	@Factory("communicationEventPurpose")
	public CommunicationEventPurposeType initCommunicationEventPurpose() {
		return getInstance();
	}

}
