package uk.ac.belfastmet.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.todo.controller.ToDoController;
import uk.ac.belfastmet.todo.domain.Task;
import uk.ac.belfastmet.todo.repository.TaskRepository;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ToDoService {

	// logger class object for logging info
	Logger logger = LoggerFactory.getLogger(ToDoController.class);
	ArrayList<Task> tasks = new ArrayList<Task>();
	ArrayList<Task> completeTasks = new ArrayList<Task>();

	@Autowired
	private TaskRepository taskRepository;

	/**
	 * method to create an arraylist of task objects
	 * 
	 * @return arraylist of task objects
	 */
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
		this.tasks.add(new Task("Dust", "Ashling", true, "Low", "25/09/2019)", 20));
		this.tasks.add(new Task("Recycling", "Chris", false, "High", "24/09/2019)", 5));
		this.tasks.add(new Task("Clean Bathroom", "Ashling", false, "Medium", "23/09/2019)", 60));
		logger.info(tasks.toString());

		logger.info("Service - Arraylist populated and returned");
		return this.tasks;
	}

	/**
	 * method to create an arraylist of completed tasks
	 * 
	 * @return an arraylist of completed tasks
	 */
	public ArrayList<Task> getCompleteTasks() {

		this.completeTasks = new ArrayList<Task>();
		logger.info("Service - Completed Task Arraylist created, begin population");

		// add tasks
		getTasks();
		for (Task task : this.tasks) {
			if (task.getStatus() == true) {
				this.completeTasks.add(task);
				logger.info("Service - Following task added: " + task.toString());
			} else {
				logger.info("Service - This task has not been added: " + task.toString());
			}
		}

		logger.info(completeTasks.toString());
		// logger.debug("This arraylist contains " + this.completeTasks.size() +
		// "tasks");
		logger.info("Service - Arraylist populated and returned");

		return this.completeTasks;
	}

	public Iterator<Task> getNumberOfTasks() {
		logger.info("Reached getNumberOfTasks method");
		logger.info("# of tasks: {}", taskRepository.count());
		
		Iterable <Task> tasks = taskRepository.findAll();
		Iterator <Task> iterator = tasks.iterator();
		while (iterator.hasNext()){
		logger.info("{}", iterator.next().toString());
		}
		return iterator;
	}

}
