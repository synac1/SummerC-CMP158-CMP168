
public class Dog {
	private String name;
	private boolean isPet;
	private String owner;
	// Default Constructor
	public Dog() {
		this.name ="";
		this.isPet=false;
		this.owner="";
	}
	//Overloaded constructor
	public Dog(String name, boolean isPet, String owner)
	{
		this.name  = name;
		this.isPet = isPet;
		this.owner = owner;
	}
	//setters and getters
	public String getName() {
		return name;
	}
	public boolean isPet() {
		return isPet;
	}
	public String getOwner() {
		return owner;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void isPet(boolean isPet) {
		this.isPet =isPet;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}
