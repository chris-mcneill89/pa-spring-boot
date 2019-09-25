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
@Table(name = "player") // connect to table of players in database
public class Player {
	//properties
	private String name;
	private String position;
	private int age;
	private String image;
	private long id;

	//constructors
	
	/**
	 * default constructor
	 */
	public Player() {
		super();
	}
	
	/**
	 * constructor that accepts all class properties as params
	 * @param name
	 * @param position
	 * @param age
	 * @param image
	 */
	public Player(String name, String position, int age, String image) {
		super();
		this.name = name;
		this.position = position;
		this.age = age;
		this.image = image;
	}
	
	//getters & setters
	
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
	 * get position property
	 * @return property
	 */
	@Column(name = "position") // database mapping
	public String getPosition() {
		return position;
	}
	
	/**
	 * set position property
	 * @param position
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	
	/**
	 * get age property
	 * @return property
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
		return "Name: " + name + ", Position: " + position + ", Age: " + age + ", Image: " + image;
	}
	
}
