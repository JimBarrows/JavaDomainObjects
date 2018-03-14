package jdo.validations;

import org.apache.commons.beanutils.PropertyUtils;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.logging.Logger;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = AtLeastOneNotNull.AtLeastOneNotNullValidator.class)
@Documented
public @interface AtLeastOneNotNull {
	String message() default "{jdo.validations.AtLeastOneNotNull}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String[] fieldNames();

	class AtLeastOneNotNullValidator implements ConstraintValidator<AtLeastOneNotNull, Object> {

		private final static Logger logger = Logger.getLogger(AtLeastOneNotNullValidator.class.getName());
		private String[] fieldNames;

		public void initialize(AtLeastOneNotNull constraintAnnotation) {

			this.fieldNames = constraintAnnotation.fieldNames();

		}

		public boolean isValid(Object object, ConstraintValidatorContext constraintContext) {

			if (object == null)
				return true;

			try {

				for (String fieldName : fieldNames) {
					Object property = PropertyUtils.getProperty(object, fieldName);

					if (property != null)
						return true;
				}

				return false;

			} catch (Exception e) {
				logger.warning("isValid(Object object=" + object + ", ConstraintValidatorContext constraintContext=" + constraintContext
						+ ") - String[] fieldNames=" + fieldNames + ", Object object=" + object + ", ConstraintValidatorContext constraintContext="
						+ constraintContext + ", Exception e=" + e.getMessage());

				return false;
			}
		}

	}

}
