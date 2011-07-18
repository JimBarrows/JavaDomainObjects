package test.party.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.persistence.EntityManager;

import mbmp.party.model.Party;
import mbmp.party.model.Person;
import mbms.party.services.implementation.PartyCrudServices;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.stubbing.answers.DoesNothing;
import org.mockito.invocation.InvocationOnMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest( PartyCrudServices.class)
public class PartyCrudServicesTest {

	PartyCrudServices classUnderTest;
	
	private EntityManager em;
	
	Party expectedParty;
	
	@SuppressWarnings("serial")
	@Test
	public void testCreate() {
		//given
		expectedParty = new Person();
		Person p = (Person)expectedParty;
		p.setFirstName("first");
		p.setLastName("last");
		doAnswer( new DoesNothing() {
			public Object answer(InvocationOnMock invocation) {
				((Party)invocation.getArguments()[0]).setId( 1l);
				return null;
			}
		}).when( em).persist(p);
		//when
		Party actualParty = classUnderTest.create(expectedParty);
		
		//then
		assertEquals(expectedParty, actualParty);
		verify( em).persist(expectedParty);
	}

	@Test
	public void testRead() {
		//given
		expectedParty = new Person();
		Person p = (Person)expectedParty;
		p.setFirstName("first");
		p.setLastName("last");
		when( em.find(Party.class, 1l)).thenReturn(expectedParty);
		//when
		Party actualParty = classUnderTest.read(1l);
		
		//then
		assertEquals(expectedParty, actualParty);
		verify( em).find(Party.class, 1l);
	}

	@Test
	public void testUpdate() {
		//given
		expectedParty = new Person();
		Person p = (Person)expectedParty;
		p.setFirstName("first");
		p.setLastName("last");
		when( em.merge( expectedParty)).thenReturn(expectedParty);
		
		//when
		Party actualParty = classUnderTest.update( expectedParty);
		
		//then
		assertEquals(expectedParty, actualParty);
		verify( em).merge(expectedParty);
	}

	@SuppressWarnings("serial")
	@Test
	public void testDelete() {
		//given
		expectedParty = new Person();
		Person p = (Person)expectedParty;
		p.setFirstName("first");
		p.setLastName("last");
		doAnswer( new DoesNothing() {
			public Object answer(InvocationOnMock invocation) {				
				return null;
			}
		}).when( em).remove(p);
		
		//when
		classUnderTest.delete( expectedParty);
		
		//then		
		verify( em).remove(expectedParty);
	}
	
	@Before
	public void before() {
		em = mock(EntityManager.class);
		classUnderTest = spy( new PartyCrudServices( em));
	}

}