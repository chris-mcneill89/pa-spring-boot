package uk.ac.belfastmet.manu.domain;

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
@Table(name = "staff") // connect to table of staff in database
public class Staff {
	// properties
	private String name;
	private String role;
	private int age;
	private String image;
	private long id;

	// constructors
	
	/**
	 * default constructor
	 */
	public Staff() {
		super();
	}

	/**
	 * constructor which accepts all properties as params
	 * @param name
	 * @param role
	 * @param age
	 * @param image
	 */
	public Staff(String name, String role, int age, String image) {
		super();
		this.name = name;
		this.role = role;
		this.age = age;
		this.image = image;
	}

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
	 * get role property
	 * @return role
	 */
	@Column(name = "role") // database mapping
	public String getRole() {
		return role;
	}

	/**
	 * set role property
	 * @param role
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * get age property
	 * @return age property
	 */
	@Column(name = "age") // database mapping
	public int getAge() {
		return age;
	}

	/**
	 * set age property
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * get image property
	 * @return image
	 */
	@Column(name = "image") // database mapping
	public String getImage() {
		return image;
	}

	/**
	 * set image property
	 * @param image
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * override toString method for debugging and checking
	 */
	public String toString() {
		return "Name: " + name + ", Role: " + role + ", Age: " + age + ", Image: " + image;
	}

}
