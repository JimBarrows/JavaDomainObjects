package jdo.shipment.model.document;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.shipment.model.Shipment;
import jdo.shipment.model.ShipmentItem;
import jdo.shipment.model.receipt.ShipmentPackage;

@Generated(value="Dali", date="2014-11-07T22:13:43.522-0700")
@StaticMetamodel(Document.class)
public class Document_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Document, ShipmentItem> forItem;
	public static volatile SingularAttribute<Document, ShipmentPackage> forPackage;
	public static volatile SingularAttribute<Document, Shipment> forShipment;
}
