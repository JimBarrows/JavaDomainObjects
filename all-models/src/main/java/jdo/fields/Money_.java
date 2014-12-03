package jdo.fields;

import java.math.BigDecimal;
import java.util.Currency;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-02T21:45:37.102-0700")
@StaticMetamodel(Money.class)
public class Money_ {
	public static volatile SingularAttribute<Money, Currency> currency;
	public static volatile SingularAttribute<Money, BigDecimal> amount;
}
