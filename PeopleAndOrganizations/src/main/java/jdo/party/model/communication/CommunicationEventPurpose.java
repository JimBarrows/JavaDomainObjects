package jdo.party.model.communication;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;

@Entity
public class CommunicationEventPurpose extends BasePersistentModel {

	private static final long				serialVersionUID	= 1L;

	@NotNull
	@ManyToOne
	private CommunicationEventPurposeType	type;

	@Embedded
	private DateTimeRange					dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	
	public CommunicationEventPurposeType getType() {
		return type;
	}

	public void setType(CommunicationEventPurposeType type) {
		this.type = type;
	}
}
