package jdo.dto;

import java.util.UUID;

public class CompanyDto extends OrganizationDto {

	public CompanyDto() {
	}

	public CompanyDto(final UUID id, final String name) {
		super(id, name);
	}

}
