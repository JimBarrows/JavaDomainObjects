package mbms.party.ui.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mbms.party.services.PartyListServices;

import com.nsfwenterprises.biz360.party.model.Organization;
import com.nsfwenterprises.biz360.party.model.Party;
import com.nsfwenterprises.biz360.party.model.Person;

public class PartyListController implements Serializable {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(PartyListController.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// @Resource
	public PartyListServices partyServices;

	ArrayList<Party> tempList;

	public PartyListController() {
		super();
		tempList = new ArrayList<Party>();
		Person p1 = new Person();
		p1.setFirstName("p1");
		p1.setLastName("p1l");
		Person p2 = new Person();
		p2.setFirstName("p2");
		p2.setLastName("p2l");
		Person p3 = new Person();
		p3.setFirstName("p3");
		p3.setLastName("p3l");
		Organization o1 = new Organization();
		o1.setName("01");
		Organization o2 = new Organization();
		o2.setName("o2");
		Organization o3 = new Organization();
		o3.setName("o3");
		tempList.add(p1);
		tempList.add(p2);
		tempList.add(p3);
		tempList.add(o1);
		tempList.add(o2);
		tempList.add(o3);
	}

	public PartyListController(PartyListServices partyServices) {
		super();
		this.partyServices = partyServices;

	}

	public List<Party> getList() {
		if (logger.isDebugEnabled()) {
			logger.debug("getList() - start");
		}

		List<Party> list = new ArrayList<Party>();

		list = tempList;

		if (logger.isDebugEnabled()) {
			logger.debug("getList() - end - return value=" + list);
		}
		return list;
	}
}
