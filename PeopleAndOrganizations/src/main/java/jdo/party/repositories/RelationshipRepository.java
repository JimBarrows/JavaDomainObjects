package jdo.party.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jdo.core.repository.Repository;
import jdo.party.model.relationship.CustomerRelationship;
import jdo.party.model.relationship.PartyRelationship;

public interface RelationshipRepository extends Repository<PartyRelationship, UUID>{

	public List<CustomerRelationship> findAllCustomersRelationships(Optional<Integer> startPosition,
			Optional<Integer> maxResult);

}
