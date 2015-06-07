package jdo.party.repositories.implementation;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import jdo.core.repository.RepositoryTemplate;
import jdo.party.model.Party;

@Stateful
public class PartyRepository extends RepositoryTemplate<Party, Long> implements jdo.party.repositories.PartyRepository {

	@PersistenceContext(name = "JavaDomainObjects", type = PersistenceContextType.EXTENDED)
	protected EntityManager em;
	
	public PartyRepository() {
		super(Party.class); 
	}

	@Override
	protected EntityManager em() {
		return em;
	}
	
}
