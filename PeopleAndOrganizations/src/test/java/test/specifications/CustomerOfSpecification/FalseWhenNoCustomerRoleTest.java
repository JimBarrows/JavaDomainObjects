package test.specifications.CustomerOfSpecification;

import jdo.party.model.PartyRole;

public class FalseWhenNoCustomerRoleTest extends CustomerOfSpecificationTest {

	@Override
	public void givenTheFollowing() {
		expectedResult = false;		
		super.givenTheFollowing();
		
	}

	@Override
	protected void addRolesToParty() {
		party.addPartyRole( new PartyRole());
	}

}
