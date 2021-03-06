package jdo.product.model.storage;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.model.BasePersistentModel;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:31 AM
 */
@Entity
public class InventoryItemVariance extends BasePersistentModel {

	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private InventoryItem		adjustmentFor;

	@Lob
	private String				comment;

	@ManyToOne
	private Reason				explainedWith;

	@Temporal(TemporalType.DATE)
	private Date				physicalInventoryDate;

	private long				quantity;

	
	public InventoryItem getAdjustmentFor() {
		return adjustmentFor;
	}

	
	public String getComment() {
		return comment;
	}

	
	public Reason getExplainedWith() {
		return explainedWith;
	}

	
	public Date getPhysicalInventoryDate() {
		return physicalInventoryDate;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setAdjustmentFor(InventoryItem adjustmentFor) {
		this.adjustmentFor = adjustmentFor;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setExplainedWith(Reason explainedWith) {
		this.explainedWith = explainedWith;
	}

	public void setPhysicalInventoryDate(Date physicalInventoryDate) {
		this.physicalInventoryDate = physicalInventoryDate;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

}