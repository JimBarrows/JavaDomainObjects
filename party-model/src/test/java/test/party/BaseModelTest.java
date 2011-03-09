package test.party;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

import test.support.DbUtils;
import test.support.HibernateSessionFactory;

public class BaseModelTest {

	@Autowired
	protected DbUtils dbUtils;
	protected Session session;

	public BaseModelTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Test");
		dbUtils.cleanDb();
		session = HibernateSessionFactory.getSession();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Test");
		session.close();		
	}

}