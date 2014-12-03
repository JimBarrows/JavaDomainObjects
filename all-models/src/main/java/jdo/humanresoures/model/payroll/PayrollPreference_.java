package jdo.humanresoures.model.payroll;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.accounting.model.asset.PeriodType;
import jdo.fields.Money;
import jdo.invoice.model.payment.PaymentMethodType;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;

@Generated(value = "Dali", date = "2014-12-02T21:35:28.713-0700")
@StaticMetamodel(PayrollPreference.class)
public class PayrollPreference_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PayrollPreference, DeductionType>		type;
	public static volatile SingularAttribute<PayrollPreference, PaymentMethodType>	paymentMethodType;
	public static volatile SingularAttribute<PayrollPreference, String>				accountNumber;
	public static volatile SingularAttribute<PayrollPreference, String>				bankName;
	public static volatile SingularAttribute<PayrollPreference, PartyRole>			forEmployee;
	public static volatile SingularAttribute<PayrollPreference, PartyRole>			forInternalOrganization;
	public static volatile SingularAttribute<PayrollPreference, Integer>			percentage;
	public static volatile SingularAttribute<PayrollPreference, PeriodType>			period;
	public static volatile SingularAttribute<PayrollPreference, String>				routingNumber;
	public static volatile SingularAttribute<PayrollPreference, DateTimeRange>		dateTimeRange;
	public static volatile SingularAttribute<PayrollPreference, Money>				flatAmount;
}
