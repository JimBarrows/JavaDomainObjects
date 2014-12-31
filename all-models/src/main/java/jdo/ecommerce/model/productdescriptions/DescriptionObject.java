package jdo.ecommerce.model.productdescriptions;

import java.io.File;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;
import jdo.product.model.Product;
import jdo.product.model.feature.ProductFeature;

@Entity
public class DescriptionObject extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	@OneToMany
	private List<ProductFeature>	describes;

	private String					description;

	@OneToMany
	private List<Product>			forProduct;

	private File					location;

	private String					name;

	@OneToMany
	private List<Party>				ofParty;

	@ManyToOne
	private ObjectType				type;

	@OneToMany
	private List<ObjectPurpose>		usedFor;

	@OneToMany
	private List<ObjectUsage>		usedWithin;
	
	public List<ProductFeature> getDescribes() {
		return describes;
	}

	public String getDescription() {
		return description;
	}

	
	public List<Product> getForProduct() {
		return forProduct;
	}

	public File getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	
	public List<Party> getOfParty() {
		return ofParty;
	}

	public ObjectType getType() {
		return type;
	}

	
	public List<ObjectPurpose> getUsedFor() {
		return usedFor;
	}
	
	public List<ObjectUsage> getUsedWithin() {
		return usedWithin;
	}

	public void setDescribes(List<ProductFeature> describes) {
		this.describes = describes;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setForProduct(List<Product> forProduct) {
		this.forProduct = forProduct;
	}

	public void setLocation(File location) {
		this.location = location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOfParty(List<Party> ofParty) {
		this.ofParty = ofParty;
	}

	public void setType(ObjectType type) {
		this.type = type;
	}

	public void setUsedFor(List<ObjectPurpose> usedFor) {
		this.usedFor = usedFor;
	}

	public void setUsedWithin(List<ObjectUsage> usedWithin) {
		this.usedWithin = usedWithin;
	}

}
