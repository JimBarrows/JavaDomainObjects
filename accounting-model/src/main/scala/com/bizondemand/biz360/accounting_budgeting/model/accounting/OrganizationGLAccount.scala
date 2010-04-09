package com.bizondemand.biz360.accounting_budgting.model.accounting

import java.math.BigDecimal
import java.math.BigDecimal._
import scala.collection.mutable._
import org.joda.time.Duration
import com.bizondemand.biz360.model._

case class OrganizationGLAccount( duration:Duration, 
		glAccount:GeneralLedgerAccount ) {
	
	val total :Money = USDollar(BigDecimal.ZERO)	

	val transactionDetails = new HashSet[TransactionDetail]  

	val comprisedOf:List[OrganizationGLAccount] = Nil

	val subsidiary:Option[OrganizationGLAccount] = None

	def add( transactionDetail:TransactionDetail) : Unit = {
			transactionDetails += transactionDetail
	}

}
