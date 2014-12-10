package jdo.errors;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Errors {

	private Hashtable<String, List<String>> errors = new Hashtable<String, List<String>>();
	
	public void add( String fieldName, String ... errorMessages) {
		errors.put(fieldName, Arrays.asList(errorMessages));
	}

	public Hashtable<String, List<String>> getErrors() {
		return errors;
	}
	
	
}
