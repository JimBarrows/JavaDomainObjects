package com.bizondemand.biz360.accounting_budgeting.model.accounting

import scala.collection.mutable._
import org.joda.time.LocalDate
import com.bizondemand.biz360.model._

class AccountingTransaction( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) {

	def debitList : List[Debit] = details.filter( _ match { 
			case x:Debit => true
			case _ =>false
			}).asInstanceOf[List[Debit]]
	

	def creditList:List[Credit] = details.filter( _ match { 
			case x:Credit => true
			case _ =>false
			}).asInstanceOf[List[Credit]]
	
	def debitTotal: BigDecimal = debitList.foldLeft( BigDecimal(0))(_ + _.amount)

	def creditTotal:BigDecimal = creditList.foldLeft( BigDecimal(0))( _ + _.amount)

	if( debitTotal != creditTotal) throw new IllegalArgumentException("Debits and Credits are not equal")

}

class TransactionDetail( seq:Int, amount:BigDecimal, allocatedTo:OrganizationGLAccount ) {
	allocatedTo.add(this)
	var relatedTo:Option[AccountingTransaction] = None
	var associatedWith:Option[AccountingTransaction] = None
}

case class Debit( seq:Int, amount:BigDecimal, allocatedTo:OrganizationGLAccount ) extends TransactionDetail(seq, amount, allocatedTo )

case class Credit( seq:Int, amount:BigDecimal, allocatedTo:OrganizationGLAccount ) extends TransactionDetail(seq, amount, allocatedTo )

class InternalAccountingTransaction( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends AccountingTransaction(id, transactionDate, entryDate, description,details)

case class Depreciation( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends InternalAccountingTransaction(id, transactionDate, entryDate, description,details)

case class Capitalization( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends InternalAccountingTransaction(id, transactionDate, entryDate, description,details)

case class Amortization( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends InternalAccountingTransaction(id, transactionDate, entryDate, description,details)

case class OtherInternalAccountingTransaction( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends InternalAccountingTransaction(id, transactionDate, entryDate, description,details)


class ExternalAccountingTransaction( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends AccountingTransaction(id, transactionDate, entryDate, description,details)

class ObligationAccountingTransaction( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends ExternalAccountingTransaction(id, transactionDate, entryDate, description,details)

case class Note( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends ObligationAccountingTransaction(id, transactionDate, entryDate, description,details)
case class TaxDue( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends ObligationAccountingTransaction(id, transactionDate, entryDate, description,details)
case class OtherObligation( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends ObligationAccountingTransaction(id, transactionDate, entryDate, description,details)
case class CreditMemo( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends ObligationAccountingTransaction(id, transactionDate, entryDate, description,details)
case class CreditLine( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends ObligationAccountingTransaction(id, transactionDate, entryDate, description,details)

class PaymentAccountingTransaction( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends ExternalAccountingTransaction(id, transactionDate, entryDate, description, details)
case class Receipt( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends PaymentAccountingTransaction(id, transactionDate, entryDate, description, details)
case class Disbursement( id:Long, transactionDate:LocalDate, entryDate:LocalDate, description:String, details:List[TransactionDetail]) 
		extends PaymentAccountingTransaction(id, transactionDate, entryDate, description, details)

