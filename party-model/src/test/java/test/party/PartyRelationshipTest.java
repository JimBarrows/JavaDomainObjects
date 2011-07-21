package test.party;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import javax.validation.ConstraintViolationException;

import mbmp.party.model.Party;
import mbmp.party.model.PartyRole;
import mbmp.party.model.PartyRoleType;
import mbmp.party.model.relationship.PartyRelationship;
import mbmp.party.model.relationship.RelationshipType;

import org.hibernate.Session;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.utils.DbTestTemplate;
import test.utils.HibernateUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/party-roles.xml")
public class PartyRelationshipTest extends DbTestTemplate {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(PartyRelationshipTest.class);

	private Party fromParty;
	private PartyRoleType fromPartyRoleType;
	private PartyRole fromPartyRole;
	private Party toParty;
	private PartyRoleType toPartyRoleType;
	private PartyRole toPartyRole;
	private RelationshipType relationshipType;

	@Test
	public void testSave() {
		if (logger.isDebugEnabled()) {
			logger.debug("testSave() - start"); //$NON-NLS-1$
		}

		// given

		PartyRelationship relationship = new PartyRelationship(new DateTime(),
				null, relationshipType, "test", fromPartyRole, toPartyRole);

		// when
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(relationship);
		session.getTransaction().commit();

		// then
		// it works

		if (logger.isDebugEnabled()) {
			logger.debug("testSave() - end"); //$NON-NLS-1$
		}
	}

	@Test
	public void testMustNotBeSameParty() {
		if (logger.isDebugEnabled()) {
			logger.debug("testMustNotBeSameParty() - start"); //$NON-NLS-1$
		}

		// given
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		fromParty.addPartyRole(toPartyRole);
		session.update(toPartyRole);
		session.update(fromParty);
		session.getTransaction().commit();
		PartyRelationship relationship = new PartyRelationship(1l, 0l,
				new DateTime(), null, relationshipType, "test", fromPartyRole,
				toPartyRole);

		// when
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			session.save(relationship);
			session.getTransaction().commit();
			fail("A relationship was to the same party.");

			// then
		} catch (ConstraintViolationException cve) {
			
			session.getTransaction().rollback();
		}

		if (logger.isDebugEnabled()) {
			logger.debug("testMustNotBeSameParty() - end"); //$NON-NLS-1$
		}
	}

	@Test
	public void partyToRoleTypeMustBeSameAsRelationshipTypeToRole() {
		if (logger.isDebugEnabled()) {
			logger.debug("partyToRoleTypeMustBeSameAsRelationshipTypeToRole() - start"); //$NON-NLS-1$
		}

		// given

		PartyRoleType toPartyRoleTypeForRelationship = new PartyRoleType("foo");
		
		RelationshipType relationshipType = new RelationshipType(1l, 0l,
				"test type", fromPartyRoleType, toPartyRoleTypeForRelationship);

		PartyRelationship relationship = new PartyRelationship(1l, 0l,
				new DateTime(), null, relationshipType, "test", fromPartyRole,
				toPartyRole);
		// when
		boolean sameType = relationship
				.isTheToRoleTypeSameAsRelationshipoTypeToRole();
		// then
		assertFalse("The to Role types match, and the should not.", sameType);

		if (logger.isDebugEnabled()) {
			logger.debug("partyToRoleTypeMustBeSameAsRelationshipTypeToRole() - end"); //$NON-NLS-1$
		}
	}

	@Test
	public void partyFromRoleTypeMustBeSameAsRelationshipTypeFromRole() {
		if (logger.isDebugEnabled()) {
			logger.debug("partyFromRoleTypeMustBeSameAsRelationshipTypeFromRole() - start"); //$NON-NLS-1$
		}

		// given
		PartyRoleType fromPartyRoleTypeForRelationship = new PartyRoleType(
				"foo");
		RelationshipType relationshipType = new RelationshipType(1l, 0l,
				"test type", fromPartyRoleTypeForRelationship, toPartyRoleType);

		PartyRelationship relationship = new PartyRelationship(1l, 0l,
				new DateTime(), null, relationshipType, "test", fromPartyRole,
				toPartyRole);
		// when
		boolean sameType = relationship
				.isTheFromRoleSameAsRelationshipoTypeFromRole();

		// then
		assertFalse("The from Role types match, and the should not.", sameType);

		if (logger.isDebugEnabled()) {
			logger.debug("partyFromRoleTypeMustBeSameAsRelationshipTypeFromRole() - end"); //$NON-NLS-1$
		}
	}

	@Before
	public void setUp() throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("setUp() - start"); //$NON-NLS-1$
		}

		super.setUp();
		fromParty = new Party();
		fromPartyRoleType = new PartyRoleType("from");
		fromPartyRole = new PartyRole(fromPartyRoleType);
		fromParty.addPartyRole(fromPartyRole);

		toParty = new Party();
		toPartyRoleType = new PartyRoleType("to");
		toPartyRole = new PartyRole(toPartyRoleType);
		toParty.addPartyRole(toPartyRole);

		relationshipType = new RelationshipType("test type", fromPartyRoleType,
				toPartyRoleType);

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(fromPartyRoleType);
		session.save(toPartyRoleType);
		session.save(fromParty);
		session.save(toParty);
		session.getTransaction().commit();
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(relationshipType);
		session.getTransaction().commit();

		if (logger.isDebugEnabled()) {
			logger.debug("setUp() - end"); //$NON-NLS-1$
		}
	}

}
