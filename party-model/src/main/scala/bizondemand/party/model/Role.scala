package bizondemand.party.model

import javax.persistence._;
import java.util._;

@Entity
class Role( ) { 
	@Id 
	var id : Long = _  
	var name: String = _
}

object Role {
	def apply( id: Long, name: String) = {
		val r =new Role()
		r.id = id
		r.name = name
		r
	}
}

//class InternalOrganization extends Role(1l, "Internal Organization")

