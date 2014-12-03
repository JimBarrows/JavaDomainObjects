package jdo.core.repository.specification;

import jdo.party.model.Party;

public class CustomerSpecification implements Specification<Party> {

	@Override
	public boolean isSatisifiedBy(Party entity) {
		
		return true;
	}

}
