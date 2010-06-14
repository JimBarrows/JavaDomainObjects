package com.bizondemand.biz360.accounting.model

import scala.collection.mutable._

import org.joda.time._

import com.bizondemand.biz360.model._
import com.bizondemand.biz360.accounting_budgeting.model.accounting._


/**If you need accounting for a class, then add this trait and you get the accounting functionality.  This would
	be the InternalOrganization class from Party normally, but can be anything.
	*/
trait Accounting{
	val generalLedgerAccounts = new HashSet[OrganizationGLAccount] 
	val accountingPeriods = new HashSet[AccountingPeriod] 
	val accountingTransactions = new HashSet[InternalAccountingTransaction] 
	
	def +( generalLedgerAccount:GeneralLedgerAccount) = {
		generalLedgerAccounts += OrganizationGLAccount( new DateRange, generalLedgerAccount)
	}

	def expire( generalLedgerAccount:GeneralLedgerAccount) = {
		val toExpire = generalLedgerAccounts.elements.find( p =>
				((p.glAccount == generalLedgerAccount) && (p.dateRange.inRangeNow)))
		toExpire.map( _.dateRange.end=Some( new DateMidnight().minusDays(1)))
		generalLedgerAccounts
	}

}


/**There can be one chart of accounts for an organization and it's internal organizations, so the chart is managed
	separate.
	*/
trait ChartOfAccounts {

		val chartOfAccounts = new HashSet[GeneralLedgerAccount]

		def +( generalLedgerAccount:GeneralLedgerAccount) = {
			chartOfAccounts += generalLedgerAccount
		}
}


/**Some accounting transactions are related to parties outside of the organization, such as tax authorities, lenders,
	employees etc, so attach this trait to those entities.
	*/
trait ExternalTransactionSource {
	var accountingTransactions = new HashSet[ExternalAccountingTransaction]
}
