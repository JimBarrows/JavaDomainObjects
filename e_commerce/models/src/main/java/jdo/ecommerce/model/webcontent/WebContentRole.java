package jdo.ecommerce.model.webcontent;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class WebContentRole extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID of Party.
	 * 
	 */
	private UUID roleOf;

	@ManyToOne
	private WebContentRoleType type;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getRoleOf() {
		return roleOf;
	}

	public WebContentRoleType getType() {
		return type;
	}

	public void setRoleOf(UUID roleOf) {
		this.roleOf = roleOf;
	}

	public void setType(WebContentRoleType type) {
		this.type = type;
	}

}
