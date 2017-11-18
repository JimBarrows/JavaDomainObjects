package jdo.shipment.model.receipt;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class ShipmentPackage extends PersistentEntity {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;
	@OneToMany
	private List<PackagingContent>	composedOf;
	@OneToMany
	private List<ShipmentReceipt>	consistingOf;

	
	public List<PackagingContent> getComposedOf() {
		return composedOf;
	}

	
	public List<ShipmentReceipt> getConsistingOf() {
		return consistingOf;
	}

	public void setComposedOf(List<PackagingContent> composedOf) {
		this.composedOf = composedOf;
	}

	public void setConsistingOf(List<ShipmentReceipt> consistingOf) {
		this.consistingOf = consistingOf;
	}
}
