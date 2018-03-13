package jdo.shipment.model;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class ShipmentStatus extends PersistentEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	@Temporal(TemporalType.TIMESTAMP)
	private Date				statusDate;
	@ManyToOne
	private ShipmentStatusType	type;

	
	public Date getStatusDate() {
		return statusDate;
	}

	
	public ShipmentStatusType getType() {
		return type;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public void setType(ShipmentStatusType type) {
		this.type = type;
	}
}
