package jdo.product.model.supplier;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;
import jdo.party.model.facility.Facility;
import jdo.party.model.geographic_boundary.GeographicBoundary;
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
	private static final long	serialVersionUID	= 1L;
	private Facility			basedOnFacility;
	private GeographicBoundary	basedOnGeographicBoundary;
	private PartyRole			basedOnInternalOrganization;
	private Good				guidelineFor;
	private long				reorderLevel;
	private long				reorderQuantity;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@ManyToOne
	public Facility getBasedOnFacility() {
		return basedOnFacility;
	}

	@ManyToOne
	public GeographicBoundary getBasedOnGeographicBoundary() {
		return basedOnGeographicBoundary;
	}

	@ManyToOne
	public PartyRole getBasedOnInternalOrganization() {
		return basedOnInternalOrganization;
	}

	@ManyToOne
	public Good getGuidelineFor() {
		return guidelineFor;
	}

	public long getReorderLevel() {
		return reorderLevel;
	}

	@Min(0)
	public long getReorderQuantity() {
		return reorderQuantity;
	}

	public void setBasedOnFacility(Facility basedOnFacility) {
		this.basedOnFacility = basedOnFacility;
	}

	public void setBasedOnGeographicBoundary(GeographicBoundary basedOnGeographicBoundary) {
		this.basedOnGeographicBoundary = basedOnGeographicBoundary;
	}

	public void setBasedOnInternalOrganization(PartyRole basedOnInternalOrganization) {
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
