package jdo.validations.annotations;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import jdo.validations.validators.AtLeastOneNotBlankValidator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Target({ TYPE, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = AtLeastOneNotBlankValidator.class)
@Documented
public @interface AtLeastOneNotBlank {
	String message() default "{jdo.validations.AtLeastOneNotNull}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String[] fieldNames();

	public static final Logger	logger	= LogManager.getLogger(AtLeastOneNotBlank.class.getName());

}
