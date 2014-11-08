package jdo.humanresoures.model.position.fulfillment;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.humanresoures.model.position.Position;
import jdo.party.model.Person;

@Entity
public class PositionFulfillment extends jdo.model.BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Person acceptedBy;
	
	private String comment;
	
	private Position fullfillmentOf;

	public Person getAcceptedBy() {
		return acceptedBy;
	}

	public String getComment() {
		return comment;
	}

	@ManyToOne
	public Position getFullfillmentOf() {
		return fullfillmentOf;
	}

	public void setAcceptedBy(Person acceptedBy) {
		this.acceptedBy = acceptedBy;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setFullfillmentOf(Position fullfillmentOf) {
		this.fullfillmentOf = fullfillmentOf;
	}

}
