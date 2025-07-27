import java.util.ArrayList;

public class MenuItems {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Pablo");
		names.add("Luke");
		names.add("Han");
		
		//Get Han
		System.out.println(names.get(2));
		//Replace Luke with Skywalker
		names.set(1, "Skywalker");
		//Print
		System.out.println(names.get(1));
		//Replace Pablo with Baby Yoda
		names.set(0, "Baby Yoda");
		System.out.println(names);
		
	}
}
