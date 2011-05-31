package mbms.party.services.implementation;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;

import com.nsfwenterprises.biz360.party.model.Party;

/**This class is responsible for returning a list of all parties, either the entire list, or paginated.  It provides no searching, and no sorting capability.
 * 
 * @author jimbarrows
 *
 */
@NamedQuery(name = "partyList", query = "from Party")
@Stateless
public class PartyListServices implements mbms.party.services.PartyListServices {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Party> list() {
		return em.createNamedQuery("partyList").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Party> list(int from, int through) {
		if ((through < from) || (from < 0) || (through < 0))
			throw new IllegalArgumentException(
					"From must less then through, and both number must be positive");
		return em.createNamedQuery("partyList")
			.setFirstResult(from)
			.setMaxResults(through - from)
			.getResultList();
	}

	public PartyListServices() {
		super();
	}

	public PartyListServices(EntityManager em) {
		super();
		this.em = em;
	}

}
