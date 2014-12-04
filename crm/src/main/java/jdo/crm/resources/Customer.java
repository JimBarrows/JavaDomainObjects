package jdo.crm.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import jdo.party.model.Organization;
import jdo.party.model.Party;
import jdo.party.model.Person;
import jdo.party.model.relationship.CustomerRelationship;

@Stateless
@Path("/customers")
public class Customer {

	@PersistenceContext(name = "all-models")
	private EntityManager	em;

	@GET
	@Produces("application/json")
	public List<Party> listAll(@QueryParam("start") Integer startPosition, @QueryParam("max") Integer maxResult) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<CustomerRelationship> criteria = builder.createQuery(CustomerRelationship.class);
		Root<CustomerRelationship> entityRoot = criteria.from(CustomerRelationship.class);
		criteria.select(entityRoot);
		TypedQuery<CustomerRelationship> query = em.createQuery(criteria);
		if (startPosition != null) {
			query.setFirstResult(startPosition);
		}
		if (maxResult != null) {
			query.setMaxResults(maxResult);
		}
		List<CustomerRelationship> entities = query.getResultList();
		List<Party> customers = new ArrayList<Party>();
		entities.forEach(customerRelationship -> {
			Party party = customerRelationship.getRelationshipTo().getRoleFor();
			if(party instanceof Person) {
				customers.add((Person) party);
			} else {
				customers.add((Organization) party);
			}
		});
		return customers;
	}
}
