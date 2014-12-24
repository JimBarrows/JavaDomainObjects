package jdo.party.specifications;

import jdo.core.repository.specification.Specification;
import jdo.party.model.Party;

public class CustomerSpecification implements Specification<Party> {

	@Override
	public boolean isSatisifiedBy(Party entity) {
		
		return true;
	}

}
