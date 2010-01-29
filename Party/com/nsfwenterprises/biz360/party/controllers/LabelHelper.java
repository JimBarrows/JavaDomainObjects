package com.nsfwenterprises.biz360.party.controllers;

import static org.apache.commons.lang.StringUtils.isEmpty;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityController;

import com.nsfwenterprises.biz360.ecommerce.model.party.contactmechanism.EmailAddress;
import com.nsfwenterprises.biz360.ecommerce.model.party.contactmechanism.InstantMessaging;
import com.nsfwenterprises.biz360.party.model.Organization;
import com.nsfwenterprises.biz360.party.model.Party;
import com.nsfwenterprises.biz360.party.model.Person;
import com.nsfwenterprises.biz360.party.model.contactmechanism.ContactMechanism;
import com.nsfwenterprises.biz360.party.model.contactmechanism.TelecommunicationsNumber;

@SuppressWarnings("serial")
@Name("labelHelper")
public class LabelHelper extends EntityController {

	public String getPartyLabel( Party party) {
		if( party instanceof Person) {
			Person person = (Person)party;
			return person.getFirstName() + " " + person.getLastName();
		} else if( party instanceof Organization) {
			return ((Organization)party).getName();
		} else {
			return "";
		}
	}
	
	public String getContactMechanismLabel( ContactMechanism cm) {
		if( cm instanceof EmailAddress) {
			return ((EmailAddress)cm).getAddress();
		} else if ( cm instanceof InstantMessaging) {
			return ((InstantMessaging)cm).getUsername() + " on " + ((InstantMessaging)cm).getProtocol(); 
		}else if ( cm instanceof TelecommunicationsNumber) {
			TelecommunicationsNumber number = (TelecommunicationsNumber)cm; 
			return "(" + number.getAreaCode() + ") " + number.getContactNumber() + ( isEmpty( number.getExtension()) ? "" : number.getExtension()); 
		} else {
			return "";
		}
	}
}
