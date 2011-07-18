package mbms.party.ui.web.controllers;

import org.apache.commons.lang.builder.ToStringBuilder;
import de.jayefem.log4e.MethodParameterStyle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PartyList {

	public static final Long numberOfColumns = 4l;
	public static final Long numberOfRows = 5l;
	
	@RequestMapping("/")
	public ModelAndView list(
			@RequestParam(value = "pageNumber", required = false) Long pageNumber) {
		logger.debug("list(" + new ToStringBuilder("", MethodParameterStyle.METHOD_PARAMETER_STYLE).append("Long pageNumber", pageNumber).toString() + ") - start"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$

		if (pageNumber == null) {
			pageNumber = 0l;
		} else {
			pageNumber -=1;  //page number is zero offset internally
		}
		
		long pageSize = numberOfColumns * numberOfRows;
		long start = pageNumber * pageSize;
		long end = start + pageSize -1 ;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pageNumber", pageNumber +1); //humans don't like zero offset page numbers
		modelAndView.setViewName("list");

		logger.debug("list(Long pageNumber) - end - " + new ToStringBuilder("", MethodParameterStyle.METHOD_PARAMETER_STYLE).append("return value", modelAndView).toString()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return modelAndView;
	}
	
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(PartyList.class);
}
