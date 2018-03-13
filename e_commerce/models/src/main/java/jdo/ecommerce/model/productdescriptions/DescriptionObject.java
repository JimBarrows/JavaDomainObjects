package jdo.ecommerce.model.productdescriptions;

import jdo.model.PersistentEntity;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Entity
public class DescriptionObject extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID of ProductFeature.
	 * 
	 */
	@ElementCollection
	private List<UUID> describes;

	private String description;

	/**
	 * UUID for Product.
	 * 
	 */
	@ElementCollection
	private List<UUID> forProduct;

	private File location;

	private String name;

	/**
	 * UUID of Party.
	 * 
	 */
	@ElementCollection
	private List<UUID> ofParty;

	@ManyToOne
	private ObjectType type;

	@OneToMany
	private List<ObjectPurpose> usedFor;

	@OneToMany
	private List<ObjectUsage> usedWithin;

	public List<UUID> getDescribes() {
		return describes;
	}

	public String getDescription() {
		return description;
	}

	public List<UUID> getForProduct() {
		return forProduct;
	}

	public File getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public List<UUID> getOfParty() {
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

	public void setDescribes(List<UUID> describes) {
		this.describes = describes;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setForProduct(List<UUID> forProduct) {
		this.forProduct = forProduct;
	}

	public void setLocation(File location) {
		this.location = location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOfParty(List<UUID> ofParty) {
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
