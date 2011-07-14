package test.support;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nsfwenterprises.biz360.party.model.Organization;
import com.nsfwenterprises.biz360.party.model.Party;
import com.nsfwenterprises.biz360.party.model.PartyClassification;
import com.nsfwenterprises.biz360.party.model.PartyContactMechanism;
import com.nsfwenterprises.biz360.party.model.PartyContactMechanismPurpose;
import com.nsfwenterprises.biz360.party.model.PartyPostalAddress;
import com.nsfwenterprises.biz360.party.model.PartyRole;
import com.nsfwenterprises.biz360.party.model.PartyRoleType;
import com.nsfwenterprises.biz360.party.model.Person;
import com.nsfwenterprises.biz360.party.model.communication.Case;
import com.nsfwenterprises.biz360.party.model.communication.CaseRole;
import com.nsfwenterprises.biz360.party.model.communication.CaseRoleType;
import com.nsfwenterprises.biz360.party.model.communication.CaseStatusType;
import com.nsfwenterprises.biz360.party.model.communication.CommunicationEvent;
import com.nsfwenterprises.biz360.party.model.communication.CommunicationEventPurpose;
import com.nsfwenterprises.biz360.party.model.communication.CommunicationEventPurposeType;
import com.nsfwenterprises.biz360.party.model.communication.CommunicationEventRole;
import com.nsfwenterprises.biz360.party.model.communication.CommunicationEventRoleType;
import com.nsfwenterprises.biz360.party.model.communication.CommunicationEventStatusType;
import com.nsfwenterprises.biz360.party.model.communication.CommunicationEventWorkEffort;
import com.nsfwenterprises.biz360.party.model.contactmechanism.ContactMechanism;
import com.nsfwenterprises.biz360.party.model.contactmechanism.ContactMechanismPurposeType;
import com.nsfwenterprises.biz360.party.model.contactmechanism.PostalAddress;
import com.nsfwenterprises.biz360.party.model.contactmechanism.TelecommunicationsNumber;
import com.nsfwenterprises.biz360.party.model.facility.Building;
import com.nsfwenterprises.biz360.party.model.facility.Facility;
import com.nsfwenterprises.biz360.party.model.facility.FacilityContactMechanism;
import com.nsfwenterprises.biz360.party.model.facility.FacilityRole;
import com.nsfwenterprises.biz360.party.model.facility.FacilityRoleType;
import com.nsfwenterprises.biz360.party.model.facility.Floor;
import com.nsfwenterprises.biz360.party.model.facility.Office;
import com.nsfwenterprises.biz360.party.model.facility.Plant;
import com.nsfwenterprises.biz360.party.model.facility.Room;
import com.nsfwenterprises.biz360.party.model.facility.Warehouse;
import com.nsfwenterprises.biz360.party.model.geographic_boundary.GeographicBoundary;
import com.nsfwenterprises.biz360.party.model.geographic_boundary.GeographicBoundaryType;
import com.nsfwenterprises.biz360.party.model.relationship.CustomerRelationship;
import com.nsfwenterprises.biz360.party.model.relationship.DistributorChannelRelationship;
import com.nsfwenterprises.biz360.party.model.relationship.Employment;
import com.nsfwenterprises.biz360.party.model.relationship.OrganizationContactRelationship;
import com.nsfwenterprises.biz360.party.model.relationship.OrganizationRollup;
import com.nsfwenterprises.biz360.party.model.relationship.Partnership;
import com.nsfwenterprises.biz360.party.model.relationship.PartyRelationship;
import com.nsfwenterprises.biz360.party.model.relationship.PriorityType;
import com.nsfwenterprises.biz360.party.model.relationship.RelationshipType;
import com.nsfwenterprises.biz360.party.model.relationship.StatusType;
import com.nsfwenterprises.biz360.party.model.relationship.SupplierRelationship;
import com.nsfwenterprises.biz360.party.model.relationship.TerminationReason;

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