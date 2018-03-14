package jdo.application;

import jdo.party.model.Company;
import jdo.party.model.Party;
import jdo.party.model.roles.InternalOrganization;
import jdo.party.model.roles.ParentOrganization;
import jdo.party.repositories.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import static jdo.party.specifications.PartyHasActiveRoleOf.partyHasActiveRoleOf;

/**
 * Single place to get all configuration information, without having to worry
 * about where it comes from.
 *
 * @author Jim
 */
@Component
public class ApplicationConfiguration {

	@Autowired
	private PartyRepository partyRepository;


	public ApplicationConfiguration() {
		super();
	}

	/**
	 * Represents the company whose customer we're managing.
	 *
	 * @return The actual company, or a default company.
	 */
	public Company company() {
		return findCompany().orElseGet(defaultCompany);
	}

	/**
	 * The default company, if none is provided.
	 */
	private final Supplier<Company> defaultCompany = () -> {
		final Company company = new Company();
		company.setName("The company in question");
		company.addPartyRole(new InternalOrganization());
		company.addPartyRole(new ParentOrganization());
		return (Company) partyRepository.create(company);
	};

	/**
	 * Find the company that we're managing customers for.
	 *
	 * @return The company, or empty if we can't find it.
	 */
	protected Optional<Company> findCompany() {
		final List<Party> filteredList = partyRepository.findBy(partyHasActiveRoleOf(InternalOrganization.class).and(partyHasActiveRoleOf(ParentOrganization.class)));

		return filteredList.isEmpty() ? Optional.empty() : Optional.ofNullable((Company) filteredList.get(0));

	}

}
