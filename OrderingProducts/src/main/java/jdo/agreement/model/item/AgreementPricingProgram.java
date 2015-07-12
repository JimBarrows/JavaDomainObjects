package jdo.agreement.model.item;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class AgreementPricingProgram extends AgreementItem {

	private static final long		serialVersionUID	= 1L;

	/**List of PriceComponent UUID's.
	 * 
	 */
	@OneToMany
	private List<UUID>	priceComponents;
	
	public List<UUID> getPriceComponents() {
		return priceComponents;
	}

	public void setPriceComponents(List<UUID> priceComponents) {
		this.priceComponents = priceComponents;
	}
}
