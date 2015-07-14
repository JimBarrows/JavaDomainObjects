package jdo.humanresoures.model.position.fulfillment;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;

import jdo.fields.DateTimeRange;
import jdo.humanresoures.model.position.Position;
import jdo.model.BasePersistentModel;

@Entity
public class PositionFulfillment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID for Person.
	 * 
	 */
	private UUID acceptedBy;

	@Lob
	private String comment;

	private Position fullfillmentOf;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getAcceptedBy() {
		return acceptedBy;
	}

	public String getComment() {
		return comment;
	}

	public Position getFullfillmentOf() {
		return fullfillmentOf;
	}

	public void setAcceptedBy(UUID acceptedBy) {
		this.acceptedBy = acceptedBy;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setFullfillmentOf(Position fullfillmentOf) {
		this.fullfillmentOf = fullfillmentOf;
	}

}
