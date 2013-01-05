package mbmp.humanresoures.model.payroll;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.accounting.model.asset.PeriodType;
import mbmp.invoice.model.payment.PaymentMethodType;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2013-01-05T07:41:45.362-0700")
@StaticMetamodel(PayrollPreference.class)
public class PayrollPreference_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PayrollPreference, PaymentMethodType> paymentMethodType;
	public static volatile SingularAttribute<PayrollPreference, String> accountNumber;
	public static volatile SingularAttribute<PayrollPreference, String> bankName;
	public static volatile SingularAttribute<PayrollPreference, BigDecimal> flatAmount;
	public static volatile SingularAttribute<PayrollPreference, PartyRole> forEmployee;
	public static volatile SingularAttribute<PayrollPreference, PartyRole> forInternalOrganization;
	public static volatile SingularAttribute<PayrollPreference, Integer> percentage;
	public static volatile SingularAttribute<PayrollPreference, PeriodType> period;
	public static volatile SingularAttribute<PayrollPreference, String> routingNumber;
	public static volatile SingularAttribute<PayrollPreference, DeductionType> type;
}
