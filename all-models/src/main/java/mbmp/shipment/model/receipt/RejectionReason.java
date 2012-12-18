package mbmp.shipment.model.receipt;

import javax.persistence.Entity;
import javax.persistence.Lob;

import mbmp.model.BasePersistentModel;

import org.hibernate.validator.NotEmpty;

@Entity
public class RejectionReason extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String description;

	@Lob
	@NotEmpty
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
