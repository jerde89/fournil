package be.ietc.tfe.fournil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/loginPage")
	public String LoginPage() {
		return "plain-login";
	}
	
	@GetMapping("/access-denied")
	public String AccessDeniedPage() {
		return "access-denied";
	}	
}
