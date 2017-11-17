package jdo.iams_services.services;

import jdo.humanresoures.model.position.Position;
import jdo.humanresoures.repository.PositionRepository;
import jdo.iams_services.models.Authorization;
import jdo.iams_services.models.Identity;
import jdo.iams_services.repositories.implementations.IdentityRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NamedEntityGraph;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static jdo.humanresoures.specifications.PersonHasPosition.personHasPosition;

@Stateless
public class EmployeeIdentityManagement {

	@EJB
	PositionRepository positionRepository;

	@EJB
	IdentityRepository identityRepository;

	public Optional<Identity> createFor(UUID person, String username, String password) {
		List<Position> positionList = positionRepository.findBy(personHasPosition(person));
		if (positionList.isEmpty()) {
			return Optional.empty();
		} else {
			List<Authorization> authorizations = positionList.stream().flatMap(position -> convertPositionResponsiblityIntoAuthorization(position)).collect(Collectors.toList());
			Identity id = new Identity(person, password, UUID.randomUUID().toString(), username, authorizations);
			return Optional.ofNullable(identityRepository.create(id));
		}
	}

	private Stream<Authorization> convertPositionResponsiblityIntoAuthorization(Position position) {
		return position.getType().getValidResponsibilities().stream()
				.filter(validResponsibility -> validResponsibility.getDateTimeRange().isActive())
				.map(validResponsibility -> new Authorization(validResponsibility.getDefinedBy().getDescription()));
	}
}
