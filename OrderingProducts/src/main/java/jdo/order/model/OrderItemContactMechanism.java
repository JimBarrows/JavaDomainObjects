package jdo.order.model;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class OrderItemContactMechanism extends PersistentEntity {

	private static final long			serialVersionUID	= 1L;

	
	/**UUID for ContactMechanism.
	 * 
	 */
	@NotNull
	private UUID			mechanism;

	/**UUID for ContactMechanismPurposeType.
	 * 
	 */
	@NotNull
	private UUID	type;

	
	public UUID getMechanism() {
		return mechanism;
	}

	
	public UUID getType() {
		return type;
	}

	public void setMechanism(UUID mechanism) {
		this.mechanism = mechanism;
	}

	public void setType(UUID type) {
		this.type = type;
	}
}
