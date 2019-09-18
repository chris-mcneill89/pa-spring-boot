package uk.ac.belfastmet.manu.domain;

public class Player {
	//properties
	private String name;
	private String position;
	private int age;
	private String image;
	
	//constructors
	public Player() {
		super();
	}
	
	public Player(String name, String position, int age, String image) {
		super();
		this.name = name;
		this.position = position;
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
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
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
