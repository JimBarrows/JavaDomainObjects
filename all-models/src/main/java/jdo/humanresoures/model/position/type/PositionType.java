package jdo.humanresoures.model.position.type;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.humanresoures.model.position.ValidResponsibility;
import jdo.humanresoures.model.position.salary.PositionTypeRate;
import jdo.model.BaseType;
import jdo.party.model.PartyRole;

import org.hibernate.validator.constraints.Range;

@Entity
public class PositionType extends BaseType {

	/**
	 * 
	 */
	private static final long					serialVersionUID	= 1L;

	@Range(min = 0, max = 100)
	private int												benefitPercent;

	@OneToMany
	private List<PositionTypeRate>		rates;

	private String										title;

	@OneToMany
	private List<PositionTypeClass>		typeClasses;

	@ManyToOne
	private PartyRole									union;

	@OneToMany
	private List<ValidResponsibility>	validResponsibilities;

	public int getBenefitPercent() {
		return benefitPercent;
	}

	public List<PositionTypeRate> getRates() {
		return rates;
	}

	public String getTitle() {
		return title;
	}

	public List<PositionTypeClass> getTypeClasses() {
		return typeClasses;
	}

	public PartyRole getUnion() {
		return union;
	}

	public List<ValidResponsibility> getValidResponsibilities() {
		return validResponsibilities;
	}

	public void setBenefitPercent(int benefitPercent) {
		this.benefitPercent = benefitPercent;
	}

	public void setRates(List<PositionTypeRate> rates) {
		this.rates = rates;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTypeClasses(List<PositionTypeClass> typeClasses) {
		this.typeClasses = typeClasses;
	}

	public void setUnion(PartyRole union) {
		this.union = union;
	}

	public void setValidResponsibilities(List<ValidResponsibility> validResponsibilities) {
		this.validResponsibilities = validResponsibilities;
	}

}
