package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.service.DwarfService;

@Controller
@RequestMapping()
public class DwarfController {
	
	@GetMapping()
	public String homePage(Model model) {
		
		model.addAttribute("pageTitle", "Home Page");
		
		return "index";
	}
	
	@GetMapping("/disney")
	public String disneyPage(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		model.addAttribute("pageTitle", "Disney Dwarfs");
		model.addAttribute("dwarfs", dwarfService.getDisneyDwarfs());
		return "disney";
	}
	
	@GetMapping("/tolkien")
	public String tolkienPage(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		model.addAttribute("pageTitle", "Tolkien Dwarfs");
		model.addAttribute("dwarfs", dwarfService.getTolkienDwarfs());
		
		return "tolkien";
	}

}
