package jdo.order.model;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class OrderContactMechanism extends PersistentEntity {

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
