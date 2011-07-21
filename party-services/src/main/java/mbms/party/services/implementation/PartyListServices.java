package mbms.party.services.implementation;

import java.util.List;

import mbmp.party.model.Party;

import org.hibernate.SessionFactory;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This service returns a list of all parties, either the entire list, or
 * paginated. It provides no searching, and no sorting capability.
 * 
 * @author jimbarrows
 * 
 */
@NamedQueries({ @NamedQuery(name = "partyList", query = "from Party"),
		@NamedQuery(name = "partyCount", query = "select count(*) from Party") })
@Service
public class PartyListServices implements mbms.party.services.PartyListServices {

	@Autowired
	private SessionFactory sessionFactory;

	public long partyCount() {
		Session currentSession = sessionFactory.getCurrentSession();
		return (Long)currentSession.getNamedQuery("partyList").uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Party> list(int firstResult, int maxResults) {
		if ( (firstResult < 0) || (maxResults <= 0))
			throw new IllegalArgumentException(
					"First Result and max results must be positive. Max results cannot be 0");
		return sessionFactory.getCurrentSession().getNamedQuery("partyList")
			.setFirstResult(firstResult)
			.setMaxResults(maxResults).list();
	}

	public PartyListServices() {
		super();
	}

	public PartyListServices(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

}
