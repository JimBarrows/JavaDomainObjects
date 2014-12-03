package jdo.fields;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class Money {

	@NotNull
	private Currency	currency;

	@NotNull
	private BigDecimal	amount;

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		return true;
	}

	public Money(Currency currency, BigDecimal amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public Money() {
		super();
	}

	public static final Money UsDollar(BigDecimal amount) {
		return new Money(Currency.getInstance(Locale.US), amount);
	}

	public int compareTo(Money fromAmount) {
		return amount.compareTo(fromAmount.getAmount());
	}
}
