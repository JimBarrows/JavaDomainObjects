package com.nsfwenterprises.biz360.product.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.xml.crypto.Data;

import com.nsfwenterprises.biz360.product.model.identificationCode.GoodIdentification;
import com.nsfwenterprises.biz360.product.model.storage.InventoryItem;
import com.nsfwenterprises.biz360.product.model.supplier.SupplierProduct;

/** The model for a tangible product.  
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:30 AM
 * @see Data Model Resource Book Volume 1 Figure 3.1, page 71
 * @see Data Model Resource Book Volume 1 Figure 3.3, page 75
 */
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class Good extends Product {

	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;

	private List<InventoryItem> genericDescriptionFor = new ArrayList<InventoryItem>();
	
	/**A good can be identified by more then one id value.
	 * 
	 */	
	private List<GoodIdentification> identifiedBy = new ArrayList<GoodIdentification>();
	
	
	private List<SupplierProduct> suppliedThru = new ArrayList<SupplierProduct>();

	@OneToMany(mappedBy="physicalOccurenceOf")
	public List<InventoryItem> getGenericDescriptionFor() {
		return genericDescriptionFor;
	}

	@OneToMany(mappedBy="identifierFor")
	public List<GoodIdentification> getIdentifiedBy() {
		return identifiedBy;
	}

	@OneToMany(mappedBy="validSupplierFor")
	public List<SupplierProduct> getSuppliedThru() {
		return suppliedThru;
	}

	public void setGenericDescriptionFor(List<InventoryItem> genericDescriptionFor) {
		this.genericDescriptionFor = genericDescriptionFor;
	}

	public void setIdentifiedBy(List<GoodIdentification> identifiedBy) {
		this.identifiedBy = identifiedBy;
	}

	public void setSuppliedThru(List<SupplierProduct> suppliedThru) {
		this.suppliedThru = suppliedThru;
	}
}