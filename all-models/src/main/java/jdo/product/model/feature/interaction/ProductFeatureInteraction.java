package jdo.product.model.feature.interaction;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
 


import jdo.product.model.Product;
import jdo.product.model.feature.ProductFeature;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:36 AM
 * @see Data Model Resource Book Volume 1 Figure 3.4, page 77
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ProductFeatureInteraction extends jdo.model.BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private ProductFeature aFactorIn;

	@ManyToOne
	private Product applicableWithinTheContextOf;

	@ManyToOne
	@JoinColumn(name = "productFeatureOf")
	private ProductFeature of;

	
	public ProductFeature getAFactorIn() {
		return aFactorIn;
	}

	
	public Product getApplicableWithinTheContextOf() {
		return applicableWithinTheContextOf;
	}
	
	public ProductFeature getOf() {
		return of;
	}

	public void setAFactorIn(ProductFeature factorIn) {
		aFactorIn = factorIn;
	}

	public void setApplicableWithinTheContextOf(
			Product applicableWithinTheContextOf) {
		this.applicableWithinTheContextOf = applicableWithinTheContextOf;
	}

	public void setOf(ProductFeature of) {
		this.of = of;
	}
}