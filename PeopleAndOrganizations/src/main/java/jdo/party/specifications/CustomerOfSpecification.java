package jdo.party.specifications;

import jdo.core.repository.specification.Specification;
import jdo.party.model.Party;
import jdo.party.model.relationship.CustomerRelationship;
import jdo.party.model.roles.Customer;

public class CustomerOfSpecification implements Specification<Party> {

	private Party vendor ;
	
	public CustomerOfSpecification(Party vendor ) {
		this.vendor = vendor;
	}
	@Override
	public boolean isSatisfiedBy(Party party) {
		return party.getActingAs().stream().anyMatch( 
				a -> (a instanceof Customer)
					&& a.getDateTimeRange().isActive() 
					&& ((Customer)a).getRelationshipsInvolvedIn().stream().anyMatch( 
							relationship -> (relationship instanceof CustomerRelationship) 
											&& relationship.getDateTimeRange().isActive() 
											&& ((CustomerRelationship)relationship).getRelationshipFrom().getRoleFor().equals( vendor)));
		
	}
	
}
