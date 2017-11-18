package jdo.product.model.supplier;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;
import jdo.product.model.Good;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.xml.crypto.Data;
import java.util.UUID;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:38 AM
 * @see Data Model Resource Book Volume 1 Figure 3.5, page 82
 */
@Entity
public class SupplierProduct extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Lob
	private String comment;
	@ManyToOne
	private PreferenceType furtherDescribedBy;
	@ManyToOne
	private RatingType ratedBy;

	private long standardLeadTime;
	/**UUID this Organization is for.
	 * 
	 */
	private UUID suppliedBy;
	@ManyToOne
	private Good validSupplierFor;
	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public String getComment() {
		return comment;
	}

	public PreferenceType getFurtherDescribedBy() {
		return furtherDescribedBy;
	}

	public RatingType getRatedBy() {
		return ratedBy;
	}

	public long getStandardLeadTime() {
		return standardLeadTime;
	}

	public UUID getSuppliedBy() {
		return suppliedBy;
	}

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

	public void setSuppliedBy(UUID suppliedBy) {
		this.suppliedBy = suppliedBy;
	}

	public void setValidSupplierFor(Good validSupplierFor) {
		this.validSupplierFor = validSupplierFor;
	}

}