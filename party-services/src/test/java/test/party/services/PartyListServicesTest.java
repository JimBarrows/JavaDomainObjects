package test.party.services;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import mbms.party.services.implementation.PartyListServices;

import org.apache.commons.lang.math.NumberUtils;
import org.apache.tomcat.util.IntrospectionUtils;
import org.hamcrest.object.IsEventFrom;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.nsfwenterprises.biz360.party.model.Organization;
import com.nsfwenterprises.biz360.party.model.Party;
import com.nsfwenterprises.biz360.party.model.Person;

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
