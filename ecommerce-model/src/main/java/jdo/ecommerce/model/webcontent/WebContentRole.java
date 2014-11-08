package jdo.ecommerce.model.webcontent;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BaseDateRangeModel;
import jdo.party.model.Party;

@Entity
public class WebContentRole extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Party roleOf;
	
	private WebContentRoleType type;

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
