package jdo.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonRootName;

@XmlRootElement(name="customers")
@JsonRootName("customers")
public class CustomerDtoList extends ArrayList<CustomerDto>{
	
	 /**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	public CustomerDtoList(Collection<? extends CustomerDto> c) {
	        addAll(c);
	    }
}


