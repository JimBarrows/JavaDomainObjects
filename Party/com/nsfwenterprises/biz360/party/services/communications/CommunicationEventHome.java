package com.nsfwenterprises.biz360.party.services.communications;

import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import com.nsfwenterprises.biz360.party.model.communication.CommunicationEvent;
import com.nsfwenterprises.biz360.party.model.communication.CommunicationEventRole;

@SuppressWarnings("serial")
@Name("communicationEventHome")
public class CommunicationEventHome extends EntityHome<CommunicationEvent> {

	@In(required=false)
	private CaseHome caseHome;
		
	public void addCommunicationEventRole() {
		getInstance().addCommunicationEventRole( new CommunicationEventRole());
	}


	@Factory("communicationEvent")
	public CommunicationEvent communicationEventFactory() {
		if( caseHome != null && ! caseHome.getInstance().getEncompassing().contains(getInstance())) {
			getInstance().getAsPartOf().add( caseHome.getInstance());
			caseHome.getInstance().getEncompassing().add( getInstance());
		}
		return getInstance();
	}
	
	@Factory("communicationEventFormReturnLink")
	public String returnLinkFactory() {
		String returnLink;
		if (caseHome !=null) {
			returnLink = "/caseForm.xhtml";
		} else {
			returnLink = "/communicationEventList.xhtml";
		}
		return returnLink;
	}

}
