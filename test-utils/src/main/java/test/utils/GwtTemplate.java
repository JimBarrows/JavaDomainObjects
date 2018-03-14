package test.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public abstract class GwtTemplate {

	@Before
	public abstract void givenTheFollowing();

	@Test
	public abstract void whenTheFollowing() throws Exception;

	@After
	public abstract void thenTheFollowing();

}
