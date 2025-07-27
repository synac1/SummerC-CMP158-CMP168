
public class Dog extends DogAbstract implements DogInterface {
	@Override
	public void eat() {
		System.out.println(bark("Woof"));
		System.out.println("Yum Yum");	
	}
	@Override
	public void sleeps() {
		System.out.println("ZZZZ....");
	}
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.eat();
	}
	@Override
	public String sing() {
		
		return null;
	}
	@Override
	public void grow() {
		
		
	}
	@Override
	public void dance() {
		
	}

}
