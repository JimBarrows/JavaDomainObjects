package jdo.validations.validators;

import jdo.validations.annotations.AtLeastOneNotBlank;
import org.apache.commons.beanutils.PropertyUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class AtLeastOneNotBlankValidator implements ConstraintValidator<AtLeastOneNotBlank, Object> {

	private String[]	fieldNames;

	@Override
	public void initialize(AtLeastOneNotBlank constraintAnnotation) {

		this.fieldNames = constraintAnnotation.fieldNames();

	}

	@Override
	public boolean isValid(Object object, ConstraintValidatorContext constraintContext) {

		if (object == null)
			return true;

		try {
			boolean valid = false;
			for (String fieldName : fieldNames) {
				Object property = PropertyUtils.getProperty(object, fieldName);
				if( property instanceof String) {
					valid = valid || isNotBlank( (String)property);
				}else if (property == null){
					valid=false;
				}
			}
			
			return valid;

		} catch (Exception e) {
			AtLeastOneNotBlank.logger.severe("isValid(Object object=" + object + ", ConstraintValidatorContext constraintContext=" + constraintContext
					+ ") - String[] fieldNames=" + fieldNames + ", Object object=" + object + ", ConstraintValidatorContext constraintContext="
					+ constraintContext + ", Exception e=" + e.getMessage());

			return false;
		}
	}

}