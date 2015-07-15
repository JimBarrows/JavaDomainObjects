package jdo.web;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("errors")
public class Errors extends Hashtable<String, List<String>>{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	
	public void put( String key, String ... messages) {
		this.put(key, Arrays.asList(messages));
	}
}