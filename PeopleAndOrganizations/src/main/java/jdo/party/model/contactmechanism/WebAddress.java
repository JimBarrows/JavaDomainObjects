package jdo.party.model.contactmechanism;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.UUID;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.AssertTrue;

/**
 * @author Jim.Barrows@gmail.com
 * @See "The Data Model Resource Book, Revised Edition Volume 2 Figure 2.7 pg 421"
 */
@Entity
public class WebAddress extends ElectronicAddress {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	/** A list of visit uuids.
	 * 
	 */
	@ElementCollection
	private List<UUID>				hostOf;

	@AssertTrue
	public boolean addressIsUrl() {
		try {
			new URL(getAddress());
			return true;
		} catch (MalformedURLException e) {
			return false;
		}
	}

	@Transient
	public URL getUrl() {
		try {
			return new URL(getAddress());
		} catch (MalformedURLException e) {
			return null;
		}
	}

	public List<UUID> getHostOf() {
		return hostOf;
	}

	public void setHostOf(List<UUID> hostOf) {
		this.hostOf = hostOf;
	}

}
