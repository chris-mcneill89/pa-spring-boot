package uk.ac.belfastmet.todo.domain;


public class Task {
	// instance variables
	private String name;
	private String personResponsible;
	private Boolean status;
	private String priority;
	private String deadline;
	private int lengthMinutes;

	// getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonResponsible() {
		return personResponsible;
	}

	public void setPersonResponsible(String personResponsible) {
		this.personResponsible = personResponsible;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public int getLengthMinutes() {
		return lengthMinutes;
	}

	public void setLengthHours(int lengthMinutes) {
		this.lengthMinutes = lengthMinutes;
	}

	// constructors
	public Task() {
		super();
	}

	public Task(String name, String personResponsible, Boolean status, String priority, String deadline,
			int lengthMinutes) {
		super();
		this.name = name;
		this.personResponsible = personResponsible;
		this.status = status;
		this.priority = priority;
		this.deadline = deadline;
		this.lengthMinutes = lengthMinutes;
	}

	// override toString method for debug and check
	public String toString() {
		return "Name: " + name + "\n" + "Person Responsible: " + personResponsible + "\n" + "Status: " + status + "\n"
				+ "Priority: " + priority + "\n" + "Deadline: " + deadline + "\n" + "Length in Minutes: " + lengthMinutes;

	}

}
