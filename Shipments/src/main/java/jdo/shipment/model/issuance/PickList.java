package jdo.shipment.model.issuance;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

@Entity
public class PickList extends PersistentEntity {

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
