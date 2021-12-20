package be.ietc.tfe.fournil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;



@Controller
public class DemoController {
	@Autowired
	private RequestMappingHandlerMapping mapping;
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/manager")
	public String showManager() {
		return "manager/manager";
	}

	public RequestMappingHandlerMapping getMapping() {
		return mapping;
	}

	public void setMapping(RequestMappingHandlerMapping mapping) {
		this.mapping = mapping;
	}
}
