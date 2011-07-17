package mbmp.party.model.relationship;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import mbmp.model.BaseType;
import mbmp.party.model.PartyRoleType;

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

	public RelationshipType(Long id, Long version, String description,
			PartyRoleType fromRoleType, PartyRoleType toRoleType) {
		super(id, version, description);
		this.fromRoleType = fromRoleType;
		this.toRoleType = toRoleType;
	}

	public RelationshipType() {
		super();
	}
	

	public RelationshipType(String comment, PartyRoleType fromRoleType,
			PartyRoleType toRoleType) {
		super(comment);
		this.fromRoleType = fromRoleType;
		this.toRoleType = toRoleType;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RelationshipType [fromRoleType=");
		builder.append(fromRoleType);
		builder.append(", toRoleType=");
		builder.append(toRoleType);
		builder.append(", id=");
		builder.append(id);
		builder.append(", version=");
		builder.append(version);
		builder.append(", getDescription()=");
		builder.append(getDescription());
		builder.append("]");
		return builder.toString();
	}

}
