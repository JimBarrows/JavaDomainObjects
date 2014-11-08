package jdo.product.model.storage;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.model.BasePersistentModel;
import jdo.party.model.facility.Facility;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:28 AM
 */
@Entity
public class Container extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ContainerType describedBy;

	private Facility locatedAt;

	private List<InventoryItem> storageContainerFor = new ArrayList<InventoryItem>();

	@ManyToOne
	public ContainerType getDescribedBy() {
		return describedBy;
	}

	@ManyToOne
	public Facility getLocatedAt() {
		return locatedAt;
	}

	@OneToMany(mappedBy = "locatedWithin")
	public List<InventoryItem> getStorageContainerFor() {
		return storageContainerFor;
	}

	public void setDescribedBy(ContainerType describedBy) {
		this.describedBy = describedBy;
	}

	public void setLocatedAt(Facility locatedAt) {
		this.locatedAt = locatedAt;
	}

	public void setStorageContainerFor(List<InventoryItem> storageContainerFor) {
		this.storageContainerFor = storageContainerFor;
	}
}