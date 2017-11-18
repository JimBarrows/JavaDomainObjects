package jdo.shipment.model.receipt;

import jdo.model.PersistentEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class RejectionReason extends PersistentEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	@Lob
	@NotEmpty
	private String				description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
