package jdo.agreement.model.item;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import jdo.product.model.price.PriceComponent;

@Entity
public class AgreementPricingProgram extends AgreementItem {

	private static final long		serialVersionUID	= 1L;

	private List<PriceComponent>	priceComponents;

	@OneToMany
	public List<PriceComponent> getPriceComponents() {
		return priceComponents;
	}

	public void setPriceComponents(List<PriceComponent> priceComponents) {
		this.priceComponents = priceComponents;
	}
}
