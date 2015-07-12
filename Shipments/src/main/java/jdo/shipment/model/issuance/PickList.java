package jdo.shipment.model.issuance;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.model.BasePersistentModel;

@Entity
public class PickList extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date				createdOn;

	@OneToMany
	private List<PicklistItem>	items;

	
	public Date getCreatedOn() {
		return createdOn;
	}
	
	public List<PicklistItem> getItems() {
		return items;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public void setItems(List<PicklistItem> items) {
		this.items = items;
	}
}
