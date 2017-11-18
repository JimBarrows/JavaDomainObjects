package jdo.humanresoures.model.benefit;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class BenefitType extends PersistentEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private String				description;

	private int					employerPercentage;

	private String				name;

	@OneToMany
	private List<PartyBenefit>	partyBenefits;

	public String getDescription() {
		return description;
	}

	public int getEmployerPercentage() {
		return employerPercentage;
	}

	public String getName() {
		return name;
	}
	
	public List<PartyBenefit> getPartyBenefits() {
		return partyBenefits;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setEmployerPercentage(int employerPercentage) {
		this.employerPercentage = employerPercentage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPartyBenefits(List<PartyBenefit> partyBenefits) {
		this.partyBenefits = partyBenefits;
	}

}
