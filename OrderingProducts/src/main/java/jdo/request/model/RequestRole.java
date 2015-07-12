package jdo.request.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;

@Entity
public class RequestRole extends BasePersistentModel {

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
