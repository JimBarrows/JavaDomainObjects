package test.specifications.CustomerOfSpecification;

public class FalseWhenThereIsNoCustomerRelationshipTest extends CustomerOfSpecificationTest {

	@Override
	public void givenTheFollowing() {
		expectedResult = false;		
		super.givenTheFollowing();
		customerRelationship = null;		
	}
}
