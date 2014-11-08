package jdo.humanresoures.model.performance;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BaseDateRangeModel;
import jdo.party.model.PartyRole;

@Entity
public class PerformanceNote extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String comment;
	
	private Date communicationDate;
	
	private PartyRole forEmployee;
	
	private PartyRole fromManger;
	
	private PerformanceNoteType type;

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

	@ManyToOne
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
