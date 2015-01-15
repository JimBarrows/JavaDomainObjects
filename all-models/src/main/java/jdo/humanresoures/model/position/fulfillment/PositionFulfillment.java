package jdo.humanresoures.model.position.fulfillment;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import jdo.humanresoures.model.position.Position;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.Person;

@Entity
public class PositionFulfillment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private Person						acceptedBy;

	@Lob
	private String						comment;

	@ManyToOne
	private Position					fullfillmentOf;

	@Embedded
	private DateTimeRange			dateTimeRange			= new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public Person getAcceptedBy() {
		return acceptedBy;
	}

	public String getComment() {
		return comment;
	}

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
