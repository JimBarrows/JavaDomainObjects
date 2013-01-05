package mbmp.product.model.feature;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import mbmp.model.BasePersistentModel;

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

	private List<ProductFeature> categoryFor;

	private String description;
	
	private String name;

	@OneToMany
	public List<ProductFeature> getCategoryFor() {
		return categoryFor;
	}

	@NotNull
	@Lob
	public String getDescription() {
		return description;
	}

	@NotEmpty
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