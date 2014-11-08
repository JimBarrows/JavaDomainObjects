package jdo.party.services;

import java.util.List;

import jdo.party.model.Party;

public interface PartyListServices {

	/**Gets a list of parties, starting at the first result, and ending with the max results provided.
	 * 
	 * @param firstResult - The index of the first result in the set
	 * @param maxResults - The maximum number of parties to return
	 * @return The list of parties, starting at the first result, and only the number in maxResults.
	 */
	public List<Party> list(int firstResult, int maxResults);

}
