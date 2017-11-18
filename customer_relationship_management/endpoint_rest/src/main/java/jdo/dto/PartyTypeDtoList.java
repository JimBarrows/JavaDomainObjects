package jdo.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collection;

/**
 * A list override for Ember.
 *
 * @author Jim
 *
 */
@XmlRootElement(name = "partyTypes")
@JsonRootName("partyTypes")
public class PartyTypeDtoList extends ArrayList<PartyTypeDto> {

	/**
	*
	*/
	private static final long serialVersionUID = 1L;

	/**
	 *
	 * @param c
	 *            The collection
	 */
	public PartyTypeDtoList(final Collection<? extends PartyTypeDto> c) {
		addAll(c);
	}
}
