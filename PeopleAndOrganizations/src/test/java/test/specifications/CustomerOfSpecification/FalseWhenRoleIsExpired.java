package test.specifications.CustomerOfSpecification;

import java.time.ZonedDateTime;

public class FalseWhenRoleIsExpired extends CustomerOfSpecificationTest {

	@Override
	public void givenTheFollowing() {
		expectedResult = false;		
		super.givenTheFollowing();
		customerRole.getDateTimeRange().setFromDate(ZonedDateTime.now().minusDays(10));
		customerRole.getDateTimeRange().setThruDate(ZonedDateTime.now().minusDays(5));
	}
	
}
