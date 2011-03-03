package bizondemand.party.model

import bizondemand.biz360.LocalEmf
import javax.persistence._;
import java.util._;

@Entity
class Role( _id: Long, _name: String, _parent: Option[Role] = None) { 
	def this() = this( 0, "", None)
	@Id 
	var id : Long = _id  
	var name: String = _name
	@OneToMany(mappedBy="parent", targetEntity=classOf[Role], cascade=Array(CascadeType.ALL))
	var children : _root_.java.util.Set[Role] = new _root_.java.util.HashSet[Role]()

	@ManyToOne
	var parent: Role = _parent.getOrElse( null )

}

object Role {
	lazy val InternalOrganization  = {
		val em = LocalEmf.openEM()
		em.find( classOf[Role], 1l)
		
	}
}

/*
object Agent extends Role(1l, "Agent", Some(OrganizationRole))
object Association extends Role(1l, "Association", Some(OrganizationRole))
object BillToCustomer extends Role(1l, "Bill To Customer", Some(Customer))
object BillToPurchaser extends Role(1l, "Bill To Purchaser")
object Carrier extends Role(1l, "Carrier", Some(OrganizationRole))
object Competitor extends Role(1l, "Competitor", Some(OrganizationRole))
object Consumer extends Role(1l, "Conusmer" )
object Contact extends Role(1l, "Contact", Some(PersonRole) )
object Contractor extends Role(1l, "Contractor", Some(Worker) )
object Customer extends Role(1l, "Customer", Some(Consumer))
object Department extends Role(1l, "Department", Some(OrganizationUnit))
object Distributor extends Role(1l, "Distributor", Some(OrganizationRole))
object DistributorChannel extends Role(1l, "Distributor Channel", Some(OrganizationRole))
object Divsion extends Role(1l, "Divsion", Some(OrganizationRole))
object Employee extends Role(1l, "Employee", Some(Worker))
object EndUserCustomer extends Role(1l, "End User Customer", Some(Customer))
*/
////object OrganizationRole extends Role(1l, "Organization")

