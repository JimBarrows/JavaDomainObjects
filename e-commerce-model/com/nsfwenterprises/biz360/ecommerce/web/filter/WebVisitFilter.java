package com.nsfwenterprises.biz360.ecommerce.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.jboss.seam.web.AbstractFilter;


/*@Scope(ScopeType.APPLICATION)
@Name("webVisitFilter")
@Filter(within = "org.jboss.seam.web.ajax4jsfFilter")*/
public class WebVisitFilter extends AbstractFilter {

	/*@In
	EntityManager entityManager;*/
	
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub

	}

}
