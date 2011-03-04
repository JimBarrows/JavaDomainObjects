package bizondemand.biz360.business.ui.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	@RequestMapping(value="/helloworld")
	public String home() {
		System.out.println("Hello world");
		return "WEB-INF/views/home.jsp";
	}
}
