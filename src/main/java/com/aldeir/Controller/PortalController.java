package com.aldeir.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Aluno")
public class PortalController {
	
	
	@RequestMapping("/Dashboard")
	public String home() {
	
		return "home";
	}

}
