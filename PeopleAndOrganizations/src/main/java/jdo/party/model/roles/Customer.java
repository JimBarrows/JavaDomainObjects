package jdo.party.model.roles;

import java.time.ZonedDateTime;
import java.util.Optional;

import javax.persistence.Entity;

import jdo.party.model.Party;
import jdo.party.model.PartyRole;

@Entity
public class Customer extends PartyRole {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public Customer() {
		super();
	}

	public Customer(final Party party) {
		super(party);
	}

	public Customer(final Party party, final ZonedDateTime from) {
		super(party, from);
	}

	public Customer(final Party party, final ZonedDateTime from, final Optional<ZonedDateTime> thru) {
		super(party, from, thru);
	}

}
