package jdo.party.model;

import jdo.facility.model.FacilityRole;
import jdo.model.BasePersistentModel;
import jdo.party.model.communication.CaseRole;
import jdo.party.model.communication.CommunicationEventRole;
import jdo.party.model.contactmechanism.ContactMechanism;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

/**
 * Represents information on either an organization, or a single person.
 * 
 * @author Jim
 * @version 1.0 created 25-Dec-2007 9:54:32 AM
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
    private static final long serialVersionUID = 1L;

    /**
     * The roles this party plays, or has played, or will play.
     * 
     */
    @OneToMany(mappedBy = "roleFor", cascade = ALL)
    @OrderBy("roleStarted")
    @XmlList
    private List<PartyRole> actingAs = new ArrayList<PartyRole>();

    /**
     * The cases this party is , has been, or will be part of.
     * 
     */
    @OneToMany(mappedBy = "of", cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    private List<CaseRole> caseRolesInvolvedIn = new ArrayList<CaseRole>();

    /**
     * The different classifications the party fits into, or has been part of.
     * 
     */
    @OneToMany(cascade = ALL, mappedBy = "classificationFor")
    private List<PartyClassification> classifiedInto = new ArrayList<PartyClassification>();

    /**
     * The ways to contact this party, now, in the past and in the future.
     * 
     */
    @OneToMany(mappedBy = "mechanismToContact", cascade = CascadeType.ALL)
    @OrderBy("dateTimeRange.from")
    private List<PartyContactMechanism> contactedVia = new ArrayList<PartyContactMechanism>();

    /**
     * Communication events, outside of cases that the party has participated
     * in.
     * 
     */
    @OneToMany(mappedBy = "forParty", cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    private List<CommunicationEventRole> eventRolesInvolvedIn = new ArrayList<CommunicationEventRole>();

    /**
     * Roles the party plays in a facility.
     * 
     */
    @OneToMany
    private List<FacilityRole> involvedInFacilityRole = new ArrayList<FacilityRole>();

    /**
     * The addresses this party has resided at, will reside at, or does reside
     * at.
     * 
     */
    @OneToMany
    private List<PartyPostalAddress> residingAt = new ArrayList<PartyPostalAddress>();

    /**
     * Add the address to the party.
     * 
     * @param address
     *            to be added.
     */
    public final void addAddress(final PartyPostalAddress address) {
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

    public void addContactMechanism(ContactMechanism mechanism) {
	PartyContactMechanism partyContactMechanism = new PartyContactMechanism();
	partyContactMechanism.setMechanismToContact(this);
	partyContactMechanism.setSpecifiedVia(mechanism);
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

    public List<PartyRole> getActingAs() {
	return actingAs;
    }

    /**
     * @return the caseRolesInvolvedIn
     */

    public List<CaseRole> getCaseRolesInvolvedIn() {
	return caseRolesInvolvedIn;
    }

    /**
     * @return the classifiedInto
     */

    public List<PartyClassification> getClassifiedInto() {
	return classifiedInto;
    }

    public List<PartyContactMechanism> getContactedVia() {
	return contactedVia;
    }

    /**
     * @return the eventRolesInvolvedIn
     */

    public List<CommunicationEventRole> getEventRolesInvolvedIn() {
	return eventRolesInvolvedIn;
    }

    /**
     * @return the involvedInFacilityRole
     */
    public List<FacilityRole> getInvolvedInFacilityRole() {
	return involvedInFacilityRole;
    }

    /**
     * @return the residingAt
     */
    public List<PartyPostalAddress> getResidingAt() {
	return residingAt;
    }

    /**
     * @param actingAs
     *            the actingAs to set
     */
    public void setActingAs(List<PartyRole> actingAs) {
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

    @Override
    public String toString() {
	final int maxLen = 10;
	return String
		.format("Party [actingAs=%s, caseRolesInvolvedIn=%s, classifiedInto=%s, contactedVia=%s, eventRolesInvolvedIn=%s, involvedInFacilityRole=%s, residingAt=%s, getId()=%s, getVersion()=%s]",
			actingAs != null ? actingAs.subList(0,
				Math.min(actingAs.size(),
					maxLen))
				: null,
			caseRolesInvolvedIn != null ? caseRolesInvolvedIn.subList(0,
				Math.min(caseRolesInvolvedIn.size(),
					maxLen))
				: null,
			classifiedInto != null
				? classifiedInto.subList(0,
					Math.min(classifiedInto.size(), maxLen))
				: null,
			contactedVia != null ? contactedVia.subList(0, Math.min(contactedVia.size(), maxLen)) : null,
			eventRolesInvolvedIn != null
				? eventRolesInvolvedIn.subList(0, Math.min(eventRolesInvolvedIn.size(), maxLen)) : null,
			involvedInFacilityRole != null
				? involvedInFacilityRole.subList(0, Math.min(involvedInFacilityRole.size(), maxLen))
				: null,
			residingAt != null ? residingAt.subList(0, Math.min(residingAt.size(), maxLen)) : null, getId(),
			getVersion());
    }

}