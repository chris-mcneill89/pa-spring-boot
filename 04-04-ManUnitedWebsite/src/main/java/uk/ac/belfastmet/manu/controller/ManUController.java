package uk.ac.belfastmet.manu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.belfastmet.manu.service.ManUService;

/**
 * 
 * @author MCN17134884
 *
 */
@Controller
@RequestMapping()
public class ManUController {
	//logger class object for logging info
	Logger logger = LoggerFactory.getLogger(ManUController.class);
	
	@Autowired
	private ManUService manUService;
	
	/**
	 * this method requests index page
	 * @param single model object
	 * @return index html file
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String homePage(Model model) {
		logger.info("Controller- I have reached the home page");
		model.addAttribute("pageTitle", "Man United Home");
		logger.info("Controller - the page title is set to Man United Home");
		
		return "index";
	}
	
	/**
	 * this method requests players page and requests getPlayers method from service
	 * @param single model object
	 * @return players html file
	 */
	@RequestMapping(value = "/players", method = RequestMethod.GET)
	public String playersPage(Model model) {
		
		logger.info("Controller - I have reached the players page");
		//ManUService manUService = new ManUService();
		model.addAttribute("pageTitle", "Man United Players");
		logger.info("Controller - the page title is set to Man United Players");
		logger.info("Controller- call getPlayers method in service");
		model.addAttribute("players", manUService.getPlayers());
		logger.info("Controller - Players arraylist contents returned to controller");
		return "players";
	}
	
	/**
	 * method requesting staff page and invokes getStaff method from service
	 * @param single model object
	 * @return staff html file
	 */
	@RequestMapping(value = "/staff", method = RequestMethod.GET)
	public String staffPage(Model model) {
		
		logger.info("Controller - I have reached the staff page");
		//ManUService manUService = new ManUService();
		model.addAttribute("pageTitle", "Man United Staff");
		logger.info("Controller - the page title is set to Man United Staff");
		logger.info("Controller- call getStaff method in service");
		model.addAttribute("staff", manUService.getStaff());
		logger.info("Controller - Staff arraylist contents returned to controller");
		
		return "staff";
	}

}
