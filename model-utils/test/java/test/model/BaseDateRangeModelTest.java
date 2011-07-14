package test.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.joda.time.DateTime;
import org.junit.Test;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;


public class BaseDateRangeModelTest {

	private BaseDateRangeModel classUnderTest;
	private final DateTime yesterday = new DateTime().minusDays(1);
	private final DateTime tomorrow = new DateTime().plusDays(1);
	private final DateTime dayAfterTomorrow = new DateTime().plusDays(2);
	
	/* BaseDateRange is an abstract class, and can't be directly instantiated.  This
	 * allows us to test the base functionality.
	 */
	private class ChildDateRangeModel extends BaseDateRangeModel {

		public ChildDateRangeModel() {
			super();
		}

		public ChildDateRangeModel(Long id, Long version, DateTime from,
				DateTime thru) {
			super(id, version, from, thru);
		}

		public ChildDateRangeModel(Long id, Long version, DateTime from) {
			super(id, version, from);
		}
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	}
	
	@Test
	public void activeIfFromBeforeNow_ThruNull() {
		classUnderTest = new ChildDateRangeModel(1l, 0l, yesterday) ;
		
		//when
		boolean active = classUnderTest.isActive();
		
		//then
		assertTrue( active);
	}
	
	@Test
	public void notActiveIfFromAfterNow_ThruNull() {
		classUnderTest = new ChildDateRangeModel(1l, 0l, tomorrow) ;
		
		//when
		boolean active = classUnderTest.isActive();
		
		//then
		assertFalse( active);
	}
	
	@Test
	public void activeIfFromIsEqualNow_ThruNull() {
		//given
		DateTime now = new DateTime();
		classUnderTest = new ChildDateRangeModel(1l, 0l, now) ;
		
		//when
		boolean active = classUnderTest.isActive();
		
		//then
		assertTrue( active);
	}
	
	@Test
	public void activeIfFromBeforeNowThruAfterNow() {
		//given
		classUnderTest = new ChildDateRangeModel(1l, 0l, yesterday, tomorrow) ;
		
		//when
		boolean active = classUnderTest.isActive();
		
		//then
		assertTrue( active);
	}
	
	@Test
	public void notActiveIfFromAfterNowThruAfterNow() {
		//given
		classUnderTest = new ChildDateRangeModel(1l, 0l, tomorrow, dayAfterTomorrow) ;
		
		//when
		boolean active = classUnderTest.isActive();
		
		//then
		assertFalse( active);
	}
	
	@Test
	public void activeIfFromIsEqualNowThruIsNow() {
		//given
		DateTime now = new DateTime();
		classUnderTest = new ChildDateRangeModel(1l, 0l, now, now) ;
		
		//when
		boolean active = classUnderTest.isActive();
		
		//then
		assertTrue( active);
	}
	
	@Test
	public void dateRangeInvalidIfNoFromDate() {
		//given
		classUnderTest = new ChildDateRangeModel();
		classUnderTest.setFrom(null);
		
		//when
		boolean dateRangeValid = classUnderTest.isDateRangeValid();
		
		//then
		assertFalse( dateRangeValid);
	}
	
	@Test
	public void dateRangeValidThruIsNull() {
		//given
		classUnderTest = new ChildDateRangeModel();
		
		//when
		boolean dateRangeValid = classUnderTest.isDateRangeValid();
		
		//then
		assertTrue( dateRangeValid);
	}
	
	@Test
	public void dateRangeInvalidWhenThruBeforeFrom() {
		//given
		classUnderTest = new ChildDateRangeModel(1l, 0l, tomorrow, yesterday);
		
		//when
		boolean dateRangeValid = classUnderTest.isDateRangeValid();
		
		//then
		assertFalse( dateRangeValid);
	}
}
