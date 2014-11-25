package jdo.party.repositories.implementation;

import javax.ejb.Stateful;

import jdo.core.repository.RepositoryTemplate;
import jdo.party.model.PartyRoleType;

@Stateful
public class PartyRoleTypeRepository extends RepositoryTemplate<PartyRoleType, Long> implements
		jdo.party.repositories.PartyRoleTypeRepository {

	public PartyRoleTypeRepository() {
		super(PartyRoleType.class);
	}

}
