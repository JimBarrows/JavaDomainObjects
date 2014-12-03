package jdo.agreement.model.term;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.agreement.model.Agreement;
import jdo.agreement.model.item.AgreementItem;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value = "Dali", date = "2014-12-02T21:35:28.471-0700")
@StaticMetamodel(AgreementTerm.class)
public class AgreementTerm_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<AgreementTerm, Agreement>		agreement;
	public static volatile SingularAttribute<AgreementTerm, AgreementItem>	agreementItem;
	public static volatile SingularAttribute<AgreementTerm, DateTimeRange>	dateTimeRange;
	public static volatile SingularAttribute<AgreementTerm, Money>			value;
}
