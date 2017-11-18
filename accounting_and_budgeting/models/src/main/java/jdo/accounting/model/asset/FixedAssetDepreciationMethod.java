package jdo.accounting.model.asset;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class FixedAssetDepreciationMethod extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private DepreciationMethod	depreciationMethod;

	@Embedded
	private DateTimeRange		dateTimeRange		= new DateTimeRange();
	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}
	
	public DepreciationMethod getDepreciationMethod() {
		return depreciationMethod;
	}

	public void setDepreciationMethod(DepreciationMethod depreciationMethod) {
		this.depreciationMethod = depreciationMethod;
	}

}
