package test.party.ui.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import mbms.party.services.PartyListServices;
import mbms.party.ui.web.controllers.PartyListController;

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
@PrepareForTest( { PartyListController.class })
public class PartyControllerTest {

	PartyListController classUnderTest;
	@Mock
	PartyListServices partyListServices;
	private List<Party> list;
	
	@Test
	public void testEmptyList() {
		List<Party> list = new ArrayList<Party>();
		//given
		when( partyListServices.list()).thenReturn(list );
		
		//when
		List<Party> result = classUnderTest.getList();
		
		//then
		assertTrue( result.isEmpty());
		verify( partyListServices).list();
	}
	
	@Test
	public void testList() {		
		//given
		when( partyListServices.list()).thenReturn(list );
		
		
		//when
		List<Party> result = classUnderTest.getList();
		
		//then
		assertFalse( result.isEmpty());
		assertEquals( list.size(), result.size());
		assertEquals( list, result);
		verify( partyListServices).list();
	}
	
	@Test
	public void testListPagination() {
		//given				
		List<Party> actualList = list.subList(4, 6);
		when( partyListServices.list(4,6)).thenReturn(actualList);
		classUnderTest.setPageSize(2);
		classUnderTest.setPageNumber(2);
		//when
		List<Party> result = classUnderTest.getList();
		
		//then
		verify( partyListServices, only()).list(4,6);
		
		assertEquals( 2, result.size());
		assertEquals( actualList, result);
	}
	
	@Before
	public void setup() {
		list = new ArrayList<Party>();
		Person p1 = new Person();		
		Person p2 = new Person();
		Person p3 = new Person();
		Organization o1 = new Organization();
		Organization o2 = new Organization();
		Organization o3 = new Organization();
		list.add( p1);
		list.add( p2);
		list.add( p3);
		list.add( o1);
		list.add( o2);
		list.add( o3);
		classUnderTest = new PartyListController(partyListServices);
	}

}
