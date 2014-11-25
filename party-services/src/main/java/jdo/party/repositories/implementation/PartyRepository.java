package jdo.party.repositories.implementation;

import javax.ejb.Stateful;

import jdo.core.repository.RepositoryTemplate;
import jdo.party.model.Party;

@Stateful
public class PartyRepository extends RepositoryTemplate<Party, Long> implements jdo.party.repositories.PartyRepository {

	public PartyRepository() {
		super(Party.class); 
	}
	
}
