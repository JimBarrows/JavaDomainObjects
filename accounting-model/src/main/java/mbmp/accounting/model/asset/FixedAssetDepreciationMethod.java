package mbmp.accounting.model.asset;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;

@Entity
public class FixedAssetDepreciationMethod extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private DepreciationMethod depreciationMethod;

	@ManyToOne
	public DepreciationMethod getDepreciationMethod() {
		return depreciationMethod;
	}

	public void setDepreciationMethod(DepreciationMethod depreciationMethod) {
		this.depreciationMethod = depreciationMethod;
	}

}
