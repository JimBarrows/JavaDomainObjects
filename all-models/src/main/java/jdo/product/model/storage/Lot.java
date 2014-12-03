package jdo.product.model.storage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

import jdo.model.BasePersistentModel;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:31 AM
 */
@Entity
public class Lot extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private Date				creationDate;

	private Date				expirationDate;

	private List<InventoryItem>	madeUpOf			= new ArrayList<InventoryItem>();

	private long				quantity;

	@Temporal(TemporalType.DATE)
	public Date getCreationDate() {
		return creationDate;
	}

	@Temporal(TemporalType.DATE)
	public Date getExpirationDate() {
		return expirationDate;
	}

	@OneToMany(mappedBy = "partOf")
	public List<InventoryItem> getMadeUpOf() {
		return madeUpOf;
	}

	@Min(value = 0)
	public long getQuantity() {
		return quantity;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public void setMadeUpOf(List<InventoryItem> madeUpOf) {
		this.madeUpOf = madeUpOf;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

}