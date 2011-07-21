package test.utils;

import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DbTestTemplate {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(DbTestTemplate.class);

	@Autowired
	protected DbUtils dbUtils;
	

	public DbTestTemplate() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		logger.debug("setUp() - start"); //$NON-NLS-1$

		dbUtils.cleanDb();

		logger.debug("setUp() - end"); //$NON-NLS-1$
	}

}