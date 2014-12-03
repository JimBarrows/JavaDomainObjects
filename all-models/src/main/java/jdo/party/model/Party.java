package jdo.party.model;

import static javax.persistence.CascadeType.ALL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.crypto.Data;

import jdo.model.BasePersistentModel;
import jdo.party.model.communication.CaseRole;
import jdo.party.model.communication.CommunicationEventRole;
import jdo.party.model.facility.FacilityRole;

/**
 * Represents information on either an organization, or a single person.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:32 AM
 * @see Data Model Resource Book Volume 1 Figure 2.3, page 30
 * @see Data Model Resource Book Volume 1 Figure 2.4, page 34
 * @see Data Model Resource Book Volume 1 Figure 2.8, page 50
 * @see Data Model Resource Book Volume 1 Figure 2.10, page 55
 * @see Data Model Resource Book Volume 1 Figure 2.11, page 59
 * @see Data Model Resource Book Volume 1 Figure 2.12, page 60
 * @see Data Model Resource Book Volume 1 Figure 2.13, page 64
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@XmlRootElement
public class Party extends BasePersistentModel implements Serializable {

	/**
	 * 
	 */
	private static final long				serialVersionUID		= 1L;

	/**
	 * The roles this party plays, or has played, or will play
	 * 
	 */
	private Set<PartyRole>					actingAs				= new HashSet<PartyRole>();

	/**
	 * The cases this party is , has been, or will be part of.
	 * 
	 */
	private List<CaseRole>					caseRolesInvolvedIn		= new ArrayList<CaseRole>();

	/**
	 * The different classifications the party fits into, or has been part of.
	 * 
	 */
	private List<PartyClassification>		classifiedInto			= new ArrayList<PartyClassification>();

	/**
	 * The ways to contact this party, now, in the past and in the future.
	 * 
	 */
	private List<PartyContactMechanism>		contactedVia			= new ArrayList<PartyContactMechanism>();

	/**
	 * Communication events, outside of cases that the party has participated
	 * in.
	 * 
	 */
	private List<CommunicationEventRole>	eventRolesInvolvedIn	= new ArrayList<CommunicationEventRole>();

	/**
	 * Roles the party plays in a facility.
	 * 
	 */
	private List<FacilityRole>				involvedInFacilityRole	= new ArrayList<FacilityRole>();

	/**
	 * The addresses this party has resided at, will reside at, or does reside
	 * at
	 * 
	 */
	private List<PartyPostalAddress>		residingAt				= new ArrayList<PartyPostalAddress>();

	public void addAddress(PartyPostalAddress address) {
		residingAt.add(address);
		address.setSpecifiedFor(this);
	}

	public void addClassification(PartyClassification classification) {
		classifiedInto.add(classification);
		classification.setClassificationFor(this);
	}

	public void addPartyContactMechanism(PartyContactMechanism contactMechanism) {
		contactedVia.add(contactMechanism);
		contactMechanism.setMechanismToContact(this);
	}

	public void addPartyRole(PartyRole role) {
		actingAs.add(role);
		role.setRoleFor(this);
	}

	public void removePartyRole(PartyRole role) {
		actingAs.remove(role);
		role.setRoleFor(null);
	}

	public void addWebAddress(PartyContactMechanism partyContactMechanism) {
		contactedVia.add(partyContactMechanism);
		partyContactMechanism.setMechanismToContact(this);

	}

	/**
	 * @return the actingAs
	 */
	@OneToMany(mappedBy = "roleFor", cascade = ALL)
	@OrderBy("from")
	public Set<PartyRole> getActingAs() {
		return actingAs;
	}

	/**
	 * @return the caseRolesInvolvedIn
	 */
	@OneToMany(mappedBy = "of", cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	public List<CaseRole> getCaseRolesInvolvedIn() {
		return caseRolesInvolvedIn;
	}

	/**
	 * @return the classifiedInto
	 */
	@OneToMany(cascade = ALL, mappedBy = "classificationFor")
	public List<PartyClassification> getClassifiedInto() {
		return classifiedInto;
	}

	@OneToMany(mappedBy = "mechanismToContact", cascade = CascadeType.ALL)
	@OrderBy("from")
	public List<PartyContactMechanism> getContactedVia() {
		return contactedVia;
	}

	/**
	 * @return the eventRolesInvolvedIn
	 */
	@OneToMany(mappedBy = "forParty", cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	public List<CommunicationEventRole> getEventRolesInvolvedIn() {
		return eventRolesInvolvedIn;
	}

	/**
	 * @return the involvedInFacilityRole
	 */
	@OneToMany(mappedBy = "forParty", cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	public List<FacilityRole> getInvolvedInFacilityRole() {
		return involvedInFacilityRole;
	}

	/**
	 * @return the residingAt
	 */
	@OneToMany(mappedBy = "specifiedFor", cascade = CascadeType.ALL)
	@OrderBy("from")
	public List<PartyPostalAddress> getResidingAt() {
		return residingAt;
	}

	/**
	 * @param actingAs
	 *            the actingAs to set
	 */
	public void setActingAs(Set<PartyRole> actingAs) {
		this.actingAs = actingAs;
	}

	/**
	 * @param caseRolesInvolvedIn
	 *            the caseRolesInvolvedIn to set
	 */
	public void setCaseRolesInvolvedIn(List<CaseRole> caseRolesInvolvedIn) {
		this.caseRolesInvolvedIn = caseRolesInvolvedIn;
	}

	/**
	 * @param classifiedInto
	 *            the classifiedInto to set
	 */
	public void setClassifiedInto(List<PartyClassification> classifiedInto) {
		this.classifiedInto = classifiedInto;
	}

	public void setContactedVia(List<PartyContactMechanism> contactMechanisms) {
		this.contactedVia = contactMechanisms;
	}

	/**
	 * @param eventRolesInvolvedIn
	 *            the eventRolesInvolvedIn to set
	 */
	public void setEventRolesInvolvedIn(List<CommunicationEventRole> eventRolesInvolvedIn) {
		this.eventRolesInvolvedIn = eventRolesInvolvedIn;
	}

	/**
	 * @param involvedInFacilityRole
	 *            the involvedInFacilityRole to set
	 */
	public void setInvolvedInFacilityRole(List<FacilityRole> involvedInFacilityRole) {
		this.involvedInFacilityRole = involvedInFacilityRole;
	}

	/**
	 * @param residingAt
	 *            the residingAt to set
	 */
	public void setResidingAt(List<PartyPostalAddress> residingAt) {
		this.residingAt = residingAt;
	}

}