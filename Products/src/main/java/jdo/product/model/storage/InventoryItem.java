package jdo.product.model.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.apache.logging.log4j.core.net.Facility;

import jdo.model.BasePersistentModel;
import jdo.product.model.Good;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:31 AM
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class InventoryItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	@OneToMany(mappedBy = "adjustmentFor")
	private List<InventoryItemVariance>	adjustedThru		= new ArrayList<InventoryItemVariance>();

	@ManyToOne
	private InventoryItemStatusType		inTheStateOf;

	/**UUID for the facility this item is located in.
	 * 
	 */	
	private UUID					locatedAt;

	@ManyToOne
	private Container					locatedWithin;

	@ManyToOne
	private Lot							partOf;

	@ManyToOne
	private Good						physicalOccurenceOf;

	
	public List<InventoryItemVariance> getAdjustedThru() {
		return adjustedThru;
	}

	
	public InventoryItemStatusType getInTheStateOf() {
		return inTheStateOf;
	}

	
	public UUID getLocatedAt() {
		return locatedAt;
	}

	
	public Container getLocatedWithin() {
		return locatedWithin;
	}

	
	public Lot getPartOf() {
		return partOf;
	}

	
	public Good getPhysicalOccurenceOf() {
		return physicalOccurenceOf;
	}

	public void setAdjustedThru(List<InventoryItemVariance> adjustedThru) {
		this.adjustedThru = adjustedThru;
	}

	public void setInTheStateOf(InventoryItemStatusType inTheStateOf) {
		this.inTheStateOf = inTheStateOf;
	}

	public void setLocatedAt(UUID locatedAt) {
		this.locatedAt = locatedAt;
	}

	public void setLocatedWithin(Container locatedWithin) {
		this.locatedWithin = locatedWithin;
	}

	public void setPartOf(Lot partOf) {
		this.partOf = partOf;
	}

	public void setPhysicalOccurenceOf(Good physicalOccurenceOf) {
		this.physicalOccurenceOf = physicalOccurenceOf;
	}
}