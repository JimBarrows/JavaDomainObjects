package mbms.party.services.implementation;


import java.util.List;

import mbmp.party.model.Party;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * This service returns a list of all parties, either the entire list, or
 * paginated. It provides no searching, and no sorting capability.
 * 
 * @author jimbarrows
 * 
 */
@Service
public class PartyListServices implements mbms.party.services.PartyListServices {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(PartyListServices.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(readOnly = true)
	public long partyCount() {
		if (logger.isDebugEnabled()) {
			logger.debug("partyCount() - start"); //$NON-NLS-1$
	}

		Session currentSession = sessionFactory.getCurrentSession();
		long returnlong = (Long) currentSession.createQuery("select count(*) from Party").uniqueResult();
		if (logger.isDebugEnabled()) {
			logger.debug("partyCount() - end - return value=" + returnlong); //$NON-NLS-1$
	}
		return returnlong;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	@Override
	public List<Party> list(int firstResult, int maxResults) {
		if (logger.isDebugEnabled()) {
			logger.debug("list(int firstResult=" + firstResult + ", int maxResults=" + maxResults + ") - start"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

		if ((firstResult < 0) || (maxResults <= 0))
			throw new IllegalArgumentException(
					"First Result and max results must be positive. Max results cannot be 0");
		sessionFactory.getCurrentSession().beginTransaction();
		List<Party> partyList = sessionFactory.getCurrentSession().createQuery("from Party")
				.setFirstResult(firstResult).setMaxResults(maxResults).list();
		sessionFactory.getCurrentSession().getTransaction().commit();

		if (logger.isDebugEnabled()) {
			logger.debug("list(int firstResult, int maxResults) - end - return value=" + partyList); //$NON-NLS-1$
	}
		return partyList;

	}

	public PartyListServices() {
		super();
	}

	public PartyListServices(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

}
