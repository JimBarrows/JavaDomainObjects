package jdo.ecommerce.model.productdescriptions;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.ecommerce.model.webvisit.ServerHit;
import jdo.model.BasePersistentModel;

@Entity
public class PartyNeed extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Lob
	private String description;

	/**
	 * UUID for CommunicationEvent.
	 * 
	 */
	private UUID discoverdViaCommunicationEvent;

	@ManyToOne
	private ServerHit discoveredViaServerHit;

	/**
	 * UUID for PartyRole.
	 * 
	 */
	private UUID forConsumer;

	/**
	 * UUID for Product.
	 * 
	 */
	private UUID forProduct;

	/**
	 * UUID for ProductCategory.
	 * 
	 */
	private UUID forProductCategory;

	@Temporal(TemporalType.TIMESTAMP)
	private Date identifiedOn;

	@ManyToOne
	private NeedType type;

	public String getDescription() {
		return description;
	}

	public UUID getDiscoverdViaCommunicationEvent() {
		return discoverdViaCommunicationEvent;
	}

	public ServerHit getDiscoveredViaServerHit() {
		return discoveredViaServerHit;
	}

	public UUID getForConsumer() {
		return forConsumer;
	}

	public UUID getForProduct() {
		return forProduct;
	}

	public UUID getForProductCategory() {
		return forProductCategory;
	}

	public Date getIdentifiedOn() {
		return identifiedOn;
	}

	public NeedType getType() {
		return type;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDiscoverdViaCommunicationEvent(UUID discoverdViaCommunicationEvent) {
		this.discoverdViaCommunicationEvent = discoverdViaCommunicationEvent;
	}

	public void setDiscoveredViaServerHit(ServerHit discoveredViaServerHit) {
		this.discoveredViaServerHit = discoveredViaServerHit;
	}

	public void setForConsumer(UUID forConsumer) {
		this.forConsumer = forConsumer;
	}

	public void setForProduct(UUID forProduct) {
		this.forProduct = forProduct;
	}

	public void setForProductCategory(UUID forProductCategory) {
		this.forProductCategory = forProductCategory;
	}

	public void setIdentifiedOn(Date identifiedOn) {
		this.identifiedOn = identifiedOn;
	}

	public void setType(NeedType type) {
		this.type = type;
	}

}
