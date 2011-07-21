package mbms.party.ui.web.controllers;

import java.util.List;

import mbmp.party.model.Party;
import mbms.party.services.PartyListServices;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import de.jayefem.log4e.MethodParameterStyle;

@Controller
public class PartyList {

	public static final int numberOfColumns = 4;
	public static final int numberOfRows = 5;

	@Autowired
	private PartyListServices partyListServices;

	@RequestMapping("/")
	public ModelAndView list(
			@RequestParam(value = "pageNumber", required = false) Integer pageNumber) {
		if (logger.isDebugEnabled()) {
			logger.debug("list(Integer pageNumber=" + pageNumber + ") - start"); //$NON-NLS-1$ //$NON-NLS-2$
		}

		if (pageNumber == null) {
			pageNumber = 0;
		} else {
			pageNumber -= 1; // page number is zero offset internally
		}

		int pageSize = numberOfColumns * numberOfRows;
		int start = pageNumber * pageSize;
		int end = start + pageSize - 1;
		List<Party> parties = partyListServices.list(start, end);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pageNumber", pageNumber + 1); // humans don't
																// like zero
																// offset page
																// numbers
		modelAndView.addObject("partyList", parties);
		modelAndView.addObject("numberOfColumns", numberOfColumns);
		modelAndView.setViewName("list");

		if (logger.isDebugEnabled()) {
			logger.debug("list(Integer) - " + new ToStringBuilder("", MethodParameterStyle.METHOD_PARAMETER_STYLE).append("return value", modelAndView).toString()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return modelAndView;
	}

	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(PartyList.class);
}
