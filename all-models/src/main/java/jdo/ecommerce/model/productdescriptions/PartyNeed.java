package jdo.ecommerce.model.productdescriptions;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.ecommerce.model.webvisit.ServerHit;
import jdo.model.BasePersistentModel;
import jdo.party.model.PartyRole;
import jdo.party.model.communication.CommunicationEvent;
import jdo.product.model.Product;
import jdo.product.model.category.ProductCategory;

@Entity
public class PartyNeed extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	@Lob
	private String							description;

	@ManyToOne
	private CommunicationEvent	discoverdViaCommunicationEvent;

	@ManyToOne
	private ServerHit						discoveredViaServerHit;

	@ManyToOne
	private PartyRole						forConsumer;

	@ManyToOne
	private Product							forProduct;

	@ManyToOne
	private ProductCategory			forProductCategory;

	@Temporal(TemporalType.TIMESTAMP)
	private Date								identifiedOn;

	@ManyToOne
	private NeedType						type;

	public String getDescription() {
		return description;
	}

	public CommunicationEvent getDiscoverdViaCommunicationEvent() {
		return discoverdViaCommunicationEvent;
	}

	public ServerHit getDiscoveredViaServerHit() {
		return discoveredViaServerHit;
	}

	public PartyRole getForConsumer() {
		return forConsumer;
	}

	public Product getForProduct() {
		return forProduct;
	}

	public ProductCategory getForProductCategory() {
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

	public void setDiscoverdViaCommunicationEvent(CommunicationEvent discoverdViaCommunicationEvent) {
		this.discoverdViaCommunicationEvent = discoverdViaCommunicationEvent;
	}

	public void setDiscoveredViaServerHit(ServerHit discoveredViaServerHit) {
		this.discoveredViaServerHit = discoveredViaServerHit;
	}

	public void setForConsumer(PartyRole forConsumer) {
		this.forConsumer = forConsumer;
	}

	public void setForProduct(Product forProduct) {
		this.forProduct = forProduct;
	}

	public void setForProductCategory(ProductCategory forProductCategory) {
		this.forProductCategory = forProductCategory;
	}

	public void setIdentifiedOn(Date identifiedOn) {
		this.identifiedOn = identifiedOn;
	}

	public void setType(NeedType type) {
		this.type = type;
	}

}
