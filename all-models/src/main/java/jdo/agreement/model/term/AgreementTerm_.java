package jdo.agreement.model.term;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.agreement.model.Agreement;
import jdo.agreement.model.item.AgreementItem;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-02T20:44:37.114-0700")
@StaticMetamodel(AgreementTerm.class)
public class AgreementTerm_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<AgreementTerm, Agreement> agreement;
	public static volatile SingularAttribute<AgreementTerm, AgreementItem> agreementItem;
	public static volatile SingularAttribute<AgreementTerm, BigDecimal> value;
	public static volatile SingularAttribute<AgreementTerm, DateTimeRange> dateTimeRange;
}
