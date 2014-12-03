package jdo.party.model.facility;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:30 AM
 * @see "Data Model Resource Book Volume 1 Figure 2.11, page 59"
 */
@Entity
public class FacilityRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private FacilityRoleType	describedBy;

	private Party				forParty;

	private Facility			of;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	/**
	 * @return the describedBy
	 */
	@ManyToOne
	@NotNull
	public FacilityRoleType getDescribedBy() {
		return describedBy;
	}

	/**
	 * @return the forParty
	 */
	@ManyToOne
	public Party getForParty() {
		return forParty;
	}

	/**
	 * @return the of
	 */
	@ManyToOne
	@JoinColumn(name = "ofFacility")
	public Facility getOf() {
		return of;
	}

	/**
	 * @param describedBy
	 *            the describedBy to set
	 */
	public void setDescribedBy(FacilityRoleType describedBy) {
		this.describedBy = describedBy;
	}

	/**
	 * @param forParty
	 *            the forParty to set
	 */
	public void setForParty(Party forParty) {
		this.forParty = forParty;
	}

	/**
	 * @param of
	 *            the of to set
	 */
	public void setOf(Facility of) {
		this.of = of;
	}

}