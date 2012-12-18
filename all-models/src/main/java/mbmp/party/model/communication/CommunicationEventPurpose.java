package mbmp.party.model.communication;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import mbmp.model.BaseDateRangeModel;

@Entity
public class CommunicationEventPurpose extends BaseDateRangeModel {

	private static final long serialVersionUID = 1L;
	
	private CommunicationEventPurposeType type;

	@NotNull
	public CommunicationEventPurposeType getType() {
		return type;
	}

	public void setType(CommunicationEventPurposeType type) {
		this.type = type;
	}
}
