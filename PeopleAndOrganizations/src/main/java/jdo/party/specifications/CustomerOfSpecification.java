package jdo.party.specifications;

import java.util.List;

import jdo.core.repository.specification.Specification;
import jdo.party.model.Party;
import jdo.party.model.relationship.CustomerRelationship;
import jdo.party.model.relationship.PartyRelationship;
import jdo.party.model.roles.Customer;

/**
 * @deprecated Don't need this at the moment.
 * @author Jim
 *
 */
public class CustomerOfSpecification implements Specification<Party> {

	private Party vendor;

	public CustomerOfSpecification(Party vendor) {
		this.vendor = vendor;
	}

	@Override
	public boolean isSatisfiedBy(Party party) {
		System.out.println("Vendor: " + vendor.getId() + " Party: " + party.getId() );
		return party.getActingAs().stream().filter(a -> a instanceof Customer)
				.filter(role -> role.getDateTimeRange().isActive())
				.anyMatch(role -> {
					List<PartyRelationship> relationshipsInvolvedIn = role.getRelationshipsInvolvedIn();
					relationshipsInvolvedIn.forEach(r -> System.out.println("Relationship: " + r.getId().toString()));
					return relationshipsInvolvedIn.stream()
							.anyMatch(relationship -> {
								System.out.println( "***** relationship id ******" + relationship.getId().toString());
								return relationship instanceof CustomerRelationship;
							});
				});
//				.anyMatch(cr -> {
//					return cr.getRelationshipsInvolvedIn().stream().anyMatch(rii -> {
//						return rii.getDateTimeRange().isActive();
//					});
//				});
				//
				// return activeCustomerRelationship.anyMatch(acr -> {
				// return acr.getRelationshipsInvolvedIn().stream().anyMatch(rii
				// -> {
				// return ((CustomerRelationship)
				// rii).getRelationshipFrom().getRoleFor().equals(vendor);
				// });
				// });

		// return party.getActingAs().stream().anyMatch(
		// a -> (a instanceof Customer)
		// && a.getDateTimeRange().isActive()
		// && ((Customer)a).getRelationshipsInvolvedIn().stream().anyMatch(
		// relationship -> (relationship instanceof CustomerRelationship)
		// && relationship.getDateTimeRange().isActive()
		// &&
		// ((CustomerRelationship)relationship).getRelationshipFrom().getRoleFor().equals(
		// vendor)));

	}

}
