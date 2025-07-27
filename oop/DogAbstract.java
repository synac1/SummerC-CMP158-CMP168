
public abstract class DogAbstract {
	private int age;
	private String name;
	private String species;
	
	public abstract void eat();
	
	public String bark(String bark) {
		return "".format("%s!%20s!", bark, bark);
	}
	public abstract void sleeps();

}
