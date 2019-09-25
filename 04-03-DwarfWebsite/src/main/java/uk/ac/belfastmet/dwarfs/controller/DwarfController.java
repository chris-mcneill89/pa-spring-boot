package uk.ac.belfastmet.dwarfs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.dwarfs.service.DwarfService;

/**
 * 
 * @author MCN17134884
 *
 */
@Controller
@RequestMapping()
public class DwarfController {

	// logger class object for logging info
	Logger logger = LoggerFactory.getLogger(DwarfController.class);

	@Autowired
	private DwarfService dwarfService;

	/**
	 * this method requests index page and the getTasks method from service
	 * @param single model object
	 * @return index html file
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String homePage(Model model) {

		logger.info("Controller- I have reached the home page");
		model.addAttribute("pageTitle", "Home Page");

		return "index";
	}

	/**
	 * this method requests disney page and the getDisneyDwarfs method from service
	 * @param single model object
	 * @return disney html file
	 */
	@RequestMapping(value = "/disney", method = RequestMethod.GET)
	public String disneyPage(Model model) {

		logger.info("Controller- I have reached the disney page");
		model.addAttribute("pageTitle", "Disney Dwarfs");
		logger.info("Call getDisneyDwarfs method from Service");
		model.addAttribute("dwarfs", dwarfService.getDisneyDwarfs());
		logger.info("Controller - Disney Dwarfs arraylist contents returned to controller");
		return "disney";
	}

	/**
	 * this method requests tolkien page and the getTolkienDwarfs method from service
	 * @param single model object
	 * @return tolkien html file
	 */
	@RequestMapping(value = "/tolkien", method = RequestMethod.GET)
	public String tolkienPage(Model model) {

		logger.info("Controller- I have reached the tolkien page");
		model.addAttribute("pageTitle", "Tolkien Dwarfs");
		logger.info("Call getTolkienDwarfs method from Service");
		model.addAttribute("dwarfs", dwarfService.getTolkienDwarfs());
		logger.info("Controller - Tolkien Dwarfs arraylist contents returned to controller");

		return "tolkien";
	}

}
