package test.party;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import test.support.HibernateSessionFactory;

import com.nsfwenterprises.biz360.party.model.Organization;
import com.nsfwenterprises.biz360.party.model.PartyRole;
import com.nsfwenterprises.biz360.party.model.PartyRoleType;

public class PartyRoles {

	private Session session;
	private Transaction transaction;
	private Organization organization;
	private PartyRoleType type;

	@Test
	public void canAddRoleToOrganization() {
		PartyRole pr = new PartyRole(type);
		organization.addPartyRole(pr);
		session.save(organization);
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Test");
		session = HibernateSessionFactory.getSession();
		transaction = session.beginTransaction();
		organization = new Organization();
		organization.setName("Test name");
		session.save(organization);
		type = new PartyRoleType();
		type.setDescription("Internal Organization");
		session.save(type);
		transaction.commit();
		transaction = session.beginTransaction();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Test");
		transaction.commit();
		session.close();
	}

}
