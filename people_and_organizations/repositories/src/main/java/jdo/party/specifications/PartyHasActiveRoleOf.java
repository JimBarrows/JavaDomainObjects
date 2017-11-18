package jdo.party.specifications;

import jdo.core.repository.specification.AbstractSpecification;
import jdo.party.model.Party;
import jdo.party.model.PartyRole;

/**
 * A party has an active role if it has a role of the appropriate type, and it's
 * active.
 *
 * @author Jim
 */
public class PartyHasActiveRoleOf extends AbstractSpecification<Party> {

	/**
	 * The role this specification expects.
	 */
	private Class<? extends PartyRole> expectedRole;

	/**
	 * Create it.
	 *
	 * @param newExpectedRole Required.
	 */
	public PartyHasActiveRoleOf(final Class<? extends PartyRole> newExpectedRole) {
		super();
		this.expectedRole = newExpectedRole;
	}

	@Override
	public final boolean isSatisfiedBy(final Party entity) {
		return entity.getActingAs().stream().anyMatch(
				partyRole -> partyRole.getClass().isInstance(expectedRole) && partyRole.getDateTimeRange().isActive());
	}

	/**
	 * Convenience method to avoid the clutter of a new statement.
	 *
	 * @param role the role the party needs to have
	 * @return A new PartyHasActiveRoleOf class.
	 */
	public static final PartyHasActiveRoleOf partyHasActiveRoleOf(final Class<? extends PartyRole> role) {
		return new PartyHasActiveRoleOf(role);
	}
}
