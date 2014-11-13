package test.party.services.PartyLIstServices;

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

import javax.persistence.EntityManager;
import javax.persistence.Query;

import jdo.party.model.Organization;
import jdo.party.model.Party;
import jdo.party.model.Person;
import jdo.party.services.implementation.PartyListServices;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@PrepareForTest( PartyListServices.class)
public class ListMethod_Test {

	private PartyListServices classUnderTest;
	
	@Mock
	EntityManager em;
	
	@Mock
	private Query query;
	
	@Test
	public void testList() {
		//given
		List<Party> expectedList = createExpectedList();		
		when( em.createQuery(anyString())).thenReturn(query);
		when( query.setFirstResult(anyInt())).thenReturn(query);
		when( query.setMaxResults(anyInt())).thenReturn(query);
		when( query.getResultList()).thenReturn(expectedList);		
		
		//when
		List<Party> list = classUnderTest.list(0, expectedList.size());
		
		//then
		verify(em).createQuery("from Party");
		verify(query).setFirstResult(0);
		verify(query).setMaxResults(expectedList.size());
		assertEquals( expectedList, list);
	}
	
	@Test
	public void firstResultNegative() {
		//given
		List<Party> expectedList = createExpectedList();		
		when( query.setFirstResult(anyInt())).thenReturn(query);
		when( query.setMaxResults(anyInt())).thenReturn(query);
		when( query.getResultList()).thenReturn(expectedList);
		
		List<Party> list = null;
		try {
			//when
			list = classUnderTest.list(-1, expectedList.size());
			fail("A negatvie first result is not valid");
		} catch (IllegalArgumentException e) {
			verifyZeroInteractions(em);
			verifyZeroInteractions(query);
			assertNull( list );
		}
	}
	
	@Test
	public void maxResultsNegative() {
		//given
		List<Party> expectedList = createExpectedList();
		when( query.setFirstResult(anyInt())).thenReturn(query);
		when( query.setMaxResults(anyInt())).thenReturn(query);
		when( query.getResultList()).thenReturn(expectedList);
		
		List<Party> list=null;
		try {
			//when
			 list = classUnderTest.list(0, -1);
			fail("A negatvie first result is not valid");
		} catch (IllegalArgumentException e) {
			verifyZeroInteractions(em);
			verifyZeroInteractions(query);

			assertNull( list );
		}
	}
	
	@Test
	public void maxResults0() {
		//given
		List<Party> expectedList = createExpectedList();	
		when( query.setFirstResult(anyInt())).thenReturn(query);
		when( query.setMaxResults(anyInt())).thenReturn(query);
		when( query.getResultList()).thenReturn(expectedList);
		
		List<Party> list = null;
		try {
			//when
			list = classUnderTest.list(0, 0);
			fail("A negatvie first result is not valid");
		} catch (IllegalArgumentException e) {
			verifyZeroInteractions(em);
			verifyZeroInteractions(query);
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
		classUnderTest = spy(new PartyListServices(em));
	}
}
