package jdo.party.repositories.implementation;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.core.repository.RepositoryTemplate;
import jdo.party.model.Party;

@Stateful
public class PartyRepository extends RepositoryTemplate<Party, Long> implements jdo.party.repositories.PartyRepository {

	@PersistenceContext(name = "PeopleAndOrganizations")
	protected EntityManager em;
	
	public PartyRepository() {
		super(Party.class); 
	}

	@Override
	protected EntityManager entityManager() {
		return em;
	}
	
}
