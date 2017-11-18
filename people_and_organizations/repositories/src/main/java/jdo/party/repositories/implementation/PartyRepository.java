package jdo.party.repositories.implementation;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.party.model.Party;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.UUID;

@Stateful
public class PartyRepository extends DatabaseRepositoryTemplate<Party, UUID> implements jdo.party.repositories.PartyRepository {

	@PersistenceContext(name = "PeopleAndOrganizations", type=PersistenceContextType.EXTENDED)
	protected EntityManager em;
	
	public PartyRepository() {
		super(Party.class); 
	}

	@Override
	protected EntityManager entityManager() {
		return em;
	}
	
}
