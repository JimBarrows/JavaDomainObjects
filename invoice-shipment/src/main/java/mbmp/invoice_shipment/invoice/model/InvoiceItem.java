package mbmp.invoice_shipment.invoice.model;

import java.util.List;

import javax.persistence.OneToMany;

import mbmp.shipment.model.ShipmentItem;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 10:23:30 AM
 */
public class InvoiceItem extends mbmp.invoice.model.InvoiceItem{

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
