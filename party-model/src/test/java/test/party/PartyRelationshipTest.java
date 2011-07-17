package test.party;

import static org.junit.Assert.*;

import javax.validation.ConstraintViolationException;

import mbmp.party.model.Party;
import mbmp.party.model.PartyRole;
import mbmp.party.model.PartyRoleType;
import mbmp.party.model.relationship.PartyRelationship;
import mbmp.party.model.relationship.RelationshipType;

import org.hibernate.Transaction;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "party-roles.xml")
public class PartyRelationshipTest extends DbTestTemplate {

	private Party fromParty;
	private PartyRoleType fromPartyRoleType;
	private PartyRole fromPartyRole;
	private Party toParty;
	private PartyRoleType toPartyRoleType;
	private PartyRole toPartyRole;
	private RelationshipType relationshipType;

	@Test
	public void testSave() {
		// given

		PartyRelationship relationship = new PartyRelationship(new DateTime(),
				null, relationshipType, "test", fromPartyRole, toPartyRole);

		// when
		Transaction transaction = session.beginTransaction();
		transaction = session.beginTransaction();
		session.save(relationship);
		transaction.commit();

		// then
		// it works
	}

	@Test
	public void testMustNotBeSameParty() {
		// given
		Transaction transaction = session.beginTransaction();
		fromParty.addPartyRole(toPartyRole);
		session.save(fromParty);
		transaction.commit();
		PartyRelationship relationship = new PartyRelationship(1l, 0l,
				new DateTime(), null, relationshipType, "test", fromPartyRole,
				toPartyRole);

		// when
		try {
			transaction = session.beginTransaction();
			session.save(relationship);
			transaction.commit();
			fail("A relationship was to the same party.");

			// then
		} catch (ConstraintViolationException cve) {

		}

	}

	@Test
	public void partyToRoleTypeMustBeSameAsRelationshipTypeToRole() {
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
		assertFalse(sameType);

	}

	@Test
	public void partyFromRoleTypeMustBeSameAsRelationshipTypeFromRole() {
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
		assertFalse(sameType);

	}

	@Before
	public void setUp() throws Exception {
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

		Transaction transaction = session.beginTransaction();
		session.save(fromPartyRoleType);
		session.save(toPartyRoleType);
		session.save(fromParty);
		session.save(toParty);
		transaction.commit();
		transaction = session.beginTransaction();
		session.save(relationshipType);
		transaction.commit();
	}

}
