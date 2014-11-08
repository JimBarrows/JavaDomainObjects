package jdo.agreement.model.term;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.AssertTrue;

import jdo.agreement.model.Agreement;
import jdo.agreement.model.item.AgreementItem;
import jdo.model.BaseDateRangeModel;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class AgreementTerm extends BaseDateRangeModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Agreement agreement;
	
	private AgreementItem agreementItem;
	
	private BigDecimal value;
	
	@ManyToOne
	public Agreement getAgreement() {
		return agreement;
	}
	
	@ManyToOne
	public AgreementItem getAgreementItem() {
		return agreementItem;
	}
	public BigDecimal getValue() {
		return value;
	}
	
	@AssertTrue
	public boolean onlyAgreementOrItem() {
		return (agreement == null && agreementItem != null) || (agreement != null && agreementItem == null);
	}

	public void setAgreement(Agreement agreement) {
		this.agreement = agreement;
	}

	public void setAgreementItem(AgreementItem agreementItem) {
		this.agreementItem = agreementItem;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
}
