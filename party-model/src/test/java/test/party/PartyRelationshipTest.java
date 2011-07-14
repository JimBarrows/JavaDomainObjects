package test.party;

import static org.junit.Assert.fail;

import javax.validation.ConstraintViolationException;

import org.hibernate.Transaction;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nsfwenterprises.biz360.party.model.Party;
import com.nsfwenterprises.biz360.party.model.PartyRole;
import com.nsfwenterprises.biz360.party.model.PartyRoleType;
import com.nsfwenterprises.biz360.party.model.relationship.PartyRelationship;
import com.nsfwenterprises.biz360.party.model.relationship.RelationshipType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "party-roles.xml")
public class PartyRelationshipTest  extends BaseModelTest{
	
	@Test
	public void testSave() {
		//given
		Party fromParty = new Party();
		PartyRoleType fromType = new PartyRoleType("from");
		PartyRole fromPartyRole = new PartyRole(fromType);
		fromParty.addPartyRole(fromPartyRole);
		
		Party toParty = new Party();
		PartyRoleType toType = new PartyRoleType("to");
		PartyRole toPartyRole = new PartyRole(toType);
		toParty.addPartyRole(toPartyRole);
		
		RelationshipType relationshipType = new RelationshipType(1l, 0l, "test type");
		
		Transaction transaction = session.beginTransaction();
		session.save(fromType);
		session.save(toType);
		session.save(fromParty);
		session.save(toParty);
		session.save( relationshipType);
		transaction.commit();
		PartyRelationship relationship = new PartyRelationship(1l, 0l, new DateTime(), null, relationshipType, "test", fromPartyRole, toPartyRole);
		
		//when
		transaction = session.beginTransaction();
		session.save(relationship);
		transaction.commit();
		
		//then
		//it works
	}
	
	@Test
	public void testMustNotBeSameParty() {
		//given
		Party fromParty = new Party();
		PartyRoleType fromType = new PartyRoleType("from");
		PartyRole fromPartyRole = new PartyRole(fromType);
		fromParty.addPartyRole(fromPartyRole);
		
		PartyRoleType toType = new PartyRoleType("to");
		PartyRole toPartyRole = new PartyRole(toType);
		fromParty.addPartyRole(toPartyRole);
		
		RelationshipType relationshipType = new RelationshipType(1l, 0l, "test type");
		
		Transaction transaction = session.beginTransaction();
		session.save(fromType);
		session.save(fromParty);
		session.save( relationshipType);
		transaction.commit();
		PartyRelationship relationship = new PartyRelationship(1l, 0l, new DateTime(), null, relationshipType,"test", fromPartyRole, toPartyRole);
		
		//when
		try {
		transaction = session.beginTransaction();
		session.save(relationship);
		transaction.commit();
		fail("A relationship was to the same party.");
		
		//then
		} catch( ConstraintViolationException cve) {
			
		}
	
	}
	
}
