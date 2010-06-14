package com.bizondemand.biz360.accounting.model

import scala.collection.mutable._

class GeneralLedgerAccount( name:String, description:String ) {
	val associatedWith = new HashSet[OrganizationGLAccount]
}

/**These are the primary accounts that every accounting system needs.
	*/
case class AssetAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)
case class LiabilityAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)
case class EquityAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)
case class RevenueAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)
case class ExpenseAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)

/**This is a common account for some businesses.
	*/
case class COGSAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)





