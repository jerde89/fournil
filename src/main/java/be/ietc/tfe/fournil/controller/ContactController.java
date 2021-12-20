package be.ietc.tfe.fournil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
	@GetMapping("/contact")
	public String LoginPage() {
		//Nom de la JSP
		return "contact";
	}
}
