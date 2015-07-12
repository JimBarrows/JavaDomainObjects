package jdo.requirement.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class ProductRequirement extends Requirement {

	private static final long serialVersionUID = 1L;
	
	/**UUID of the Product.
	 * 
	 */
	private UUID requesting;
	
	@OneToMany(mappedBy="productRequirement")
	private List<DesiredFeature> specifying;

	public UUID getRequesting() {
		return requesting;
	}

	public ProductRequirement() {
		super();
	}

	public List<DesiredFeature> getSpecifying() {
		return specifying;
	}

	public void setRequesting(final UUID requesting) {
		this.requesting = requesting;
	}

	public void setSpecifying(final List<DesiredFeature> specifying) {
		this.specifying = specifying;
	}
}
