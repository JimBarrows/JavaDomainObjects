package jdo.validations.annotations;

import jdo.validations.validators.AtLeastOneNotBlankValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.logging.Logger;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ TYPE, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = AtLeastOneNotBlankValidator.class)
@Documented
public @interface AtLeastOneNotBlank {
	String message() default "{jdo.validations.AtLeastOneNotNull}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String[] fieldNames();

	Logger logger = Logger.getLogger(AtLeastOneNotBlank.class.getName());

}
