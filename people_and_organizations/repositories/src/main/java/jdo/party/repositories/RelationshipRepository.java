package jdo.party.repositories;

import jdo.core.repository.Repository;
import jdo.party.model.relationship.CustomerRelationship;
import jdo.party.model.relationship.PartyRelationship;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RelationshipRepository extends Repository<PartyRelationship, UUID>{

	List<CustomerRelationship> findAllCustomersRelationships(Optional<Integer> startPosition,
	                                                         Optional<Integer> maxResult);

}
