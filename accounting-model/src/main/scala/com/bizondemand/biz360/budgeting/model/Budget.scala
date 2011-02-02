package com.bizondemand.biz360.budgeting.model

class Budget(id: Long, comment:String, timePeriod:StandardTimePeriod) {
	timePeriod.add( this);
}

class OperatingBudget (id:Long, comment:String, timePeriod:StandardTimePeriod) extends Budget(id, comment, timePeriod)

class CaptialBudget (id:Long, comment:String, timePeriod:StandardTimePeriod) extends Budget(id,comment, timePeriod:StandardTimePeriod)