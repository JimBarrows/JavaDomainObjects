package jdo.party.repositories.implementation;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import jdo.core.repository.RepositoryTemplate;
import jdo.party.model.Party;

@Stateful
public class PartyRepository extends RepositoryTemplate<Party>implements jdo.party.repositories.PartyRepository {

	@PersistenceContext(name = "PeopleAndOrganizations", type = PersistenceContextType.EXTENDED)
	protected EntityManager em;

	public PartyRepository() {
		super(Party.class);
	}

	@Override
	protected EntityManager entityManager() {
		return em;
	}

}
