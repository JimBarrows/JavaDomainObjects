package com.bizondemand.biz360.budgeting.model

import java.util.UUID
import org.joda.time.Duration
import org.joda.time.Period

class StandardTimePeriod( number:Long, period:Period) {
	var budgets : List[Budget]
	
	def add( budget:Budget) = budgets.add( budget)
}

case class YearPeriod( number:Long) extends AccountingPeriod(number, Period.years(1))
case class MonthPeriod( number:Long) extends AccountingPeriod(number, Period.months(1))
case class QuarterPeriod( number:Long) extends AccountingPeriod(number, Period.months(3))
case class SemiAnnual( number:Long) extends AccountingPeriod(number, Period.months(6))
case class BiWeekly( number:Long) extends AccountingPeriod(number, Period.weeks(2))
case class Weekly( number:Long) extends AccountingPeriod(number, Period.weeks(1))
