package uk.ac.belfastmet.dwarfs.domain;

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
@Table(name = "dwarfpeople") // connect to table of dwarfs in database
public class Dwarf {
	//properties
	private String name;
	private int age;
	private String author;
	private String image;
	private long id;
	
	//constructors

	/**
	 * default constructor
	 */
	public Dwarf() {
		super();
	}
	
	/**
	 * contructor which accepts all properties as params
	 * @param name
	 * @param author
	 * @param image
	 */
	public Dwarf(String name, String author, String image) {
		super();
		this.name = name;
		this.author = author;
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
	 * get age property
	 * @return age
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
	 * get author property
	 * @return author
	 */
	@Column(name = "creator") // database mapping
	public String getAuthor() {
		return author;
	}
	
	/**
	 * set author property
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
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

}
