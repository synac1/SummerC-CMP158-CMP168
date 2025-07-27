import java.util.Scanner;

public class Calculator {
	public static int divideTwo() {
		Scanner scnr = new Scanner(System.in);
		int result = 0 ;
		System.out.println("Enter two numbers");
		
		try {
			int num1 = scnr.nextInt();
			int num2 = scnr.nextInt();

			result = num1/num2;
		}
		catch(ArithmeticException ae) {
			System.err.println(ae.getMessage());
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println("Division has been completed");
		}
		scnr.close();
		return result;
		
	}
	public static void main(String[] args) {
		System.out.println(divideTwo());
	}
}
