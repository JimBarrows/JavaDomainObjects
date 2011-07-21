package test.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DbUtils {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(DbUtils.class);

	private JdbcTemplate template;

	public void cleanDb() throws SQLException {
		logger.debug("cleanDb() - start"); //$NON-NLS-1$

		template.execute("delete from partyrelationship");
		template.execute("delete from relationshiptype");
		template.execute("delete from partyrole");
		template.execute("delete from party");
		template.execute("delete from partyroletype");

		logger.debug("cleanDb() - end"); //$NON-NLS-1$
	}

	@Autowired
	public void setDataSource(DataSource ds) {
		logger.debug("setDataSource(DataSource ds=" + ds + ") - start"); //$NON-NLS-1$ //$NON-NLS-2$

		this.template = new JdbcTemplate(ds);

		logger.debug("setDataSource(DataSource) - end"); //$NON-NLS-1$
	}
}
