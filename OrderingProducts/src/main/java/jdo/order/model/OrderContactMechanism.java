package jdo.order.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;

@Entity
public class OrderContactMechanism extends BasePersistentModel {

	private static final long			serialVersionUID	= 1L;
	@ManyToOne
	private Order order;
	
	/**UUID of the contactMechanism.
	 * 
	 */
	private UUID			contactMechanism;
	
	/** UUID of the ContactMechanismPurposeType.
	 * 
	 */
	private UUID	usedFor;

	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public UUID getContactMechanism() {
		return contactMechanism;
	}
	
	public UUID getUsedFor() {
		return usedFor;
	}

	public void setContactMechanism(UUID contactMechanism) {
		this.contactMechanism = contactMechanism;
	}

	public void setUsedFor(UUID usedFor) {
		this.usedFor = usedFor;
	}
}
