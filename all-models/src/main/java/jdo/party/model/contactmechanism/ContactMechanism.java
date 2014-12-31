package jdo.party.model.contactmechanism;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
 


import jdo.model.BasePersistentModel;
import jdo.party.model.PartyContactMechanism;
import jdo.party.model.facility.FacilityContactMechanism;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:27 AM
 * @see Data Model Resource Book Volume 1 Figure 2.10, page 55
 * @see Data Model Resource Book Volume 1 Figure 2.11, page 59
 */
@SuppressWarnings("serial")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ContactMechanism extends BasePersistentModel {

	@OneToMany(mappedBy = "specifiedVia", cascade = CascadeType.ALL)
	private List<FacilityContactMechanism> usedByFacilities = new ArrayList<FacilityContactMechanism>();

	@OneToMany(mappedBy = "specifiedVia", cascade = CascadeType.ALL)
	private List<PartyContactMechanism> usedByParties = new ArrayList<PartyContactMechanism>();

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (!(object instanceof ContactMechanism)) {
			return false;
		}
		ContactMechanism rhs = (ContactMechanism) object;
		return new EqualsBuilder().appendSuper(super.equals(object)).append(
				this.usedByParties, rhs.usedByParties).append(
				this.usedByFacilities, rhs.usedByFacilities).isEquals();
	}

	/**
	 * @return the usedByFacilities
	 */	
	public List<FacilityContactMechanism> getUsedByFacilities() {
		return usedByFacilities;
	}
	
	public List<PartyContactMechanism> getUsedByParties() {
		return usedByParties;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(1581071507, -125000905).appendSuper(
				super.hashCode()).append(this.usedByParties).append(
				this.usedByFacilities).toHashCode();
	}

	/**
	 * @param usedByFacilities
	 *            the usedByFacilities to set
	 */

	public void setUsedByFacilities(
			List<FacilityContactMechanism> usedByFacilities) {
		this.usedByFacilities = usedByFacilities;
	}

	public void setUsedByParties(List<PartyContactMechanism> usedByParties) {
		this.usedByParties = usedByParties;
	}

}