package jdo.core.repository.specification;

import jdo.party.model.PartyRoleType;

public class PartialDescription implements Specification<PartyRoleType> {

	private String description;
	
	@Override
	public boolean isSatisifiedBy(PartyRoleType entity) {		
		return entity.getDescription().toLowerCase().startsWith(description.toLowerCase());
	}

	public PartialDescription(String description) {
		super();
		this.description = description;
	}

}
