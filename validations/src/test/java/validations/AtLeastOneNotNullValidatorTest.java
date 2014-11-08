package validations;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

import test.fixtures.AtLeastOneNotNullTestFixture;

public class AtLeastOneNotNullValidatorTest {

	private static Validator	validator;

	@BeforeClass
	public static void setup() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@Test
	public void allAreNull() {
		//given
		AtLeastOneNotNullTestFixture AtLeastOneNotNullTestFixture = new AtLeastOneNotNullTestFixture();

		//when
		Set<ConstraintViolation<AtLeastOneNotNullTestFixture>> constraintViolations = validator.validate(AtLeastOneNotNullTestFixture);
		
		//then
		assertEquals(1, constraintViolations.size());
		assertEquals("{jdo.validations.AtLeastOneNotNull}", constraintViolations.iterator().next().getMessage());
	}

	
	@Test
	public void oneIsNotNull() {
		//given
		AtLeastOneNotNullTestFixture AtLeastOneNotNullTestFixture = new AtLeastOneNotNullTestFixture(null,1);		
		
		//when
		Set<ConstraintViolation<AtLeastOneNotNullTestFixture>> constraintViolations = validator.validate(AtLeastOneNotNullTestFixture);
		
		//then
		assertEquals(0, constraintViolations.size());
		
	}

}
