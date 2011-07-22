package test.party;

import static org.junit.Assert.assertFalse;
import mbmp.party.model.Organization;
import mbmp.party.model.PartyRole;
import mbmp.party.model.PartyRoleType;

import org.hibernate.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.utils.DbTestTemplate;
import test.utils.HibernateUtil;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/party-roles.xml")
public class PartyRolesTest extends DbTestTemplate {

	@Test
	public void canAddRoleToExistingOrganization() {
		//given
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Organization organization = new Organization();
		organization.setName("Test name");
		PartyRoleType type = new PartyRoleType("Type");
		session.save(organization);
		session.save(type);
		session.getTransaction().commit();
		
		PartyRole role = new PartyRole(type);
		organization.addPartyRole(role );
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		//when
		session.save(organization);
		session.getTransaction().commit();
		
		//it should works
	}

	@Test
	public void canAddRoleToNewOrganization() {
		//given 
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		PartyRoleType type = new PartyRoleType("Type");
		session.save(type);
		session.getTransaction().commit();
		
		Organization newOrganization = new Organization();
		newOrganization.setName("Test name");
		PartyRole pr = new PartyRole(type);
		newOrganization.addPartyRole(pr);
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		//when
		session.save(newOrganization);
		session.getTransaction().commit();
		//then it should work
	}
	
	@Test 
	public void canRemoveRoleFromOrganization() {
		//given
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Organization organization = new Organization();
		organization.setName("Test name");
		PartyRoleType type = new PartyRoleType("Type");
		session.save(type);
		PartyRole role = new PartyRole(type);
		organization.addPartyRole(role );
		session.save(organization);
		session.getTransaction().commit();
		
		//when
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		organization.removePartyRole( role);
		session.save(organization);
		session.getTransaction().commit();
		
		assertFalse( organization.getActingAs().contains(role));
		
	}

}
