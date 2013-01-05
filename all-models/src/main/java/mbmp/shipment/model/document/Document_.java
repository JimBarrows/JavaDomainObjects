package mbmp.shipment.model.document;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.shipment.model.Shipment;
import mbmp.shipment.model.ShipmentItem;
import mbmp.shipment.model.receipt.ShipmentPackage;

@Generated(value="Dali", date="2013-01-04T22:11:23.220-0700")
@StaticMetamodel(Document.class)
public class Document_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Document, ShipmentItem> forItem;
	public static volatile SingularAttribute<Document, ShipmentPackage> forPackage;
	public static volatile SingularAttribute<Document, Shipment> forShipment;
}
