package com.nsfwenterprises.biz360.party.services.communications;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.party.model.communication.CommunicationEvent;

@SuppressWarnings("serial")
@Name("communicationEventList")
public class CommunicationEventList extends EntityQuery<CommunicationEvent> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jboss.seam.framework.Query#getEjbql()
	 */
	@Override
	public String getEjbql() {
		return "select event from CommunicationEvent event";
	}

}
