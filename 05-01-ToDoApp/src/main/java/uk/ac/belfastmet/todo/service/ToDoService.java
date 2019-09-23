package uk.ac.belfastmet.todo.service;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.todo.controller.ToDoController;
import uk.ac.belfastmet.todo.domain.Task;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ToDoService {

	// logger class object for logging info
	Logger logger = LoggerFactory.getLogger(ToDoController.class);
	ArrayList<Task> tasks = new ArrayList<Task>();

	// method to create and return arraylist of task object
	public ArrayList<Task> getTasks() {

		this.tasks = new ArrayList<Task>();
		logger.info("Service - Task Arraylist created");

		// add tasks
		logger.info("Service - Begin Tasks Arraylist population");
		this.tasks.add(new Task("Dishes", "Chris", false, "Low", "23/09/2019", 10));
		logger.info(tasks.toString());
		this.tasks.add(new Task("Empty Bins", "Ashling", true, "Medium", "24/09/2019", 5));
		this.tasks.add(new Task("Hoover Floors", "Chris", true, "High", "22/09/2019", 30));
		this.tasks.add(new Task("Mop Floors", "Chris", false, "Medium", "23/09/2019", 15));
		this.tasks.add(new Task("Laundry", "Ashling", false, "High", "24/09/2019)", 75));
		logger.info(tasks.toString());

		logger.info("Service - Arraylist populated and returned");
		return this.tasks;
	}

}
