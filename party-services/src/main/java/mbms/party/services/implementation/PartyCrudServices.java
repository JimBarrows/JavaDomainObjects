package mbms.party.services.implementation;

import javax.ejb.Remove;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.nsfwenterprises.biz360.party.model.Party;

/**Provides the 4 basic crud services, and not much else.
 * 
 * @author jimbarrows
 *
 */
@Stateless
public class PartyCrudServices implements mbms.party.services.PartyCrudServices {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Party create(Party party) {
		em.persist(party);
		return party;
	}

	@Override
	public Party read(Long id) {
		return em.find(Party.class, id);
	}

	@Override
	public Party update(Party party) {
		return em.merge(party);
	}

	@Remove
	@Override
	public void delete(Party party) {
		em.remove(party);

	}

}
