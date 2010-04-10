package test.accounting_budgeting.model.accounting

import com.bizondemand.biz360.model._
import com.bizondemand.biz360.accounting_budgeting.model._
import com.bizondemand.biz360.accounting_budgeting.model.accounting._
import org.specs._
import org.specs.runner.JUnit4

import org.joda.time._

class StructuralTest extends JUnit4(StructuralSpec)
object StructuralSpec extends Specification {

	object chartOfAccounts extends ChartOfAccounts
	object internalAccount extends Accounting
	object externalAccount extends ExternalTransactionSource

	val asset = AssetAccount("Petty Cash","Cash on hand")
	val liability = LiabilityAccount("Accounts Payable", "Money we owe")
	val equity = EquityAccount("Stated Capital", "Money we've put in")
	val revenue = RevenueAccount("Product #1 Sales", "Stuff we've sold")
	val expense = ExpenseAccount("Default Purchase Expense", "Stuff we've spent money on")

	"The library " should {
		"be able to create a chart of accounts" in {
			chartOfAccounts + asset
			chartOfAccounts + liability
			chartOfAccounts + equity
			chartOfAccounts + revenue
			chartOfAccounts + expense

			chartOfAccounts.chartOfAccounts must containAll( asset::liability::equity::revenue::expense::Nil)

		}
		"be able to add a General ledger acount to a class/object with the accounting trait" in {
			internalAccount +  asset
			internalAccount.generalLedgerAccounts must exist( p => (p.glAccount == asset)  && (p.dateRange.inRangeNow))
		}
		"be able to expire a general ledger account" in {
			internalAccount.expire(asset)
			internalAccount.generalLedgerAccounts must exist( p => ((p.glAccount == asset)  && !p.dateRange.inRangeNow))
		}
		"create a balanced Account transaction (debit and credit amounts match)" in {
			val assetOrg = OrganizationGLAccount( new DateRange, asset)
			val liabilityOrg =OrganizationGLAccount( new DateRange, liability) 

			val debit = Debit(2, BigDecimal(2),liabilityOrg ) 
			debit.amount
			val credit = Credit(1, BigDecimal(2), assetOrg ) 

			val details = debit :: credit :: Nil 

			val accountingTransaction = new AccountingTransaction(1, new LocalDate, new LocalDate, "This is a test", details)	
			assetOrg.transactionDetails must exist( _ == credit)
			liabilityOrg.transactionDetails must exist( _ == debit)
		}
		"add InternalAccountingTransactions to the accounting trait" in {

		}
	}
}
