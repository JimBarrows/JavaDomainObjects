package jdo.accounting.model.asset;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

@Entity
public class FixedAssetDepreciationMethod extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private DepreciationMethod	depreciationMethod;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@ManyToOne
	public DepreciationMethod getDepreciationMethod() {
		return depreciationMethod;
	}

	public void setDepreciationMethod(DepreciationMethod depreciationMethod) {
		this.depreciationMethod = depreciationMethod;
	}

}
