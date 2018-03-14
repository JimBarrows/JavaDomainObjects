package jdo;

import java.util.UUID;

public class Salt {
	public static final String create() {
		return UUID.randomUUID().toString();
	}
}
