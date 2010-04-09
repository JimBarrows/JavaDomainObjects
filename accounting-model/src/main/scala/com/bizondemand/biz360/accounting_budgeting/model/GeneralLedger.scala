package com.bizondemand.biz360.accounting_budgting.model

import com.bizondemand.biz360.accounting_budgting.model.accounting._

/**If you need accounting for a class, then add this trait and you get the accounting functionality.  This would
	be the InternalOrganization class from Party normally, but can be anything.
	*/
trait Accounting {
		var generalLedgerAccounts : List[OrganizationGLAccount]
		var accountingPeriods : List[AccountingPeriod]
		var accountingTransactions : List[InternalAccountingTransaction]
}


/**Some accounting transactions are related to parties outside of the organization, such as tax authorities, lenders,
	employees etc, so attach this trait to those entities.
	*/
trait ExternalTransactionSource {
		var accountingTransactions : List[ExternalAccountingTransaction]
}
