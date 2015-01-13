package jdo.product.model.feature;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import jdo.model.BasePersistentModel;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:36 AM
 * @see "Data Model Resource Book Volume 1 Figure 3.4, page 77"
 */
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "name") })
public class ProductFeatureCategory extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany
	private List<ProductFeature> categoryFor;

	@Lob
	private String description;

	@NotEmpty
	private String name;

	public List<ProductFeature> getCategoryFor() {
		return categoryFor;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public void setCategoryFor(List<ProductFeature> categoryFor) {
		this.categoryFor = categoryFor;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

}