package com.bizondemand.biz360.model

import org.joda.time._

case class DateRange( start:DateMidnight, var end:Option[DateMidnight]) {
	def this( start:DateMidnight) = this( start, None)
	def this() = this(new DateMidnight, None)
	
	def afterStart = start.toInstant.isBeforeNow || start.toInstant.isEqualNow

	def beforeEnd = end.map(_.toInstant.isAfterNow).getOrElse(true) || end.toInstant.isEqualNow
	
	def inRangeNow = afterStart && beforeEnd
}

