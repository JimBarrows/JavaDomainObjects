package com.nsfwenterprises.biz360.party.model.relationship;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.nsfwenterprises.biz360.model.BaseType;
import com.nsfwenterprises.biz360.party.model.PartyRoleType;

/**
 * This type restricts the parties in a relationship to those parties with the
 * specified roles.
 * 
 * @author jimbarrows
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class RelationshipType extends BaseType {

	public RelationshipType() {
		super();
	}

	public RelationshipType(Long id, Long version, String description) {
		super(id, version, description);
	}

	@ManyToOne(optional = false, targetEntity = PartyRoleType.class)
	@NotNull
	private PartyRoleType fromRoleType;

	@ManyToOne(optional = false, targetEntity = PartyRoleType.class)
	@NotNull
	private PartyRoleType toRoleType;

	public PartyRoleType getFromRoleType() {
		return fromRoleType;
	}

	public void setFromRoleType(PartyRoleType fromRoleType) {
		this.fromRoleType = fromRoleType;
	}

	public PartyRoleType getToRoleType() {
		return toRoleType;
	}

	public void setToRoleType(PartyRoleType toRoleType) {
		this.toRoleType = toRoleType;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
