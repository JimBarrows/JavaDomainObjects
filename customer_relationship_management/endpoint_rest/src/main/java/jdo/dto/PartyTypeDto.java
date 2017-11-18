package jdo.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Represent the type that inherit from party.
 *
 * @author Jim
 *
 */
@JsonRootName("partyType")
public class PartyTypeDto {

	/**
	 * The fully qualified, canonical name of the class.
	 *
	 */
	private final String	id;
	/**
	 * The name the user sees.
	 */
	private final String	name;

	/**
	 * Create the read only class.
	 *
	 * @param type
	 *            of the class.
	 * @param name
	 *            of the class.
	 */
	public PartyTypeDto(final Class<?> type, final String name) {
		super();
		id = type.getCanonicalName();
		this.name = name;
	}

	/**
	 *
	 * @return id
	 */
	public final String getId() {
		return id;
	}

	/**
	 *
	 * @return name
	 */
	public final String getName() {
		return name;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public final boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final PartyTypeDto other = ( PartyTypeDto ) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	@Override
	public final String

	toString() {
		return "PartyTypeDto [id=" + id + ", name=" + name + "]";
	}
}
