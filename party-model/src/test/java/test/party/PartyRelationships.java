package test.party;

import static org.junit.Assert.*;
import javax.validation.ConstraintViolationException;

import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nsfwenterprises.biz360.party.model.Party;
import com.nsfwenterprises.biz360.party.model.PartyRole;
import com.nsfwenterprises.biz360.party.model.PartyRoleType;
import com.nsfwenterprises.biz360.party.model.relationship.PartyRelationship;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "party-roles.xml")
public class PartyRelationships  extends BaseModelTest{
	
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
		
		Transaction transaction = session.beginTransaction();
		session.save(fromType);
		session.save(toType);
		session.save(fromParty);
		session.save(toParty);
		transaction.commit();
		PartyRelationship relationship = new PartyRelationship("test", fromPartyRole, toPartyRole);
		
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
		
		Transaction transaction = session.beginTransaction();
		session.save(fromType);
		session.save(fromParty);
		transaction.commit();
		PartyRelationship relationship = new PartyRelationship("test", fromPartyRole, toPartyRole);
		
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
