package test;

import jdo.core.repository.specification.Specification;
import jdo.fields.DateTimeRange;
import jdo.humanresoures.model.position.Position;
import jdo.humanresoures.model.position.PositionResponsibility;
import jdo.humanresoures.model.position.ResponsibilityType;
import jdo.humanresoures.model.position.ValidResponsibility;
import jdo.humanresoures.repository.PositionRepository;
import jdo.iams_services.models.Authorization;
import jdo.iams_services.models.Identity;
import jdo.iams_services.repositories.IdentityRepository;
import jdo.iams_services.services.EmployeeIdentityManagement;
import test.utils.GwtTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static java.util.Optional.empty;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;

public class CreateIdentityTest extends GwtTemplate {

	private EmployeeIdentityManagement classUnderTest;
	private PositionRepository positionRepository = mock(PositionRepository.class);
	private IdentityRepository identityRepository = mock(IdentityRepository.class);
	private Optional<Identity> createdIdentity = empty();
	private UUID person;
	private String username;
	private String password;
	private List<Position> positions = new ArrayList<>();
	private Identity identity;
	private List<ValidResponsibility> responsibilites = new ArrayList<>();
	private ValidResponsibility responsbility;
	private List<PositionResponsibility> assignedToPositionResponsibility;
	private PositionResponsibility positionResponsibility;
	private ResponsibilityType responsibilityType;

	@Override
	public void givenTheFollowing() {
		classUnderTest = new EmployeeIdentityManagement(positionRepository, identityRepository);
		person = UUID.randomUUID();
		username = "test user";
		password = "this is a password";
		Specification<Position> specPosition = any();
		responsibilityType = new ResponsibilityType();
		responsibilityType.setDescription("This is a responsibility type");
		assignedToPositionResponsibility = new ArrayList<>();
		positionResponsibility = createPositionResponsibility();
		assignedToPositionResponsibility.add(positionResponsibility);
		positions.add(createPosition());
		identity = createIdentity();
		given(positionRepository.findBy(specPosition)).willReturn(positions);
		given(identityRepository.create(identity)).willReturn(identity);
	}

	private PositionResponsibility createPositionResponsibility() {
		PositionResponsibility positionResponsibility = new PositionResponsibility();
		positionResponsibility.setType(responsibilityType);
		return positionResponsibility;
	}

	protected Position createPosition() {
		Position p = new Position();
		p.setId(UUID.randomUUID());
		p.setDateTimeRange(new DateTimeRange());
		p.setAssigendTo(assignedToPositionResponsibility);
		return p;
	}

	private Identity createIdentity() {
		final List<Authorization> authorizations = new ArrayList<>();
		authorizations.add(new Authorization(responsibilityType.getDescription()));
		Identity identity = new Identity(person, password, "salt", username, authorizations);
		return identity;
	}

	@Override
	public void whenTheFollowing() {
		createdIdentity = classUnderTest.createFor(person, username, password);
	}

	@Override
	public void thenTheFollowing() {
		assertTrue("An identity should be created", createdIdentity.isPresent());
		assertEquals("The person id should not change", person, createdIdentity.get().getIdentityOfParty());
		assertEquals("The username should not change", username, createdIdentity.get().getUsername());
		assertNotSame("The password should be present and encrypted", password, createdIdentity.get().getPassword());
		assertTrue("The salt should not be blank or null", isNotEmpty(createdIdentity.get().getSalt()));
		assertTrue("The identity must be active", createdIdentity.get().isActive());
		assertEquals("The authorization should be " + responsibilityType.getDescription(), responsibilityType.getDescription(), createdIdentity.get().getAuthorizations().get(0).getAuthorization());
	}
}
