package com.bizondemand.biz360.accounting.model

import java.math.BigDecimal
import java.math.BigDecimal._
import scala.collection.mutable._
import org.joda.time._
import com.bizondemand.biz360.model._

case class OrganizationGLAccount( dateRange:DateRange, 
		glAccount:GeneralLedgerAccount ) {

	def this(glAccount:GeneralLedgerAccount) = this(new DateRange, glAccount)

	val total :Money = USDollar(BigDecimal.ZERO)	

	val transactionDetails = new HashSet[TransactionDetail]  

	val comprisedOf:List[OrganizationGLAccount] = Nil

	val subsidiary:Option[OrganizationGLAccount] = None

	def add( transactionDetail:TransactionDetail) : Unit = {
			transactionDetails += transactionDetail
	}

}
