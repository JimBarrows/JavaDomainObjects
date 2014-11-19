package jdo.humanresoures.model.payroll;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.asset.PeriodType;
import jdo.invoice.model.payment.PaymentMethodType;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-11-07T22:13:42.273-0700")
@StaticMetamodel(PayrollPreference.class)
public class PayrollPreference_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PayrollPreference, DeductionType> type;
	public static volatile SingularAttribute<PayrollPreference, PaymentMethodType> paymentMethodType;
	public static volatile SingularAttribute<PayrollPreference, String> accountNumber;
	public static volatile SingularAttribute<PayrollPreference, String> bankName;
	public static volatile SingularAttribute<PayrollPreference, BigDecimal> flatAmount;
	public static volatile SingularAttribute<PayrollPreference, PartyRole> forEmployee;
	public static volatile SingularAttribute<PayrollPreference, PartyRole> forInternalOrganization;
	public static volatile SingularAttribute<PayrollPreference, Integer> percentage;
	public static volatile SingularAttribute<PayrollPreference, PeriodType> period;
	public static volatile SingularAttribute<PayrollPreference, String> routingNumber;
}