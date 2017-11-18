package jdo.request.model;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class RequestRole extends PersistentEntity {

	private static final long serialVersionUID = 1L;
	/**
	 * UUID of the Party.
	 * 
	 */
	private UUID party;
	@ManyToOne
	private RequestRoleType roleType;

	public UUID getParty() {
		return party;
	}

	public RequestRoleType getRoleType() {
		return roleType;
	}

	public void setParty(UUID party) {
		this.party = party;
	}

	public void setRoleType(RequestRoleType roleType) {
		this.roleType = roleType;
	}
}
