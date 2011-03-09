package test.support;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DbUtils {

	private JdbcTemplate template;

	public void cleanDb() throws SQLException {
		template.execute("delete from partyrelationship");
		template.execute("delete from partyrole");
		template.execute("delete from party");
		template.execute("delete from partyroletype");
	}

	@Autowired
	public void setDataSource(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}
}
