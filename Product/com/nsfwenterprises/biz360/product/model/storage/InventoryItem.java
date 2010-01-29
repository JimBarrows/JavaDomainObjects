package com.nsfwenterprises.biz360.product.model.storage;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.party.model.facility.Facility;
import com.nsfwenterprises.biz360.product.model.Good;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:31 AM
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class InventoryItem extends BasePersistentModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private List<InventoryItemVariance> adjustedThru = new ArrayList<InventoryItemVariance>();

	
	private InventoryItemStatusType inTheStateOf;
	
	private Facility locatedAt;
	
	private Container locatedWithin;
	
	private Lot partOf;
	
	
	private Good physicalOccurenceOf;

	@OneToMany(mappedBy="adjustmentFor")
	public List<InventoryItemVariance> getAdjustedThru() {
		return adjustedThru;
	}

	@ManyToOne
	public InventoryItemStatusType getInTheStateOf() {
		return inTheStateOf;
	}

	@ManyToOne
	public Facility getLocatedAt() {
		return locatedAt;
	}

	@ManyToOne
	public Container getLocatedWithin() {
		return locatedWithin;
	}

	@ManyToOne
	public Lot getPartOf() {
		return partOf;
	}

	@ManyToOne
	public Good getPhysicalOccurenceOf() {
		return physicalOccurenceOf;
	}

	public void setAdjustedThru(List<InventoryItemVariance> adjustedThru) {
		this.adjustedThru = adjustedThru;
	}

	public void setInTheStateOf(InventoryItemStatusType inTheStateOf) {
		this.inTheStateOf = inTheStateOf;
	}

	public void setLocatedAt(Facility locatedAt) {
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