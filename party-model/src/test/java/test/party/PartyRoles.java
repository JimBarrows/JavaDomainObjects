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

public class PartyRoles {
	
	@Test
	public void canAddRoleToOrganization() {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		Organization organization = new Organization();
		organization.setName("Test name");
		session.save(organization);
		transaction.commit();
		session.close();
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
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Test");
	}

}
