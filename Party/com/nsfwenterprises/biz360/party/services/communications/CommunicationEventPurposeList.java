package com.nsfwenterprises.biz360.party.services.communications;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.party.model.communication.CommunicationEventPurposeType;

@SuppressWarnings("serial")
@Name("communicationEventPurposeList")
public class CommunicationEventPurposeList extends EntityQuery<CommunicationEventPurposeType> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jboss.seam.framework.Query#getEjbql()
	 */
	@Override
	public String getEjbql() {
		return "select communicationEventPurpose from CommunicationEventPurposeType communicationEventPurpose";
	}

}
