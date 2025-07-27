import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;

public class MessageReader {
	public static void main(String[] args) throws IOException
	{
		Scanner scnr = new Scanner(System.in);
		
		FileInputStream fis         = null;
		Scanner         inputStream = null;
		
		System.out.println("Enter name of file:");
		String filename	= scnr.nextLine();
	
		fis             = new FileInputStream(filename);
		inputStream     = new Scanner(fis);
		
		while(inputStream.hasNextLine()) 
		{
			System.out.println(inputStream.nextLine());
		}
		inputStream.close();
		scnr.close();
	}

}
