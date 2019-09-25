package uk.ac.belfastmet.todo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author MCN17134884
 *
 */
@Entity
@Table(name = "tbltask") // connect to table of tasks in database
public class Task {
	// instance variables
	private String name;
	private String personResponsible;
	private Boolean status;
	private String priority;
	private String deadline;
	private int lengthMinutes;
	private long id;

	
	
	// getters & setters
	
	/**
	 * get id property
	 * @return id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // primary key field
	public long getId() {
		return id;
	}
	
	/**
	 * set id property
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * get name property
	 * @return name
	 */
	@Column(name = "name") // database mapping
	public String getName() {
		return name;
	}

	/**
	 * set name property
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * get personResponsible property
	 * @return personResponsible
	 */
	@Column(name = "personresponsible") // database mapping
	public String getPersonResponsible() {
		return personResponsible;
	}

	/**
	 * set personResponsible property
	 * @param personResponsible
	 */
	public void setPersonResponsible(String personResponsible) {
		this.personResponsible = personResponsible;
	}

	/**
	 * get status property
	 * @return status
	 */
	@Column(name = "status")
	public Boolean getStatus() {
		return status;
	}

	/**
	 * set status property
	 * @param status
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * get priority property
	 * @return priority
	 */
	@Column(name = "priority") // database mapping
	public String getPriority() {
		return priority;
	}

	/**
	 * set priority property
	 * @param priority
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * get deadline property
	 * @return deadline
	 */
	@Column(name = "deadline") // database mapping
	public String getDeadline() {
		return deadline;
	}

	/**
	 * set deadline property
	 * @param deadline
	 */
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	/**
	 * get lengthMinutes property
	 * @return lengthinutes
	 */
	@Column(name = "lengthminutes") // database mapping
	public int getLengthMinutes() {
		return lengthMinutes;
	}

	/**
	 * set lengthMinutes property
	 * @param lengthMinutes
	 */
	public void setLengthMinutes(int lengthMinutes) {
		this.lengthMinutes = lengthMinutes;
	}

	// constructors
	
	/**
	 * default constructor
	 */
	public Task() {
		super();
	}

	/**
	 * constructor which accepts all properties as parameters
	 * @param name
	 * @param personResponsible
	 * @param status
	 * @param priority
	 * @param deadline
	 * @param lengthMinutes
	 */
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
	
	/**
	 * override toString method for debug and check
	 */
	public String toString() {
		return "Name: " + name + "\n" + "Person Responsible: " + personResponsible + "\n" + "Status: " + status + "\n"
				+ "Priority: " + priority + "\n" + "Deadline: " + deadline + "\n" + "Length in Minutes: "
				+ lengthMinutes;

	}

}
