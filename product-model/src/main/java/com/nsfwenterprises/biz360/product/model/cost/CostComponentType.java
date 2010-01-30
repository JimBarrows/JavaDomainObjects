package com.nsfwenterprises.biz360.product.model.cost;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.model.BaseType;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:28 AM
 */
@Entity
public class CostComponentType extends BaseType{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	private List<EstimatedProductCost> usedToDefine = new ArrayList<EstimatedProductCost>();

	@OneToMany(mappedBy="categorizedBy")
	public List<EstimatedProductCost> getUsedToDefine() {
		return usedToDefine;
	}

	public void setUsedToDefine(List<EstimatedProductCost> usedToDefine) {
		this.usedToDefine = usedToDefine;
	}
	
}