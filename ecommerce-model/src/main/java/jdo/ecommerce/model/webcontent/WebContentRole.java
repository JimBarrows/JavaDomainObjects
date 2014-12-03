package jdo.ecommerce.model.webcontent;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Entity
public class WebContentRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Party roleOf;
	
	private WebContentRoleType type;
	
	private DateTimeRange	dateTimeRange	= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@ManyToOne
	public Party getRoleOf() {
		return roleOf;
	}

	@ManyToOne
	public WebContentRoleType getType() {
		return type;
	}

	public void setRoleOf(Party roleOf) {
		this.roleOf = roleOf;
	}

	public void setType(WebContentRoleType type) {
		this.type = type;
	}

}
