package com.nsfwenterprises.biz360.ecommerce.model.product;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nsfwenterprises.biz360.ecommerce.model.webvisit.ServerHit;
import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.party.model.communication.CommunicationEvent;
import com.nsfwenterprises.biz360.party.model.role.Consumer;
import com.nsfwenterprises.biz360.product.model.Product;
import com.nsfwenterprises.biz360.product.model.category.ProductCategory;

@Entity
public class PartyNeed extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String description;
	
	private CommunicationEvent discoverdViaCommunicationEvent;
	
	private ServerHit discoveredViaServerHit;
	
	private Consumer forConsumer;
	
	private Product forProduct;
	
	private ProductCategory forProductCategory;
	
	private Date identifiedOn;
	
	private NeedType type;

	@Lob
	public String getDescription() {
		return description;
	}

	@ManyToOne
	public CommunicationEvent getDiscoverdViaCommunicationEvent() {
		return discoverdViaCommunicationEvent;
	}

	@ManyToOne
	public ServerHit getDiscoveredViaServerHit() {
		return discoveredViaServerHit;
	}

	@ManyToOne
	public Consumer getForConsumer() {
		return forConsumer;
	}

	@ManyToOne
	public Product getForProduct() {
		return forProduct;
	}

	@ManyToOne
	public ProductCategory getForProductCategory() {
		return forProductCategory;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getIdentifiedOn() {
		return identifiedOn;
	}

	@ManyToOne
	public NeedType getType() {
		return type;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDiscoverdViaCommunicationEvent(
			CommunicationEvent discoverdViaCommunicationEvent) {
		this.discoverdViaCommunicationEvent = discoverdViaCommunicationEvent;
	}

	public void setDiscoveredViaServerHit(ServerHit discoveredViaServerHit) {
		this.discoveredViaServerHit = discoveredViaServerHit;
	}

	public void setForConsumer(Consumer forConsumer) {
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
