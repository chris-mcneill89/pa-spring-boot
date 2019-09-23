package uk.ac.belfastmet.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.todo.service.ToDoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping()
public class ToDoController {

	// logger class object for logging info
	Logger logger = LoggerFactory.getLogger(ToDoController.class);
	
	/**
	 * this method requests index page
	 * @param single model object
	 * @return index html file
	 */
	@RequestMapping(value="", method= RequestMethod.GET)
	public String indexPage(Model model) {
		ToDoService todoService = new ToDoService();
		logger.info("Controller- I have reached the home page");
		model.addAttribute("pageTitle", "ToDo App Home");
		logger.info("Controller - the page title is set to ToDo App Home");
		logger.info("Controller- call getTasks method in service");
		model.addAttribute("tasks", todoService.getTasks());
		logger.info("Controller - Tasks arraylist contents returned to controller");
		
		return "index";
	}

}
