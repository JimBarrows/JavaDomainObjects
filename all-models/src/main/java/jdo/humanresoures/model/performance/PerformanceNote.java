package jdo.humanresoures.model.performance;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;

@Entity
public class PerformanceNote extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Lob
	private String comment;

	@Temporal(TemporalType.DATE)
	private Date communicationDate;

	@ManyToOne
	private PartyRole forEmployee;

	@ManyToOne
	private PartyRole fromManger;

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

	public PartyRole getForEmployee() {
		return forEmployee;
	}

	public PartyRole getFromManger() {
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

	public void setForEmployee(PartyRole forEmployee) {
		this.forEmployee = forEmployee;
	}

	public void setFromManger(PartyRole fromManger) {
		this.fromManger = fromManger;
	}

	public void setType(PerformanceNoteType type) {
		this.type = type;
	}

}
