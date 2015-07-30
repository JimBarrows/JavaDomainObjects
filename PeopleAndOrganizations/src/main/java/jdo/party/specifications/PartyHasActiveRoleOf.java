package jdo.party.specifications;

import jdo.core.repository.specification.AbstractSpecification;
import jdo.party.model.Party;
import jdo.party.model.PartyRole;

/**
 * A party has an active role if it has a role of the appropriate type, and it's
 * active.
 * 
 * @author Jim
 *
 */
public class PartyHasActiveRoleOf extends AbstractSpecification<Party> {

	private Class<? extends PartyRole> expectedRole;

	public PartyHasActiveRoleOf(Class<? extends PartyRole> expectedRole) {
		super();
		this.expectedRole = expectedRole;
	}

	@Override
	public boolean isSatisfiedBy(Party entity) {
		return entity.getActingAs().stream().anyMatch(
				partyRole -> partyRole.getClass().isInstance(expectedRole) && partyRole.getDateTimeRange().isActive());
	}

	public static final PartyHasActiveRoleOf partyHasActiveRoleOf(Class<? extends PartyRole> role) {
		return new PartyHasActiveRoleOf(role);
	}
}
