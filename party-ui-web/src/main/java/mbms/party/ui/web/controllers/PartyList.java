package mbms.party.ui.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PartyList {

	@RequestMapping("/")
	public String list() {
		
		return "list";
	}
}
