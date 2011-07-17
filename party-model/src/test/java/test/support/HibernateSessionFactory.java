package test.support;

import mbmp.party.model.Organization;
import mbmp.party.model.Party;
import mbmp.party.model.PartyClassification;
import mbmp.party.model.PartyContactMechanism;
import mbmp.party.model.PartyContactMechanismPurpose;
import mbmp.party.model.PartyPostalAddress;
import mbmp.party.model.PartyRole;
import mbmp.party.model.PartyRoleType;
import mbmp.party.model.Person;
import mbmp.party.model.communication.Case;
import mbmp.party.model.communication.CaseRole;
import mbmp.party.model.communication.CaseRoleType;
import mbmp.party.model.communication.CaseStatusType;
import mbmp.party.model.communication.CommunicationEvent;
import mbmp.party.model.communication.CommunicationEventPurpose;
import mbmp.party.model.communication.CommunicationEventPurposeType;
import mbmp.party.model.communication.CommunicationEventRole;
import mbmp.party.model.communication.CommunicationEventRoleType;
import mbmp.party.model.communication.CommunicationEventStatusType;
import mbmp.party.model.communication.CommunicationEventWorkEffort;
import mbmp.party.model.contactmechanism.ContactMechanism;
import mbmp.party.model.contactmechanism.ContactMechanismPurposeType;
import mbmp.party.model.contactmechanism.PostalAddress;
import mbmp.party.model.contactmechanism.TelecommunicationsNumber;
import mbmp.party.model.facility.Building;
import mbmp.party.model.facility.Facility;
import mbmp.party.model.facility.FacilityContactMechanism;
import mbmp.party.model.facility.FacilityRole;
import mbmp.party.model.facility.FacilityRoleType;
import mbmp.party.model.facility.Floor;
import mbmp.party.model.facility.Office;
import mbmp.party.model.facility.Plant;
import mbmp.party.model.facility.Room;
import mbmp.party.model.facility.Warehouse;
import mbmp.party.model.geographic_boundary.GeographicBoundary;
import mbmp.party.model.geographic_boundary.GeographicBoundaryType;
import mbmp.party.model.relationship.CustomerRelationship;
import mbmp.party.model.relationship.DistributorChannelRelationship;
import mbmp.party.model.relationship.Employment;
import mbmp.party.model.relationship.OrganizationContactRelationship;
import mbmp.party.model.relationship.OrganizationRollup;
import mbmp.party.model.relationship.Partnership;
import mbmp.party.model.relationship.PartyRelationship;
import mbmp.party.model.relationship.PriorityType;
import mbmp.party.model.relationship.RelationshipType;
import mbmp.party.model.relationship.StatusType;
import mbmp.party.model.relationship.SupplierRelationship;
import mbmp.party.model.relationship.TerminationReason;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Configures and provides access to Hibernate sessions, tied to the current
 * thread of execution. Follows the Thread Local Session pattern, see
 * {@link http://hibernate.org/42.html }.
 */

public class HibernateSessionFactory {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(HibernateSessionFactory.class);

	private static final SessionFactory sessionFactory;
	static {
		try {
			Configuration cfg = new Configuration();
			cfg.setProperty("hibernate.dialect",
					"org.hibernate.dialect.PostgreSQLDialect")
					.setProperty("hibernate.connection.url",
							"jdbc:postgresql://localhost/biz360")
					.setProperty("hibernate.connection.username", "biz360")
					.setProperty("hibernate.connection.password", "biz360")
					.setProperty("hibernate.connection.driver_class",
							"org.postgresql.Driver")
					.setProperty("hibernate.current_session_context_class",
							"org.hibernate.context.ThreadLocalSessionContext")
					.setProperty("hibernate.show_sql", "true")
					.setProperty("hibernate.hbm2ddl.auto", "update")
					.addAnnotatedClass(Organization.class)
					.addAnnotatedClass(Party.class)
					.addAnnotatedClass(PartyClassification.class)
					.addAnnotatedClass(PartyContactMechanism.class)
					.addAnnotatedClass(PartyContactMechanismPurpose.class)
					.addAnnotatedClass(PartyPostalAddress.class)
					.addAnnotatedClass(PartyRole.class)
					.addAnnotatedClass(PartyRoleType.class)
					.addAnnotatedClass(Person.class)
					.addAnnotatedClass(Case.class)
					.addAnnotatedClass(CaseRole.class)
					.addAnnotatedClass(CaseRoleType.class)
					.addAnnotatedClass(CaseStatusType.class)
					.addAnnotatedClass(CommunicationEvent.class)
					.addAnnotatedClass(CommunicationEventPurpose.class)
					.addAnnotatedClass(CommunicationEventPurposeType.class)
					.addAnnotatedClass(CommunicationEventRole.class)
					.addAnnotatedClass(CommunicationEventRoleType.class)
					.addAnnotatedClass(CommunicationEventStatusType.class)
					.addAnnotatedClass(CommunicationEventWorkEffort.class)
					.addAnnotatedClass(ContactMechanism.class)
					.addAnnotatedClass(ContactMechanismPurposeType.class)
					.addAnnotatedClass(PostalAddress.class)
					.addAnnotatedClass(TelecommunicationsNumber.class)
					.addAnnotatedClass(Building.class)
					.addAnnotatedClass(Facility.class)
					.addAnnotatedClass(FacilityContactMechanism.class)
					.addAnnotatedClass(FacilityRole.class)
					.addAnnotatedClass(FacilityRoleType.class)
					.addAnnotatedClass(Floor.class)
					.addAnnotatedClass(Office.class)
					.addAnnotatedClass(Plant.class)
					.addAnnotatedClass(Room.class)
					.addAnnotatedClass(Warehouse.class)
					.addAnnotatedClass(GeographicBoundary.class)
					.addAnnotatedClass(GeographicBoundaryType.class)
					.addAnnotatedClass(CustomerRelationship.class)
					.addAnnotatedClass(DistributorChannelRelationship.class)
					.addAnnotatedClass(Employment.class)
					.addAnnotatedClass(OrganizationContactRelationship.class)
					.addAnnotatedClass(OrganizationRollup.class)
					.addAnnotatedClass(Partnership.class)
					.addAnnotatedClass(PartyRelationship.class)
					.addAnnotatedClass(PriorityType.class)
					.addAnnotatedClass(RelationshipType.class)
					.addAnnotatedClass(StatusType.class)
					.addAnnotatedClass(SupplierRelationship.class)
					.addAnnotatedClass(TerminationReason.class);

			sessionFactory = cfg.buildSessionFactory();
		} catch (Throwable ex) {
			// Log exception!
			logger.error("Couldn't configure Hibernate", ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static Session getSession() throws HibernateException {
		logger.debug("getSession() - start"); //$NON-NLS-1$

		Session returnSession = sessionFactory.openSession();
		logger.debug("getSession() - end"); //$NON-NLS-1$
		return returnSession;
	}

}