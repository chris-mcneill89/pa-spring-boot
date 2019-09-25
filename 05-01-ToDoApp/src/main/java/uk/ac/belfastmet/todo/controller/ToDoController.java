package uk.ac.belfastmet.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.todo.service.ToDoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author MCN17134884
 *
 */
@Controller
@RequestMapping()
public class ToDoController {

	// logger class object for logging info
	Logger logger = LoggerFactory.getLogger(ToDoController.class);

	@Autowired
	private ToDoService todoService;

	/**
	 * this method requests index page and the getTasks method from service
	 * currently attempting to access the getNumberOfTasks method from service
	 * 
	 * @param single model object
	 * @return index html file
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String indexPage(Model model) {
		// ToDoService todoService = new ToDoService();
		logger.info("Controller- I have reached the home page");
		model.addAttribute("pageTitle", "ToDo App Home");
		/*
		 * logger.info("Controller - the page title is set to ToDo App Home");
		 * logger.info("Controller- call getTasks method in service");
		 * model.addAttribute("tasks", todoService.getTasks());
		 * logger.info("Controller - Tasks arraylist contents returned to controller");
		 */
		todoService.getNumberOfTasks();

		return "index";
	}

	/**
	 * this method requests the login page
	 * 
	 * @param single model object
	 * @return login html file
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Model model) {
		// ToDoService todoService = new ToDoService();
		logger.info("Controller - I have reached the login page");
		model.addAttribute("pageTitle", "ToDO App Login");
		logger.info("Controller - the page title is set to ToDo App Login");

		return "login";
	}

	/**
	 * this method requests completedTasks page and the getCompletedTasks method
	 * from service currently attempting to access the getNumberOfTasks method from
	 * service
	 * 
	 * @param single model object
	 * @return complete html file
	 */
	@RequestMapping(value = "/complete", method = RequestMethod.GET)
	public String completePage(Model model) {
		// ToDoService todoService = new ToDoService();
		logger.info("Controller- I have reached the complete page");
		model.addAttribute("pageTitle", "ToDo App Complete");
		logger.info("Controller - the page title is set to ToDo App Complete");
		
		// consider commenting hy this code is commented out is it to be deleted or worked on later?
		/*
		 * logger.info("Controller- call getCompleteTasks method in service");
		 * model.addAttribute("tasks", todoService.getCompleteTasks()); logger.
		 * info("Controller - Complete asks arraylist contents returned to controller")
		 */;
		model.addAttribute("tasks", todoService.getNumberOfTasks());

		return "complete";
	}

}
