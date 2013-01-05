package mbmp.product.model.supplier;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import mbmp.model.BaseDateRangeModel;
import mbmp.party.model.PartyRole;
import mbmp.party.model.facility.Facility;
import mbmp.party.model.geographic_boundary.GeographicBoundary;
import mbmp.product.model.Good;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:37 AM
 * @see "Data Model Resource Book Volume 1 Figure 3.5, page 82"
 */
@Entity
public class ReorderGuideline extends BaseDateRangeModel {

	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	private Facility basedOnFacility;
	private GeographicBoundary basedOnGeographicBoundary;
	private PartyRole basedOnInternalOrganization;
	private Good guidelineFor;
	private long reorderLevel;
	private long reorderQuantity;

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

	public void setBasedOnGeographicBoundary(
			GeographicBoundary basedOnGeographicBoundary) {
		this.basedOnGeographicBoundary = basedOnGeographicBoundary;
	}

	public void setBasedOnInternalOrganization(
			PartyRole basedOnInternalOrganization) {
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
