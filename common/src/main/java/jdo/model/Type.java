package jdo.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

/**
 * There are a lot of user definable type, this is the base class for them all.
 * 
 * @author Jim Barrows
 * 
 */
@MappedSuperclass
public class Type extends PersistentEntity {

	@NotEmpty
	@Column(nullable = false)
	protected String	description;

	public Type(UUID id, Long version, String description) {
		super(id, version);
		this.description = description;
	}

	public Type(String description) {
		super();
		this.description = description;
	}

	public Type() {
		super();
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Type [description=" + description + ", id=" + getId() + ", version=" + getVersion() + "]";
	}

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
}
