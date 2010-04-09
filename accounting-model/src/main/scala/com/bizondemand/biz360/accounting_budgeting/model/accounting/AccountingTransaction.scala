package com.bizondemand.biz360.accounting_budgting.model.accounting

import scala.collection.mutable._
import org.joda.time.LocalDate

class AccountingTransaction( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) {
	val details = new HashSet[TransactionDetail]
}

class TransactionDetail( seq:Int, amount:BigDecimal, allocatedTo:OrganizationGLAccount, partOf:AccountingTransaction) {
	allocatedTo.add(this)
	var relatedTo:Option[AccountingTransaction] = None
	var associatedWith:Option[AccountingTransaction] = None
}

case class Debit( seq:Int, amount:BigDecimal, allocatedTo:OrganizationGLAccount, partOf:AccountingTransaction) extends TransactionDetail(seq, amount, allocatedTo, partOf)
case class Credit( seq:Int, amount:BigDecimal, allocatedTo:OrganizationGLAccount, partOf:AccountingTransaction) extends TransactionDetail(seq, amount, allocatedTo, partOf)

class InternalAccountingTransaction( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends AccountingTransaction(id, transactionDate, entryDate, description)

case class Depreciation( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends InternalAccountingTransaction(id, transactionDate, entryDate, description)

case class Capitalization( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends InternalAccountingTransaction(id, transactionDate, entryDate, description)

case class Amortization( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends InternalAccountingTransaction(id, transactionDate, entryDate, description)

case class OtherInternalAccountingTransaction( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends InternalAccountingTransaction(id, transactionDate, entryDate, description)


class ExternalAccountingTransaction( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends AccountingTransaction(id, transactionDate, entryDate, description)

class ObligationAccountingTransaction( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends ExternalAccountingTransaction(id, transactionDate, entryDate, description)

case class Note( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends ObligationAccountingTransaction(id, transactionDate, entryDate, description)
case class TaxDue( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends ObligationAccountingTransaction(id, transactionDate, entryDate, description)
case class OtherObligation( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends ObligationAccountingTransaction(id, transactionDate, entryDate, description)
case class CreditMemo( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends ObligationAccountingTransaction(id, transactionDate, entryDate, description)
case class CreditLine( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends ObligationAccountingTransaction(id, transactionDate, entryDate, description)

class PaymentAccountingTransaction( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends ExternalAccountingTransaction(id, transactionDate, entryDate, description)
case class Receipt( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends PaymentAccountingTransaction(id, transactionDate, entryDate, description)
case class Disbursement( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String) 
		extends PaymentAccountingTransaction(id, transactionDate, entryDate, description)
