package mbms.party.ui.web.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import mbms.party.services.PartyListServices;

import com.nsfwenterprises.biz360.party.model.Organization;
import com.nsfwenterprises.biz360.party.model.Party;
import com.nsfwenterprises.biz360.party.model.Person;

public class PartyListController {

	//@Resource
	public PartyListServices partyServices;
	
	private int pageSize = 2;
	
	private int pageNumber = 0;
	
	ArrayList<Party> tempList;
	
	public PartyListController() {
		super();
		tempList = new ArrayList<Party>();
		Person p1 = new Person();		
		Person p2 = new Person();
		Person p3 = new Person();
		Organization o1 = new Organization();
		Organization o2 = new Organization();
		Organization o3 = new Organization();
		tempList.add( p1);
		tempList.add( p2);
		tempList.add( p3);
		tempList.add( o1);
		tempList.add( o2);
		tempList.add( o3);
	}

	public PartyListController(PartyListServices partyServices) {
		super();
		this.partyServices = partyServices;
		
	}

	public List<Party> getList() {
		List<Party> list = new ArrayList<Party>();
		if( pageSize < 0) {
			list = partyServices.list();
		} else {
			int from = pageSize * pageNumber;
			list = this.tempList.subList(from, from+pageSize);//partyServices.list(from, from + pageSize);
		}
		return list;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}	
}
