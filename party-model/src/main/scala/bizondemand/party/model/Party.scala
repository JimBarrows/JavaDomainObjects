package bizondemand.party.model

import _root_.javax.persistence.CascadeType;
import _root_.javax.persistence.Entity;
import _root_.javax.persistence.Inheritance;
import _root_.javax.persistence.InheritanceType;
import _root_.javax.persistence.OneToMany;
import _root_.javax.persistence.OrderBy;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
class Party {
}
