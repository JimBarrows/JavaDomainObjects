package jdo.party.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import jdo.model.BaseType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PartyRoleType extends BaseType{

	public PartyRoleType(String description) {
		super(description);
	}

	public PartyRoleType() {
		super();
	}

	public PartyRoleType(Long id, Long version, String description) {
		super(id, version, description);
	}
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PartyRoleType [description=");
		builder.append(description);
		builder.append(", id=");
		builder.append(id);
		builder.append(", version=");
		builder.append(version);
		builder.append("]");
		return builder.toString();
	}
}
