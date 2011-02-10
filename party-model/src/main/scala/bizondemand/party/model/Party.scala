package bizondemand.party.model

import _root_.javax.persistence._


/**
 * Represents information on either an organization, or a single person.
 * 
 * @see Data Model Resource Book Volume 1 Figure 2.3, page 30
 * @see Data Model Resource Book Volume 1 Figure 2.4, page 34
 * @see Data Model Resource Book Volume 1 Figure 2.8, page 50
 * @see Data Model Resource Book Volume 1 Figure 2.10, page 55
 * @see Data Model Resource Book Volume 1 Figure 2.11, page 59
 * @see Data Model Resource Book Volume 1 Figure 2.12, page 60
 * @see Data Model Resource Book Volume 1 Figure 2.13, page 64
 */

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
class Party {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	var id: Long = _

//	@OneToMany(mappedBy="roleFor", targetEntity=classOf[PartyRole])
	//var roles : _root_.java.util.Set[PartyRole] = new _root_.java.util.HashSet[PartyRole]()

}

/**
 * An organization, such as a family, company, government agency etc.
 * @see Data Model Resource Book Volume 1 Figure 3.5, page 82
 */

@Entity
class Organization extends Party {

	var name = ""

}


/**
 * A single person the system keeps track of.
 * 
 */
@Entity
class Person extends Party {

	val firstName = ""

	var lastName = ""

	var middleName=""
}
