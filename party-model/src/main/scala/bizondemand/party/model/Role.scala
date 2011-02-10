package bizondemand.party.model

import javax.persistence.Entity;
import org.joda.time.Instant

@Entity
case class PartyRole ( roleFor: Party, from: Instant, thru: Instant ){
}

