package com.nsfwenterprises.biz360.party.services.communications;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.party.model.communication.CommunicationEventRoleType;

@SuppressWarnings("serial")
@Name( value="communicationEventRoleTypeList")
public class CommunicationEventRoleTypeList extends EntityQuery<CommunicationEventRoleType> {


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jboss.seam.framework.Query#getEjbql()
	 */
	@Override
	public String getEjbql() {
		return "select type from CommunicationEventRoleType type";
	}
	
}
