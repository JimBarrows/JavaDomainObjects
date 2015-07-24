package test.specifications.CustomerOfSpecification;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jdo.party.model.Party;
import jdo.party.model.PartyRole;
import jdo.party.model.relationship.CustomerRelationship;
import jdo.party.model.roles.Customer;
import jdo.party.model.roles.InternalOrganization;
import jdo.party.specifications.CustomerOfSpecification;

public class CustomerOfSpecificationTest {

	protected CustomerOfSpecification classUnderTest;
	protected Party party = new Party();
	private boolean actualResult;
	protected boolean expectedResult;
	protected InternalOrganization relationshipFrom = new InternalOrganization();
	protected Customer customerRole = new Customer();
	protected CustomerRelationship customerRelationship = new CustomerRelationship(relationshipFrom, customerRole);
	protected Party vendor = new Party();

	@Before
	public void givenTheFollowing() {
		vendor.addPartyRole(relationshipFrom);		
		addRolesToParty();
		classUnderTest = new CustomerOfSpecification(vendor);
	}

	protected void addRolesToParty() {
		party.addPartyRole(customerRole);
	}
	
	@Test
	public void whenTheFollowing() {
		actualResult = classUnderTest.isSatisfiedBy(party);
	}

	@After
	public void thenTheFollowing() {
		assertEquals(expectedResult, actualResult);
	}
}
