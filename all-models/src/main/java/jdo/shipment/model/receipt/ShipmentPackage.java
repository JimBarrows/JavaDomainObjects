package jdo.shipment.model.receipt;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import jdo.model.BasePersistentModel;

@Entity
public class ShipmentPackage extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	private List<PackagingContent>	composedOf;

	private List<ShipmentReceipt>	consistingOf;

	@OneToMany
	public List<PackagingContent> getComposedOf() {
		return composedOf;
	}

	@OneToMany
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
