package jdo.shipment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.model.BasePersistentModel;

@Entity
public class ShipmentStatus extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private Date				statusDate;

	private ShipmentStatusType	type;

	@Temporal(TemporalType.TIMESTAMP)
	public Date getStatusDate() {
		return statusDate;
	}

	@ManyToOne
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
