package com.nsfwenterprises.biz360.accounting.model.transaction;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.accounting.model.asset.FixedAsset;

@Entity
public class Depreciation extends InternalAccountingTransaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private FixedAsset forFixedAsset;

	@ManyToOne
	public FixedAsset getForFixedAsset() {
		return forFixedAsset;
	}

	public void setForFixedAsset(FixedAsset forFixedAsset) {
		this.forFixedAsset = forFixedAsset;
	}
}