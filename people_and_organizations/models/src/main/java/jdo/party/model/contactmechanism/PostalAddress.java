package jdo.party.model.contactmechanism;

import jdo.party.model.PartyPostalAddress;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:34 AM
 * @see Data Model Resource Book Volume 1 Figure 2.8, page 50
 */
@SuppressWarnings("serial")
@Entity
public class PostalAddress extends ContactMechanism {

	@NotEmpty
	@Lob	
	private String										address;

	@Lob
	private String										directions;

	@OneToMany(mappedBy="locatedAt")
	private List<PartyPostalAddress>	locationFor	= new ArrayList<PartyPostalAddress>();

	@ManyToMany(mappedBy = "boundaryFor")
	private List<GeographicBoundary>	within			= new ArrayList<GeographicBoundary>();

	protected void addGeographicBoundary(GeographicBoundary newGeographicBoundary) {
		if (!within.contains(newGeographicBoundary)) {
			within.add(newGeographicBoundary);
		}
	}

	/**
	 * @return the address1
	 */
	public String getAddress() {
		return address;
	}

	public String getDirections() {
		return directions;
	}

	/**
	 * @return the locationFor
	 */

	public List<PartyPostalAddress> getLocationFor() {
		return locationFor;
	}

	/**
	 * @return the within
	 */

	public List<GeographicBoundary> getWithin() {
		return within;
	}

	/**
	 * @param address1
	 *          the address1 to set
	 */
	public void setAddress(String address1) {
		this.address = address1;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	/**
	 * @param locationFor
	 *          the locationFor to set
	 */
	public void setLocationFor(List<PartyPostalAddress> locationFor) {
		this.locationFor = locationFor;
	}

	/**
	 * @param within the within to set
	 */
	public void setWithin(List<GeographicBoundary> within) {
		this.within = within;
	}
}