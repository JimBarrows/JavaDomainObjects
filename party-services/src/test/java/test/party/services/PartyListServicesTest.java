package test.party.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import mbmp.party.model.Organization;
import mbmp.party.model.Party;
import mbmp.party.model.Person;
import mbms.party.services.implementation.PartyListServices;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PartyListServices.class)
public class PartyListServicesTest {

	@Mock
	private EntityManager em;
	
	@Mock
	private Query query;

	PartyListServices classUnderTest;

	Party expectedParty;

	@Test
	public void testList() {
		//given
		List<Party> expectedList = createExpectedList();
		when( em.createNamedQuery("partyList")).thenReturn(query);
		when( query.getResultList()).thenReturn(expectedList);
		
		//when
		List<Party> list = classUnderTest.list();
		
		//then
		assertEquals( expectedList, list);
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

	@Test
	public void testListIntInt() {
		fail("Not yet implemented");
	}

	@Before
	public void before() {
		classUnderTest = spy(new PartyListServices(em));
	}
}
