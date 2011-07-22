package test.party.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import mbmp.party.model.Organization;
import mbmp.party.model.Party;
import mbmp.party.model.Person;
import mbms.party.services.implementation.PartyListServices;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@PrepareForTest( PartyListServices.class)
public class PartyListServices_ListMethod_Test {

	private PartyListServices classUnderTest;
	
	@Mock
	private SessionFactory sessionFactory;

	@Mock
	private Session session;

	@Mock
	private org.hibernate.Query query;

	@Test
	public void testList() {
		//given
		List<Party> expectedList = createExpectedList();
		when( sessionFactory.getCurrentSession()).thenReturn(session);
		when( session.getNamedQuery(anyString())).thenReturn(query);
		when( query.setFirstResult(anyInt())).thenReturn(query);
		when( query.setMaxResults(anyInt())).thenReturn(query);
		when( query.list()).thenReturn(expectedList);
		
		//when
		List<Party> list = classUnderTest.list(0, expectedList.size());
		
		//then
		verify(session).getNamedQuery("partyList");
		verify(query).setFirstResult(0);
		verify(query).setMaxResults(expectedList.size());
		assertEquals( expectedList, list);
	}
	
	@Test
	public void firstResultNegative() {
		//given
		List<Party> expectedList = createExpectedList();
		when( sessionFactory.getCurrentSession()).thenReturn(session);
		when( session.getNamedQuery(anyString())).thenReturn(query);
		when( query.setFirstResult(anyInt())).thenReturn(query);
		when( query.setMaxResults(anyInt())).thenReturn(query);
		when( query.list()).thenReturn(expectedList);
		
		List<Party> list = null;
		try {
			//when
			list = classUnderTest.list(-1, expectedList.size());
			fail("A negatvie first result is not valid");
		} catch (IllegalArgumentException e) {
			verifyZeroInteractions(session);
			verifyZeroInteractions(query);
			verifyZeroInteractions(sessionFactory);
			assertNull( list );
		}
	}
	
	@Test
	public void maxResultsNegative() {
		//given
		List<Party> expectedList = createExpectedList();
		when( sessionFactory.getCurrentSession()).thenReturn(session);
		when( session.getNamedQuery(anyString())).thenReturn(query);
		when( query.setFirstResult(anyInt())).thenReturn(query);
		when( query.setMaxResults(anyInt())).thenReturn(query);
		when( query.list()).thenReturn(expectedList);
		
		List<Party> list=null;
		try {
			//when
			 list = classUnderTest.list(0, -1);
			fail("A negatvie first result is not valid");
		} catch (IllegalArgumentException e) {
			verifyZeroInteractions(session);
			verifyZeroInteractions(query);
			verifyZeroInteractions(sessionFactory);
			assertNull( list );
		}
	}
	
	@Test
	public void maxResults0() {
		//given
		List<Party> expectedList = createExpectedList();
		when( sessionFactory.getCurrentSession()).thenReturn(session);
		when( session.getNamedQuery(anyString())).thenReturn(query);
		when( query.setFirstResult(anyInt())).thenReturn(query);
		when( query.setMaxResults(anyInt())).thenReturn(query);
		when( query.list()).thenReturn(expectedList);
		
		List<Party> list = null;
		try {
			//when
			list = classUnderTest.list(0, 0);
			fail("A negatvie first result is not valid");
		} catch (IllegalArgumentException e) {
			verifyZeroInteractions(session);
			verifyZeroInteractions(query);
			verifyZeroInteractions(sessionFactory);
			assertNull( list );
		}
	}

	private List<Party> createExpectedList() {
		List<Party> list = new ArrayList<Party>();
		for( int i=0; i< 10; i++) {
			if( i%2 == 0) {
				Organization org = new Organization();
				org.setName("org " +i);
				list.add(org);
			}else {
				Person per = new Person();
				per.setFirstName("first " + i);
				per.setMiddleName("middle" +i);
				per.setLastName("last" + i);
				list.add(per);
			}
		}
		return list;
	}

	@Before
	public void before() {
		classUnderTest = spy(new PartyListServices(sessionFactory));
	}
}
