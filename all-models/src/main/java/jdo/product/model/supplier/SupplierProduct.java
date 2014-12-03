package jdo.product.model.supplier;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.Organization;
import jdo.product.model.Good;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:38 AM
 * @see Data Model Resource Book Volume 1 Figure 3.5, page 82
 */
@Entity
public class SupplierProduct extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private String				comment;

	private PreferenceType		furtherDescribedBy;

	private RatingType			ratedBy;

	private long				standardLeadTime;

	private Organization		suppliedBy;

	private Good				validSupplierFor;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@NotNull
	public String getComment() {
		return comment;
	}

	@ManyToOne
	public PreferenceType getFurtherDescribedBy() {
		return furtherDescribedBy;
	}

	@ManyToOne
	public RatingType getRatedBy() {
		return ratedBy;
	}

	public long getStandardLeadTime() {
		return standardLeadTime;
	}

	@ManyToOne
	public Organization getSuppliedBy() {
		return suppliedBy;
	}

	@ManyToOne
	public Good getValidSupplierFor() {
		return validSupplierFor;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setFurtherDescribedBy(PreferenceType furtherDescribedBy) {
		this.furtherDescribedBy = furtherDescribedBy;
	}

	public void setRatedBy(RatingType ratedBy) {
		this.ratedBy = ratedBy;
	}

	public void setStandardLeadTime(long standardLeadTime) {
		this.standardLeadTime = standardLeadTime;
	}

	public void setSuppliedBy(Organization suppliedBy) {
		this.suppliedBy = suppliedBy;
	}

	public void setValidSupplierFor(Good validSupplierFor) {
		this.validSupplierFor = validSupplierFor;
	}

}