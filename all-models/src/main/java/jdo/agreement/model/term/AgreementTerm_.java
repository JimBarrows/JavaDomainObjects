package jdo.agreement.model.term;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.agreement.model.Agreement;
import jdo.agreement.model.item.AgreementItem;
import jdo.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.114-0700")
@StaticMetamodel(AgreementTerm.class)
public class AgreementTerm_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<AgreementTerm, Agreement> agreement;
	public static volatile SingularAttribute<AgreementTerm, AgreementItem> agreementItem;
	public static volatile SingularAttribute<AgreementTerm, BigDecimal> value;
}
