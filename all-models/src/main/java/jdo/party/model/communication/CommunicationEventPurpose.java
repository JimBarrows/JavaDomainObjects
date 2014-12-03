package jdo.party.model.communication;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

@Entity
public class CommunicationEventPurpose extends BasePersistentModel {

	private static final long				serialVersionUID	= 1L;

	private CommunicationEventPurposeType	type;

	private DateTimeRange					dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@NotNull
	public CommunicationEventPurposeType getType() {
		return type;
	}

	public void setType(CommunicationEventPurposeType type) {
		this.type = type;
	}
}
