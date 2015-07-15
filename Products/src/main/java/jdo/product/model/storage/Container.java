package jdo.product.model.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.model.BasePersistentModel;

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
	private static final long		serialVersionUID		= 1L;

	@ManyToOne
	private ContainerType				describedBy;

	/**UUID to the Facility this container is in.
	 * 
	 */
	private UUID						locatedAt;

	@OneToMany(mappedBy = "locatedWithin")
	private List<InventoryItem>	storageContainerFor	= new ArrayList<InventoryItem>();

	public ContainerType getDescribedBy() {
		return describedBy;
	}

	public UUID getLocatedAt() {
		return locatedAt;
	}

	public List<InventoryItem> getStorageContainerFor() {
		return storageContainerFor;
	}

	public void setDescribedBy(ContainerType describedBy) {
		this.describedBy = describedBy;
	}

	public void setLocatedAt(UUID locatedAt) {
		this.locatedAt = locatedAt;
	}

	public void setStorageContainerFor(List<InventoryItem> storageContainerFor) {
		this.storageContainerFor = storageContainerFor;
	}
}