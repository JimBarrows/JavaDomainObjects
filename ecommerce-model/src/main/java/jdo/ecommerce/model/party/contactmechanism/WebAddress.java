package jdo.ecommerce.model.party.contactmechanism;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.AssertTrue;

import jdo.ecommerce.model.webvisit.Visit;


/**
 *
 * @author Jim.Barrows@gmail.com
 * @See "The Data Model Resource Book, Revised Edition Volume 2 Figure 2.7 pg 421"
 */
@Entity
public class WebAddress extends ElectronicAddress {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Visit> hostOf;
	
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

	@OneToMany
	public List<Visit> getHostOf() {
		return hostOf;
	}

	public void setHostOf(List<Visit> hostOf) {
		this.hostOf = hostOf;
	}	
	
	
}
