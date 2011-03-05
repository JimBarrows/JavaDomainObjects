package test.party;

import org.dbunit.DBTestCase;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.support.HibernateSessionFactory;

import com.nsfwenterprises.biz360.party.model.Organization;
import com.nsfwenterprises.biz360.party.model.PartyRole;
import com.nsfwenterprises.biz360.party.model.PartyRoleType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "party-roles.xml")
public class PartyRoles extends DBTestCase{

	private Session session;
	private Transaction transaction;
	private Organization organization;
	private PartyRoleType type;

	@Test
	public void canAddRoleToExistingOrganization() {
		PartyRole pr = new PartyRole(type);
		organization.addPartyRole(pr);
		session.save(organization);
	}
	
	@Test
	public void canAddRoleToNewOrganization() {
		Organization newOrganization = new Organization();
		newOrganization.setName("Test name");
		PartyRole pr = new PartyRole(type);
		newOrganization.addPartyRole(pr);
		session.save(newOrganization);
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

	@Override
	protected IDataSet getDataSet() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected DatabaseOperation getSetUpOperation() throws Exception
    {
        return DatabaseOperation.REFRESH;
    }

    protected DatabaseOperation getTearDownOperation() throws Exception
    {
        return DatabaseOperation.NONE;
    }

}
