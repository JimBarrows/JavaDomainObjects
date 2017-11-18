package jdo.product.model.storage;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:31 AM
 */
@Entity
public class Lot extends PersistentEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Temporal(TemporalType.DATE)
	private Date				creationDate;

	@Temporal(TemporalType.DATE)
	private Date				expirationDate;

	@OneToMany(mappedBy = "partOf")
	private List<InventoryItem>	madeUpOf			= new ArrayList<InventoryItem>();

	@Min(value = 0)
	private long				quantity;

	
	public Date getCreationDate() {
		return creationDate;
	}

	
	public Date getExpirationDate() {
		return expirationDate;
	}

	
	public List<InventoryItem> getMadeUpOf() {
		return madeUpOf;
	}

	
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