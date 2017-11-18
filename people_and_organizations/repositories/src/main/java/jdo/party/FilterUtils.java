package jdo.party;

import jdo.party.model.PartyRole;
import jdo.party.model.roles.InternalOrganization;
import jdo.party.model.roles.ParentOrganization;

import java.util.function.Predicate;

public class FilterUtils {

	/**
	 * Convenience method for an anonymous function to filter for the
	 * internalOrganization role.
	 *
	 * @return an anonymous function that filters for the internal organization
	 * role.
	 */
	public static final Predicate<PartyRole> isInternalOrganization() {
		final Predicate<PartyRole> isInternalOrganization = a -> (a instanceof InternalOrganization)
				& a.getDateTimeRange().isActive();
		return isInternalOrganization;
	}

	/**
	 * Convenience method for an anonymous function to filter for the parent
	 * organization role.
	 *
	 * @return and anonymous function that filters for parent organization role.
	 */
	public static final Predicate<PartyRole> isParentOrganization() {
		final Predicate<PartyRole> isParent = a -> (a instanceof ParentOrganization);
		return isParent;
	}
}
