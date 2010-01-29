package com.nsfwenterprises.biz360.humanresoures.model.position.type;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.Range;

import com.nsfwenterprises.biz360.humanresoures.model.position.ValidResponsibility;
import com.nsfwenterprises.biz360.humanresoures.model.position.salary.PositionTypeRate;
import com.nsfwenterprises.biz360.model.BaseType;
import com.nsfwenterprises.biz360.party.model.role.Union;

@Entity
public class PositionType extends BaseType {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int benefitPercent;
	
	private List<PositionTypeRate> rates;
	
	private String title;
	
	private List<PositionTypeClass> typeClasses;
	
	private Union union;
	
	private List<ValidResponsibility> validResponsibilities;

	@Range(min=0, max=100)
	public int getBenefitPercent() {
		return benefitPercent;
	}

	@OneToMany
	public List<PositionTypeRate> getRates() {
		return rates;
	}

	public String getTitle() {
		return title;
	}

	@OneToMany
	public List<PositionTypeClass> getTypeClasses() {
		return typeClasses;
	}

	@ManyToOne
	public Union getUnion() {
		return union;
	}

	@OneToMany
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

	public void setUnion(Union union) {
		this.union = union;
	}

	public void setValidResponsibilities(
			List<ValidResponsibility> validResponsibilities) {
		this.validResponsibilities = validResponsibilities;
	}

}
