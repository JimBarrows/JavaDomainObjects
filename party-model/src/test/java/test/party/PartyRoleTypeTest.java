package test.party;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nsfwenterprises.biz360.party.model.PartyRoleType;

public class PartyRoleTypeTest {

	@Test
	public void testEqualsObject() {
		//given
		PartyRoleType left = new PartyRoleType(343l, 0l, "left");
		PartyRoleType right = new PartyRoleType( 343l, 0l, "left");
		
		//when
		boolean equals = left.equals( right);
		
		//then
		assertTrue( equals);
	}

}
