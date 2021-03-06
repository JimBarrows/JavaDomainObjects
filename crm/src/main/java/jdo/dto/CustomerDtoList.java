package jdo.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * A list of dto customers, because of the way that Ember wants it's data.
 * 
 * @author Jim
 *
 */
@XmlRootElement(name = "customers")
@JsonRootName("customers")
public class CustomerDtoList extends ArrayList<CustomerDto> {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	/**
	 * Create the list from the parameters provided.
	 * 
	 * @param c
	 *            The list.
	 */
	public CustomerDtoList(final Collection<? extends CustomerDto> c) {
		addAll(c);
	}
}
