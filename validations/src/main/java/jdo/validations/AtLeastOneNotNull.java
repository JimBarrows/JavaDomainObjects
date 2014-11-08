package jdo.validations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Target({ TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = AtLeastOneNotNull.AtLeastOneNotNullValidator.class)
@Documented
public @interface AtLeastOneNotNull {
	String message() default "{jdo.validations.AtLeastOneNotNull}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String[] fieldNames();

	public static final Logger	logger	= LogManager.getLogger(AtLeastOneNotNull.class.getName());

	public static class AtLeastOneNotNullValidator implements ConstraintValidator<AtLeastOneNotNull, Object> {

		private String[]	fieldNames;

		public void initialize(AtLeastOneNotNull constraintAnnotation) {
			logger.debug("initialize(AtLeastOneNotNull constraintAnnotation) - start");

			this.fieldNames = constraintAnnotation.fieldNames();

			logger.debug("initialize(AtLeastOneNotNull) - end");
		}

		public boolean isValid(Object object, ConstraintValidatorContext constraintContext) {
			logger.debug("isValid(Object object, ConstraintValidatorContext constraintContext) - start");

			if (object == null)
				return true;

			try {

				for (String fieldName : fieldNames) {
					Object property = PropertyUtils.getProperty(object, fieldName);

					if (property != null)
						return true;
				}

				logger.debug("isValid(Object, ConstraintValidatorContext) - end - return value={}", false);
				return false;

			} catch (Exception e) {
				logger.error("isValid(Object object=" + object + ", ConstraintValidatorContext constraintContext=" + constraintContext
						+ ") - String[] fieldNames=" + fieldNames + ", Object object=" + object + ", ConstraintValidatorContext constraintContext="
						+ constraintContext + ", Exception e=" + e, e);

				logger.debug("isValid(Object, ConstraintValidatorContext) - end - return value={}", false);
				return false;
			}
		}

	}

}
