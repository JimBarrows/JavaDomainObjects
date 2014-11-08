package validations;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

import test.fixtures.AtLeastOneNotBlankTestFixture;

public class AtLeastOneNotBlankValidatorTest {

	private static Validator	validator;

	@BeforeClass
	public static void setup() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void allAreBlank() {
		//given
		AtLeastOneNotBlankTestFixture atLeastOneNotBlankTestFixture = new AtLeastOneNotBlankTestFixture("","");

		//when
		Set<ConstraintViolation<AtLeastOneNotBlankTestFixture>> constraintViolations = validator.validate(atLeastOneNotBlankTestFixture);
		
		//then
		assertEquals(1, constraintViolations.size());
		assertEquals("{jdo.validations.AtLeastOneNotNull}", constraintViolations.iterator().next().getMessage());
	}
	
	@Test
	public void allAreNull() {
		//given
		AtLeastOneNotBlankTestFixture atLeastOneNotBlankTestFixture = new AtLeastOneNotBlankTestFixture();

		//when
		Set<ConstraintViolation<AtLeastOneNotBlankTestFixture>> constraintViolations = validator.validate(atLeastOneNotBlankTestFixture);
		
		//then
		assertEquals(1, constraintViolations.size());
		assertEquals("{jdo.validations.AtLeastOneNotNull}", constraintViolations.iterator().next().getMessage());
	}

	
	@Test
	public void oneIsNotBlank() {
		//given
		AtLeastOneNotBlankTestFixture atLeastOneNotBlankTestFixture = new AtLeastOneNotBlankTestFixture("","not blank anymore");		
		
		//when
		Set<ConstraintViolation<AtLeastOneNotBlankTestFixture>> constraintViolations = validator.validate(atLeastOneNotBlankTestFixture);
		
		//then
		assertEquals(0, constraintViolations.size());
		
	}

}
