package jdo.shipment.model.issuance;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;

import jdo.model.BasePersistentModel;
import jdo.product.model.storage.InventoryItem;

@Entity
public class PicklistItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private List<ItemIssuance>	issueList;

	private PickList			partOf;

	private InventoryItem		pickedFrom;

	private int					quantity;

	@OneToMany
	public List<ItemIssuance> getIssueList() {
		return issueList;
	}

	@ManyToOne
	public PickList getPartOf() {
		return partOf;
	}

	@ManyToOne
	public InventoryItem getPickedFrom() {
		return pickedFrom;
	}

	@Min(1)
	public int getQuantity() {
		return quantity;
	}

	public void setIssueList(List<ItemIssuance> issueList) {
		this.issueList = issueList;
	}

	public void setPartOf(PickList partOf) {
		this.partOf = partOf;
	}

	public void setPickedFrom(InventoryItem pickedFrom) {
		this.pickedFrom = pickedFrom;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
