package com.nsfwenterprises.biz360.party.model.facility;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.crypto.Data;

import org.hibernate.validator.NotNull;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:29 AM
 * @see Data Model Resource Book Volume 1 Figure 2.11, page 59
 * @see Data Model Resource Book Volume 1 Figure 3.5, page 82
 */
@Entity
public class Facility extends BasePersistentModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<FacilityContactMechanism> contactedVia = new ArrayList<FacilityContactMechanism>();
	
	private String description;
		
	private List<FacilityRole> involving = new ArrayList<FacilityRole>();
	
	
	private List<Facility> madeUpOf = new ArrayList<Facility>();
	
	
	private Facility partOf;
	
	/**
	 * @return the contactedVia
	 */
	@OneToMany
	public List<FacilityContactMechanism> getContactedVia() {
		return contactedVia;
	}

	/**
	 * @return the description
	 */
	@NotNull
	public String getDescription() {
		return description;
	}

	/**
	 * @return the involving
	 */
	@OneToMany
	public List<FacilityRole> getInvolving() {
		return involving;
	}

	/**
	 * @return the madeUpOf
	 */
	@OneToMany
	public List<Facility> getMadeUpOf() {
		return madeUpOf;
	}

	/**
	 * @return the partOf
	 */
	@ManyToOne
	public Facility getPartOf() {
		return partOf;
	}

	/**
	 * @param contactedVia
	 *            the contactedVia to set
	 */
	public void setContactedVia(List<FacilityContactMechanism> contactedVia) {
		this.contactedVia = contactedVia;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param facilityId
	 *            the facilityId to set
	 */
	public void setFacilityId(Long facilityId) {
		this.id = facilityId;
	}

	/**
	 * @param involving
	 *            the involving to set
	 */
	public void setInvolving(List<FacilityRole> involving) {
		this.involving = involving;
	}

	/**
	 * @param madeUpOf
	 *            the madeUpOf to set
	 */
	public void setMadeUpOf(List<Facility> madeUpOf) {
		this.madeUpOf = madeUpOf;
	}

	/**
	 * @param partOf
	 *            the partOf to set
	 */
	public void setPartOf(Facility partOf) {
		this.partOf = partOf;
	}

}