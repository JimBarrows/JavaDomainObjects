package mbmp.product.model.feature.interaction;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
 

import mbmp.product.model.Product;
import mbmp.product.model.feature.ProductFeature;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:36 AM
 * @see Data Model Resource Book Volume 1 Figure 3.4, page 77
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ProductFeatureInteraction extends mbmp.model.BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProductFeature aFactorIn;

	private Product applicableWithinTheContextOf;

	private ProductFeature of;

	@ManyToOne
	public ProductFeature getAFactorIn() {
		return aFactorIn;
	}

	@ManyToOne
	public Product getApplicableWithinTheContextOf() {
		return applicableWithinTheContextOf;
	}

	@ManyToOne
	@JoinColumn(name = "productFeatureOf")
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