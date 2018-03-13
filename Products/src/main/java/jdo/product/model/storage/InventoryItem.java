package jdo.product.model.storage;

import jdo.model.PersistentEntity;
import jdo.product.model.Good;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:31 AM
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class InventoryItem extends PersistentEntity {

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
	private Good						physicalOccurrenceOf;

	
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

	
	public Good getPhysicalOccurrenceOf() {
		return physicalOccurrenceOf;
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

	public void setPhysicalOccurrenceOf(Good physicalOccurrenceOf) {
		this.physicalOccurrenceOf = physicalOccurrenceOf;
	}
}