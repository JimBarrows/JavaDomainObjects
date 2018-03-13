package jdo.humanresoures.model.performance;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class PerformanceNote extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Lob
	private String comment;

	@Temporal(TemporalType.DATE)
	private Date communicationDate;

	/**
	 * UUID for PartyRole.
	 * 
	 */
	private UUID forEmployee;

	/**
	 * UUID for PartyRole.
	 * 
	 */
	private UUID fromManger;

	@ManyToOne
	private PerformanceNoteType type;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public String getComment() {
		return comment;
	}

	public Date getCommunicationDate() {
		return communicationDate;
	}

	public UUID getForEmployee() {
		return forEmployee;
	}

	public UUID getFromManger() {
		return fromManger;
	}

	public PerformanceNoteType getType() {
		return type;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setCommunicationDate(Date communicationDate) {
		this.communicationDate = communicationDate;
	}

	public void setForEmployee(UUID forEmployee) {
		this.forEmployee = forEmployee;
	}

	public void setFromManger(UUID fromManger) {
		this.fromManger = fromManger;
	}

	public void setType(PerformanceNoteType type) {
		this.type = type;
	}

}
