package jdo.product.model.supplier;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.apache.logging.log4j.core.net.Facility;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;
import jdo.product.model.Good;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:37 AM
 * @see "Data Model Resource Book Volume 1 Figure 3.5, page 82"
 */
@Entity
public class ReorderGuideline extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** UUID for the Facility this is for.
	 * 
	 */
	private UUID basedOnFacility;
	/**UUID for the GeographicBoundary this is for.
	 * 
	 */
	private UUID basedOnGeographicBoundary;
	/**
	 * UUID for the PartyRole this is for.
	 */
	private UUID basedOnInternalOrganization;
	@ManyToOne
	private Good guidelineFor;
	private long reorderLevel;
	private long reorderQuantity;
	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getBasedOnFacility() {
		return basedOnFacility;
	}

	public UUID getBasedOnGeographicBoundary() {
		return basedOnGeographicBoundary;
	}

	public UUID getBasedOnInternalOrganization() {
		return basedOnInternalOrganization;
	}

	public Good getGuidelineFor() {
		return guidelineFor;
	}

	public long getReorderLevel() {
		return reorderLevel;
	}

	public long getReorderQuantity() {
		return reorderQuantity;
	}

	public void setBasedOnFacility(UUID basedOnFacility) {
		this.basedOnFacility = basedOnFacility;
	}

	public void setBasedOnGeographicBoundary(
			UUID basedOnGeographicBoundary) {
		this.basedOnGeographicBoundary = basedOnGeographicBoundary;
	}

	public void setBasedOnInternalOrganization(
			UUID basedOnInternalOrganization) {
		this.basedOnInternalOrganization = basedOnInternalOrganization;
	}

	public void setGuidelineFor(Good guidelineFor) {
		this.guidelineFor = guidelineFor;
	}

	public void setReorderLevel(long reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public void setReorderQuantity(long reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}

}
