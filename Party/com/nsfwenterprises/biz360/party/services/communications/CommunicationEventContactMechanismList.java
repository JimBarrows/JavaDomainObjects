package com.nsfwenterprises.biz360.party.services.communications;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.nsfwenterprises.biz360.party.model.communication.CommunicationEvent;
import com.nsfwenterprises.biz360.party.model.communication.CommunicationEventRole;
import com.nsfwenterprises.biz360.party.model.contactmechanism.ContactMechanism;

/**
 * This class executes a query to find all the possible communication mechanisms
 * the parties invovled in a communication event have.
 * 
 * @author jim
 * 
 */
@SuppressWarnings("serial")
@Name("communicationEventContactMechanismList")
public class CommunicationEventContactMechanismList extends
		EntityQuery<ContactMechanism> {

	@In
	private CommunicationEvent communicationEvent;

	@Override
	public String getEjbql() {
		String ejbQl = "select partyCm from PartyContactMechanism partyCm  where partyCm.specifiedFor.id in ( :partyIdList ) ";
		return ejbQl;
	}

	@Override
	protected Query createQuery() {
		Query query = getEntityManager().createQuery(getEjbql());
		query.setParameter("partyIdList", getPartyIdList());
		return query;
	}

	protected List<Long> getPartyIdList() {
		List<Long> idList = new ArrayList<Long>();
		List<CommunicationEventRole> involving = communicationEvent
				.getInvolving();
		for (CommunicationEventRole communicationEventRole : involving) {
			if (communicationEventRole.getForParty() != null) {
				idList.add(communicationEventRole.getForParty().getId());
			}
		}
		if (idList.isEmpty()) {
			idList.add(0l);
		}
		return idList;
	}

}
