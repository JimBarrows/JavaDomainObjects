package jdo.dto;

import java.io.Serializable;
import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * A data transfer object that represents the data for a customer.
 *
 * @author Jim
 *
 */
@XmlRootElement
public class CustomerDto implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The id of the customer, which is the ID of the party.
	 *
	 */
	private UUID id;

	/**
	 * Default constructor, don't use if you want to actually have data in the
	 * object..
	 */
	public CustomerDto() {
		super();
	}

	/**
	 * @param id
	 */
	public CustomerDto(final UUID id) {
		super();
		this.id = id;
	}

	/**
	 *
	 * @return id.
	 */
	public final UUID getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final UUID id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("CustomerDto [id=%s]", id);
	}

}
