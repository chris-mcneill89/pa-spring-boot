package uk.ac.belfastmet.manu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.belfastmet.manu.service.ManUService;

@Controller
@RequestMapping()
public class ManUController {
	//logger class object for logging info
	Logger logger = LoggerFactory.getLogger(ManUController.class);
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String homePage(Model model) {
		logger.info("Controller- I have reached the home page");
		model.addAttribute("pageTitle", "Man United Home");
		logger.info("Controller - the page title is set to Man United Home");
		
		return "index";
	}
	
	@RequestMapping(value = "/players", method = RequestMethod.GET)
	public String playersPage(Model model) {
		
		logger.info("Controller - I have reached the players page");
		ManUService manUService = new ManUService();
		model.addAttribute("pageTitle", "Man United Players");
		logger.info("Controller - the page title is set to Man United Players");
		logger.info("Controller- call getPlayers method in service");
		model.addAttribute("players", manUService.getPlayers());
		logger.info("Controller - Players arraylist contents returned to controller");
		return "players";
	}
	
	@RequestMapping(value = "/staff", method = RequestMethod.GET)
	public String staffPage(Model model) {
		
		logger.info("Controller - I have reached the staff page");
		ManUService manUService = new ManUService();
		model.addAttribute("pageTitle", "Man United Staff");
		logger.info("Controller - the page title is set to Man United Staff");
		logger.info("Controller- call getStaff method in service");
		model.addAttribute("staff", manUService.getStaff());
		logger.info("Controller - Staff arraylist contents returned to controller");
		
		return "staff";
	}

}
