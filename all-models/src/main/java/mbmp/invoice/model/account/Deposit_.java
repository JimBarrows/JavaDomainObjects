package mbmp.invoice.model.account;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.payment.Receipt;

@Generated(value="Dali", date="2013-01-04T22:11:20.466-0700")
@StaticMetamodel(Deposit.class)
public class Deposit_ extends FinancialAccountTransaction_ {
	public static volatile ListAttribute<Deposit, Receipt> causedBy;
}
