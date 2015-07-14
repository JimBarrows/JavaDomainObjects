package jdo.agreement.model.term;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.AssertTrue;

import jdo.agreement.model.Agreement;
import jdo.agreement.model.item.AgreementItem;
import jdo.fields.DateTimeRange;
import jdo.fields.Money;
import jdo.model.BasePersistentModel;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class AgreementTerm extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private Agreement					agreement;

	@ManyToOne
	private AgreementItem			agreementItem;

	@Embedded
	private Money							value;

	@Embedded
	private DateTimeRange			dateTimeRange			= new DateTimeRange();

	@AssertTrue
	public boolean onlyAgreementOrItem() {
		return (agreement == null && agreementItem != null) || (agreement != null && agreementItem == null);
	}

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public Agreement getAgreement() {
		return agreement;
	}

	public AgreementItem getAgreementItem() {
		return agreementItem;
	}

	public Money getValue() {
		return value;
	}

	public void setAgreement(Agreement agreement) {
		this.agreement = agreement;
	}

	public void setAgreementItem(AgreementItem agreementItem) {
		this.agreementItem = agreementItem;
	}

	public void setValue(Money value) {
		this.value = value;
	}
}
