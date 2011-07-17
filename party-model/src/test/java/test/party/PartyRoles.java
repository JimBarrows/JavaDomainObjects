package test.party;

import static org.junit.Assert.assertFalse;

import mbmp.party.model.Organization;
import mbmp.party.model.PartyRole;
import mbmp.party.model.PartyRoleType;

import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "party-roles.xml")
public class PartyRoles extends DbTestTemplate {

	@Test
	public void canAddRoleToExistingOrganization() {
		//given
		Transaction transaction = session.beginTransaction();
		Organization organization = new Organization();
		organization.setName("Test name");
		PartyRoleType type = new PartyRoleType("Type");
		session.save(organization);
		session.save(type);
		transaction.commit();
		
		PartyRole role = new PartyRole(type);
		organization.addPartyRole(role );
		
		//when
		session.save(organization);
		
		//it should works
	}

	@Test
	public void canAddRoleToNewOrganization() {
		//given 
		Transaction transaction = session.beginTransaction();
		PartyRoleType type = new PartyRoleType("Type");
		session.save(type);
		transaction.commit();
		
		Organization newOrganization = new Organization();
		newOrganization.setName("Test name");
		PartyRole pr = new PartyRole(type);
		newOrganization.addPartyRole(pr);
		
		//when
		session.save(newOrganization);
		
		//then it should work
	}
	
	@Test 
	public void canRemoveRoleFromOrganization() {
		//given
		Transaction transaction = session.beginTransaction();
		Organization organization = new Organization();
		organization.setName("Test name");
		PartyRoleType type = new PartyRoleType("Type");
		session.save(type);
		PartyRole role = new PartyRole(type);
		organization.addPartyRole(role );
		session.save(organization);
		transaction.commit();
		
		//when
		transaction = session.beginTransaction();
		organization.removePartyRole( role);
		session.save(organization);
		transaction.commit();
		
		assertFalse( organization.getActingAs().contains(role));
		
	}

}
