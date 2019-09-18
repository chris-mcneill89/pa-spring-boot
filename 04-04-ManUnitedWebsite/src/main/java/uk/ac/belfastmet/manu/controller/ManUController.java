package uk.ac.belfastmet.manu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.manu.service.ManUService;

@Controller
@RequestMapping()
public class ManUController {
	
	@GetMapping()
	public String homePage(Model model) {
		
		model.addAttribute("pageTitle", "Man United Home");
		
		return "index";
	}
	
	@GetMapping("/players")
	public String playersPage(Model model) {
		
		ManUService manUService = new ManUService();
		model.addAttribute("pageTitle", "Man United Players");
		model.addAttribute("players", manUService.getPlayers());
		
		return "players";
	}
	
	@GetMapping("/staff")
	public String staffPage(Model model) {
		
		ManUService manUService = new ManUService();
		model.addAttribute("pageTitle", "Man United Staff");
		model.addAttribute("staff", manUService.getStaff());
		
		return "staff";
	}

}
