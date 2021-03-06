package jdo.product.model.cost;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import jdo.model.BaseType;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:28 AM
 */
@Entity
public class CostComponentType extends BaseType {

	/**
	 * 
	 */
	private static final long						serialVersionUID	= 1L;

	@OneToMany(mappedBy = "categorizedBy")
	private List<EstimatedProductCost>	usedToDefine			= new ArrayList<EstimatedProductCost>();

	public List<EstimatedProductCost> getUsedToDefine() {
		return usedToDefine;
	}

	public void setUsedToDefine(List<EstimatedProductCost> usedToDefine) {
		this.usedToDefine = usedToDefine;
	}

}