package com.bizondemand.biz360.model

import java.math.BigDecimal
import java.math.BigDecimal.ZERO
import java.util.Locale._
import java.util.Currency

class Money(currency:Currency, amount:BigDecimal)
case class USDollar(amount:BigDecimal) extends Money(Currency.getInstance(US), amount)
