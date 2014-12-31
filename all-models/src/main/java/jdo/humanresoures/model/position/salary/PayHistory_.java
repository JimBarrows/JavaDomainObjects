package jdo.humanresoures.model.position.salary;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.asset.PeriodType;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.relationship.Employment;

@Generated(value="Dali", date="2014-12-31T07:38:59.470-0700")
@StaticMetamodel(PayHistory.class)
public class PayHistory_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PayHistory, Money> amount;
	public static volatile SingularAttribute<PayHistory, String> comment;
	public static volatile SingularAttribute<PayHistory, PeriodType> forPeriodType;
	public static volatile SingularAttribute<PayHistory, Employment> recordFor;
	public static volatile SingularAttribute<PayHistory, SalaryStep> step;
	public static volatile SingularAttribute<PayHistory, DateTimeRange> dateTimeRange;
}
