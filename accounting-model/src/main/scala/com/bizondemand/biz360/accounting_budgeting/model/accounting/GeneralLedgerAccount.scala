package com.bizondemand.biz360.accounting_budgting.model.accounting

import scala.collection.mutable._

class GeneralLedgerAccount( name:String, description:String ) {
	val associatedWith = new HashSet[OrganizationGLAccount]
}

class AssetAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)
case class CurrentAssetAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)
case class FixedAssetAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)
case class OtherAssetAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)

class LiabilityAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)
case class CurrentLiabilityAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)
case class LongTermLiabilityAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)

case class RevenueAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)

case class ExpenseAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)

case class COGSAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)

case class EquityAccount( name:String, description:String) extends GeneralLedgerAccount( name, description)
