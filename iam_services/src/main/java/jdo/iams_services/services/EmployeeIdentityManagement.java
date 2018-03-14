package jdo.iams_services.services;

import jdo.Salt;
import jdo.humanresoures.model.position.Position;
import jdo.humanresoures.repository.PositionRepository;
import jdo.iams_services.models.Authorization;
import jdo.iams_services.models.Identity;
import jdo.iams_services.repositories.IdentityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static jdo.humanresoures.specifications.PositionHeldBy.positionHeldBy;

/**
 * This class allows a user to create an identity whose authorizations is the employees positions.
 */
@Service
public class EmployeeIdentityManagement {

	@Autowired
	private PositionRepository positionRepository;

	@Autowired
	private IdentityRepository identityRepository;

	public EmployeeIdentityManagement() {
	}

	public EmployeeIdentityManagement(PositionRepository positionRepository, IdentityRepository identityRepository) {
		this.positionRepository = positionRepository;
		this.identityRepository = identityRepository;
	}

	public Optional<Identity> createFor(UUID person, String username, String password) {

		List<Position> positionList = positionRepository.findBy(positionHeldBy(person));
		if (positionList.isEmpty()) {
			return Optional.empty();
		} else {
			List<Authorization> authorizations = positionList.stream().flatMap(position -> convertPositionResponsabilityIntoAuthorization(position)).collect(Collectors.toList());
			Identity id = new Identity(person, password, Salt.create(), username, authorizations);
			return Optional.ofNullable(identityRepository.create(id));
		}
	}

	private Stream<Authorization> convertPositionResponsabilityIntoAuthorization(Position position) {
		return position.getAssigendTo().stream()
				.filter(positionResponsibility -> positionResponsibility.getDateTimeRange().isActive())
				.map(positionResponsibility -> new Authorization(positionResponsibility.getType().getDescription()));
	}
}
