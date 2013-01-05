package mbmp.agreement.model.term;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.agreement.model.Agreement;
import mbmp.agreement.model.item.AgreementItem;
import mbmp.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2013-01-05T07:41:45.292-0700")
@StaticMetamodel(AgreementTerm.class)
public class AgreementTerm_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<AgreementTerm, Agreement> agreement;
	public static volatile SingularAttribute<AgreementTerm, AgreementItem> agreementItem;
	public static volatile SingularAttribute<AgreementTerm, BigDecimal> value;
}
