package jdo.party.specifications;

import jdo.core.repository.specification.Specification;
import jdo.party.model.Party;
import jdo.party.model.roles.Customer;

public class CustomerSpecification implements Specification<Party> {

	@Override
	public boolean isSatisifiedBy(Party party) {
		return party.getActingAs().stream().anyMatch( a -> (a instanceof Customer));
		
	}

}