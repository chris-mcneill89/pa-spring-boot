package uk.ac.belfastmet.manu.domain;

public class Staff {
	//properties
	private String name;
	private String role;
	private int age;
	private String image;
	
	//constructors
	public Staff() {
		super();
	}
	
	public Staff(String name, String role, int age, String image) {
		super();
		this.name = name;
		this.role = role;
		this.age = age;
		this.image = image;
	}

	//getters & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
