package jdo.product.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.xml.crypto.Data;

import jdo.product.model.identificationcode.GoodIdentification;
import jdo.product.model.storage.InventoryItem;
import jdo.product.model.supplier.SupplierProduct;

/**
 * The model for a tangible product.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:30 AM
 * @see Data Model Resource Book Volume 1 Figure 3.1, page 71
 * @see Data Model Resource Book Volume 1 Figure 3.3, page 75
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Good extends Product {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "physicalOccurrenceOf")
	private List<InventoryItem> genericDescriptionFor = new ArrayList<InventoryItem>();

	/**
	 * A good can be identified by more then one id value.
	 * 
	 */
	@OneToMany(mappedBy = "identifierFor")
	private List<GoodIdentification> identifiedBy = new ArrayList<GoodIdentification>();

	@OneToMany(mappedBy = "validSupplierFor")
	private List<SupplierProduct> suppliedThru = new ArrayList<SupplierProduct>();

	public List<InventoryItem> getGenericDescriptionFor() {
		return genericDescriptionFor;
	}

	public List<GoodIdentification> getIdentifiedBy() {
		return identifiedBy;
	}

	public List<SupplierProduct> getSuppliedThru() {
		return suppliedThru;
	}

	public void setGenericDescriptionFor(
			List<InventoryItem> genericDescriptionFor) {
		this.genericDescriptionFor = genericDescriptionFor;
	}

	public void setIdentifiedBy(List<GoodIdentification> identifiedBy) {
		this.identifiedBy = identifiedBy;
	}

	public void setSuppliedThru(List<SupplierProduct> suppliedThru) {
		this.suppliedThru = suppliedThru;
	}
}