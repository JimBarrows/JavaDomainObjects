package com.bizondemand.biz360.invoice_shipment.invoice.model;

import com.nsfwenterprises.biz360.shipment.model.ShipmentItem;

import javax.persistence.OneToMany;
import java.util.List;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 10:23:30 AM
 */
public class InvoiceItem extends com.nsfwenterprises.biz360.invoice.model.InvoiceItem{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ShipmentItem> billingForShipmentItem;

    @OneToMany
	public List<ShipmentItem> getBillingForShipmentItem() {
		return billingForShipmentItem;
	}

    public void setBillingForShipmentItem(List<ShipmentItem> billingFor) {
		this.billingForShipmentItem = billingFor;
	}
}
