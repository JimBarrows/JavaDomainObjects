package bizondemand.party.model

import javax.persistence._;
import java.util._;

@Entity
class PartyRole { 

	@Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  var id : Long = _

	@ManyToOne( optional=false)
	var roleFor: Party = _

	@Temporal(TemporalType.DATE)
	var from: Date = new Date() 

	@Temporal(TemporalType.DATE)
	var thru: Date = _
}

